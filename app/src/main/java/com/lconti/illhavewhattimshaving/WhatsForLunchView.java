package com.lconti.illhavewhattimshaving;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WhatsForLunchView extends AppCompatActivity implements IWhatsForLunchView{
    private WhatsForLunchPresenter whatsForLunchPresenter;
    private Button whatsForLunchButton;
    private TextView restaurantTextView;
    private TextView mealTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        whatsForLunchPresenter = new WhatsForLunchPresenter(this);

        whatsForLunchButton = (Button) findViewById(R.id.whats_for_lunch_button);
        restaurantTextView = (TextView) findViewById(R.id.restaurant_text_view);
        mealTextView = (TextView) findViewById(R.id.meal_text_view);

        whatsForLunchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                whatsForLunchPresenter.getNextLunch();
            }
        });
    }

    @Override
    public void setNextLunch(Lunch lunch) {
        restaurantTextView.setText(lunch.getRestaurant());
        mealTextView.setText(lunch.getMeal());
    }
}
