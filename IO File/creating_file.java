import java.io.*;
public class creating_file {
    
    public static void main(String[] args)throws Exception {
        
        File file = new File("creating_Dipositry.java");
        System.out.println(file.exists());
        file.createNewFile();
    }
}
