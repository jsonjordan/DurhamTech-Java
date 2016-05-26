package com.example.jason.phonephotoprints;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    double FOUR_BY_SIX = .19;
    double FIVE_BY_SEVEN = .49;
    double EIGHT_BY_TEN = .79;
    double numberOfPrints = 0;
    double totalCost;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTheme(android.R.style.Theme_Holo);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayUseLogoEnabled(true);
        }


        final EditText prints = (EditText) findViewById(R.id.txtPrints);
        final RadioButton rad4x6 = (RadioButton) findViewById(R.id.rad4x6);
        final RadioButton rad5x7 = (RadioButton) findViewById(R.id.rad5x7);
        final RadioButton rad8x10 = (RadioButton) findViewById(R.id.rad8x10);
        final TextView results = (TextView) findViewById(R.id.txtResults);
        Button order = (Button) findViewById(R.id.btnOrder);


        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberOfPrints = Double.parseDouble(prints.getText().toString());
                DecimalFormat hundredth = new DecimalFormat("#.##");

                if (rad4x6.isChecked()) {
                    if (numberOfPrints <= 50) {
                        totalCost = numberOfPrints * FOUR_BY_SIX;
                        results.setText("The order cost is $" + hundredth.format(totalCost));
                    } else {
                        Toast.makeText(MainActivity.this, "Cannot order more than 50 prints", Toast.LENGTH_LONG).show();
                    } // end else
                } // end 4x6

                if (rad5x7.isChecked()) {
                    if (numberOfPrints <= 50) {
                        totalCost = numberOfPrints * FIVE_BY_SEVEN;
                        results.setText("The order cost is $" + hundredth.format(totalCost));
                    } else {
                        Toast.makeText(MainActivity.this, "Cannot order more than 50 prints", Toast.LENGTH_LONG).show();
                    } // end else
                } // end 5x7

                if (rad8x10.isChecked()) {
                    if (numberOfPrints <= 50) {
                        totalCost = numberOfPrints * EIGHT_BY_TEN;
                        results.setText("The order cost is $" + hundredth.format(totalCost));
                    } else {
                        Toast.makeText(MainActivity.this, "Cannot order more than 50 prints", Toast.LENGTH_LONG).show();
                    } // end else
                } // end 8x10
            }


        });

    }

}