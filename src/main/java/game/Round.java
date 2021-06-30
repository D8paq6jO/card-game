package game;

import cards.Card;
import game.goodhand.GoodHand;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import players.Player;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Round {
    List<Card> deck;
    List<Player> players;
    @Builder.Default
    List<Player> winners = new ArrayList<>();
    List<GoodHand> goodHandList;
    int pot;
    int bet;

    public void play(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < players.size(); j++) {
                players.get(j).getHand().add(deck.get(i*3+j));
            }
        }
        for (Player player :
                players) {
            player.setMoney(player.getMoney()-bet);
            pot += bet;
            player.getHand().sort(Comparator.comparingInt(Card::getValue));
            player.setGoodHand(goodHandList.stream().findFirst().get());
            //iterate over different options for winning hand, sorted by ranking descending
            // if true, assign to player continue
            // if winner==null, assign this player
            // else, compare ranking against winning player ranking
//            winner.getGoodHand().getRank()>player.getGoodHand().getRank();
            // if current hand is better, clear list of winners and assign new winner
            if (winners.size()>1){
                players = winners;
                winners = new ArrayList<>();
                deck = getDeck();
                play();
            }
        }
        for (int i = 0; i < winners.size(); i++) {
            winners.get(i).setMoney(winners.get(i).getMoney()+ (pot/winners.size()));
        }

    }
}
