package com.pluralsight;
import java.util.Scanner;
import java.util.SequencedSet;

public class Main {
    public static void main(String[] args) {
        cellPhone p1 = new cellPhone();
        Scanner s = new Scanner(System.in);

        System.out.print("What is the serial number? ");
        String serialInput = s.nextLine();
        p1.setSerialNumber(serialInput);

        System.out.print("What model is the phone? ");
        String modelInput = s.nextLine();
        p1.setModel(modelInput);

        System.out.print("Who is the carrier? ");
        String carrierInput = s.nextLine();
        p1.setCarrier(carrierInput);

        System.out.print("What is the phone number? ");
        String phoneInput = s.nextLine();
        p1.setPhoneNumber(phoneInput);

        System.out.print("Who is the owner? ");
        String ownerInput = s.nextLine();
        p1.setOwner(ownerInput);
        System.out.println();

        System.out.println(p1.getSerialNumber());
        System.out.println(p1.getModel());
        System.out.println(p1.getCarrier());
        System.out.println(p1.getPhoneNumber());
        System.out.println(p1.getOwner());

    }
}