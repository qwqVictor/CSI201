public class SavingsAccount extends BankAccount {
    private final double rate = 2.5 / 100;   // ANNUALY RATE
    private int savingsNumber = 0;
    private String accountNumber;

    /**
     * standard constructor
     * 
     * @param name   the owner of the account
     * @param amount the beginning balance
     */
    public SavingsAccount(String name, double amount) {
        super(name, amount);
        this.accountNumber = String.format("%s-%d", super.getAccountNumber(), this.savingsNumber);
    }
    /**
     * copy constructor
     * 
     * @param oldAccount   the old account
     * @param amount       the beginning balance
     */
    public SavingsAccount(SavingsAccount oldAccount, double amount) {
        super(oldAccount, amount);
        this.savingsNumber = oldAccount.savingsNumber + 1;
        this.accountNumber = String.format("%s-%d", super.getAccountNumber(), this.savingsNumber);
    }

    /**
     * post MONTHLY interest into account
     */
    public void postInterest() {
        this.deposit(this.getBalance() * this.rate / 12);
    }

    /**
     * accessor method to account number
     * 
     * @return the account number
     */
    @Override
    public String getAccountNumber() {
        return this.accountNumber;
    }
}