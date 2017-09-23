package com.lconti.illhavewhattimshaving;

import javax.inject.Singleton;

import dagger.Component;

@Singleton @Component(modules = {WhatsForLunchModule.class})
public interface WhatsForLunchComponent {
    WhatsForLunchGenerator whatsForLunchGenerator();
}
