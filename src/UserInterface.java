
import java.util.Iterator;
import java.util.Scanner;
import javafx.scene.paint.Color;

/**
 * Represents user interface
 *
 * @author Nikita Sumahers, Sarmad Abbas and Kristin Hagen
 * @version 2018-03-09
 */
public class UserInterface {

    private Register register;

    public UserInterface() {
        this.register = new Register();
    }

    public void start() {
        boolean finished = false;

        int choice = 0;
        String remove = "";

        printWelcome();
        while (!finished) {
            printMenu();
            Scanner reader = new Scanner(System.in);

            if (reader.hasNextInt()) {
                choice = reader.nextInt();
            } else {
                // Set choice to an invalid value
                choice = 99;
            }

            // Fill newspaper with predefined newspapers
            switch (choice) {
                case 1:
                    this.register.fillNewspaperRegister();
                    System.out.println("Newspaper register i filled with newspaper");
                    break;

                // Get all registered newspapers displayed
                case 2:
                    Iterator<Newspaper> it = this.register.getIterator();
                    if (!it.hasNext()) {
                        System.out.println("Register is empty!");
                    }
                    while (it.hasNext()) {
                        Newspaper newsPaper = it.next();
                        System.out.print("Title: " + newsPaper.getTitle()
                                + " Publisher: " + newsPaper.getPublisher()
                                + " Category: " + newsPaper.getCategory()
                                + " Number of realese per year: " + newsPaper.getNumberOfRealeases());
                        System.out.println();
                    }
                    break;
                // Delete chosen newspaper
                case 3:
                    Iterator<Newspaper> it2 = this.register.getIterator();
                    if (!it2.hasNext()) {
                        System.out.println("Register is empty!");
                        break;
                    }

                    System.out.println("Insert the title of the newpaper to remove");

                    if (reader.hasNext()) {
                        remove = reader.next();
                    }
                    if (register.getNewspaperByTitle(remove) != null) {
                        System.out.println(register.getNewspaperByTitle(remove).getTitle() + " Has been removed");
                        register.removeByTitleContains(remove);
                    } else {
                        System.out.println("Invalid newspaper title, ...");
                        choice = 3;
                    }
                    break;

                // Quit
                case 4:
                    finished = true;
                    System.out.println("Thank you for visiting our register, Bye..");
                    break;

                default:
                    System.out.println("Unknown commend");
                    break;
            }
        }
    }

    /**
     * Print welcome message
     */
    public void printWelcome() {
        System.out.println("***Welocme to the newspaper register!***");
    }

    /**
     * Print menu choices
     */
    public void printMenu() {
        System.out.println();
        System.out.println("***Menu***");
        System.out.println("Type 1 to add newspaper to register");
        System.out.println("Type 2 to list all avaleble newspapers");
        System.out.println("Type 3 to remove newspapers by titile");
        System.out.println("Type 4 to quit");
    }
}
