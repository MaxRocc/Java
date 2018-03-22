import javax.swing.*;
import java.util.Scanner;//calling on java's built-in function that makes user inputs available

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome");
        Scanner userInputs = new Scanner(System.in);
        playerClass emptyWarrior = new Warrior();

        System.out.println("Do you want yo create a 1) Warrior or a 2) Mage ?");

            int choice = userInputs.nextInt();
        do {//do while loop in order to reprint line 26 explanation if user input !=1 or 2 :)
            userInputs.nextLine();
            switch (choice){
                case 1: System.out.println("You chose to create a Warrior");
                    break;
                case 2: System.out.println("You chose to create a Mage");
                    break;
                default: System.out.println("Please type : \n'1' for Warrior, \n'2' for Mage");
            }
        } while (choice>2);//even works when user input is not integer!


        System.out.println("Name your character = " );
        String inputWarriorName = userInputs.nextLine();
        emptyWarrior.setFirstName(inputWarriorName);

        System.out.println("You called your character "+ emptyWarrior.getFirstName()+".\n Now assign it an image :" );
        String inputImage = userInputs.nextLine();
        emptyWarrior.setFirstName(inputImage);
        System.out.println(emptyWarrior.getImage());
    }
}
