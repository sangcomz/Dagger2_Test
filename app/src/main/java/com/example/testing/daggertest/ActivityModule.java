package com.example.testing.daggertest;

import android.util.Log;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sangcomz on 16. 3. 7.
 */
@Module
public class ActivityModule {

    @Provides
    UserModel userModel(){
        Log.d("ActivityModule", "Provides UserModel");
        return new UserModel();
    }

    @Provides
    UserModel2 userModel2(){
        Log.d("ActivityModule", "Provides UserModel2");
        return new UserModel2();
    }
}
