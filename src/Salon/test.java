package Salon;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class test {


    private ArrayList<String> tider;



    test(){
        tider = new ArrayList<>();
    }
    public static void main(String[] args) {
        new test().run();
    }

    private void run() {




        /*
        Scanner scanner = new Scanner(System.in);
        boolean isharry = true;
        frisør harryskonto = new frisør("123","123");
        frisør reviser = new frisør("123","321");
        frisør bruger1 = null;
        while(isharry){

            System.out.println("Username: ");
            String username = scanner.nextLine();
            System.out.println("Password: ");
            String password = scanner.nextLine();

            bruger1 = new frisør(username,password);
            if (bruger1.equals(harryskonto)){
                System.out.println("welcome harry");
                isharry = false;
            }else if(bruger1.equals(reviser)){
                System.out.println("welcome reviser");
                isharry = false;
            }
            else{
                System.out.println("ikke en rigtig bruger, angiv en bruger");
            }


        }

        String[] menuItems = {"1. Add ny tid","2. View tider","3. Ændre/Slet tider","4. Afslut"};
        Menu menu = new Menu("MENU",menuItems,"Welcome to the bookingsystem, what would you like to do");

        boolean choice = true;
        int choice2;
        while (choice){

            menu.printMenu();
            choice2 = menu.nextChoice();
            switch (choice2){
                case 1:
                    System.out.println("hey");
                    break;
                case 2:
                    System.out.println("yo");
                    break;
                case 3:
                    System.out.println("ayoo");
                    break;
                case 4:
                    System.out.println("You have quitted");
                    choice = false;
                    break;
                default:
                    System.out.println("invallidt choice");
                    break;

            }
        }


*/
        sender();
        reader();

    }

    public void createTime(){

    }



    public void changeTime(){
        Scanner scanner = new Scanner(System.in);
        boolean validTime = true;
        System.out.println("Hvad tid vil du have en person?");
        int tider2 = 0;
        tider2 = scanner.nextInt();
        while (validTime){

            if (tider2 >= 10 && tider2 <= 18) {
                tider2 = tider2 - 10;
                validTime = false;
            } else {
                System.out.println("denne tid er ikke i kalænderen");
                tider2 = scanner.nextInt();
            }
        }
        scanner.nextLine();//scannerbug
        System.out.println("\nHvad hedder personen?");
        String navn = scanner.nextLine();
       // tider.get(tider2).setName(navn);
        System.out.println("\nHvad er emailen på personen?");
        String email = scanner.nextLine();
        //tider.get(tider2).setEmail(email);
        System.out.println("\nHvad er telefonnummer på personen? (vi er i danmark så der behøves ikke +45)");
        int telefonNummer = scanner.nextInt();
        //tider.get(tider2).setTelefonnummer(telefonNummer);

        System.out.println("-..............- ");
        for (int i = 0; i < tider.size(); i++) {
            System.out.println(tider.get(i));
        }
    }
    public void reader() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
        System.out.println("Skriv dagen du har lyst til at ændre tiden");
        System.out.println("år?");
        int year = scanner.nextInt();
        System.out.println("måned");
        int month = scanner.nextInt();
        System.out.println("dag?");
        int day = scanner.nextInt();
        LocalDate dato = LocalDate.of(year, month, day);
        String dato2 = dato.toString();
        String value;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(dato2+".txt"));


            while ((value = bufferedReader.readLine()) != null) {
                strings.add(value);
            }
            System.out.println("angiv en tid du vil ændre");
            int tid = scanner.nextInt();

            String[] dele = strings.get(tid).split(", ");

            for (int i = 0; i < dele.length; i++) {
                if (dele[i].startsWith("name=")) {
                    dele[i] = "name= 'Hassan'";
                }
            }
            for (int i = 0; i < dele.length; i++) {
                if (dele[i].startsWith("email=")) {
                    dele[i] = "email= 'Alpha.com'";
                }
            }
            for (int i = 0; i < dele.length; i++) {
                if (dele[i].startsWith("telefonnummer")) {
                    dele[i] = "telefonnummer= 234234234";
                }
            }

            String updatedLineHassan = String.join(", ", dele);

            strings.set(tid, updatedLineHassan);
            // Save the changes back to the file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(dato2+".txt"))) {
                for (int i = 0; i <strings.size() ; i++) {
                    writer.write(strings.get(i));
                    writer.newLine();
                }


            }

            for (int i = 0; i < strings.size(); i++) {
                System.out.println(strings.get(i));
                tider.add(strings.get(i) + "");
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void sender(){

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Opret en dag");
            System.out.println("år?");
            int year = scanner.nextInt();
            System.out.println("måned");
            int month = scanner.nextInt();
            System.out.println("dag?");
            int day = scanner.nextInt();
            LocalDate dato = LocalDate.of(year, month, day);
            String dato2 = dato.toString();
            File file = new File(dato2 + ".txt");
            // Tjek om filen allerede eksisterer
            // Eneste problem ved den er hvis en fil hedder datoen og ikke har noget virker den ikke rigtig
            // Man kan prøve at lave en READER der reader filen og derefter lave en if statement hvor hvis der er noget som helts i filen eller ej skal den lave denne filen/override, blev træt :(
            if (file.exists()) {
                System.out.println("Filen eksisterer allerede.");
            } else {
                PrintStream outFile = new PrintStream(file);

                for (int j = 0; j < 9; j++) {
                    int hour = 10;
                    int min = 0;
                    LocalTime tid = LocalTime.of((hour) + j, min);
                    String name = null;
                    String email = null;
                    int telefon = 0;

                    kunden kunden1 = new kunden(tid, name, email, telefon);

                    tider.add(kunden1 + "");
                    outFile.println(tider.get(tider.size() - 1));
                }


                System.out.println("Filen er oprettet og data er skrevet.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Fejl: Filen kunne ikke oprettes.");
        }


    }


}
