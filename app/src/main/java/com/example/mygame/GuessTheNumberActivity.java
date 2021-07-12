package com.example.mygame;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import java.util.Scanner;
import android.os.Bundle;
import android.widget.TextView;

public class GuessTheNumberActivity extends AppCompatActivity {

    private TextView titleTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess_the_number);

        titleTv = findViewById(R.id.titleTv);
        titleTv.setText("Я загадал число от 0 до 1000. /end Ваш ход.");

       /* Scanner scanner = new Scanner(System.in);
        int randomInt = new Random().nextInt(1000);

        int userInput = -1;
        int numberOаAttempts = 0;

        while (userInput != randomInt) {
            userInput = scanner.nextInt();
            numberOаAttempts++;
            if (userInput < randomInt) {
                System.out.println("Больше");
            } else if (userInput > randomInt) {
                System.out.println("Меньше");
            }
        }
        System.out.println("Количество попыток: " + numberOаAttempts);
        System.out.println("Верно!!!");*/
    }
}