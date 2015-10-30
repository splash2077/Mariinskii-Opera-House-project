package com.example.forevergame;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class secondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void toThirdActivity (View view) {
        Intent changeActivity = new Intent(this, thirdActivity.class);
        startActivity(changeActivity);
    }


}
