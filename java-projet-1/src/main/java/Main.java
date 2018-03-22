import javax.swing.*;
import java.util.Scanner;//calling on java's built-in function that makes user inputs available

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome");
        Scanner userInputs = new Scanner(System.in);
        playerClass emptyFighter = null;

        System.out.println("Do you want yo create a 1) Warrior or a 2) Mage ?");

            int choice = userInputs.nextInt();
        do {//do while loop in order to reprint line 26 explanation if user input !=1 or 2 :)
            userInputs.nextLine();
            switch (choice){
                case 1: System.out.println("You chose to create a Warrior");
                        emptyFighter = new Warrior();
                    break;
                case 2: System.out.println("You chose to create a Mage");
                        emptyFighter = new Mage();
                    break;
                default: System.out.println("Please type : \n'1' for Warrior, \n'2' for Mage");
            }
        } while (choice>2);//even works when user input is not integer!

        System.out.println("Name your Character = " );
        String inputWarriorName = userInputs.nextLine();
        emptyFighter.setFirstName(inputWarriorName);

        System.out.println("You called your Character "+ emptyFighter.getFirstName()+".\n Now assign it an image :" );
        String inputImage = userInputs.nextLine();
        emptyFighter.setImage(inputImage);
        System.out.println("Here's the image you chose : "+emptyFighter.getImage());

        System.out.println("Determine your Character's Health Points (from 1 to 100) = " );
        Integer inputLife = userInputs.nextInt();
        userInputs.nextLine();//empties userInputs' cache - use with nextInt()
        emptyFighter.setLife(inputLife);
        System.out.println("Your Character's Health Points : "+emptyFighter.getLife());

        System.out.println("Determine your Character's Attack Points (from 1 to 100) = " );
        Integer inputAttack = userInputs.nextInt();
        userInputs.nextLine();//empties userInputs' cache - use with nextInt()
        emptyFighter.setAttack(inputAttack);
        System.out.println("Your Character's Attack Points : "+emptyFighter.getAttack());

        if (emptyFighter instanceof Warrior) {
            System.out.println("Weapon type = ");
            String inputWeapon = userInputs.nextLine();
            ((Warrior)emptyFighter).setWeapon(inputWeapon);
            System.out.println("Your Character's Weapon : " + ((Warrior)emptyFighter).getWeapon());
        } else
        {
            System.out.println("Weapon type = ");
            String inputSpell = userInputs.nextLine();
            ((Mage)emptyFighter).setSpell(inputSpell);
            System.out.println("Your Character's Weapon : " + ((Mage)emptyFighter).getSpell());
        }

        System.out.println(emptyFighter);

    }
}
