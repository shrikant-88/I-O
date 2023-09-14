package fileReader;
import java.io.*;
public class reading_file {
    public static void main(String[] args) throws Exception {
        File file = new File("fileWriter","profile.txt");
        FileReader fileR = new FileReader(file);
        int i = fileR.read();
        while (i!=-1) {
            System.out.print((char)i);
             i = fileR.read();
        }

    }
}
