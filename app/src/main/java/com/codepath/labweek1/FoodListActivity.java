package com.codepath.labweek1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FoodListActivity extends AppCompatActivity {

    RecyclerView foodList;
    FoodAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);

        foodList = (RecyclerView) findViewById(R.id.foodList);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        foodList.setLayoutManager(llm);

        List<Food> items = new ArrayList<>();
        items.add(new Food("Cookies"));
        items.add(new Food("Cheese"));
        items.add(new Food("Meat"));

        adapter = new FoodAdapter(this, items);
        foodList.setAdapter(adapter);
        //adapter.notifyDataSetChanged();


    }
}
