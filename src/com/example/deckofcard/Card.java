package com.example.deckofcard;

import java.util.ArrayList;

public class Card {
    ArrayList<String> arrayList = new ArrayList<>();

    //craete method to add sit and rank in the arraylist
    public void deckOfCards() {
        String[] suit = {"Clubs,Diamonds,Hearts,Spade"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
            for (int i = 0; i < rank.length; i++) {
                for (int j = 0; j < suit.length; j++) {
                    arrayList.add(rank[i]+" "+suit[i]);
                }
            }
        display(arrayList);
        }
    public void display(ArrayList<String> arrayList) {
        for(String card:arrayList){
            System.out.println(card);
        }
    }
}
