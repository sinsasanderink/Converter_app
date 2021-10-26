package com.example.converterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    ImageView mimage;
    EditText minches_input;
    TextView mmeters_output;
    Button mbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mimage = findViewById(R.id.imageView2);
        mbutton = findViewById(R.id.button);
        minches_input = findViewById(R.id.inches_input);
        mmeters_output = findViewById(R.id.meters_output);

        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (minches_input.getText() == null && mmeters_output.getText() == null ||
                        minches_input.getText().length() == 0 && mmeters_output.getText().length() == 0)
                     Toast.makeText(getApplicationContext(),
                             "Enter a value. Can't be empty!", Toast.LENGTH_LONG).show();

                else if (minches_input.getText()!= null && minches_input.getText().length() > 0)
                     //Editable inches = minches.getText();
                    mmeters_output.setText("Result: "+
                            String.format("%.2f", (
                                    Double.parseDouble(minches_input.getText().toString()) *
                                    0.0254)));



                else if (mmeters_output.getText()!= null && mmeters_output.getText().length() > 0)
                    minches_input.setText("Result "+
                            String.format("%.2f",  (
                                    Double.parseDouble(mmeters_output.getText().toString()) *
                                            39.3701)));

            }
                                   }


        );
    }




}

