package com.diya.sawaljawab;

import static com.diya.sawaljawab.R.id.question;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String[] questions={"Q1-Is your crush is yashika?","Q2-Are you really virgin","Q3-you ever kissed someone","Q4-Are you serious for your carrier","Q5-Did you like pussy","Q6-Are u a brilliant boy"};
    private boolean[] answers={true,true,false,true,true,true};
    private int score=0;
    Button YES;
    Button NO;
    TextView question;
    private int index=0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        YES=findViewById(R.id.Yes);
        NO=findViewById(R.id.No);
        question = findViewById(R.id.question);
        question.setText(questions[index]);

        YES.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index < questions.length - 1) {
                    if (answers [index] == true){
                        score++;
                    }
                    index++;
                    if (index < questions.length - 1) {
                        question.setText(questions[index]);
                    }


                    else{
                        Toast.makeText(MainActivity.this, "Your score is:" + score, Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });



        NO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index < questions.length - 1) {
                    if (answers [index] == false){
                        score++;
                    }
                    index++;
                    if (index < questions.length - 1)


                    {
                        question.setText(questions[index]);
                    }

                    else{
                        Toast.makeText(MainActivity.this, "Your score is:" + score, Toast.LENGTH_SHORT).show();
                    }

                }
            }});
}
}