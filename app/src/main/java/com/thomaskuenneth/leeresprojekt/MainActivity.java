package com.thomaskuenneth.leeresprojekt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {
    static EditText name;
    static EditText phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button b = (Button)findViewById(R.id.next);
        b.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Main2Activity.class);
                name = (EditText) findViewById(R.id.name);
                phone = (EditText) findViewById(R.id.phone) ;
                intent.putExtra("name", name.getText().toString());
                intent.putExtra("phone", phone.getText().toString());
                startActivity(intent);

            }
        });

        Button insert = (Button)findViewById(R.id.insert);
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_INSERT, ContactsContract.Contacts.CONTENT_URI);
                name = (EditText) findViewById(R.id.name);
                phone = (EditText) findViewById(R.id.phone) ;
                intent.putExtra("finishActivityOnSaveCompleted",true);
                intent.putExtra(ContactsContract.Intents.Insert.NAME,name.getText().toString());
                intent.putExtra(ContactsContract.Intents.Insert.PHONE,phone.getText().toString());
                intent.putExtra(ContactsContract.Intents.Insert.PHONE_TYPE,ContactsContract.CommonDataKinds.Phone.TYPE_HOME);
                startActivity(intent);

            }
        });


    }
}
