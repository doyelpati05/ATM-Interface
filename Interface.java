import java.util.Scanner;
public class Interface {
    int amount, d, w;
    public static void main(String[] args) {
        Bank b= new Bank();
        b.total();
        Scanner sc = new Scanner(System.in);
        while(true) {
        System.out.println("Welcome to the ATM Interface!");
        System.out.println("This is a placeholder for ATM operations.");
        System.out.println("Choose an operation\n 1 for deposit \n 2 for withdraw\n 3 for checking the balance\n 4 for exit: ");
        int n = sc.nextInt();
        switch(n){
            case 1:
                System.out.println("You chose to deposit.");
                System.out.println("Hello Sir/Madam, please enter the amount you want to deposit: ");
                double d=sc.nextDouble();
                System.out.println("You have successfully deposited " + d + ". Your new balance is " + b.deposit(d) + ".");
                break;
            case 2:
                System.out.println("You chose to withdraw.");
                System.out.println("Hello Sir/Madam, please enter the amount you want to withdraw: ");
                double w = sc.nextDouble();
                System.out.println("You have successfully withdrawn " + w + ". Your new balance is " + b.withdraw(w) + ".");
                break;
            case 3:
                System.out.println("You chose to check balance.");
                // Call check balance method
                b.checkBalance ();
                break;
            case 4:
                System.out.println("Exiting...Thank you for using our ATM Interface!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
    }
}

class Bank{
    String name;
    String accountNumber;
    double amount;
    Scanner sc = new Scanner(System.in);
    public Bank() {
        System.out.println("Enter the name of the account holder: ");
        name = sc.nextLine();
        System.out.println("Enter the account number: ");
        accountNumber = sc.nextLine();
        System.out.println("Enter the initial amount in the account: ");
        amount = sc.nextDouble();
    }
    public void total(){
        System.out.println("Account Holder Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Total Amount: " + amount);
    }
    public double deposit(double d){
        if(d <= 0) {
            System.out.println("Invalid deposit amount.");
            return amount;
        }
        amount += d;
        return amount;
    }
    public double withdraw(double w) {
        if (w <= amount) {
            amount -= w;
            return amount;
        } else {
            System.out.println("Insufficient funds for withdrawal.");
            return amount;
        }
    }
    public double checkBalance() {
        System.out.println("Current balance: " + amount);
        return amount;
    }

}
