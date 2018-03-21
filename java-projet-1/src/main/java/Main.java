import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome");
        Scanner sc = new Scanner(System.in);
        playerClass trentReznor = new Warrior();
        System.out.println(trentReznor.getFirstName());

        Scanner classChoice = new Scanner(System.in);

        int choice = classChoice;

        if (choice = 1)
        {

        }
        else
        {

        }


        System.out.println("Name your warrior = " );
        String inputNameW = sc.nextLine();

        trentReznor.setFirstName(inputNameW);

        System.out.println("You called your warrior "+ trentReznor.getFirstName());
    }
}
