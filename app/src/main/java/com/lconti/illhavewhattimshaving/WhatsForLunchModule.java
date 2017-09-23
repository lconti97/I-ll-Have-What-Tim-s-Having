package com.lconti.illhavewhattimshaving;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class WhatsForLunchModule {

    @Provides @Singleton
    static WhatsForLunchGenerator provideWhatsForLunchGenerator() {
        return new WhatsForLunchGenerator();
    }
}
