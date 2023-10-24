package Salon;

import java.util.Scanner;

public class Menu {
    private String header;
    private String[] menuItems;
    private String welcomeText;



    Menu(String header,String[] menuItems,String welcomeText){
        setHeader(header);
        setMenuItems(menuItems);
        setWelcomeText(welcomeText);
    }

    public void printMenu(){
        String menulist = header + "\n";
        for (int i = 0; i < menuItems.length; i++) {
            menulist += menuItems[i] + "\n";
        }
        System.out.println("\n" + menulist);
    }

    public int nextChoice(){
        System.out.println(welcomeText + "\n");
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        boolean validchoice = true;
        while (validchoice){
            if(choice == 0){
                choice = scanner.nextInt();
                validchoice = false;
            }else{
                scanner.nextInt();
            }
        }
        return choice;

    }

    public String[] getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(String[] menuItems) {
        this.menuItems = menuItems;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getWelcomeText() {
        return welcomeText;
    }

    public void setWelcomeText(String welcomeText) {
        this.welcomeText = welcomeText;
    }
}
