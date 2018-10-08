
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    //Set Prices
    private static final double PRICE_OF_ECONOMICAL = 2.5;
    private static final double PRICE_OF_GOURMET = 4.0;

    public CashRegister() {
        // at start the register has 1000 euros & no sold meals
        this.cashInRegister = 1000;
        this.economicalSold = 0;
        this.gourmetSold = 0;
    }

    public double payEconomical(double cashGiven) {
        if (cashGiven >= PRICE_OF_ECONOMICAL) {
            economicalSold++;
            cashInRegister += PRICE_OF_ECONOMICAL;

            return cashGiven - PRICE_OF_ECONOMICAL;
        }

        return cashGiven;
    }

    public double payGourmet(double cashGiven) {

        if (cashGiven >= PRICE_OF_GOURMET) {
            gourmetSold++;
            cashInRegister += PRICE_OF_GOURMET;

            return cashGiven - PRICE_OF_GOURMET;
        }
        return cashGiven;
    }


    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }

    public boolean payEconomical(LyyraCard card) {
        boolean paid = card.pay(PRICE_OF_ECONOMICAL);
        if (paid) economicalSold++;
        return paid;

    }

    public boolean payGourmet(LyyraCard card) {
        boolean paid = card.pay(PRICE_OF_GOURMET);
        if (paid) gourmetSold++;
        return paid;
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {card.loadMoney(sum); cashInRegister+=sum;}
    }
}
