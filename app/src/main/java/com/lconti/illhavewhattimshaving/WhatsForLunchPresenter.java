package com.lconti.illhavewhattimshaving;


public class WhatsForLunchPresenter implements IWhatsForLunchPresenter {
    private WhatsForLunchGenerator whatsForLunchGenerator;
    private IWhatsForLunchView whatsForLunchView;

    public WhatsForLunchPresenter(IWhatsForLunchView whatsForLunchView) {
        whatsForLunchGenerator = new WhatsForLunchGenerator();
        this.whatsForLunchView = whatsForLunchView;
    }

    @Override
    public void getNextLunch() {
        Lunch nextLunch = whatsForLunchGenerator.getNextLunch();
        whatsForLunchView.setNextLunch(nextLunch);
    }
}
