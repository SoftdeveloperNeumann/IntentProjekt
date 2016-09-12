package com.thomaskuenneth.leeresprojekt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();

        TextView view = (TextView) findViewById(R.id.textView);
        if(intent != null) {
            view.setText(intent.getStringExtra("name") + "\n" + intent.getStringExtra("phone"));
        }

    }
}
