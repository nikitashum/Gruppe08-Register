/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikita Sumahers, Sarmad Abbas, Kristin Hagen
 * @
 */
public class NewsPaper {

    private String title;
    private String publisher;
    private int numberOfReleases;
    private String category;

    /**
     *
     * @param title - represents title of newspaper
     * @param publisher - represents newspaper publisher name
     * @param numberOfReleases - number of realeses of newspaper per year
     * @param category - name of the category for newspaper
     */
    public NewsPaper(String title, String publisher, int numberOfReleases, String category) {
        this.title = title;
        this.publisher = publisher;
        this.numberOfReleases = numberOfReleases;
        this.category = category;
    }

    public NewsPaper(String title) {
        this.title = title;
    }

    /**
     *
     * @param newPublisher - Sets new publisher for newspaper
     */
    public void setPublisher(String newPublisher) {
        this.publisher = newPublisher;
    }

    /**
     *
     * @param newCategory - Sets new category for newspaper
     */
    public void setCategory(String newCategory) {
        this.category = newCategory;
    }

    /**
     *
     * @param newTitle - Sets new title for newspaper
     */
    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    /**
     *
     * @return - return title of the newspaper
     */
    public String getTitle() {
        return this.title;
    }

    /**
     *
     * @return - return publisher of the newspaper
     */
    public String getPublisher() {
        return this.publisher;
    }

    /**
     *
     * @return - return number of realeses of the newspaper per year
     */
    public int getNumberOfRealeases() {
        return this.numberOfReleases;
    }

    /**
     *
     * @return - return category of the newspaper
     */
    public String getCategory() {
        return this.category;
    }

    public String getNewspaperDetails() {
        return "Title: " + this.title + " Publisher: " + this.publisher + " Category: " + this.category + " Number of realese per year: " + this.numberOfReleases;
    }
}
