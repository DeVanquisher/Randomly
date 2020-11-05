import fileHandling.RandomReader;
import fileHandling.FileWriter;
import fileHandling.SizeCalculator;
import utils.ElementComparator;
import utils.Utilities;

import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {

        String firstFile = "src/textFiles/FirstFile";
        String secondFile = "src/textFiles/SecondFile";

        Utilities utils = new Utilities();
        RandomReader rr = new RandomReader();
        FileWriter fw = new FileWriter();
        ElementComparator comparator = new ElementComparator();
        SizeCalculator sizeCalculator = new SizeCalculator();

        System.out.println("Welcome to randomly.\n"+
                "Reading file...");

        //Selecting element randomly from first file and avoiding previously selected element.
        while (true){
            utils.setTryItem(rr.readRandomly(firstFile));
            if (comparator.compareElements(utils.getTryItem(), secondFile));
            else {
                utils.setCalledItem(utils.getTryItem());
                break;
            }
        }


        utils.setClassStrength(sizeCalculator.calculateSize(firstFile));
        utils.setTotCalledStudents(sizeCalculator.calculateSize(secondFile));

        //Adding randomly selected element to second file util secondFile size reaches firstFile size.
        if (utils.getTotCalledStudents() <= utils.getClassStrength()){
            utils.setFilledItem(fw.writeFile(utils.getCalledItem(), secondFile));
        }
        else {
            PrintWriter writer = new PrintWriter(secondFile);
            writer.print("");
            writer.close();
        }


        System.out.println(utils.getCalledItem()
                +"\n"+utils.getFilledItem()+" has been put to SecondFile."
                +"\nTotal strength of the class is " + utils.getClassStrength()
                +" and "+utils.getTotCalledStudents()+" have been called yet.\n*Check out the SecondFile to see called Student.");

    }

}
