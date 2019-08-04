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
            Float weightValue =  Float.parseFloat(weightStr) / 100;
            Float resultValue = Float.parseFloat(resultStr);

            Float calc =  resultValue * weightValue;
            displayCalc(calc);
        }
    }

    private void displayCalc(Float calc){
        String calcLabel = "";

        if (Float.compare(calc, 59f) > 0){
            calcLabel = getString(R.string.Well_Done_You_Have_Achieved_Passed);
        }else if (Float.compare(calc, 60f) > 0 && Float.compare(calc, 69f) <=0){
            calcLabel = getString(R.string.Well_Done_You_Have_Achieved_2_1);
        } else if (Float.compare(calc, 70f) > 0 && Float.compare(calc, 100f) <=0){
            calcLabel = getString(R.string.Well_Done_You_Have_Achieved_a_First);
        }
        calcLabel = calc + "\n\n" + calcLabel;
        outcome.setText(calcLabel);
    }
}
