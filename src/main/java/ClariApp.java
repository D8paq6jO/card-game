/*

Summary: Simulate a card game by generating a deck of cards, distribute hands (3 cards each) to a variable number of players and declare a winner if any. Expected to write a code with proper modeling, comments and tests if time permits.


Detailed Steps.
1. Initialize following parameters
       i. Number of players, say X = 4
       ii. Betting amount per round per player, say B = $10
       iii. Initial amount per player, say M = $100
2. Generate a deck of cards (standard deck of 13 cards of 4 suits totaling to 52), print cards in the console.

3. Shuffle the cards, must be a fair shuffle,  print the cards in the console

4. Form a bet pot P, by subtracting B from each player M.

5. Distribute 3 cards to each player. Print the hands of each player in the console.
 (Preferable: distribute one card at a time to X players until each player has 3 cards.)

6. Compare hands among players, declare a winner for the hand, print it in the console with the indicating the winner.

7. If the top two players have the same ranked hand, it’s a tie.

8. If no one wins in the step #7 due to a tie, the game continues to the next round(each player has to bet again i.e. repeat from step 3 with added bet pot from previous rounds ) until someone wins. Print the repeated steps in the console. Note: it is possible that no one wins and pot keeps growing. Exit the game if all the players end up in the situation M < B

9. Print money in hand of each player, any player with M<B, loses, remove loser from the list of current player. E.g. if we had 5 initial players and 2 players lose, we will have only 3 players for the next round.

10. Exit game when one of the following criteria is reached:
        i. No player has enough money for the bet. i.e. each player has M < B
        ii. Only one player is left.



 Hands should be ranked as:


 1. Straight flush
    Three suited cards in sequence. Straight flush with the highest card wins the tie.


 2. Three of a kind
    Three cards of the same rank. Highest ranked card wins the tie.


 3. Straight
   Three cards in sequence, highest ranked card wins the tie


 4. Flush
    Three suited cards, the highest ranked card wins the tie.


 5. Pair
   Two cards of same rank


 6.High card
    None of the above, higher ranked card wins. If same high card, it's a tie.


 */


import cards.Card;
import lombok.Data;

import java.util.List;

@Data
public class ClariApp {
    List<Card> deck;

//    public ClariApp()
}
