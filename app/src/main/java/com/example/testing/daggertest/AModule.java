package com.example.testing.daggertest;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sangcomz on 16. 3. 9.
 */
@Module
public class AModule {

    @Provides AModel providesAModel(){
        return new AModel();
    }


}
