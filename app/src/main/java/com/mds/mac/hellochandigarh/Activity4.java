package com.mds.mac.hellochandigarh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Activity4 extends AppCompatActivity {

    public ImageButton buttonvar;
    public void one()
    {
        buttonvar = (ImageButton) findViewById(R.id.ib1);
        buttonvar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent hotel = new Intent(Activity4.this,MapsActivity12.class);
                startActivity(hotel);

            }

        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        one();
    }
}