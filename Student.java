import java.time.LocalDate;

public class Student implements Borrower {
    private int ID;
    private String FirstName;
    private String LastName;
    private String DateJoined;
    private LocalDate DateBook1;
    private LocalDate DateBook2;
    private LocalDate DateEbook1;
    private LocalDate DateEbook2;
    private LocalDate DateJournal1;
    private LocalDate DateJournal2;
    private LocalDate DateDissertation1;
    private LocalDate DateDissertation2;

    @Override
    public void setID(int id) {
        this.ID = id;
    }

    @Override
    public int getID() {
        return this.ID;
    }

    @Override
    public void setFirstName(String firstname) {
        this.FirstName = firstname;
    }

    @Override
    public String getFirstName() {
        return this.FirstName;
    }

    @Override
    public void setLastName(String lastname) {
        this.LastName = lastname;
    }

    @Override
    public String getLastName() {
        return this.LastName;
    }

    @Override
    public void setDateJoined(String dateJoined) {
        this.DateJoined = dateJoined;
    }

    @Override
    public String getDateJoined() {
        return this.DateJoined;
    }

    public String toString() {
        return String.format("ID number: %d, %s %s, joined Date %s",
                getID(), getFirstName(), getLastName(), getDateJoined(), getDate1(), getDate2(),
                getDateEbook1(), getDateEbook2(), getDateJournal1(), getDateJournal2(), getDateDissertation1(),
                getDateDissertation2());
    }

    @Override
    public void setDateBook1(LocalDate date1) {
        this.DateBook1 = date1;
    }

    @Override
    public LocalDate getDate1() {
        return this.DateBook1;
    }

    @Override
    public void setDateBook2(LocalDate date2) {
        this.DateBook2 = date2;
    }

    @Override
    public LocalDate getDate2() {
        return this.DateBook2;
    }

    @Override
    public void setDateEbook1(LocalDate date1) {
        this.DateEbook1 = date1;
    }

    @Override
    public LocalDate getDateEbook1() {
        return this.DateEbook1;
    }

    @Override
    public void setDateEbook2(LocalDate date2) {
        this.DateEbook2 = date2;
    }

    @Override
    public LocalDate getDateEbook2() {
        return this.DateEbook2;
    }

    @Override
    public void setDateJournal1(LocalDate date1) {
        this.DateJournal1 = date1;
    }

    @Override
    public LocalDate getDateJournal1() {
        return this.DateJournal1;
    }

    @Override
    public void setDateJournal2(LocalDate date2) {
        this.DateJournal2 = date2;
    }

    @Override
    public LocalDate getDateJournal2() {
        return this.DateJournal2;
    }

    @Override
    public void setDateDissertation1(LocalDate date1) {
        this.DateDissertation1 = date1;
    }

    @Override
    public LocalDate getDateDissertation1() {
        return this.DateDissertation1;
    }

    @Override
    public void setDateDissertation2(LocalDate date2) {
        this.DateDissertation2 = date2;
    }

    @Override
    public LocalDate getDateDissertation2() {
        return this.DateDissertation2;
    }

}

class StudentBuilder { // we created this class as a builder to implement the DSL
    public static StudentBuilder student() {
        return new StudentBuilder();
    }

    private final Student student;

    StudentBuilder() {
        student = new Student();
    }

    public Student build() {
        return student;
    }

    public StudentBuilder ID(int ID) {
        student.setID(ID);
        return this;
    }

    public StudentBuilder firstName(String firstName) {
        student.setFirstName(firstName);
        return this;
    }

    public StudentBuilder lastName(String lastName) {
        student.setLastName(lastName);
        return this;
    }

    public StudentBuilder dateJoined(String DateJoined) {
        student.setDateJoined(DateJoined);
        return this;
    }

}