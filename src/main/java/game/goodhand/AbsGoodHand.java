package game.goodhand;

import cards.Card;
import lombok.Data;

import java.util.List;

@Data
public abstract class AbsGoodHand implements GoodHand{
    public Card highestCard;
}
