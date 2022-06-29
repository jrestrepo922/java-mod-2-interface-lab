import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Integer birdType = Main.getUserInput(scanner, false); 
            Integer monsterSpeed = Main.getUserInput(scanner, true);
            
            CanFly userBird; 

            if(birdType == 1){
                 userBird = new Falcon(); 
            } else {    
                 userBird = new AmericanWoodcock(); 
            }

            if(userBird.fly() > monsterSpeed ){
                System.out.println("The bird escaped");
            } else {
                System.out.println(" The bird got eaten");
            }

        } catch (Exception e) {
            System.out.println("Something when wrong");
        }
    }


    // create a method that takes in user input
    private static Integer getUserInput(Scanner scanner, Boolean isMonster){
        if(isMonster){
            System.out.println("Please provide the speed for the monster");
        } else {
            System.out.println("Please either select the bird");
            System.out.println("Falcon type 1");
            System.out.println("American Woodcodk 2");
        }
        String  input = scanner.nextLine();

        return Integer.parseInt(input); 
    }


}
