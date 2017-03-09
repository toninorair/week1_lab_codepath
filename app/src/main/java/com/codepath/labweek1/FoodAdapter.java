package com.codepath.labweek1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


/**
 * Created by tonya on 8/29/16.
 */
public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.foodViewHolder> {

    private List<Food> items;
    private Context context;


    public FoodAdapter(Context context, List<Food> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public void onBindViewHolder(foodViewHolder viewHolder, int i) {
        Food food = items.get(i);
        viewHolder.name.setText(food.getName());
    }

    @Override
    public foodViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.food_item, viewGroup, false);

        final foodViewHolder holder = new foodViewHolder(view);

        return holder;

    }


    public class foodViewHolder extends RecyclerView.ViewHolder {
        public TextView name;

        public foodViewHolder(View v) {
            super(v);
            name = (TextView) v.findViewById(R.id.item_name);

        }
    }


}

