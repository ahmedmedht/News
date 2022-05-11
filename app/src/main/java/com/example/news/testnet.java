package com.example.news;

import androidx.appcompat.app.AppCompatActivity;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.widget.Toast;

public class testnet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testnet);
        ConnectivityManager cManager = (ConnectivityManager) getSystemService(this.CONNECTIVITY_SERVICE);


        NetworkInfo ninfo = cManager.getActiveNetworkInfo();


        if(ninfo!=null && ninfo.isConnected())

        {
            Toast.makeText(this, "Available",Toast.LENGTH_LONG).show();
        }

        else
        {
            Toast.makeText(this, "Not Available",Toast.LENGTH_LONG).show();
        }
    }
}