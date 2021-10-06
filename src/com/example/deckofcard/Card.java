package com.example.deckofcard;

import java.util.ArrayList;
import java.util.Scanner;

public class Card{
    ArrayList<String> arrayList = new ArrayList<>();
    String[] suit = {"Clubs,Diamonds,Hearts,Spade"};
    String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
  //  String[][] deckOfCards = {suit,rank};

    //craete method to add sit and rank in the arraylist
    public void deckOfCards(){
            for (int i = 0; i< suit.length; i++) {
                for (int j = 0; j < rank.length; j++) {
                    arrayList.add(suit[i] + " " + rank[j]);
                }
            }
       display(arrayList);
        }
    public void display(ArrayList<String> arrayList) {
        for(String card:arrayList){
            System.out.println(card);
        }
    }
    public void addPlayer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the player");
        int player = scanner.nextInt();
        if(player >2) {
            System.out.println("Enter the 2 more than player");
        }

    }
}
