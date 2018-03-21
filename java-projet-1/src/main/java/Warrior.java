import java.util.Scanner;

public class Warrior extends playerClass {

    public static void main(String[] args)
    {
        Scanner warriorName = new Scanner(System.in);
        System.out.println("Give your warrior a name:");
        String Name = warriorName.nextLine();
        System.out.println("Your warrior's name is: " + Name);
    }
}