public class Main {
    public static void main(String[] args) {

       
        Calculator calculator = new Calculator(); 
         


            System.out.println("Addition: " + calculator.add(5, 3));
            System.out.println("Subtraction: " + calculator.subtract(5, 3));
            System.out.println("Multiplication: " + calculator.multiply(5, 3));
            System.out.println("Division: " + calculator.divide(5, 3));

            BankAccount account = new BankAccount("ACC1001", 5000.0);

            account.deposit(1000.0);
            account.withdraw(500.0);

            System.out.println("Final Balance: " + account.getBalance());
    }
}