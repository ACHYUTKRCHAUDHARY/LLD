package oops.Design.PlayingCards;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;

class Solution {
    public static abstract class Card implements Comparable<Card> {
        public abstract int getValue();

        @Override
        public int compareTo(Card o) {
            return Integer.compare(getValue(), o.getValue());
        }
    }

    public enum Suit {
        SPADES,
        HEARTS,
        DIAMONDS,
        CLUBS,
    }

    public static class PlayingCard extends Card {
        private Suit suit;
        private int value;

        public static final Map<String, Suit> SUITS = Map.of(
                "Spades", Suit.SPADES,
                "Hearts", Suit.HEARTS,
                "Diamonds", Suit.DIAMONDS,
                "Clubs", Suit.CLUBS);

        // Inverts the above map to convert back to string.
        public static final Map<Suit, String> SUIT_NAMES = SUITS.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));

        // Map.of is limited to 10 entries, so we initialize a static map instead
        public static final Map<String, Integer> VALUES = new HashMap<>();
        static {
            VALUES.put("A", 1);
            for (int i = 2; i <= 10; i++) {
                VALUES.put(String.valueOf(i), i);
            }
            VALUES.put("J", 11);
            VALUES.put("Q", 12);
            VALUES.put("K", 13);
        }
        // Inverts the above map to convert back to string.
        public static final Map<Integer, String> VALUE_NAMES = VALUES.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));

        public PlayingCard(String suit, String value) {
            this.suit = SUITS.get(suit);
            this.value = VALUES.get(value);
        }

        @Override
        public int getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.format("%s of %s", VALUE_NAMES.get(value), SUIT_NAMES.get(suit));
        }
    }

    public static class Game {
        private ArrayList<Card> cards;

        public Game() {
            cards = new ArrayList<>();
        }

        public void addCard(String suit, String value) {
            cards.add(new PlayingCard(suit, value));
        }

        public String cardString(int card) {
            return cards.get(card).toString();
        }

        public boolean cardBeats(int cardA, int cardB) {
            return cards.get(cardA).compareTo(cards.get(cardB)) > 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();
        String[] segs = scanner.nextLine().split(" ");
        game.addCard(segs[0], segs[1]);
        System.out.println(game.cardString(0));
        segs = scanner.nextLine().split(" ");
        game.addCard(segs[0], segs[1]);
        System.out.println(game.cardString(1));
        System.out.println(game.cardBeats(0, 1));
    }
}

