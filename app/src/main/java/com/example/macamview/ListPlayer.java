package com.example.macamview;

import java.util.ArrayList;

public class ListPlayer {
    private static String[] player = {
            "Cristiano Ronaldo", "Paulo Dybala", "Mario Mandzukic",
            "Miralem Pjanic", "Sami Khadira", "Emre Can", "Claudio Marchisio",
            "Medhi Benatia", "Giorgio Chiellini", "Leonardo Bonuci",
            "Wojciech Szcesny"
    };

    private static String[] posisi ={
            "Striker", "Striker", "Striker",
            "Midfilder", "Mildfilder", "Mildfilder",
            "Defender", "Defender", "Defender",
            "Goal Keeper"
    };

    private static int[] nomor = {
            7,10,17,5,6,23,8,4,3,19,1
    };

    static ArrayList<customAdapter> getListData(){
        ArrayList<customAdapter> list = new ArrayList<>();
        for(int position=0; position < player.length; position++){
            customAdapter cusAdapter = new customAdapter();
            cusAdapter.
        }
    }
}
