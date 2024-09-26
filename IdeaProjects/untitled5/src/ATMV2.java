import java.util.Scanner;
public class ATMV2 {
    public static void main(String[] args) {
int choice = 0;
String [] userNames = new String [10];
double [] balances = new double[10];
double depositAmount;
double withdrawAmount;
String NametoCheck;

int userCount = 0;

Scanner scanner = new Scanner(System.in);
        do {
        System.out.println("Welcome to Panini's ATM System! Please create an account first.");
        System.out.println("Menu: ");
        System.out.println("1. Add a new user");
        System.out.println("2. Check balance");
        System.out.println("3. Deposit to Account");
        System.out.println("4. Withdraw from Account");
        System.out.println("5. View Account Summary");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();

        //switch

    switch (choice) {
        case 1:
            //add new user
            if (userCount < 10) {
                System.out.print("Enter your name: ");
                userNames[userCount] = scanner.next();
                System.out.print("Enter your initial deposit: ");
                balances[userCount] = scanner.nextDouble();


                System.out.println("Account created for " + userNames[userCount]);
                System.out.println(userNames[userCount] + "'s initial  balance is " + balances[userCount]);
                userCount++;

            } else {
                System.out.println("Account limit reached, sorry!");
            }
            break;

        case 2:
            //check balance
            System.out.print("Enter your account name to check: ");
            NametoCheck = scanner.next();
            boolean userFound = false;

            for (int i = 0; i < userCount; i++) {

                if (userNames[i].equalsIgnoreCase(NametoCheck)) {
                    System.out.println("Balance is " + balances[i]);
                    userFound = true;
                    break;
                } if (!userFound) {
                    System.out.println("Sorry, user not found!");

                }

            }
            break;


        case 3:
            //deposit
            System.out.print("Enter your account name to deposit to: ");
            String NametoDeposit = scanner.next();
            userFound = false;

            for (int i = 0; i < userCount; i++) {
                if (userNames[i].equalsIgnoreCase(NametoDeposit)) {
                    userFound = true;
                    System.out.print("Enter the amount to deposit: ");
                    depositAmount = scanner.nextDouble();
                    balances[i] += depositAmount;
                    System.out.println(depositAmount + " has been deposited. Your new balance is " + balances[i]);

                    break;
                }

                if (!userFound) {
                    System.out.println("User not found. Sorry, no deposits!");

                }
            }
            break;
        case 4:
            System.out.print("Enter your account name to withdraw from: ");
            String NametoWithdraw = scanner.next();
            userFound = false;

            for (int i = 0; i < userCount; i++) {
                if (userNames[i].equalsIgnoreCase(NametoWithdraw)) {
                    System.out.println("Enter your amount to withdraw: ");
                    withdrawAmount = scanner.nextDouble();
                    userFound = true;
                    if (withdrawAmount > balances[i]) {
                        System.out.println("Sorry, withdraw value exceeds your balance!");

                    } else if (withdrawAmount <= balances[i]) {
                        balances[i] -= withdrawAmount;
                        System.out.println(withdrawAmount + " has been withdrawn from your account, your new balance is " + balances[i]);

                    } else if (withdrawAmount < 0) {
                        System.out.println("Please input a valid number!");
                        break;

                    }

                } if (!userFound) {
                    System.out.println("User not found. Sorry, no withdrawing!");
                    break;
                }
            }
            break;
        case 5:
            System.out.print("Enter the account to summarize: ");
            String NametoSummarize = scanner.next();
            userFound = false;

            for (int i = 0; i < userCount; i++) {
                if (userNames[i].equalsIgnoreCase(NametoSummarize)) {
                    userFound = true;
                    System.out.println("User: " + userNames[i] + " || Total Balance: " + balances[i]);
                    break;
                } if (!userFound) {
                    System.out.println("User not found, sorry!");

                }
                break;
            }
        case 6:
            System.out.println("Thank you for using Panini ATM!");
            break;

        default:
            System.out.println("Invalid choice.");
            break;
    }

}    while (true);
    }
}
