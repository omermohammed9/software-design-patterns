import java.time.LocalDate;

public interface Borrower {

    void setID(int id);

    int getID();

    void setFirstName(String firstname);

    String getFirstName();

    void setLastName(String lastname);

    String getLastName();

    void setDateJoined(String dateJoined);

    String getDateJoined();

    void setDateBook1(LocalDate date1);

    LocalDate getDate1();

    void setDateBook2(LocalDate date2);

    LocalDate getDate2();

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