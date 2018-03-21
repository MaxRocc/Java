import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome");
        Scanner userInputs = new Scanner(System.in);
        playerClass trentReznor = new Warrior();
        System.out.println(trentReznor.getFirstName());

        System.out.println("Do you want yo create a 1) Warrior or a 2) Mage ?");

            int choice = userInputs.nextInt();
            do {

                userInputs.nextLine();
                if (choice == 1)
                {
                    System.out.println("You chose to create a Warrior");
                }
                else if (choice == 2)
                {
                    System.out.println("You chose to create a Mage");
                }
                else
                {
                    System.out.println("Please type '1' for Warrior and '2' for Mage");
                }
            } while (choice>2);


        System.out.println("Name your warrior = " );
        String inputWarriorName = userInputs.nextLine();

        trentReznor.setFirstName(inputWarriorName);

        System.out.println("You called your warrior "+ trentReznor.getFirstName());
    }
}
