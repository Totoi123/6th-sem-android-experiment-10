package com.example.experiment10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    ImageView image;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinner);
        image = (ImageView) findViewById(R.id.img);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 1:
                        animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.alpha);
                        image.startAnimation(animation);
                        break;
                    case 2:
                        animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate);
                        image.startAnimation(animation);
                        break;
                    case 3:
                        animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale);
                        image.startAnimation(animation);
                        break;
                    case 4:
                        animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.spin);
                        image.startAnimation(animation);
                        break;
                    case 5:
                        animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.translate);
                        image.startAnimation(animation);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }

}
