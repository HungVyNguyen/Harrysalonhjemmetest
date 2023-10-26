package Salon;

import java.time.LocalTime;
import java.util.Scanner;

public class tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validTime = true;
        timemanega tidListe = new timemanega();


        for (int i = 1; i < 10 ; i++) {
            int hour = 9;
            int min = 0;
            LocalTime tid = LocalTime.of((hour)+i,min);
            String name = null;
            String email= null;
            int telefon = 0;


            kunden kunden1 = new kunden(tid,name,email,telefon);

            tidListe.addNewTime(kunden1);
        }

        for (int i = 0; i < tidListe.getTider().size(); i++) {
            System.out.println(tidListe.getTider().get(i));
        }


        System.out.println("Hvad tid vil du have en person?");
        int tider = 0;
        tider = scanner.nextInt();
        while (validTime){

            if (tider >= 10 && tider <= 18) {
                tider = tider - 10;
                validTime = false;
            } else {
                System.out.println("denne tid er ikke i kalænderen");
                tider = scanner.nextInt();
            }
        }
        scanner.nextLine();//scannerbug
        System.out.println("\nHvad hedder personen?");
        String navn = scanner.nextLine();
        tidListe.getTider().get(tider).setName(navn);
        System.out.println("\nHvad er emailen på personen?");
        String email = scanner.nextLine();
        tidListe.getTider().get(tider).setEmail(email);
        System.out.println("\nHvad er telefonnummer på personen? (vi er i danmark så der behøves ikke +45)");
        int telefonNummer = scanner.nextInt();
        tidListe.getTider().get(tider).setTelefonnummer(telefonNummer);

        System.out.println("-..............- ");
        for (int i = 0; i < tidListe.getTider().size(); i++) {
            System.out.println(tidListe.getTider().get(i));
        }




    }
}
