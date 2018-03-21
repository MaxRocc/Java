import java.util.Scanner;

public class Wizard extends playerClass {

    public static void main(String[] args)
    {
        Scanner wizardName = new Scanner(System.in);
        System.out.println("Give your wizard a name:");
        String Name = wizardName.nextLine();
        System.out.println("Your wizard's name is: " + Name);
    }
}