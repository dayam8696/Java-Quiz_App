package com.example.cha4practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String[] questions = {"1. Java is a person?", "2. java was introduced in 1233?", "3. java is object oriented programing language?", "4. Java have abstract classes?" , "5. Java is extension of JavaScript?" };
    private boolean[] answers = { false , false ,true , true, false};
    private int score = 0;
    private int index = 0;
    Button yes ;
    Button no;
   TextView question;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes = findViewById(R.id.YES);
        no = findViewById(R.id.NO);
      question = findViewById(R.id.question);
      question.setText(questions[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if the array is not going out of bounds
                if (index<=questions.length-1){
                    //if you have given correct answer
                    if (answers[index]==true){
                        score++;

                    }
                    //go to the next question
                    index++;
                    if(index<=questions.length-1){
                        question.setText(questions[index]);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Your score is " +score+ "/"+ questions.length , Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(MainActivity.this, "Restart the app to play again ", Toast.LENGTH_SHORT).show();
                }
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index<=questions.length-1){
                    if (answers[index]==false){
                        score++;


                    }
                    index++;
                    if(index<=questions.length-1){
                        question.setText(questions[index]);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Your score is " +score+ "/"+ questions.length , Toast.LENGTH_SHORT).show();
                    }

                }
                else {
                    Toast.makeText(MainActivity.this, "Restart the app to play again ", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}