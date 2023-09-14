/**
 * file_w
 */
import java.io.*;
public class file_w {

    public static void main(String[] args) {
      
      File textf = new File("fileWriter","profile.txt");
      
        // Try block to check if exception occurs
        try {
 
            // Create a FileWriter object
            // to write in the file
            FileWriter fWriter = new FileWriter(textf);
 
            // Writing into file
            // Note: The content taken above inside the
            // string
            fWriter.write("hello !");
        
            // Closing the file writing connection
            fWriter.close();
 
            // Display message for successful execution of
            // program on the console
            System.out.println(
                "File is created successfully with the content.");
        }
 
        // Catch block to handle if exception occurs
        catch (IOException e) {
 
            // Print the exception
            System.out.print(e.getMessage());
    
    }
}
}