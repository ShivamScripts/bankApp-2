import java.util.UUID;

public class HDFCBankAccount implements BankAccount{
    private String accountNumber;
    private int balance;
    private int roi;
    public HDFCBankAccount(int balance){
        this.balance = balance;
        this.accountNumber = String.valueOf(UUID.randomUUID());
        this.roi = 5;
    }
    public HDFCBankAccount(int balance,int roi){
        this.balance = balance;
        this.accountNumber = String.valueOf(UUID.randomUUID());
        this.roi = roi;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getRoi() {
        return roi;
    }

    public void setRoi(int roi) {
        this.roi = roi;
    }

    @Override
    public Boolean withdrawMoney(int money) {
        if(this.balance-500 >= money){
            this.balance = this.balance - money;
            return true;
        }
        return false;
    }
    @Override
    public Boolean addMoney(int money) {
        this.balance += money;
        return true;
    }

    @Override
    public int checkBalance() {
        return this.balance;
    }

    @Override
    public int getROI() {
        return this.roi;
    }

    @Override
    public int getTotalInterest(int amount , int time) {
        return roi/100*time*amount;
    }
}
