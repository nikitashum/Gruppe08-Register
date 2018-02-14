
import java.util.ArrayList;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author shuma
 */
public class Register {

    private ArrayList<NewsPaper> newspaperList;

    public Register() {
        this.newspaperList = new ArrayList<NewsPaper>();
    }

    public void addNewspaper(NewsPaper newspaper) {
        this.newspaperList.add(newspaper);
    }

    public void removeNewspaperByIndex(int index) {
        this.newspaperList.remove(index);
    }

    public NewsPaper getNewspaperByTitle(String title) {
        NewsPaper foundNewspaper = null;
        int index = 0;
        while ((null == foundNewspaper) && (index < this.newspaperList.size())) {
            NewsPaper p = this.newspaperList.get(index++);
            if (p.getTitle().contains(title)) {
                foundNewspaper = p;
            }
        }
        return foundNewspaper;
    }

    public void removeNewspaperByTitle(String title) {
        NewsPaper foundNewspaper = null;
        int index = 0;
        while ((null == foundNewspaper) && (index < this.newspaperList.size())) {
            NewsPaper p = this.newspaperList.get(index++);
            if (p.getTitle().equalsIgnoreCase(title)) {
                foundNewspaper = p;
            }
        }
        this.newspaperList.remove(foundNewspaper);
    }

    public void listAllNewspaper() {
        for (NewsPaper p : this.newspaperList) {
            System.out.println(p.getNewspaperDetails());
        }
    }
    
       public void fillNewsPaperRegister()
    {
        newspaperList.add(new NewsPaper("VG", "VG", 365, "Sport"));
        newspaperList.add(new NewsPaper("Adressa", "Adressa", 300, "Dagavis"));
        newspaperList.add(new NewsPaper("Test", "Test2", 200, "anotherCategory"));
        newspaperList.add(new NewsPaper("365", "somePublisher", 100, "Data"));
    }

}
