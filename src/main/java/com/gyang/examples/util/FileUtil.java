
package com.gyang.examples.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtil
{
    public static int counter = 0;

    public FileUtil()
    {
        // util class, don't instantiate it.
    }

    public static List<String> readFile(String path)
    {
        File file = new File(path);

        List<String> result = new ArrayList<>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) != null) {
                counter++;
                if (st.length() < 2) {
                    continue;
                }
                for (String string : st.split(",")) {
                    result.add(string.replaceAll("\\s", ""));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    private static class Person
    {
        private void print()
        {
            System.out.println();
        }
    }
}
