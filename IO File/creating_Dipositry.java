/**
 * creating_Dipositry
 */
import java.io.*;
public class creating_Dipositry {

    public static void main(String[] args)throws Exception
     {
        File folder = new File("fileWriter");
        System.out.println(folder.exists());
        folder.mkdir();
        File folderfile = new File(folder,"file_w.java");
        folderfile.createNewFile();
    }
}