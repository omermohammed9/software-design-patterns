// Omer Mohammed Abbas om17102@auis.edu.krd
// Lawen Hunar Jamal   lh19274@auis.edu.krd

import java.time.LocalDate;
import java.util.Stack;

public class Library implements Item {
    private Borrower borrower; // dependency injection
    private String book;
    private String Ebook;
    private String journal;
    private String dissertation;
    private final Stack<Library> stack = new Stack<>();
    Borrower st = new Student();
    Borrower fa = new faculty();

    public void snapshot() {
        Library library = new Library();
        library.book = (this.book);
        library.Ebook = (this.Ebook);
        library.journal = (this.journal);
        library.dissertation = (this.dissertation);
        stack.push(library);
    }

    public Library(Borrower borrower, // dependency injection
            String book, LocalDate date1, LocalDate date2, String ebook, LocalDate Ebook1,
            LocalDate Ebook2, String journal,
            LocalDate Journal1, LocalDate Journal2, String dissertation, LocalDate Dissertation1,
            LocalDate Dissertation2) {
        setBorrower(borrower);
        setBook(book);
        setEbook(ebook);
        setJournal(journal);
        setDissertation(dissertation);

        setDate1book(date1);
        setDate2book(date2);
        setDateEbook1(Ebook1);
        setDateEbook2(Ebook2);

        setDateJournal1(Journal1);
        setDateJournal2(Journal2);

        setDateDissertation1(Dissertation1);
        setDateDissertation2(Dissertation2);
    }

    public Library() {
    }

    @Override
    public void notifyFine(String msg) {
        System.out.println(msg);
    }

    public void setBorrower(Borrower borrower) { // dependency injection
        this.borrower = borrower;
    }

    public Borrower getBorrower() {
        return this.borrower;
    }

    public void setBook(String book) {
        snapshot();
        this.book = book;
    }

    @Override
    public String getBook() {
        return this.book;
    }

    public void setEbook(String Ebook) {
        snapshot();
        this.Ebook = Ebook;
    }

    @Override
    public String getEbook() {
        return this.Ebook;
    }

    @Override
    public void setJournal(String journal) {
        snapshot();
        this.journal = journal;
    }

    @Override
    public String getJournal() {
        return this.journal;
    }

    public void setDissertation(String dissertation) {
        snapshot();
        this.dissertation = dissertation;
    }

    @Override
    public String getDissertation() {
        return this.dissertation;
    }

    public String toString() {
        return String.format("%s\n Borrowed: Books: %s, BookstartDate: %tF, BookEndDate2: %tF, "
                + "\n Ebook: %s, EbookStartDate: %tF, EbookendDate: %tF, \nJournal: %s JournalStartDate: %tF, JournalEndDate: %tF,"
                + "\n Dissertation: %s, DissertationStartDate: %tF, DissertationEndDate: %tF",
                getBorrower(), getBook(), getDate1book(), getDate2Book(), getEbook(), getDateEbook1(),
                getDateEbook2(), getJournal(), getDateJournal1(), getDateJournal2(), getDissertation(),
                getDateDissertation1(), getDateDissertation2());
    }

    @Override
    public void setDate1book(LocalDate date1) {
        if (fa.getDate1() != st.getDate1())
            this.fa.setDateBook1(date1);
        if (st.getDate1() == st.getDate1())
            this.st.setDateBook1(date1);

    }

    @Override
    public LocalDate getDate1book() {
        return st.getDate1();
    }

    @Override
    public void setDate2book(LocalDate date2) {
        if (st.getDate2() == st.getDate2())
            this.st.setDateBook2(date2);
        if (fa.getDate2() == st.getDate2())
            return;
    }

    @Override
    public LocalDate getDate2Book() {
        return st.getDate2();
    }

    @Override
    public void setDateEbook1(LocalDate date1) {
        if (st.getDateEbook1() == st.getDateEbook1())
            this.st.setDateEbook1(date1);
        if (fa.getDateEbook1() != st.getDateEbook1())
            this.fa.setDateEbook1(date1);
    }

    @Override
    public LocalDate getDateEbook1() {
        return st.getDateEbook1();
    }

    @Override
    public void setDateEbook2(LocalDate date2) {
        if (st.getDateEbook2() == st.getDateEbook2())
            this.st.setDateEbook2(date2);
        if (fa.getDateEbook2() != st.getDateEbook2())
            this.fa.setDateEbook2(fa.getDateEbook2());
    }

    @Override
    public LocalDate getDateEbook2() {
        return st.getDateEbook2();
    }

    @Override
    public void setDateJournal1(LocalDate date1) {
        if (st.getDateJournal1() == st.getDateJournal1())
            this.st.setDateJournal1(date1);
        if (fa.getDateJournal1() == st.getDateJournal1())
            return;
    }

    @Override
    public LocalDate getDateJournal1() {
        return st.getDateJournal1();
    }

    @Override
    public void setDateJournal2(LocalDate date2) {
        if (st.getDateJournal2() == st.getDateJournal2())
            this.st.setDateJournal2(date2);
        if (fa.getDateJournal2() == st.getDateJournal2())
            return;
    }

    @Override
    public LocalDate getDateJournal2() {
        return st.getDateJournal2();
    }

    @Override
    public void setDateDissertation1(LocalDate date1) {
        st.setDateDissertation1(date1);
    }

    @Override
    public LocalDate getDateDissertation1() {
        return st.getDateDissertation1();
    }

    public void setDateDissertation2(LocalDate date2) {
        st.setDateDissertation2(date2);
    }

    @Override
    public LocalDate getDateDissertation2() {
        return st.getDateDissertation2();
    }

    public void undo() { // our undo method for book,ebook,journal,dissertation names
        Library snap = stack.pop();
        this.book = snap.book;
        this.Ebook = snap.Ebook;
        this.journal = snap.journal;
        this.dissertation = snap.dissertation;
        System.out.println("object are undo " + " " + this.book + " " + this.Ebook + " " + this.journal
                + " " + this.dissertation);
    }
}
