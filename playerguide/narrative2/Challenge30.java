package playerguide.narrative2;

import java.util.ArrayList;

public class Challenge30{
    
    public static void main(String[] args) {
        ArrayList<Card> cards = new ArrayList<Card>();
        
        Color[] colors = Color.values();
        Rank[] ranks = Rank.values();
        
        for (Color color : colors) {
            for (Rank rank : ranks) {
                cards.add(new Card(color, rank));
            }
        }
        
        System.out.println("\nThese are all the cards:\n");
        for (Rank rank : ranks) {
            for (Card card : cards) {
                if (card.getRank().equals(rank)) {
                    System.out.printf("%-21s", card);
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}