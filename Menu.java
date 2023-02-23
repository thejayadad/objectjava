import java.util.Scanner;

public class Menu {
    double fries = 2.00;
    double hamburger = 5.00;
    double salad = 6.00;
    double total = 0;
    int option;
    double quanity;
    String more;


    public void displayMenu(){
        System.out.println("**WELCOME TO THE DINER**");
        System.out.println("========================");
        System.out.println("**********MENU***********");
        System.out.println(" 1. French Fries....2.00 ");
        System.out.println(" 2. Hamburgers....5.00   ");
        System.out.println(" 3. Salad....6.00        ");
        System.out.println("========================");
        System.out.println("What would you like to order today?");
    }
    //ORDER ITEMS
    public void order(){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Please enter your options");
            option = scan.nextInt();
            switch(option){
                case 1:
                    System.out.println("Selected French Fries");
                    System.out.println();
                    System.out.println("Please enter your quanity");
                    quanity = scan.nextInt();
                    total = total + (quanity * fries);
                    break;
                case 2:
                    System.out.println("Selected Hamburger");
                    System.out.println();
                    System.out.println("Please enter your quanity");
                    quanity = scan.nextInt();
                    total = total + (quanity * hamburger);
                    break;
                case 3:
                    System.out.println("Selected Salad");
                    System.out.println();
                    System.out.println("Please enter your quanity");
                    quanity = scan.nextInt();
                    total = total + (quanity * salad);
                    break;
                case 4:
                    System.exit(1);
                    break;

                default: break;
            }
            System.out.println();
            System.out.println("Would you like anything else? (y/n)");
            more = scan.next();
            if(more.equalsIgnoreCase("y")){
                order();
            } else if(more.equalsIgnoreCase("n")){
                generateBill();
                System.exit(1);
            } else {
                System.out.println("Invalid Choice");
            }
        }
    }
    //GENERATE BILL//
    public void generateBill(){
        System.out.println();
        System.out.println("**THANK YOU FOR ORDERING WITH US**");
        System.out.println("Your Total: " + total);
    }

}
