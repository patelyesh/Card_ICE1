/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;


import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        Card[] hand = new Card[7];  

    
        Random random = new Random();
        for (int i = 0; i < hand.length; i++) {
            int number = random.nextInt(13) + 1; 
            String suit = suits[random.nextInt(4)];  
            hand[i] = new Card(number, suit);  
        }

     
        System.out.println("Your hand of cards:");
        for (Card card : hand) {
            System.out.println(card);
        }

     
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pick a card number (1-13): ");
        int userNumber = scanner.nextInt();
        System.out.print("Pick a suit (Hearts, Diamonds, Clubs, Spades): ");
        String userSuit = scanner.next();

    
        boolean userCardFound = false;
        for (Card card : hand) {
            if (card.getNumber() == userNumber && card.getSuit().equalsIgnoreCase(userSuit)) {
                userCardFound = true;
                break;
            }
        }

   
        if (userCardFound) {
            System.out.println("Your card is in the hand!");
        } else {
            System.out.println("Your card is not in the hand.");
        }

        
       
    }
}

