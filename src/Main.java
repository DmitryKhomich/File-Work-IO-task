
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println("Hello! If you want to create and write info in file, enter 1. If you want to reade info from file, enter 2 ");

        try {
            int choice = scanner.nextInt();
            if (choice == 1) {
                FileWriteService.serviceToWriteInFile();
            }
             else if (choice == 2) {
                FileReadService.serviceToReadTextFromFile();
            }
            else {
                throw new RuntimeException("You enter not valid number, try again");
            }
        } catch (InputMismatchException e){
            System.out.println("You enter not a number, try again");
        }
    }
}
