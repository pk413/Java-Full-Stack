package Hello.World;

import java.util.Scanner;

public class SimpleBankingApp {
  static int balance = 0;

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    while (true) {
      System.out.println("1. Check balance");
      System.out.println("2. Deposit");
      System.out.println("3. Withdraw");
      System.out.println("4. Exit");
      System.out.print("Enter your choice: ");

      int choice = input.nextInt();

      if (choice == 1) {
        checkBalance();
      } else if (choice == 2) {
        System.out.print("Enter the amount to deposit: ");
        int amount = input.nextInt();
        deposit(amount);
      } else if (choice == 3) {
        System.out.print("Enter the amount to withdraw: ");
        int amount = input.nextInt();
        withdraw(amount);
      } else if (choice == 4) {
        System.out.println("Thank you for using our banking service.");
        break;
      } else {
        System.out.println("Invalid choice, please try again.");
      }
    }
    input.close();
  }

  static void checkBalance() {
    System.out.println("Your current balance is: " + balance);
  }

  static void deposit(int amount) {
    balance += amount;
    System.out.println("Amount of " + amount + " has been deposited successfully.");
    checkBalance();
  }

  static void withdraw(int amount) {
    if (amount > balance) {
      System.out.println("Insufficient balance.");
    } else {
      balance -= amount;
      System.out.println("Amount of " + amount + " has been withdrawn successfully.");
      checkBalance();
    }
  }
}
