package game.goodhand;

import cards.Card;

import java.util.List;

public class Flush extends AbsGoodHand implements GoodHand{
    @Override
    public boolean isWinningHand(List<Card> hand) {
        return false;
    }

    @Override
    public int getRank() {
        return 2;
    }
}
