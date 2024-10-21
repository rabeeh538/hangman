package com.example.hangmangame;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView wordSpace;
    private TextView timer;
    private Button[] keyboardButtons = new Button[26]; // Array for all letter buttons

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        wordSpace = findViewById(R.id.word_space);
//        timer = findViewById(R.id.timer);
//
//        // Initialize keyboard buttons
//        initializeKeyboardButtons();
//    }
//
//    // Initialize each button and set a click listener
//    private void initializeKeyboardButtons() {
//        int[] buttonIds = {
//                R.id.buttonQ, R.id.buttonW, R.id.buttonE, R.id.buttonR, R.id.buttonT,
//                R.id.buttonY, R.id.buttonU, R.id.buttonI, R.id.buttonO, R.id.buttonP,
//                R.id.buttonA, R.id.buttonS, R.id.buttonD, R.id.buttonF, R.id.buttonG,
//                R.id.buttonH, R.id.buttonJ, R.id.buttonK, R.id.buttonL,
//                R.id.buttonZ, R.id.buttonX, R.id.buttonC, R.id.buttonV, R.id.buttonB,
//                R.id.buttonN, R.id.buttonM
//        };
//
//        // Loop through each button ID, find the button, and set up a click listener
//        for (int i = 0; i < buttonIds.length; i++) {
//            final Button button = findViewById(buttonIds[i]);
//            final String letter = button.getText().toString(); // Get the letter from the button text
//
//            button.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    onLetterClicked(letter, button);
//                }
//            });
//
//            keyboardButtons[i] = button;
//        }
//    }
//
//    // This method is called when a keyboard button is clicked
//    private void onLetterClicked(String letter, Button button) {
//        // Use the letter for your game logic (e.g., check if it is in the word)
//        // For now, just disable the button to indicate it's been used
//        button.setEnabled(false);
//
//        // TODO: Add your game logic here to check if the letter is part of the word
//        // e.g., update word display, reduce remaining attempts, etc.
//
//        // Example: Display which letter was selected (for testing purposes)
//        wordSpace.setText("You selected: " + letter);
 }}