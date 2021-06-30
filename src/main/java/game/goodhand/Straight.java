package game.goodhand;

import cards.Card;

import java.util.List;

public class Straight extends AbsGoodHand implements GoodHand {
    //assuming this is a ascending sorted hand
    @Override
    public boolean isWinningHand(List<Card> hand) {
        if(hand.get(0).getValue()==hand.get(1).getValue()-1
            && hand.get(1).getValue()==hand.get(2).getValue()-1) {
            return true;
        }
        return false;
    }

    @Override
    public int getRank() {
        return 1;
    }
}
