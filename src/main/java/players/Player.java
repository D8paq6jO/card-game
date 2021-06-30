package players;

import cards.Card;
import game.goodhand.GoodHand;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Player {
    String name;
    int money;
    @Builder.Default
    List<Card> hand = new ArrayList<>();
    GoodHand goodHand;
}
