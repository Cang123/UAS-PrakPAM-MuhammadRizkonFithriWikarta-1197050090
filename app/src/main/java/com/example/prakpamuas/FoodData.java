package com.example.prakpamuas;


import android.content.Context;

import java.util.ArrayList;

public class FoodData {
    public static ArrayList<Food> getData(Context context) {
        ArrayList<Food> list = new ArrayList<Food>();
        list.add(new Food("Cappucino", "Drink", 5000, context.getDrawable(R.drawable.cappucino)));
        list.add(new Food("Longblack", "Drink", 5000, context.getDrawable(R.drawable.kopi)));
        list.add(new Food("Dougnut", "Food", 5000, context.getDrawable(R.drawable.donut)));
        list.add(new Food("Cheesecake", "Food", 5000, context.getDrawable(R.drawable.cheesecake)));
        return list;
    }
}
