package Salon;

import java.time.LocalTime;
import java.util.Scanner;

public class test {



    public static void main(String[] args) {
        new test().run();
    }

    private void run() {
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




    }

    public void createTime(){
        Scanner scanner = new Scanner(System.in);
        boolean validTime = true;
        timemanega tidListe = new timemanega();

        for (int i = 0; i < tidListe.tider.size() ; i++) {

            tidListe.getTider().get(i);

        }




    }



    public void reader(){

    }
    public void sender(){
        //ser om den skal bruges
    }


}
