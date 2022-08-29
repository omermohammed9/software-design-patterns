import java.time.LocalDate;

public interface Item {
    public void notifyFine(String msg);

    void setBook(String book);

    String getBook();

    void setEbook(String Ebook);

    String getEbook();

    void setJournal(String journal);

    String getJournal();

    void setDissertation(String dissertation);

    String getDissertation();

    void setDate1book(LocalDate date1);

    LocalDate getDate1book();

    void setDate2book(LocalDate date2);

    LocalDate getDate2Book();

    void setDateEbook1(LocalDate date1);

    LocalDate getDateEbook1();

    void setDateEbook2(LocalDate date2);

    LocalDate getDateEbook2();

    void setDateJournal1(LocalDate date1);

    LocalDate getDateJournal1();

    void setDateJournal2(LocalDate date2);

    LocalDate getDateJournal2();

    void setDateDissertation1(LocalDate date1);

    LocalDate getDateDissertation1();

    void setDateDissertation2(LocalDate date2);

    LocalDate getDateDissertation2();

}
