package com.example.hw_class230_forloopinandroidpart2factorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText userInput;
    Button button;
    TextView tvDisplay;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userInput = findViewById(R.id.userInput);
        button = findViewById(R.id.button);
        tvDisplay = findViewById(R.id.tvDisplay);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int factorial = 1;
                tvDisplay.setText("");
                int userData = Integer.parseInt(userInput.getText().toString());


                for (int i = 1; i <= userData; i++) {

                    factorial = factorial*i;

                    tvDisplay.setText("Facrial of "+userData+ " is = " +factorial);

                }

            }
        });



    }
}