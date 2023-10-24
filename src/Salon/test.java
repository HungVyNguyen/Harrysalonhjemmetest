package Salon;

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





    }


}
