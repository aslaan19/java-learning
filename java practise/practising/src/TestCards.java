import java.util.ArrayList;
import java.util.Arrays;

class Card implements Comparable<Card> {
    private int cardNo;
    private ArrayList<Double> transactions;

    public Card(int cardNo) {
        this.cardNo = cardNo;
        transactions = new ArrayList<>();
    }

    public int getCardNo() {
        return cardNo;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void purchase(double amount) {
        transactions.add(amount);
    }

    public double getTotalAmount() {
        return transactions.stream().mapToDouble(Double::doubleValue).sum();
    }

    @Override
    public String toString() {
        return "Card " + cardNo + ": total amount = " + getTotalAmount();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Card)) {
            return false;
        }
        Card other = (Card) o;
        return cardNo == other.cardNo;
    }

    @Override
    public int compareTo(Card other) {
        return Double.compare(getTotalAmount(), other.getTotalAmount());
    }
}

class SilverCard extends Card {
    private double transactionFee;

    public SilverCard(int cardNo, double transactionFee) {
        super(cardNo);
        this.transactionFee = transactionFee;
    }

    @Override
    public void purchase(double amount) {
        super.purchase(amount + amount * transactionFee);
    }

    @Override
    public String toString() {
        return "Silver card " + getCardNo() + ": fee = " + transactionFee + ", total amount = " + getTotalAmount();
    }
}

class GoldenCard extends Card {
    private int monthlyFee;

    public GoldenCard(int cardNo, int monthlyFee) {
        super(cardNo);
        this.monthlyFee = monthlyFee;
    }

    @Override
    public String toString() {
        return "Golden card " + getCardNo() + ": monthly fee = " + monthlyFee + ", total amount = " + getTotalAmount();
    }
}

public class TestCards {
    public static void main(String[] args) {
        Card[] cards = {
                new SilverCard(1, 0.15),
                new GoldenCard(2, 100),
                new SilverCard(3, 0.1),
                new GoldenCard(4, 50)
        };

        for (Card card : cards) {
            card.purchase(Math.random() * 100);
        }

        Arrays.sort(cards);

        for (Card card : cards) {
            System.out.println(card);
        }

        int totalGoldenAmount = 0;

        for (Card card : cards) {
            if (card instanceof GoldenCard) {
                totalGoldenAmount += card.getTotalAmount();
            }
        }

        System.out.println("Total amount of GoldenCard objects: " + totalGoldenAmount);
    }
}
