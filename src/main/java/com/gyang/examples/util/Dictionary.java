
package com.gyang.examples.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import me.shib.java.lib.diction.DictionService;
import me.shib.java.lib.diction.DictionWord;
import me.shib.java.lib.diction.DictionWord.DictionDesc;

public class Dictionary
{

    private static String[] EXCEPTION_LIST = new String[] { "yours", "his", "hers", "yes", "ours", "theirs", "its", "outs" };
    private static Set<String> _words = new HashSet<>();
    
    /**
     * @param path
     * @param outputPath
     * @throws IOException
     * @e.g. Dictionary.translate("./src/main/java//com/gyang/exmaples/test.txt", "./src/main/java//com/gyang/exmaples/output.txt");
     */
    public static void translate(String path, String outputPath)
        throws IOException
    {
        DictionService service = new DictionService();
        File file = new File(outputPath);
        FileOutputStream fos = new FileOutputStream(file);

        for (String input : FileUtil.readFile(path)) {
            DictionWord word = service.getDictionWord(input);
            if (word == null) {
                continue;
            }
            String aWord = input + ":\n";
            fos.write(aWord.getBytes());
            for (DictionDesc desc : word.getDescriptions()) {
                String out = "\t" + desc.getDescription() + "\n";
                fos.write(out.getBytes());
            }
        }
        fos.flush();
        fos.close();
        System.out.println("done");
    }

    public static void wordLaundery(String inputFilePath, String outputFilePath) throws IOException
   {
      List<String[]> filteredRows = new ArrayList<>();
      Map<String, String> map = new HashMap<>();
      String line;

      try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath)))
      {

         while ((line = br.readLine()) != null)
         {
            String[] cells = line.split(",");
            map.put(cells[0], cells[1]);
         }
      }
      _words.addAll(map.keySet());
      try (BufferedReader x = new BufferedReader(new FileReader(inputFilePath)))
      {
         while ((line = x.readLine()) != null)
         {
            String[] cells = line.split(",");
            boolean wanted = Arrays.stream(cells)
                  .anyMatch(cell -> cell.matches("^[a-z]+$") && cell.matches(".*[aeiouyAEIOUY].*"));
            if (wanted && !isPlural(cells[0]) && !isPastTense(cells[0]))
            {
               filteredRows.add(cells);
            }
         }
      }

      // Write the filtered rows back to the output file
      try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilePath)))
      {
         for (String[] row : filteredRows)
         {
            bw.write(String.join(",", row));
            bw.newLine();
         }
      }
   }

   public static boolean isPastTense(String word)
   {
      String temp = "";
      if (!word.endsWith("ed")) {
         return false;
      }
      if (word.endsWith("ied")) {
         temp = word.substring(0, word.length() - 3) + "y";
      } else {
         temp = word.substring(0, word.length() - 2);
      }
      return _words.contains(temp) || _words.contains(temp + "e");
   }

   private static boolean isPlural(String candidate)
   {
      if (!candidate.endsWith("s"))
      {
         return false;
      }
      if (candidate.endsWith("ss"))
      {
         return false;
      }
      if (Arrays.asList(EXCEPTION_LIST).contains(candidate))
      {
         return false;
      }
      String temp = "";
      if (candidate.endsWith("ies"))
      {
         temp = candidate.substring(0, candidate.length() - 3) + "y";
      }
      else if (candidate.endsWith("ves"))
      {
         temp = candidate.substring(0, candidate.length() - 3) + "f";
      }
      else if (candidate.endsWith("es"))
      {
         temp = candidate.substring(0, candidate.length() - 2);
         if (!temp.matches(".*(s|x|z|ch|sh)$"))
         {
            temp = temp + "e";
         }
      }
      else
      {
         temp = candidate.substring(0, candidate.length() - 1);
      }
      return _words.contains(temp);
   }
}
