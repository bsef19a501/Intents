package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.net.Uri;
public class MainActivity extends AppCompatActivity {
   private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dialonClick(View view) {
        Uri uri =  Uri.parse("tel:+923001234567");
        Intent intent = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(intent);

    }
}