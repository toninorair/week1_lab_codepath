package com.codepath.labweek1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onFacebookClick(View view) {
        Toast.makeText(this, "Facebook clicked", Toast.LENGTH_LONG).show();

        Intent intent = new Intent(this, FoodListActivity.class);
        startActivity(intent);

    }

    public void onTwitterClick(View view) {
        Toast.makeText(this, "Twitter clicked", Toast.LENGTH_LONG).show();

    }
}
