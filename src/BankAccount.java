public interface BankAccount {
    // withdraw money
    // check balance
    // add money
    // check roi
    // get final interest
    Boolean withdrawMoney(int money);
    Boolean addMoney(int money);
    int checkBalance();
    int getROI();
    int getTotalInterest(int amount , int time);
}  
