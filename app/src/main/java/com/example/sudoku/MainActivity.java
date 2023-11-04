package com.example.sudoku;

import android.app.Activity;
import android.graphics.Color;
import android.util.TypedValue;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.util.Log;
import android.widget.TextView;

public class MainActivity  extends Activity{

    String selected_number = "";

    String selected_difficulty = "none";

    private TextView textView;

    // This initializes the game board

    String[][] board = {
            {"", "", "", "", "", "", "", "", ""},
            {"", "", "", "", "", "", "", "", ""},
            {"", "", "", "", "", "", "", "", ""},
            {"", "", "", "", "", "", "", "", ""},
            {"", "", "", "", "", "", "", "", ""},
            {"", "", "", "", "", "", "", "", ""},
            {"", "", "", "", "", "", "", "", ""},
            {"", "", "", "", "", "", "", "", ""},
            {"", "", "", "", "", "", "", "", ""}
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        // Create a ridiculous amount of buttons

        GridLayout gridLayout = findViewById(R.id.gridLayout);

        int buttonSizeInDp = 40; // Set the size in dp
        int buttonSizeInPixels = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, buttonSizeInDp, getResources().getDisplayMetrics()
        );

        for (int i = 1; i <= 81; i++) {
            Button button = new Button(this);
            button.setText("");

            // Set a unique ID for each button
            button.setId(i);

            // Set the width and height for each button
            GridLayout.LayoutParams params = new GridLayout.LayoutParams();
            params.width = buttonSizeInPixels;
            params.height = buttonSizeInPixels;
            params.rowSpec = GridLayout.spec(GridLayout.UNDEFINED, 1f);
            params.columnSpec = GridLayout.spec(GridLayout.UNDEFINED, 1f);

            // Set the custom background drawable
            button.setBackgroundResource(R.drawable.button_background);

            button.setLayoutParams(params);

            // Add a click listener to each button
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Button clickedButton = (Button) v;
                    String buttonText = clickedButton.getText().toString();

                    if (buttonText.isEmpty()) {
                        clickedButton.setText(selected_number);
                    }
                }
            });

            gridLayout.addView(button);
        }

        // changing values depending on which button is pressed
        Button num1Button = findViewById(R.id.num1_button);
        Button num2Button = findViewById(R.id.num2_button);
        Button num3Button = findViewById(R.id.num3_button);
        Button num4Button = findViewById(R.id.num4_button);
        Button num5Button = findViewById(R.id.num5_button);
        Button num6Button = findViewById(R.id.num6_button);
        Button num7Button = findViewById(R.id.num7_button);
        Button num8Button = findViewById(R.id.num8_button);
        Button num9Button = findViewById(R.id.num9_button);

        num1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choose_number(v);
            }
        });

        num2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choose_number(v);
            }
        });

        num3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choose_number(v);
            }
        });

        num4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choose_number(v);
            }
        });

        num5Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choose_number(v);
            }
        });

        num6Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choose_number(v);
            }
        });

        num7Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choose_number(v);
            }
        });

        num8Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choose_number(v);
            }
        });

        num9Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choose_number(v);
            }
        });

    }

    public void select_easy(View v) {

        selected_difficulty = "easy";

        String[] values = {
                "", "", "", "", "", "", "", "", "7",
                "", "", "8", "", "", "", "2", "", "",
                "2", "", "5", "4", "", "", "6", "9", "3",
                "", "8", "", "", "6", "", "9", "", "5",
                "7", "6", "", "", "5", "", "3", "1", "8",
                "5", "3", "9", "8", "", "4", "", "", "",
                "", "", "", "", "", "", "", "3", "",
                "", "4", "2", "", "", "7", "8", "6", "2",
                "6", "5", "", "2", "8", "1", "4", "", ""
        };

        int index = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = values[index];
                index++;
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                // Calculate the unique button ID based on row and column
                int buttonId = i * 9 + j + 1;

                // Find the corresponding button by its ID
                Button button = findViewById(buttonId);

                // Set the text of the button to the value from the 'board' array
                button.setText(board[i][j]);
            }
        }
    }

    public void select_medium(View v) {

        selected_difficulty = "medium";

        String[] values = {
                "", "", "", "2", "", "", "", "", "8",
                "7", "", "1", "", "", "9", "", "", "",
                "", "2", "", "7", "6", "5", "3", "", "",
                "", "8", "9", "5", "4", "6", "", "2", "7",
                "4", "", "", "", "", "", "9", "", "",
                "1", "9", "", "", "", "8", "2", "", "",
                "2", "7", "6", "", "", "3", "", "1", "9",
                "", "", "", "", "", "", "", "", "",
                "", "", "3", "", "2", "", "6", "", ""
        };

        int index = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = values[index];
                index++;
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                // Calculate the unique button ID based on row and column
                int buttonId = i * 9 + j + 1;

                // Find the corresponding button by its ID
                Button button = findViewById(buttonId);

                // Set the text of the button to the value from the 'board' array
                button.setText(board[i][j]);
            }
        }
    }

    public void select_hard(View v) {

        selected_difficulty = "hard";

        String[] values = {
                "1", "", "", "", "", "", "", "", "",
                "", "1", "", "", "", "", "", "", "",
                "", "", "1", "", "", "", "", "", "",
                "", "", "", "1", "", "", "", "", "",
                "", "", "", "", "1", "", "", "", "",
                "", "", "", "", "", "1", "", "", "",
                "", "", "", "", "", "", "1", "", "",
                "", "", "", "", "", "", "", "1", "",
                "", "", "", "", "", "", "", "", "1"
        };

        int index = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = values[index];
                index++;
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                // Calculate the unique button ID based on row and column
                int buttonId = i * 9 + j + 1;

                // Find the corresponding button by its ID
                Button button = findViewById(buttonId);

                // Set the text of the button to the value from the 'board' array
                button.setText(board[i][j]);
            }
        }
    }

    public void choose_number(View v) {
        Button clickedButton = (Button) v;
        selected_number = clickedButton.getText().toString();
    }

    public void reset_puzzle(View v) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                // Calculate the unique button ID based on row and column
                int buttonId = i * 9 + j + 1;

                // Find the corresponding button by its ID
                Button button = findViewById(buttonId);

                // Set the text of the button to the value from the 'board' array
                button.setText(board[i][j]);
            }
        }
    }

    public void submit_puzzle(View v) {
        if (selected_difficulty == "easy") {
            String[][] easySudokuSolution = {
                {"4", "9", "6", "3", "2", "5", "1", "8", "7"},
                {"3", "7", "8", "1", "9", "6", "2", "5", "4"},
                {"2", "1", "5", "4", "7", "8", "6", "9", "3"},
                {"1", "8", "2", "7", "6", "3", "9", "4", "5"},
                {"7", "6", "4", "9", "5", "2", "9", "4", "5"},
                {"5", "3", "9", "8", "1", "4", "7", "2", "6"},
                {"8", "2", "7", "6", "4", "9", "5", "3", "1"},
                {"9", "4", "1", "5", "3", "7", "8", "6", "2"},
                {"6", "9", "3", "2", "8", "1", "4", "7", "9"}
            };

            for (int i = 1; i <= 81; i++) {
                Button button = findViewById(i);
                String buttonText = button.getText().toString();
                int row = (i - 1) / 9;
                int col = (i - 1) % 9;

                // Check if the button's text is not equal to the solution
                if (!buttonText.equals(easySudokuSolution[row][col]) || buttonText.equals(" ")) {
                    textView.setText("Sorry Try again       :(");
                    textView.setTextColor(Color.RED);
                }
            }
        } else if (selected_difficulty == "medium") { // This puzzle is broken
            String[][] mediumSudokuSolution = {
                {"6", "3", "5", "2", "1", "4", "7", "9", "8"},
                {"7", "4", "1", "3", "8", "9", "5", "6", "2"},
                {"9", "2", "8", "7", "6", "5", "3", "4", "1"},
                {"5", "1", "7", "8", "9", "2", "4", "3", "6"},
                {"3", "8", "9", "5", "4", "6", "1", "2", "7"},
                {"4", "6", "2", "1", "3", "7", "9", "8", "5"},
                {"1", "9", "4", "6", "7", "8", "2", "5", "3"},
                {"2", "7", "6", "4", "5", "3", "8", "1", "9"},
                {"8", "5", "3", "9", "2", "1", "6", "7", "4"}
            };

            for (int i = 1; i <= 81; i++) {
                Button button = findViewById(i);
                String buttonText = button.getText().toString();
                int row = (i - 1) / 9;
                int col = (i - 1) % 9;

                // Check if the button's text is not equal to the solution
                if (!buttonText.equals(mediumSudokuSolution[row][col]) || buttonText.equals(" ")) {
                    textView.setText("Sorry Try again       :(");
                    textView.setTextColor(Color.RED);
                }
            }
        } else if (selected_difficulty == "hard") { // This puzzle is broken

            String[][] hardSudokuSolution = {
                {"1", "1", "1", "1", "1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1", "1", "1", "1", "1"}
            };

            for (int i = 1; i <= 81; i++) {
                Button button = findViewById(i);
                String buttonText = button.getText().toString();
                int row = (i - 1) / 9;
                int col = (i - 1) % 9;

                // Check if the button's text is not equal to the solution
                if (!buttonText.equals(hardSudokuSolution[row][col]) || buttonText.equals(" ")) {
                    textView.setText("Sorry Try again       :(");
                    textView.setTextColor(Color.RED);
                }
            }
        } else {
            textView.setText("Select a difficulty");
            textView.setTextColor(Color.WHITE);
        }
    }

}
