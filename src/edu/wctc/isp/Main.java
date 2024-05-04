package edu.wctc.isp;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

//        System.out.println("Original Program");
//
//        Product book1 = new HardcoverBook("The Hunger Games", "9780439023528",
//                8.79, 12,
//                LocalDate.of(2010, Month.JULY, 3),
//                "Suzanne Collins", 384);
//        Product book2 = new PaperbackBook("A Wrinkle in Time", "9780312367541",
//                6.19, 4,
//                LocalDate.of(2007, Month.MAY, 1),
//                "Madeleine L'Engle", 256);
//        Product record = new VinylRecord("Kind of Blue",
//                13.54, 18,
//                LocalDate.of(2011, Month.APRIL, 12),
//                "Miles Davis", Duration.ofMinutes(46));
//
//        System.out.println(book1.toString());
//        System.out.println("\n");
//        System.out.println(book2.toString());
//        System.out.println("\n");
//        System.out.println(record.toString());

        List<Object> books = new ArrayList<Object>();
        books.add(new HardcoverBook("The Hunger Games", "9780439023528", 8.79, 12,
                LocalDate.of(2010, Month.JULY, 3), "Suzanne Collins", 384));
        books.add(new PaperbackBook("A Wrinkle in Time", "9780312367541", 6.19, 4,
                LocalDate.of(2007, Month.MAY, 1), "Madeleine L'Engle", 256));

        List<Object> albums = new ArrayList<Object>();
        albums.add(new VinylRecord("Kind of Blue", 13.54, 18,
                LocalDate.of(2011, Month.APRIL, 12),
                "Miles Davis", Duration.ofMinutes(46)));

        System.out.println("\nWellcome to the BookStore");
        boolean closeStore = true;
        do {
            System.out.println("\n Type 'b' if you want to see books.\n Type 'r' if you want to see records.\n Type 'a' if you want to see all product.\n Type 'c' if you want to close the app.");
            String chooseOne = key.nextLine();

            if (chooseOne.equals("b")) {
                for (Object book : books) {
                    System.out.println("\n" + book);
                }

            } else if (chooseOne.equals("r")) {
                for (Object album : albums) {
                    System.out.println("\n" + album);
                }
            } else if (chooseOne.equals("a")) {
                for (Object book : books) {
                    System.out.println("\n" + book);
                }
                for (Object album : albums) {
                    System.out.println("\n" + album);
                }

            } else if (chooseOne.equals("c")) {
                closeStore = false;
            }
        } while (closeStore);
    }
}
