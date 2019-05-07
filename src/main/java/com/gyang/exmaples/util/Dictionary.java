
package com.gyang.exmaples.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import me.shib.java.lib.diction.DictionService;
import me.shib.java.lib.diction.DictionWord;
import me.shib.java.lib.diction.DictionWord.DictionDesc;

public class Dictionary
{

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
}
