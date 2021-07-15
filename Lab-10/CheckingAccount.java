public class CheckingAccount extends BankAccount {
    private final double FEE = 0.15;

    /**
     * standard constructor
     * 
     * @param name   the owner of the account
     * @param amount the beginning balance
     */
    public CheckingAccount(String name, double amount) {
        super(name, amount);
        this.setAccountNumber(super.getAccountNumber() + "-10");
    }

    /**
     * allows you to remove money from the account if enough money is
     * available,returns true if the transaction was completed, returns false if the
     * there was not enough money.
     * 
     * @param amount the amount to withdraw from the account
     * @return true if there was sufficient funds to complete the transaction, false
     *         otherwise
     */
    @Override
    public boolean withdraw(double amount) {
        return super.withdraw(amount + this.FEE);
    }
}