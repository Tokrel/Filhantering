import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class CreateFile {

    private String userInput;

    public CreateFile(String userInput){
        this.userInput = userInput;

    }

    public void makefile(String userInput) {
        try {
            File myObj = new File(userInput);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}