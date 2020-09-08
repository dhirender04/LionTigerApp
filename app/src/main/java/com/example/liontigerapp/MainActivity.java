package com.example.liontigerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    enum Player{
        ONE,TWO,NO
    }
    Player currentPlayer =Player.ONE;
    Player[] playerChoice=new Player[9];
    int[][] winnerRowsColumns={{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playerChoice[0]=Player.NO;
        playerChoice[1]=Player.NO;
        playerChoice[2]=Player.NO;
        playerChoice[3]=Player.NO;
        playerChoice[4]=Player.NO;
        playerChoice[5]=Player.NO;
        playerChoice[6]=Player.NO;
        playerChoice[7]=Player.NO;
        playerChoice[8]=Player.NO;




    }


    public void imageViewIsTapped(View imageView){
        ImageView tappedImageView=(ImageView) imageView;
        tappedImageView.setTranslationX(-2000);
        int tiTag=Integer.parseInt(imageView.getTag().toString());
        playerChoice[tiTag]=currentPlayer;
        if(currentPlayer==Player.ONE) {
            tappedImageView.setImageResource(R.drawable.lion);
            currentPlayer=Player.TWO;


        }else if(currentPlayer==Player.TWO){
            tappedImageView.setImageResource(R.drawable.tiger);

            currentPlayer=Player.ONE;

        }
        tappedImageView.animate().translationXBy(2000).alpha(1).rotation(3600).setDuration(1000);
        Toast.makeText(this, tappedImageView.getTag().toString(), Toast.LENGTH_SHORT).show();

        for(int[] winnerColumns : winnerRowsColumns){
            if(playerChoice[winnerColumns[0]]==playerChoice[winnerColumns[1]]
                   && playerChoice[winnerColumns[1]]==playerChoice[winnerColumns[2]]
                    && playerChoice[winnerColumns[0]] != Player.NO){

                Toast.makeText(this,"You Are The Winner Of The Chicken Dinner", Toast.LENGTH_SHORT).show();


            }
        }
    }
}