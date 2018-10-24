package com.example.geeky.magic_8_ball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;
/**
 * Created by Geeky Kelvin on 10/24/2018.
 * Email: Kelvinator4leo@gmail.com
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // links the views in the Layout XML file to the Java code
        final ImageView ballDisplay = findViewById(R.id.image_eightBall);

        Button myButton = findViewById(R.id.askButton);

        // Store dice images in an Array (collection)
        final int [] ballArray = new int [] {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        //Tells Button Listen For Clicks
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Executed When Ask Button Is Clicked

                // Generates Random Number
                Random randomNumber = new Random();

                int number = randomNumber.nextInt(5);

                // Grabs a random ball image from ballArray and Displays on ImageView
                ballDisplay.setImageResource(ballArray[number]);

            }
        });
    }
}
