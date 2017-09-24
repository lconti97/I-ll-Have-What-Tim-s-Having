package com.lconti.illhavewhattimshaving;


import java.util.Random;

import javax.inject.Inject;

public class WhatsForLunchGenerator implements IWhatsForLunchGenerator {

    private Random random;

    private Lunch[] lunches =
    {
        new Lunch("Cabo Fish Taco", "3 chicken tacos with a side of mashers"),
        new Lunch("BB Cup", "Spicy sweet pork bowl"),
        new Lunch("Souvlaki", "Gyro plate")
    };

    @Inject
    public WhatsForLunchGenerator() {
        random = new Random();
    }

    @Override
    public Lunch getNextLunch() {
        int randomDataRowIndex = random.nextInt(lunches.length);
        return lunches[randomDataRowIndex];
    }
}
