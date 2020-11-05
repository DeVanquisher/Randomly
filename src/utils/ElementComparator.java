package utils;

import fileHandling.SequentialReader;

import java.util.ArrayList;

public class ElementComparator extends Utilities{
    boolean flag = false;
    SequentialReader sr =new SequentialReader();
    ArrayList<String> secondFileContent = new ArrayList<>();

    //this method will check that tryItem is matching with any item present in second file
    public boolean compareElements(String tryItemOfFirstFile, String file2){
        secondFileContent =  sr.readSequentially(file2);
        for (String i : secondFileContent){
            if (i.equals(tryItemOfFirstFile)){
                System.out.println(secondFileContent);
            }
                flag = true;
        }

        return flag;

    }
}
