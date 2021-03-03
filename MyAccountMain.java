package TDD;

import java.util.Scanner;

public class MyAccountMain {
    public static void main(String[] args) {



         MyAccount account = new MyAccount();
         Scanner userInput = new Scanner(System.in);

         String prompt = """
                 Hello user,
                 Welcome to Blackie Bank.
                 -> Enter 1 to check balance.
                 -> Enter 2 to withdraw.
                 -> Enter 3 to deposit
                 """;

        System.out.println(prompt);
        int userSelection = userInput.nextInt();

        switch (userSelection) {
            case 1 -> System.out.println(account.getBalance);
            case 2 -> System.out.println(account.withdraw + account.getPin);
            case 3 -> System.out.println(account.deposit);
            default -> System.out.println("invalid number");
        }

    }
}
