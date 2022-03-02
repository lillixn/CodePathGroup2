package com.example.myapplication;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        //Register your parse models
        //ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("pg8Amhd4dSC5XpV9AiClMhbt9t54vbw0nVV0Ac3j")
                .clientKey("kkd0vHc8lChn9KO5ayaeSsvOLRhvkNRgWvaeUR3F")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
