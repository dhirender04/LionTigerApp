package com.example.liontigerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.gridlayout.widget.GridLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






    }


    public void imageViewIsTapped(View imageView){
        ImageView tappedImageView=(ImageView) imageView;
        tappedImageView.setTranslationX(-2000);
        tappedImageView.setImageResource(R.drawable.lion);
        tappedImageView.animate().translationXBy(2000).alpha(1).rotation(3600).setDuration(1000);

    }
}