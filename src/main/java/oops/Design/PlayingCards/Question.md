Playing Cards

For this question, we ask you to design a card game using the traditional 52-card deck. We divide this question into three parts, so you can complete them in order.

Part One
For the first part, you must design a Game class representing the game, and these following functions associated with the class.

add_card(suit, value): Creates a new card object with a suit from one of the following strings: Hearts, Spades, Clubs, Diamonds, and a value from one of the following strings: A, 2~10, J, Q, K. This card is represented by i, where i is an integer indicating how many cards have been created before.
card_string(card): Returns the string representation of the card represented by i. It follows the format <value> of <suit>. For example, a card created by add_card("Spades", "3") should have a string representation of 3 of Spades.
card_beats(card_a, card_b): Check if the card represented by card_a beats the one represented by card_b. A card beats another card if and only if it has a greater value. The value of the cards are ordered from A to K.
You may implement these however you like. However, preferably this should be easily expandable to accommodate new requirements.********
