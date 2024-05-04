package edu.wctc.isp;

import java.time.LocalDate;

public interface Product {

    double getCost();

    String getFormattedReleaseDate();

    String getISBN();

    int getQuantityOnHand();

    LocalDate getReleaseDate();

    String getTitle();

    void order(int quantity);

}
