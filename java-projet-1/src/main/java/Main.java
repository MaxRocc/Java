import java.util.Scanner;//calling on java's built-in function that makes user inputs available

public class Main {

    private static Scanner userInputs = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Welcome");

        PlayerClass emptyFighter = null;

        System.out.println("Do you want yo create a 1) Warrior or a 2) Mage ?");

        int choice = userInputs.nextInt();
        userInputs.nextLine();
        do {//do while loop in order to reprint line 26 explanation if user input !=1 or 2 :)
            switch (choice){
                case 1: System.out.println("You chose to create a Warrior");
                        emptyFighter = new Warrior();
                    break;
                case 2: System.out.println("You chose to create a Mage");
                        emptyFighter = new Mage();
                    break;
                default: System.out.println("Please type : \n'1' for Warrior, \n'2' for Mage");
                    break;
            }
        } while (choice<3);//even works when user input is not an integer!

        /*Calling of name input and printing method*/
        callYourCharacter(emptyFighter);

        /*Calling of image input and printing method*/
        drawYourCharacter(emptyFighter);

        /*Calling health points input and printing method*/
        healYourCharacter(emptyFighter);

        /*Calling attack points input and printing method*/
        attackYourCharacter(emptyFighter);

        if (emptyFighter instanceof Warrior) {//if emptyFighter is an instance of the Warrior class, then
            System.out.println("Weapon type = ");
            String inputWeapon = userInputs.nextLine();
            ((Warrior)emptyFighter).setWeapon(inputWeapon);
            System.out.println("Your Character's Weapon : " + ((Warrior)emptyFighter).getWeapon());
        } else
        {
            System.out.println("Spell type = ");
            String inputSpell = userInputs.nextLine();
            ((Mage)emptyFighter).setSpell(inputSpell);
            System.out.println("Your Character's Spell : " + ((Mage)emptyFighter).getSpell());
        }
        /*Character information review cf. PlayerClass*/
        System.out.println("Do you want to review your character's information? 1) Yes - 2) No");
        int infoDisplay = userInputs.nextInt();
        userInputs.nextLine();//empties Scanner's cache after nextInt()
        switch (infoDisplay){
            case 1: System.out.println(emptyFighter);
                break;
            case 2: System.out.println("The programm will shortly end");
                break;
            case 3: System.out.println("2... 1... BANG !!!!");
                break;
        }

    }

    /*Name input and printing*/
    public static void callYourCharacter(PlayerClass emptyFighter) {
        System.out.println("Name your Character = ");
        String inputWarriorName = userInputs.nextLine();
        emptyFighter.setFirstName(inputWarriorName);
        System.out.println("You called your Character " + emptyFighter.getFirstName());
    }

    /*Image input and printing*/
    public static void drawYourCharacter(PlayerClass emptyFighter) {
        System.out.println("Now assign it an image :" );
        String inputImage = userInputs.nextLine();
        emptyFighter.setImage(inputImage);
        System.out.println("Here's the image you chose : "+emptyFighter.getImage());
    }
        /*Health points input and printing*/
    public static void healYourCharacter(PlayerClass emptyFighter) {
        System.out.println("Determine your Character's Health Points (from 1 to 100) = " );
        Integer inputLife = userInputs.nextInt();
        userInputs.nextLine();//empties Scanner's cache after nextInt()
        emptyFighter.setLife(inputLife);
        System.out.println("Your Character's Health Points : "+emptyFighter.getLife());
        }

    /*Attack points input and printing*/
    public static void attackYourCharacter(PlayerClass emptyFighter) {
        System.out.println("Determine your Character's Attack Points (from 1 to 100) = ");
        Integer inputAttack = userInputs.nextInt();
        userInputs.nextLine();//empties Scanner's cache after nextInt()
        emptyFighter.setAttack(inputAttack);
        System.out.println("Your Character's Attack Points : " + emptyFighter.getAttack());
    }
}