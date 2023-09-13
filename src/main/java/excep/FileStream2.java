package excep;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileStream2 {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("C://file//abc.txt");
        FileWriter fileWriter = new FileWriter("C://file//techm.txt");
        int c;
        while ((c = fileReader.read()) != -1) {
            fileWriter.write(c);
        }

        System.out.println("data copied");
        fileReader.close();
        fileWriter.close();
    }
}