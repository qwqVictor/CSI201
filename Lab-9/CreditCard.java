public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    /**
     * Constructor to make a new credit card
     * @param newCardHolder the person who holds the card
     * @param limit         the credit limit
     */
    public CreditCard(Person newCardHolder, Money limit) {
        this.owner = newCardHolder;
        this.creditLimit = new Money(limit);
        this.balance = new Money(0.0);
    }

    /**
     * get the balance of credit card
     * @return balance
     */
    public Money getBalance() {
        return new Money(this.balance);
    }

    /**
     * get the credit limit of credit card
     * @return credit limit
     */
    public Money getCreditLimit() {
        return new Money(this.creditLimit);
    }

    /**
     * get the personal information of the owner
     * @return owner's information
     */
    public String getPersonals() {
        return this.owner.toString();
    }

    /**
     * add fund to the card
     * @param amount the amount to be charged
     */
    public void charge(Money amount) {
        Money newBalance = balance.add(amount);
        if (newBalance.compareTo(this.creditLimit) == 1) {
            System.out.println("Exceeds credit limit");
            return;
        }
        System.out.println("Charge: " + amount);
        this.balance = newBalance;
    }

    /**
     * pay using the card
     * @param amount the amount to be paid
     */
    public void payment(Money amount) {
        System.out.println("Payment: " + amount);
        this.balance = this.balance.subtract(amount);
    }
}
