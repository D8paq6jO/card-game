package game;

import cards.Deck;
import game.goodhand.GoodHand;
import game.goodhand.Pair;
import game.goodhand.Straight;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import players.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Data
//@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Game {

    //TODO: must be bigger than 1, smaller than 19
    public int numOfPlayers;
    //TODO: must be bigger than bet Size
    public int initialSum;
    //TODO: must be bigget than 0
    public int betSize;
    @Builder.Default

    public List<GoodHand> goodHandList = Arrays.asList(new Pair(), new Straight());



    public void play(){

        List<Player> players = new ArrayList<>(numOfPlayers);
        //TODO: cache two top players (2nd place) to save iteration of
        // validation of enough players

        for (int i = 0; i < numOfPlayers; i++) {
            players.add(Player.builder()
                    .name("player" + i)
                    .money(initialSum)
                    .build());

        }
        Player leader = players.get(0);
        while (
                players.size()>1
        ){
            Round round = Round.builder()
                    .players(players)
                    .bet(betSize)
                    .deck(Deck.getDeck())

                    .build();
            round.play();
            players = players.stream().filter(player -> player.getMoney()>=betSize)
                    .collect(Collectors.toList());
        }

    }
}
