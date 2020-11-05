package fileHandling;


import java.io.*;
import java.util.ArrayList;

public class SequentialReader {
    public ArrayList<String> readSequentially(String filePath){
        String data;
        ArrayList<String> elements = new ArrayList<>();

        try {
            File myObj = new File(filePath);
            FileReader fr = new FileReader(myObj);
            BufferedReader br = new BufferedReader(fr);
            StringBuffer sb = new StringBuffer();
            String line;


            br.readLine();
            while ((line=br.readLine())!=null) {
                sb.append(line);
                sb.append("\n");
                elements.add(sb.toString());
            }
            fr.close();
            //System.out.println(elements);

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return elements;
    }
}
