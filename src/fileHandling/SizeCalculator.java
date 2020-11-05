package fileHandling;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SizeCalculator {
    int size;
    public int calculateSize(String file){
        ArrayList<String> content = new ArrayList<>();
        try {
            File thisFile = new File(file);
            Scanner reader = new Scanner(thisFile);
            while (reader.hasNextLine()){
                content.add(reader.nextLine());
            }
            reader.close();
            size = content.size();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return size;
    }
}
