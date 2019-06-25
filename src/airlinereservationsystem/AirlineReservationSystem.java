package airlinereservationsystem;
import java.util.Scanner;

public class AirlineReservationSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean[] seat = new boolean[10];
//        boolean[] economyClass = new boolean[5];
        int firstPosition = 0;
        int economyPosition = 5;
        int option;
        int capacity = 10;
        
    
        while (capacity > 0){
       System.out.println("Please type 1 for First Class");
       System.out.print("Please type 2 for Economy: ");
        option = input.nextInt();
        
        System.out.println("Choice: " + option);
        
        if(option < 1 || option > 2 ){
               System.out.println("Option Invalid");
        } else if(option == 1){
            if(firstPosition >= 5){
                System.out.println("First Class is full, Economy Class?");
                System.out.print("1, Yes, 2. No. ");
                option = input.nextInt();
                System.out.println("Your choice: " + option);
                if(option == 1 ){
                    if ( economyPosition >= 10){
                        break;
                    } else {
                    seat[economyPosition] = true;
                    System.out.println("Economy Class. Seat #" + economyPosition);
                    System.out.println(" ");
                    economyPosition++;
                    }
                } else if(option == 2){
                    System.out.println("Next flight leaves in 3 hours.");
                    System.out.println(" ");
                } else {
                    System.out.println("Invalid Option!!!!");
                }
        
            } else{
                seat[firstPosition] = true;
                firstPosition++;
                System.out.println("First Class. Seat #" + firstPosition);
                System.out.println(" ");
                
            }
            
        } else if(option == 2){
            if(economyPosition >= 10){
                System.out.println("Economy Class is full, First Class?");
                System.out.print("1, Yes, 2. No. ");
                option = input.nextInt();
                System.out.println("Your choice: " + option);
                if(option == 1 ){
                    if ( firstPosition >= 5){
                        break;
                    } else {
                    seat[firstPosition] = true;
                    System.out.println("First Class. Seat #" + firstPosition);
                    System.out.println(" ");
                    firstPosition++;
                    }
                } else if(option == 2){
                    System.out.println("Next flight leaves in 3 hours.");
                    System.out.println(" ");
                } else {
                    System.out.println("Invalid Option!!!!");
                }
        
            } else{
                seat[economyPosition] = true;
                economyPosition++;
                System.out.println("Economy Class. Seat #" + economyPosition);
                System.out.println(" ");
                
            }
            
        }
        
        }
        
        System.out.println("The plane is now full");
//      

    }    
}
