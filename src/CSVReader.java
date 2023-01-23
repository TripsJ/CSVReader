// Deconstructs a CSV line by line, removes the column declaration and returns an arraylist of entrys

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVReader{
    private String filename;
    Scanner sc;


    public CSVReader(String filename) {
        this.filename = filename;
    }


    public ArrayList<String> readlines() {
        ArrayList<String> linelist = new ArrayList<>();

   try {
            sc = new Scanner(new File(filename));
            sc.useDelimiter("\r?\n|\r");
            while (sc.hasNext()) {
                linelist.add(sc.next());


            }
            linelist.remove(0);
            return linelist;
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            return linelist;

        }
    }



}


