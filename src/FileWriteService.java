import utils.Constants;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteService {
    static String fileName;
    static String myFile;
    static String myText;
    static FileOutputStream fout;
    static byte[] byteArr;
    static Scanner scanner;


    static void serviceToWriteInFile() {
        scanner = new Scanner(System.in);
        System.out.println("Enter file name: ");
        fileName = scanner.nextLine() + ".txt";
        System.out.println("Enter text which you want to write in file: ");
        myText = scanner.nextLine();
        myFile = Constants.BASE_PATH_IN + fileName;

        try {
            fout = new FileOutputStream(myFile);
            byteArr = myText.getBytes();
            fout.write(byteArr, 0, byteArr.length);
            fout.close();
            System.out.println("Success!");
        } catch (IOException ex) {
            System.out.println("Something went wrong");
            System.out.println(ex.getMessage());
        }
    }
}