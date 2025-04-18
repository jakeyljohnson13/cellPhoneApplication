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

        cellPhone p2 = new cellPhone();

        System.out.print("What is the serial number? ");
        String serial2Input = s.nextLine();
        p2.setSerialNumber(serial2Input);

        System.out.print("What model is the phone? ");
        String model2Input = s.nextLine();
        p2.setModel(model2Input);

        System.out.print("Who is the carrier? ");
        String carrier2Input = s.nextLine();
        p2.setCarrier(carrier2Input);

        System.out.print("What is the phone number? ");
        String phone2Input = s.nextLine();
        p2.setPhoneNumber(phone2Input);

        System.out.print("Who is the owner? ");
        String owner2Input = s.nextLine();
        p2.setOwner(owner2Input);
        System.out.println();

        p1.dial("855-555-2222");
        display(p1);
        display(p2);
        p1.dial(p2.getPhoneNumber());
        p2.dial(p1.getPhoneNumber());

        cellPhone p3 = new cellPhone("0","iPhone"," "," "," ");
        System.out.print("What is the serial number? ");
        String serial3Input = s.nextLine();
        p3.setSerialNumber(serial3Input);

        System.out.print("What model is the phone? ");
        String model3Input = s.nextLine();
        p3.setModel(model3Input);

        System.out.print("Who is the carrier? ");
        String carrier3Input = s.nextLine();
        p3.setCarrier(carrier3Input);

        System.out.print("What is the phone number? ");
        String phone3Input = s.nextLine();
        p3.setPhoneNumber(phone3Input);

        System.out.print("Who is the owner? ");
        String owner3Input = s.nextLine();
        p3.setOwner(owner3Input);
        System.out.println();
        display(p3);
        p3.dial(p1.getPhoneNumber());
        p1.dial(p3.getPhoneNumber());


    }
    public static void display(cellPhone p){
        System.out.println(p.getSerialNumber());
        System.out.println(p.getModel());
        System.out.println(p.getCarrier());
        System.out.println(p.getPhoneNumber());
        System.out.println(p.getOwner());
        System.out.println();
    }
}