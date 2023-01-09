package ie.atu.week8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File myFile = new File("MyFile1.txt");
        System.out.println("My file is located at " + myFile.getAbsolutePath());
        String contenct = "Details to write";
        try
        {
            FileWriter myWriter = new FileWriter(myFile, true);
            myWriter.write("abcabc");
            myWriter.close();
        } catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}