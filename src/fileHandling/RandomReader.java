package fileHandling;

import utils.Locator;
import utils.RandomGenerator;
import utils.Utilities;

import java.io.*;

import java.util.ArrayList;
import java.util.Scanner;

public class RandomReader extends Utilities {
    String calledStudent;
    public String readRandomly(String filePath){
        String data;
        //Locator locator = new Locator();
        ArrayList<String> student = new ArrayList<>();


        RandomGenerator randomGenerator = new RandomGenerator();
        try {
            File myObj = new File(filePath);
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
                student.add(data);
            }
            myReader.close();

            int index = randomGenerator.generateRandom(student.size());
            calledStudent = student.get(index);
            setCalledItemIndex(index);

//            locator.setLineNo(index);

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return calledStudent;
    }
}
