package com.example.ajie.travelaja;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Move extends AppCompatActivity implements View.OnClickListener{
    Button btnMoveActivity;
    Button btnWebBrowser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnMoveActivity = findViewById(R.id.btn_move_company);
        btnMoveActivity.setOnClickListener(this);

        btnWebBrowser = findViewById(R.id.btn_move_aplikasi);
        btnWebBrowser.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_move_company:
                Intent moveIntent = new Intent(Move.this, Welcome.class);
                startActivity(moveIntent);
                break;

            case R.id.btn_move_aplikasi:
                String url = "https://google.com" ;
                Intent openBrowserIntent = new Intent(Intent.ACTION_VIEW);
                openBrowserIntent.setData(Uri.parse(url));
                startActivity(openBrowserIntent);
                break;
        }
    }
}
