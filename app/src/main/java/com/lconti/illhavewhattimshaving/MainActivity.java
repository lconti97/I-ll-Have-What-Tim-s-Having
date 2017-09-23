package com.lconti.illhavewhattimshaving;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private DataRow[] dataRows = {
            new DataRow("Cabo Fish Taco", "3 chicken tacos with a side of mashers"),
            new DataRow("BB Cup", "Spicy sweet pork bowl"),
            new DataRow("Souvlaki", "Gyro plate")
    };
    private Random random;
    private Button IllHaveWhatTimsHavingButton;
    private TextView RestaurantTextView;
    private TextView MealTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        random = new Random();

        IllHaveWhatTimsHavingButton = (Button) findViewById(R.id.whats_for_lunch_button);
        RestaurantTextView = (TextView) findViewById(R.id.restaurant_text_view);
        MealTextView = (TextView) findViewById(R.id.meal_text_view);

        IllHaveWhatTimsHavingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int randomDataRowIndex = random.nextInt(dataRows.length);
                DataRow dataRow = dataRows[randomDataRowIndex];

                RestaurantTextView.setText(dataRow.restaurant);
                MealTextView.setText(dataRow.meal);
            }
        });
    }

    private class DataRow {
        public String restaurant;
        public String meal;

        DataRow(String restaurant, String meal) {
            this.restaurant = restaurant;
            this.meal = meal;
        }
    }
}
