package demo;


import java.util.Objects;

public class Money {

    public static class Currency{
        private String name;

        public Currency(String name) {
            this.name = name;
        }
    }

    public int amount;
    public String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency=currency;
    }

    @Override
    public String toString() {
        return amount + currency;
    }

    public Money add(Money that) {
        return new Money(this.amount+that.amount,this.currency);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Money)) return false;
        Money money = (Money) o;
        return amount == money.amount &&
                Objects.equals(currency, money.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency);
    }
}
