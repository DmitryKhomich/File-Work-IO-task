import utils.Constants;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileReadService {
    static String fileName;
    static String path;
    static FileInputStream fin;
    static Scanner scanner;

     static void serviceToReadTextFromFile() {
         scanner = new Scanner(System.in);
        System.out.println("Enter file name which you want to read: ");
        fileName =  scanner.nextLine() + ".txt";
        path = Constants.BASE_PATH_IN + fileName;

        try {
            fin = new FileInputStream(path);
            int i;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException ex) {
            System.out.println("Something went wrong, please try again");
            System.out.println(ex.getMessage());
        }
    }
}


