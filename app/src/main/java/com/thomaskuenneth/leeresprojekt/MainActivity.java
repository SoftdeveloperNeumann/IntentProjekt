package com.thomaskuenneth.leeresprojekt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button b = (Button)findViewById(R.id.next);
        b.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Main2Activity.class);
                EditText name = (EditText) findViewById(R.id.name);
                EditText phone = (EditText) findViewById(R.id.phone) ;
                intent.putExtra("name", name.getText().toString());
                intent.putExtra("phone",phone.getText().toString());
                startActivity(intent);
            }
        });




    }
}
