package com.comp301.weatherdashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Define variables for the components
    ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Link components var to their id
        scrollView = (ScrollView) findViewById(R.id.mainScrollView);

        //SimpleDateFormat formatter= new SimpleDateFormat("HH");
        //int currentTime = 20 ;//Integer.parseInt(formatter.format(new Date(System.currentTimeMillis())));

        //String background_day_state = "Day";

        /** Code to change the background
         *
         *  - we could set it such if we get the sunrise and sunset times to change the background
         *
         * */

        /*switch (background_day_state){
            case "Morning":
                scrollView.setBackground(getResources().getDrawable(R.drawable.background_morning));
                break;
            case "Day":
                scrollView.setBackground(getResources().getDrawable(R.drawable.background_day));
                break;
            case "Night":
                scrollView.setBackground(getResources().getDrawable(R.drawable.background_night));
                break;
        }*/

    }
}