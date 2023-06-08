package P03CardsWithPower;

public class Card {
    private RankPower rank;
    private SuitPower suit;
    private int power;

    public Card(RankPower rank, SuitPower suit) {
        this.rank = rank;
        this.suit = suit;
        this.power = rank.getPower() + suit.getPower();
    }

    @Override
    public String toString() {
        String cardName = this.rank + " of " + this.suit;
        return String.format("Card name: %s; Card power: %d", cardName, this.power);
    }
}
