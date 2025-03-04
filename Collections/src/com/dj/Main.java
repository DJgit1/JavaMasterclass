package com.dj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Theatre theatre = new Theatre("Olympian",8, 12);
//        theatre.getSeats();

//        if (theatre.reserveSeat("H11")){
//            System.out.println("Please Pay");
//        }else {
//            System.out.println("Sorry, seat is taken");
//        }
//
//        if (theatre.reserveSeat("H11")){
//            System.out.println("Please Pay");
//        }else {
//            System.out.println("Sorry, seat is taken");
//        }

//        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
//        printList(seatCopy);

//        seatCopy.get(1).reserve();
        if (theatre.reserveSeat("D12")){
            System.out.println("Please pay for D12");
        }else {
            System.out.println("Seat already reserved");
        }

        if (theatre.reserveSeat("D12")){
            System.out.println("Please pay for D12");
        }else {
            System.out.println("Seat already reserved");
        }

        if (theatre.reserveSeat("B13")){
            System.out.println("Please pay for B13");
        }else {
            System.out.println("Seat already reserved");
        }

        List<Theatre.Seat> reverseSeats = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00",13.00));
        priceSeats.add(theatre.new Seat("A00",13.00));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(priceSeats);

//        Collections.shuffle(seatCopy);
//        System.out.println("Printing seatCopy");
//        printList(seatCopy);
//        System.out.println("Printing theatre.seat");
//        printList(theatre.seats);
//
//        Theatre.Seat minSeat = Collections.min(seatCopy);
//        Theatre.Seat maxSeat = Collections.max(seatCopy);
//        System.out.println("Min seat number is " + minSeat);
//        System.out.println("Max seat number is " + maxSeat);
//
//        sortList(seatCopy);
//        System.out.println("Printing sorted seatCopy");
//        printList(seatCopy);
    }

    public static void printList(List<Theatre.Seat> list){
        for (Theatre.Seat seat: list){
            System.out.print(" " + seat.getSeatNumber() + " $" + seat.getPrice());
        }
        System.out.println();
        System.out.println("==========================================");
    }
}