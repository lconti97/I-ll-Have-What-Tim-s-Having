package com.lconti.illhavewhattimshaving;


import javax.inject.Inject;

public class WhatsForLunchPresenter implements IWhatsForLunchPresenter {

    @Inject
    WhatsForLunchGenerator whatsForLunchGenerator;
    private IWhatsForLunchView whatsForLunchView;

    public WhatsForLunchPresenter(IWhatsForLunchView whatsForLunchView) {
        this.whatsForLunchView = whatsForLunchView;
        whatsForLunchGenerator = DaggerWhatsForLunchComponent.create().whatsForLunchGenerator();
    }

    @Override
    public void getNextLunch() {
        Lunch nextLunch = whatsForLunchGenerator.getNextLunch();
        whatsForLunchView.setNextLunch(nextLunch);
    }
}
