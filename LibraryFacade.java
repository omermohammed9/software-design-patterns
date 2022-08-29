//lawen hunar jamal lh19274
//omar mohammed abbas om17102

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class LibraryFacade { // facade design pattern
    public StudentBuilder studentBuilder = new StudentBuilder();
    public facultyBuilder facultyBuilder = new facultyBuilder();
    FinesClass fines = new FinesClass();
    double fine = 0;
    long daybook = 0;
    long dayebook = 0;
    long dayJournal = 0;

    public void registerUser() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of borrowers: ");
        int numofborrowers = input.nextInt();
        Borrower[] br = new Borrower[numofborrowers];
        for (int i = 0; i < numofborrowers; i++) {
            System.out.println("Register user by Choosing words student/faculty/staff");
            String s = input.next();
            if (s.equals("student")) {
                System.out.println("Enter the ID of student");
                int id = input.nextInt();
                System.out.println("Enter firstname of student");
                String firstname = input.next();
                System.out.println("Enter lastname of student");
                String lastname = input.next();
                System.out.println("Enter the Join date: ");
                String joindate = input.next();
                System.out.printf("User Registered: \n ",
                        br[i] = studentBuilder.ID(id).firstName(firstname).lastName(lastname).dateJoined(joindate)
                                .build()); // DSL

            } else if (s.equals("faculty") || s.equals("staff")) {
                System.out.println("Enter the ID of faculty/staff");
                int id = input.nextInt();
                System.out.println("Enter firstname of faculty/staff");
                String firstname = input.next();
                System.out.println("Enter lastname of faculty/staff");
                String lastname = input.next();
                System.out.println("Enter the Join date: ");
                String joindate = input.next();
                System.out.println("Enter the name of department");
                String department = input.next();
                System.out.println("Enter the office place");
                String office = input.next();
                System.out.printf("User Registered: \n",
                        br[i] = facultyBuilder.ID(id).firstName(firstname).lastName(lastname).dateJoined(joindate)
                                .department(department).Office(office).build());

            }
        }
        for (Borrower user : br)
            if (user != null)
                System.out.println(user);

        // To check the fines and print the items for the specific user
        System.out
                .println("Enter the number of borrowers that you want to know which things they have and the fines: ");
        int numofborrower = input.nextInt();
        Item[] lib = new Library[numofborrower];
        Borrower[] bor = new Borrower[numofborrower];
        for (int i = 0; i < numofborrower; i++) {
            System.out.println("Register user by Choosing words student/faculty/staff");
            String s = input.next();
            if (s.equals("student")) {
                System.out.println("Enter the ID of student");
                int id = input.nextInt();
                System.out.println("Enter firstname of student");
                String firstname = input.next();
                System.out.println("Enter lastname of student");
                String lastname = input.next();
                System.out.println("Enter the Join date: ");
                String joindate = input.next();
                System.out.printf("User Registered\n ", bor[i] = studentBuilder.ID(id)
                        .firstName(firstname).lastName(lastname).dateJoined(joindate).build()); // DSL
            } else if (s.equals("faculty") || s.equals("staff")) {
                System.out.println("Enter the ID of faculty/staff");
                int id = input.nextInt();
                System.out.println("Enter firstname of faculty/staff");
                String firstname = input.next();
                System.out.println("Enter lastname of faculty/staff");
                String lastname = input.next();
                System.out.println("Enter the Join date: ");
                String joindate = input.next();
                System.out.println("Enter the name of department");
                String department = input.next();
                System.out.println("Enter the office place");
                String office = input.next();
                System.out.printf("User Registered \n",
                        bor[i] = facultyBuilder.ID(id).firstName(firstname).lastName(lastname).dateJoined(joindate)
                                .department(department).Office(office).build()); // DSL
            }
            System.out.println("Enter the book: ");
            String book = input.next();

            System.out.println("Enter the issue date for the book: ");
            String issueDateBook = input.next();

            System.out.println("Enter the the return date for the book: ");
            String returnDateBook = input.next();

            System.out.println("Enter the Ebook: ");
            String Ebook = input.next();

            System.out.println("Enter the issue date for the Ebook: ");
            String issueDateEbook = input.next();

            System.out.println("Enter the return date for the Ebook: ");
            String returnDateEbook = input.next();

            System.out.println("Enter the the journal: ");
            String journal = input.next();

            System.out.println("Enter the issue date for the journal: ");
            String issueDateJournal = input.next();

            System.out.println("Enter the return date for the journal: ");
            String returnDateJournal = input.next();

            System.out.println("Enter the dissertation: ");
            String dissertation = input.next();

            System.out.println("Enter the the issue date for the dissertation: ");
            String issueDateDissertation = input.next();

            System.out.println("Enter the the return date for the dissertation: ");
            String returnDateDissertation = input.next();

            lib[i] = new Library(bor[i], book, LocalDate.parse(issueDateBook),
                    LocalDate.parse(returnDateBook), Ebook,
                    LocalDate.parse(issueDateEbook), LocalDate.parse(returnDateEbook), journal,
                    LocalDate.parse(issueDateJournal), LocalDate.parse(returnDateJournal),
                    dissertation,
                    LocalDate.parse(issueDateDissertation),
                    LocalDate.parse(returnDateDissertation));

        }
        for (Borrower user : bor)
            if (user != null)
                System.out.println(user);
        // check fines for book
        for (Item y : lib) {
            daybook = ChronoUnit.DAYS.between(y.getDate1book(), y.getDate2Book());
            if (y != null)
                if (daybook <= 30)
                    fine = daybook * 0;
                else if (daybook > 30)
                    fine = (daybook - 30) * 1;
            System.out.println(
                    y + "\n" + "Num of Days book for student: " + daybook + "\n" +
                            "total fines: " + fine);
            if (y != null)
                if (daybook <= 60)
                    fine = daybook * 0;
                else if (daybook > 60) {
                    fine = (daybook - 30) * 1;
                    fines.addObserver(y); // observer
                }
            System.out.println(
                    y + "\n" + "Num of Days book for faculty: " + daybook + "\n" +
                            "total fines: " + fine);

            // check fines for the Ebook
            for (Item x : lib) {
                dayebook = ChronoUnit.DAYS.between(x.getDateEbook1(), x.getDateEbook2());
                if (dayebook <= 60)
                    fine = dayebook * 0;
                System.out.println("No fines: " + fine);
                if (dayebook > 60)
                    fine = (dayebook - 60) * 1;
                System.out.println(
                        x + "\n" + "Num of Days Ebook for student: " + dayebook + "\n" +
                                "total fines: "
                                + fine);
                if (x != null)
                    if (dayebook <= 60)
                        fine = dayebook * 0;
                System.out.println("No fines: " + fine);
                if (dayebook > 60)
                    fine = (dayebook - 30) * 1;
                System.out.println(
                        x + "\n" + "Num of Days Ebook for faculty: " + dayebook + "\n" +
                                "total fines: "
                                + fine);
            }

            // for fines the Journal fines
            for (Item t : lib) {
                dayJournal = ChronoUnit.DAYS.between(t.getDateJournal1(),
                        t.getDateJournal2());
                if (dayJournal <= 14) {
                    fine = dayJournal * 0;

                } else if (dayJournal > 14) {
                    fine = dayJournal * 2;
                    fines.addObserver(t); // observer
                    fines.notifyFines("you are under hold fines");
                    System.out.println(
                            t + "\n" + "Num of Days journal: " + dayJournal + "\n" + "total fines: " + fine);
                }
            }
        }
    }
}