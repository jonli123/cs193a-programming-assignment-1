package com.example.jonny.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button1_click(View view){
        double tip = 0;
        double bill = 0;

        EditText billTextbox = (EditText) findViewById(R.id.billText);
        bill = Double.parseDouble(billTextbox.getText().toString());
        EditText tipTextbox = (EditText) findViewById(R.id.tipText);
        tip = Double.parseDouble(tipTextbox.getText().toString())/100 * bill;
        tip = (Math.ceil(tip*100))/100;

        double total = (Math.ceil((tip+bill)*100))/100;

        TextView answerTextbox = (TextView) findViewById(R.id.answer);

        answerTextbox.setText("Tip: $"+ String.format("%.2f",tip) + "\nTotal: $"+ String.format("%.2f", total));

    }
}
