package com.example.deckofcard;

import java.util.ArrayList;
import java.util.Scanner;

public class Card{
    static ArrayList<String> arrayList = new ArrayList<>();
    static String[] suit = {"Clubs,Diamonds,Hearts,Spade"};
    static String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
  //  String[][] deckOfCards = {suit,rank};

    //craete method to add sit and rank in the arraylist
    public static void deckOfCards(){
            for (int i = 0; i< suit.length; i++) {
                for (int j = 0; j < rank.length; j++) {
                    arrayList.add(suit[i] + " " + rank[j]);
                }
            }
       display(arrayList);
        }
    public static void display(ArrayList<String> arrayList) {
        for(String card:arrayList){
            System.out.println(card);
        }
    }
    /* method to use the player to the compute
     * Player need more than two to compute the deck of cards
     */
    public static void addPlayer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the player");
        int player = scanner.nextInt();
        if(player >=2) {
            System.out.println("Enter the 2 more than player");
            cardsPlayer(player);
        }

    }
    /* method to use the player to add the cards
     * @param player and it will take the cards to the deck of cards
     */
    public static void cardsPlayer(int player){
        System.out.println("Player has cards as below");
        for(int i=0;i<player;i++){
            System.out.println("the player has cards"+i);
            shuffleCards(arrayList);
        }
    }
    /* createshufflecard method to the player
     @param arralylist and temp value
     */
    public static void shuffleCards(ArrayList<String> arrayList){
        System.out.println("the cards are shuffule properly");
        ArrayList<String> temp = new ArrayList<>();
        while(! arrayList.isEmpty()){
            int loc = (int) (Math.random()*arrayList.size());
            temp.add(arrayList.get(loc));
            arrayList.remove(loc);
        }
        arrayList = temp;
        display(arrayList);
    }

}
