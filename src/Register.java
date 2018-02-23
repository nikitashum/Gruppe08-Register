
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Represents the register of newspaper.
 *
 * @author Nikita Sumahers, Sarmad Abbas and Kristin Hagen
 * @version 2018-02-12
 */
public class Register {

    private ArrayList<Newspaper> newspaperList;

    /**
     * Constructor for objects of class Register.
     */
    public Register() {
        this.newspaperList = new ArrayList<Newspaper>();
    }

    /**
     * Adds a newspaper to the register
     *
     * @param newspaper - the newspaper to add to the register
     */
    public void addNewspaper(Newspaper newspaper) {
        this.newspaperList.add(newspaper);
    }

    /**
     * Removes a newspaper by its index from the register
     *
     * @param index - the index of the newspaper to remove from the register
     */
    public void removeNewspaperByIndex(int index) {
        this.newspaperList.remove(index);
    }

    /**
     * Searches and returns for all newspapers that contain a given string in
     * their title
     *
     * @param title - the string of the newspaper to remove from the register
     */
    public Newspaper getNewspaperByTitle(String title) {
        Newspaper foundNewspaper = null;
        int index = 0;
        while ((null == foundNewspaper) && (index < this.newspaperList.size())) {
            Newspaper p = this.newspaperList.get(index++);
            if (p.getTitle().contains(title)) {
                foundNewspaper = p;
            }
        }
        return foundNewspaper;
    }

    /**
     * Removes all newspapers that contain a given string in their title from
     * the register
     *
     * @param title - the string of the newspaper to remove from the register
     */
    public void removeByTitleContains(String titleToRemove) {
        Iterator<Newspaper> it = newspaperList.iterator();
        while (it.hasNext()) {
            Newspaper t = it.next();
            String title = t.getTitle();
            if (title.contains(titleToRemove)) {
                it.remove();
            }
        }
    }

    /**
     * Lists all persons in the phone book to the terminal window.
     */
    public void listAllNewspaper() {
        for (Newspaper p : this.newspaperList) {
            System.out.println(p.getNewspaperDetails());
        }
    }

    /**
     * Adds some newspaper to the register.
     */
    public void fillNewspaperRegister() {
        newspaperList.add(new Newspaper("VG", "VG", 365, "Sport"));
        newspaperList.add(new Newspaper("Adressa", "Adressa", 300, "Dagavis"));
        newspaperList.add(new Newspaper("Test", "Test2", 200, "anotherCategory"));
        newspaperList.add(new Newspaper("365", "somePublisher", 100, "Data"));
    }

}
