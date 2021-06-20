package com.company.observer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

      public String readFile() throws FileNotFoundException {
            File file = new File("D:\\project\\observer-pattern\\src\\captmidn.txt");

            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
          return null;
      }



}
