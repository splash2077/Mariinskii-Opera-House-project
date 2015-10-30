package com.example.forevergame;

import android.os.Bundle;
import android.app.Activity;

public class forthActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forth);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
