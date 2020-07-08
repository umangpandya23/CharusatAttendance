package com.example.charusat_ams;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void onTakeAttendanceClick(View view)
    {
    	Intent intent = new Intent(MainActivity.this, AttendanceDetailsActivity.class);
    	startActivity(intent);
    }
    
    public void onGenerateReportClick(View view)
    {
    	Intent intent = new Intent(MainActivity.this, AttendanceGenerateDetailsActivity.class);
    	startActivity(intent);
    }    
}
