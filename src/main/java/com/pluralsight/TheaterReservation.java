package com.pluralsight;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Please enter your name: Geri Johnson↵
        System.out.print("Please enter your Full Name: ");
        String userInput = sc.nextLine().trim();

        String[] parts = userInput.split(" ");

        String firstName = parts[0];
        String lastName = parts[1];

        // What date will you be coming (MM/dd/yyyy): 05/13/2023↵
        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String scheduledDate = sc.next();

        // How many tickets would you like?
        System.out.print("How many ticket(s) would you like? ");
        int numOfTickets = sc.nextInt();


        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date = LocalDate.parse(scheduledDate, format);

        // # ticket(s) reserved for (date) under (LastName, FirstName)

        if (numOfTickets > 1){
            System.out.println(numOfTickets + " " + "tickets reserved for " + scheduledDate   + " under " + parts[1] + "," + parts[0] );
        }else{
            System.out.println(numOfTickets + " " + "ticket reserved for " +  scheduledDate  + " under " + parts[1] + "," + parts[0]);
        }




    }
}
