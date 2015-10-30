package com.example.forevergame;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class thirdActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void toForthActivity (View view) {
        Intent changeActivity = new Intent(this, forthActivity.class);
        startActivity(changeActivity);
    }

}
