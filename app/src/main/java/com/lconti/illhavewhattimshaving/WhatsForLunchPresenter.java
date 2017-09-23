package com.lconti.illhavewhattimshaving;


public class WhatsForLunchPresenter implements IWhatsForLunchPresenter {

    private WhatsForLunchGenerator whatsForLunchGenerator;
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
