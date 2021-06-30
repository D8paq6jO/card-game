package game.goodhand;

import cards.Card;

import java.util.List;

public interface GoodHand extends Comparable<GoodHand> {
    public boolean isWinningHand(List<Card> hand);
    public int getRank();
    public Card getHighestCard();
    public void setHighestCard(Card card);
}
