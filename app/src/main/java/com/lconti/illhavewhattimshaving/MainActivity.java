package com.lconti.illhavewhattimshaving;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private WhatsForLunchGenerator whatsForLunchGenerator;
    private Button IllHaveWhatTimsHavingButton;
    private TextView RestaurantTextView;
    private TextView MealTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        whatsForLunchGenerator = new WhatsForLunchGenerator();

        IllHaveWhatTimsHavingButton = (Button) findViewById(R.id.whats_for_lunch_button);
        RestaurantTextView = (TextView) findViewById(R.id.restaurant_text_view);
        MealTextView = (TextView) findViewById(R.id.meal_text_view);

        IllHaveWhatTimsHavingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Lunch todaysLunch = whatsForLunchGenerator.GetNextLunch();

                RestaurantTextView.setText(todaysLunch.getRestaurant());
                MealTextView.setText(todaysLunch.getMeal());
            }
        });
    }
}
