package game.goodhand;

import cards.Card;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Pair extends AbsGoodHand implements GoodHand {


    //Assuming there are three cards
    @Override
    public boolean isWinningHand(List<Card> hand) {

        switch (hand){
            case hand.get(0).getValue() == hand.get(1).getValue():
            case hand.get(0).getValue() == hand.get(2).getValue():
                setHighestCard(hand.get(0));
                return true;
            case hand.get(1).getValue() == hand.get(2).getValue():
                setHighestCard(hand.get(1));
                return true;
            default:
                return false;

        }
    }

    @Override
    public int getRank() {
        return 0;
    }


    @Override
    public int compareTo(@NotNull GoodHand o) {
        return 0;
    }
}
