//lawen hunar jamal lh19274
//omar mohammed abbas om17102

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class test1 {

    public static void main(String[] args) {
        LibraryFacade facade = new LibraryFacade();
        FinesClass fines = new FinesClass();
        StudentBuilder studentBuilder = facade.studentBuilder;
        facultyBuilder facultyBuilder = facade.facultyBuilder;

        // To Register A New User
        facade.registerUser();

        // To test the fines and print them, uncomment up to line 110 to test:
        // Borrower[] borrower = new Borrower[2];
        // Library[] library = new Library[2];
        // library[0] = new Library(
        // studentBuilder.ID(17102).firstName("Omar").lastName("Mohammed") // DSL design
        // .dateJoined("2018/01/01").build(),
        // "algorithm",
        // LocalDate.parse("2021-01-01"), LocalDate.parse("2021-02-08"),
        // "EBOOK", LocalDate.parse("2019-02-11"), LocalDate.parse("2019-04-20"),
        // "jOURNAL",
        // LocalDate.parse("2019-05-01"), LocalDate.parse("2019-06-11"), "Dissertation",
        // LocalDate.parse("2021-01-01"), LocalDate.parse("2021-02-14"));

        // library[0].setBook("booooooooks");
        // library[0].undo(); // undo for book, ebook, journal, dissertation names

        // library[1] = new Library(
        // facultyBuilder.ID(123).firstName("Alan").lastName("Amin") // DSL design
        // .dateJoined("2015/01/01").department("IT/SE").Office("B-F2-17").build(),
        // "C++ intro",
        // LocalDate.parse("2021-01-01"), LocalDate.parse("2021-02-20"),
        // "EBOOK", LocalDate.parse("2019-02-10"), LocalDate.parse("2019-04-20"),
        // "jOURNAL",
        // LocalDate.parse("2019-05-01"), LocalDate.parse("2019-06-05"), "Dissertation",
        // LocalDate.parse("2021-01-10"), LocalDate.parse("2021-02-14"));

        // double fine = 0;
        // long daybook = 0;
        // long dayebook = 0;
        // long dayJournal = 0;

        // for the book fines
        // for (Item y : library) {
        // daybook = ChronoUnit.DAYS.between(y.getDate1book(), y.getDate2Book());
        // if (library[0] != null)
        // if (daybook <= 30)
        // fine = daybook * 0;
        // else if (daybook > 30)
        // fine = (daybook - 30) * 1;
        // System.out.println(
        // library[0] + "\n" + "Num of Days book for student: " + daybook + "\n" +
        // "total fines: " + fine);
        // if (library[1] != null)
        // if (daybook <= 60)
        // fine = daybook * 0;
        // else if (daybook > 60) {
        // fine = (daybook - 30) * 1;
        // fines.addObserver(y);
        // }
        // System.out.println(
        // library[1] + "\n" + "Num of Days book for faculty: " + daybook + "\n" +
        // "total fines: " + fine);

        // // for the Ebook
        // for (Item x : library) {
        // dayebook = ChronoUnit.DAYS.between(x.getDateEbook1(), x.getDateEbook2());
        // if (dayebook <= 60)
        // fine = dayebook * 0;
        // System.out.println("No fines: " + fine);
        // if (dayebook > 60)
        // fine = (dayebook - 60) * 1;
        // System.out.println(
        // library[0] + "\n" + "Num of Days Ebook for student: " + dayebook + "\n" +
        // "total fines: "
        // + fine);
        // if (library[1] != null)
        // if (dayebook <= 60)
        // fine = dayebook * 0;
        // System.out.println("No fines: " + fine);
        // if (dayebook > 60)
        // fine = (dayebook - 30) * 1;
        // System.out.println(
        // library[1] + "\n" + "Num of Days Ebook for faculty: " + dayebook + "\n" +
        // "total fines: "
        // + fine);
        // }

        // // for the Journal fines
        // for (Item t : library) {
        // dayJournal = ChronoUnit.DAYS.between(t.getDateJournal1(),
        // t.getDateJournal2());
        // if (dayJournal <= 14) {
        // fine = dayJournal * 0;

        // } else if (dayJournal > 14) {
        // fine = dayJournal * 2;
        // fines.addObserver(t);
        // fines.notifyFines("you are under hold fines");
        // System.out.println(
        // library[0] + "\n" + "Num of Days journal: " + dayJournal + "\n" + "total
        // fines: " + fine);
        // }
        // }

        // System.out.print("\n\n\n\n");
        // }
    }
}
