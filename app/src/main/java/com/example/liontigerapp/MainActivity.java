package com.example.liontigerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    enum Player{
        ONE,TWO
    }
    Player currentPlayer =Player.ONE;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






    }


    public void imageViewIsTapped(View imageView){
        ImageView tappedImageView=(ImageView) imageView;
        tappedImageView.setTranslationX(-2000);

        if(currentPlayer==Player.ONE) {
            tappedImageView.setImageResource(R.drawable.lion);
            tappedImageView.animate().translationXBy(2000).alpha(1).rotation(3600).setDuration(1000);
            currentPlayer=Player.TWO;
        }else if(currentPlayer==Player.TWO){
            tappedImageView.setImageResource(R.drawable.tiger);
            tappedImageView.animate().translationXBy(2000).alpha(1).rotation(3600).setDuration(1000);
            currentPlayer=Player.ONE;

        }
    }
}