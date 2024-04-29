 import java.util.Scanner;

    class BankAccount {
       int id;
       int pin;
       String name;
       double balance;

    public BankAccount(int id, int pin, String name, double balance) {
        this.id = id;
        this.pin = pin;
        this.name = name;
        this.balance = balance;
}

   
    public int getId() {
        return id;
}
    
    public int getPin() {
        return pin;
}

    public String getName() {
        return name;
}

    public double getBalance() {
        return balance;
}

   
    public void checkBalance() {
        System.out.println("Balance for " + name + ": $" + balance);
}

   
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + ". New balance: $" + balance);
}

    public void transfer(BankAccount recipient, double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            recipient.deposit(amount);
            System.out.println("Transferred $" + amount + " to " + recipient.getName());
        } else {
            System.out.println("Invalid transfer amount or insufficient funds. Transfer canceled.");
        }
    }
}

    public class BankingApp {
        public static void main(String[] args) {
        
          BankAccount account1 = new BankAccount(412435, 7452, "Chris Sandoval", 32000);
          BankAccount account2 = new BankAccount(264863, 1349, "Marc Yim", 1000);

        
          Scanner scanner = new Scanner(System.in);

       
        System.out.println("Login first");
        System.out.print("Enter your user ID: ");
        int userId = scanner.nextInt();
        System.out.print("Enter your PIN: ");
        int pin = scanner.nextInt();

        BankAccount currentUser = null;

        if (userId == account1.getId() && pin == account1.getPin()) {
            currentUser = account1;
        } else if (userId == account2.getId() && pin == account2.getPin()) {
            currentUser = account2;
        } else {
            System.out.println("Invalid credentials. Exiting...");
            System.exit(0);
}

        
        int choice;
        do {
            System.out.println("\nWelcome, " + currentUser.getName() + "!");
            System.out.println("1. Check Balance");
            System.out.println("2. Cash-in (Deposit Money)");
            System.out.println("3. Money Transfer");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    currentUser.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    currentUser.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter recipient's user ID: ");
                    int recipientId = scanner.nextInt();
                    BankAccount recipient = (recipientId == account1.getId()) ? account1 : account2;
                    System.out.print("Enter transfer amount: $");
                    double transferAmount = scanner.nextDouble();
                    currentUser.transfer(recipient, transferAmount);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 4);

        
        scanner.close();
    }
}
