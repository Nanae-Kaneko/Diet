package com.example.gushimakota.diet;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    TextView calTextView;
    int cal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cal = 100;
        calTextView = (TextView) findViewById(R.id.caltextView);
        calTextView.setText(String.valueOf(cal));
    }

    public void cake(View v){
        cal = cal-8;
        calTextView.setText(String.valueOf(cal));
    }

    public void sweets(View v){
        cal = cal-5;
        calTextView.setText(String.valueOf(cal));
    }

    public void humber(View v){
        cal = cal-12;
        calTextView.setText(String.valueOf(cal));
    }

    public void ramen(View v){
        cal = cal-17;
        calTextView.setText(String.valueOf(cal));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
