package com.example.karlharvey.kittengallery;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //array of URLs to images to be retrieved

    public static String[] catImages = {
            "http://placekitten.com/400/550",
            "http://placekitten.com/401/551",
            "http://placekitten.com/402/552",
            "http://placekitten.com/403/553",
            "http://placekitten.com/404/554",
            "http://placekitten.com/405/555",
            "http://placekitten.com/406/556",
            "http://placekitten.com/407/557",
            "http://placekitten.com/408/558",
            "http://placekitten.com/409/559",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        // setting up the listview layout and creating a new instance of SimpleImageListAdapter
        // to be passed on to the SimpleImageListAdapter class.

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(
                new SimpleImageListAdapter(
                         MainActivity.this,
                        catImages
                )
        );
    }
}
