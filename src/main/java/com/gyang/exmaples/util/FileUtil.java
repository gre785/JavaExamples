package com.gyang.exmaples.util;

import java.io.*;

public class FileUtil
{
    public static int counter = 0;
    public FileUtil()
    {
        // util class, don't instantiate it.
    }

    public static void readFile(String path)
    {
        File file = new File(path);

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) != null) {
                counter ++;
                System.out.println(st);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class Person
    {
        private void print()
        {
            System.out.println();
        }
    }
}
