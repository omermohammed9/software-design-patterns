import java.time.LocalDate;

public class faculty implements Borrower {
	private int ID;
	private String FirstName;
	private String LastName;
	private String DateJoined;
	private String Department;
	private String Office;
	private LocalDate DateBook1;
	private LocalDate DateBook2;
	private LocalDate DateEbook1;
	private LocalDate DateEbook2;
	private LocalDate DateJournal1;
	private LocalDate DateJournal2;
	private LocalDate DateDissertation1;
	private LocalDate DateDisserences2;

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

	public void setDepartment(String department) {
		this.Department = department;
	}

	public String getDepartment() {
		return this.Department;
	}

	public void setOffice(String office) {
		this.Office = office;
	}

	public String getOffice() {
		return this.Office;
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

	public String toString() {
		return String.format("ID number: %d, %s %s, JoinedDate: %s, Department: %s, Office: %s",
				getID(), getFirstName(), getLastName(), getDateJoined(), getDepartment(), getOffice(), getDate1(),
				getDate2(),
				getDateEbook1(), getDateEbook2(), getDateJournal1(), getDateJournal2(), getDateDissertation1(),
				getDateDissertation2());
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
		this.DateDisserences2 = date2;
	}

	@Override
	public LocalDate getDateDissertation2() {
		return this.DateDisserences2;
	}
}

class facultyBuilder { // we created this class as a builder to implement the DSL
	public static facultyBuilder student() {
		return new facultyBuilder();
	}

	private final faculty faculty;

	facultyBuilder() {
		faculty = new faculty();
	}

	public faculty build() {
		return faculty;
	}

	public facultyBuilder ID(int ID) {
		faculty.setID(ID);
		return this;
	}

	public facultyBuilder firstName(String firstName) {
		faculty.setFirstName(firstName);
		return this;
	}

	public facultyBuilder lastName(String lastName) {
		faculty.setLastName(lastName);
		return this;
	}

	public facultyBuilder dateJoined(String DateJoined) {
		faculty.setDateJoined(DateJoined);
		return this;
	}

	public facultyBuilder department(String department) {
		faculty.setDepartment(department);
		return this;
	}

	public facultyBuilder Office(String office) {
		faculty.setOffice(office);
		return this;
	}
}