package com.example.trafficlightsimulator;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView colorLabel;
    private Button nextColorButton;
    private String[] colors = {"RED", "YELLOW", "GREEN"};
    private int currentColorIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colorLabel = findViewById(R.id.colorLabel);
        nextColorButton = findViewById(R.id.nextColorButton);

        updateColor();

        nextColorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentColorIndex = (currentColorIndex + 1) % colors.length;
                updateColor();
            }
        });
    }

    private void updateColor() {
        String currentColor = colors[currentColorIndex];
        colorLabel.setText(currentColor);

        switch (currentColor) {
            case "RED":
                colorLabel.setTextColor(Color.RED);
//                colorLabel.setBackgroundColor(Color.RED);
                break;
            case "YELLOW":
                colorLabel.setTextColor(Color.YELLOW);

                break;
            case "GREEN":
                colorLabel.setTextColor(Color.GREEN);
                break;
        }
    }
}
