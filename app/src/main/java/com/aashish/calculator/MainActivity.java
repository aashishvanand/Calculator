package com.aashish.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public String string ="";
    Character operator = 'q';
    int num,numtemp;
    TextView disp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        disp = (TextView) findViewById(R.id.disp);
    }
    public void btn0Clicked(View v){
        insert(0);

    }
    public void btn1Clicked(View v){
        insert(1);

    }

    public void btn2Clicked(View v){
        insert(2);

    }
    public void btn3Clicked(View v){
        insert(3);

    }
    public void btn4Clicked(View v){
        insert(4);

    }
    public void btn5Clicked(View v){
        insert(5);

    }
    public void btn6Clicked(View v){
        insert(6);
    }
    public void btn7Clicked(View v){
        insert(7);

    }
    public void btn8Clicked(View v){
        insert(8);

    }
    public void btn9Clicked(View v){
        insert(9);

    }
    public void btnplusClicked(View v){
        perform();
        operator = '+';
        clear();

    }

    public void btnminusClicked(View v){
        perform();
        operator = '-';
        clear();

    }
    public void btndivideClicked(View v){
        perform();
        operator = '/';
        clear();

    }
    public void btnmultiClicked(View v){
        perform();
        operator = '*';
        clear();

    }
    public void btnequalClicked(View v){
        calculate();

    }

    public void btnclearClicked(View v){
        reset();
    }
    private void reset() {
        string ="";
        operator ='q';
        num = 0;
        numtemp = 0;
        disp.setText("");
    }
    private void insert(int j) {
        string = string+Integer.toString(j);
        num = Integer.valueOf(string);
        disp.setText(string);
    }
    private void perform() {
        string = "";
        numtemp = num;
    }
    private void calculate() {
        if(operator == '+')
            num = numtemp+num;
        else if(operator == '-')
            num = numtemp-num;
        else if(operator == '/')
            if(num!=0) {
                num = numtemp / num;
            }
            else
            {
                Toast toast = Toast.makeText(getApplicationContext(),"Divide by Zero",Toast.LENGTH_SHORT);
                toast.show();
            }
        else if(operator == '*')
            num = numtemp*num;
        disp.setText(""+num);
    }
    private void clear()
    {
        disp.setText("");
    }
}

