import java.time.LocalDate;

public class BankAccount {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private int accountNumber;
    private double balance;

    public BankAccount(String firstName, String lastName, LocalDate dateOfBirth,  int accountNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = 0.0; // Initial balance is 0
    }

    // Getter methods;
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public LocalDate getDateOfBirth(){
        return this.dateOfBirth;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public double getBalance(){
        return balance;
    }

    // Setter methods;
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setDateOfBirth(LocalDate dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
//Deposit method
//    public void deposit(double amount){
//        if (amount > 0) {
//        this.balance+=amount;
//            System.out.println("Deposited £" + amount + ".New balance: £" + balance);
//    }

}
