package com.example.karlharvey.kittengallery;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private ImageView catOne;
    private ImageView catTwo;
    private ImageView catThree;
    private ImageView catFour;
    private ImageView catFive;
    private ImageView catSix;

    private String url1 = "http://placekitten.com/100/100";
    private String url2 = "http://placekitten.com/101/101";
    private String url3 = "http://placekitten.com/102/102";
    private String url4 = "http://placekitten.com/103/103";
    private String url5 = "http://placekitten.com/104/104";
    private String url6 = "http://placekitten.com/200/200";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        catOne = (ImageView) findViewById(R.id.catOne);
        Glide.with(getApplicationContext())
                .load(url1)
                .into(catOne);

        catTwo = (ImageView) findViewById(R.id.catTwo);
        Glide.with(getApplicationContext())
                .load(url2)
                .into(catTwo);

        catThree = (ImageView) findViewById(R.id.catThree);
        Glide.with(getApplicationContext())
                .load(url3)
                .into(catThree);

        catFour = (ImageView) findViewById(R.id.catFour);
        Glide.with(getApplicationContext())
                .load(url4)
                .into(catFour);

        catFive = (ImageView) findViewById(R.id.catFive);
        Glide.with(getApplicationContext())
                .load(url5)
                .into(catFive);

        catSix = (ImageView) findViewById(R.id.catSix);
        Glide.with(getApplicationContext())
                .load(url6)
                .into(catSix);
    }
}
