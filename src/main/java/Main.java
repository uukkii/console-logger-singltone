import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Random random = new Random();
        Scanner console = new Scanner(System.in);

        logger.log("Program is starting...");
        System.out.println("Hello!\n");

        logger.log("Asking user to fill income data for list...");
        System.out.println("Enter the size of list:");
        int sizeOfList = console.nextInt();
        logger.log("Size of list (" + sizeOfList + ") is entered!\n");
        System.out.println("Enter the maximum value of numbers:");
        int maxValue = console.nextInt();
        logger.log("Maximum value (" + maxValue + ") is entered!\n");

        logger.log("Creating and filling of list...");
        List<Integer> source = new ArrayList<>();
        System.out.println("Your list: ");
        for (int i = 0; i < sizeOfList; i++) {
            source.add(random.nextInt(maxValue));
            System.out.print(" " + source.get(i));
        }
        System.out.println();
        logger.log("The list is created and filled!\n");

        logger.log("Asking user to fill data for filter...\n");
        System.out.println("Enter the value for filter:");
        int filterValue = console.nextInt();
        logger.log("Value for filter (" + filterValue + ") is entered\n");

        logger.log("Filter is running...");
        Filter filter = new Filter(filterValue);
        source = filter.filterOut(source);
        logger.log("Filter is finished!\n");

        logger.log("Display the result on screen...");
        System.out.print(" Filtered list: ");
        for (int i : source) {
            System.out.print(" " + i);
        }
        System.out.println();

        logger.log("Exiting the program...");
    }
}
