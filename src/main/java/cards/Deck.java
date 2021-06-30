package cards;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Deck {
    public static List<Card> getDeck(){
        List<Card> cards = new ArrayList<>();
        for (int i = 2; i < 15; i++) {
            for (Suite suite :
                    Suite.values()) {
                Card card = new Card(i, suite);
                int randomSpot = cards.size();
                if (cards.size()>0){
                    randomSpot = ThreadLocalRandom.current().nextInt(0, cards.size());
                }
                cards.add(randomSpot,card);
                //                new Random().nextInt
//                cards.a

                //add card to random index in current list

            }

        }
        return cards;
    }

    //TODO: randomize on input instead of creating all cards and then randomizing
    public Deck(){

    }
}
