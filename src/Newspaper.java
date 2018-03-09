
/**
 * Represents a single newspaper, holding information
 * about the title, the publisher, the number of releases each year and the category of the newspaper.
 *
 * @author Nikita Sumahers, Sarmad Abbas and Kristin Hagen
 * @version 2018-03-09
 */
public class Newspaper {

    private String title;
    private String publisher;
    private int numberOfReleases;
    private String category;

    /**
     * First Constructor for objects of class Newspaper.
     *
     * @param title - represents title of newspaper
     * @param publisher - represents newspaper publisher name
     * @param numberOfReleases - number of realeses of newspaper per year
     * @param category - name of the category for newspaper
     */
    public Newspaper(String title, String publisher, int numberOfReleases, String category) {
        this.title = title;
        this.publisher = publisher;
        this.numberOfReleases = numberOfReleases;
        this.category = category;
    }

    /**
     * Second Constructor for objects of class Newspaper.
     *
     * @param title - represents title of newspaper
     */
    public Newspaper(String title) {
        this.title = title;
    }

    /**
     * Changes/sets the number of releases that are released each year to a new
     * number.
     *
     * @param newNumberOfReleases - sets new number of releases
     */
    public void setNumberOfReleases(int newNumberOfReleases) {
        if (newNumberOfReleases > 0) {
            this.numberOfReleases = newNumberOfReleases;
        } else {
            this.numberOfReleases = 0;
        }
    }

    /**
     * Sets/Changes the publisher of newspaper to a new publisher.
     *
     * @param newPublisher - Sets new publisher for newspaper
     */
    public void setPublisher(String newPublisher) {
        this.publisher = newPublisher;
    }

    /**
     * Sets/Changes the category of the newspaper to a new category.
     *
     * @param newCategory - Sets new category for newspaper
     */
    public void setCategory(String newCategory) {
        this.category = newCategory;
    }

    /**
     * Sets/Changes the title of the newspaper to a new title
     *
     * @param newTitle - Sets new title for newspaper
     */
    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    /**
     * Returns the title of the newspaper
     *
     * @return - return title of the newspaper
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Returns the publisher of the newspaper
     *
     * @return - return publisher of the newspaper
     */
    public String getPublisher() {
        return this.publisher;
    }

    /**
     * Returns the number of releases of the newspaper each year
     *
     * @return - return number of realeses of the newspaper per year
     */
    public int getNumberOfRealeases() {
        return this.numberOfReleases;
    }

    /**
     * Returns the category of the newpaper
     *
     * @return - return category of the newspaper
     */
    public String getCategory() {
        return this.category;
    }
}
