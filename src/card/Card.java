/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package card;

public class Card {
    private final int number;   
    private final String suit;

    // Constructor to initialize the card with a number and suit
    public Card(int number, String suit) {
        this.number = number;
        this.suit = suit;
    }

    // Getter method for card number
    public int getNumber() {
        return number;
    }

    // Getter method for card suit
    public String getSuit() {
        return suit;
    }

    // Optional: You can add a toString() method to print the card in a readable format
    @Override
    public String toString() {
        return number + " of " + suit;
    }
}

