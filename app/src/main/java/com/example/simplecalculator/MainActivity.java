package com.example.simplecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private double num1 = 0;
    private double num2 = 0;

    private char optr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn01Click (View view){
        EditText etext = findViewById(R.id.resultEdit);
        etext.setText(etext.getText()+"1");
    }

    public void btn02Click (View view){
        EditText etext = findViewById(R.id.resultEdit);
        etext.setText(etext.getText() + "2");
    }

    public void btn03Click (View view){
        EditText etext = findViewById(R.id.resultEdit);
        etext.setText(etext.getText()+"3");
    }

    public void btn04Click (View view){
        EditText etext = findViewById(R.id.resultEdit);
        etext.setText(etext.getText()+"4");
    }

    public void btn05Click (View view){
        EditText etext = findViewById(R.id.resultEdit);
        etext.setText(etext.getText()+"5");
    }

    public void btn06Click (View view){
        EditText etext = findViewById(R.id.resultEdit);
        etext.setText(etext.getText() + "6");
    }
    public void btn07Click (View view){
        EditText etext = findViewById(R.id.resultEdit);
        etext.setText(etext.getText()+"7");
    }
    public void btn08Click (View view){
        EditText etext = findViewById(R.id.resultEdit);
        etext.setText(etext.getText()+"8");
    }
    public void btn09Click (View view){
        EditText etext = findViewById(R.id.resultEdit);
        etext.setText(etext.getText()+"9");
    }
    public void btn0Click (View view){
        EditText etext = findViewById(R.id.resultEdit);
        etext.setText(etext.getText()+"0");
    }
    public void btnDecimalClick (View view){
        EditText etext = findViewById(R.id.resultEdit);
        etext.setText(etext.getText()+".");
    }
    public void btnClearClick (View view){
        EditText etext = findViewById(R.id.resultEdit);
        etext.setText("");
    }
    public void btnPlusClick (View view){
        EditText etext = findViewById(R.id.resultEdit);
        num1 = Double.parseDouble(etext.toString());
        optr = '+';
        etext.setText(etext.getText()+"+");
    }
    public void btnMinusClick (View view){
        EditText etext = findViewById(R.id.resultEdit);
        num1 = Double.parseDouble(etext.toString());
        optr = '-';
        etext.setText(etext.getText()+"-");
    }
    public void btnMultiplyClick (View view){
        EditText etext = findViewById(R.id.resultEdit);
        num1 = Double.parseDouble(etext.toString());
        optr = '*';
        etext.setText(etext.getText()+"*");
    }
    public void btnDivideClick (View view){
        EditText etext = findViewById(R.id.resultEdit);
        num1 = Double.parseDouble(etext.toString());
        optr = '/';
        etext.setText(etext.getText()+"/");
    }
    public void btnEqualClick (View view){
        EditText etext = findViewById(R.id.resultEdit);
        num2 = Double.parseDouble(etext.getText().toString());
        if(optr=='+'){
            etext.setText(Double.toString(num1+num2));
        }
        else if(optr=='-') {
            etext.setText(Double.toString(num1 - num2));
        }
        else if(optr=='*'){
            etext.setText(Double.toString(num1*num2));
        }
        else if(optr=='/'){
            etext.setText(Double.toString(num1/num2));
        }
        else{
            etext.setText(R.string.error_msg);
        }
    }
}