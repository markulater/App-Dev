package com.example.markulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText weight;
    private EditText result;
    private TextView outcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        weight = (EditText) findViewById(R.id.weight);
        result = (EditText) findViewById(R.id.result);
        outcome = (TextView) findViewById(R.id.outcome);
    }

    public void markulutorCal(View v){
        String weightStr = weight.getText().toString();
        String resultStr = result.getText().toString();

        if (weightStr != null && !"".equals(weightStr)
            && weightStr != null && !"".equals(weightStr)){
            int weightValue = int.ParseInt(weightStr/ 100;
        }
    }
}
