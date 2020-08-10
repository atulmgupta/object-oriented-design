package com.atul.ood.libraryManagementSystem.model;

import com.atul.ood.libraryManagementSystem.enums.ReservationStatus;

import java.util.Date;

public class BookReservation {
    private Date creationDate;
    private ReservationStatus status;
    private String bookItemBarcode;
    private String memberId;

    public static BookReservation fetchReservationDetails(String barcode);
}
