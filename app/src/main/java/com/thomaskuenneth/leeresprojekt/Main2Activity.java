package com.thomaskuenneth.leeresprojekt;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends Activity {

    private static final int NOTIFICATION_ID = 1;

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
    public void sendNotification(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://developer.android.com/references/android/app/Notification.html"));
        PendingIntent pendingIntent = PendingIntent.getActivity(this,0,intent,0);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setSmallIcon(R.drawable.ic_stat_notification);
        builder.setContentIntent(pendingIntent);
        builder.setAutoCancel(true);
        builder.setLargeIcon(BitmapFactory.decodeResource(getResources(),R.drawable.test3));



    }
}
