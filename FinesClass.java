import java.util.ArrayList;

public class FinesClass { // we've built this class to implement the observer design pattern
    public ArrayList<Item> borrower = new ArrayList<Item>();

    public void addObserver(Item s) {
        borrower.add(s);
    }

    public void removeObserver(Item s) {
        borrower.remove(s);
    }

    public void notifyFines(String msg) {

        for (Item s : borrower) {
            s.notifyFine(msg);
        }
    }
}