package com.litlime.its_d3c;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    String operation = "";
    double val1 = 0;
    String txt2 = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText txt1 = (EditText) findViewById(R.id.editText);
        txt1.setInputType(InputType.TYPE_NULL);




        Button num0 = (Button) findViewById(R.id.num0);

        num0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"0");
                txt2+=(txt1.getText());
            }
        });



        Button num1 = (Button) findViewById(R.id.num1);

        num1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"1");
                txt2+=(txt1.getText());
            }
        });


        Button num2 = (Button) findViewById(R.id.num2);

        num2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"2");
                txt2+=(txt1.getText());
            }
        });


        Button num3 = (Button) findViewById(R.id.num3);

        num3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"3");
                txt2+=(txt1.getText());
            }
        });


        Button num4 = (Button) findViewById(R.id.num4);

        num4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"4");
                txt2+=(txt1.getText());
            }
        });


        Button num5 = (Button) findViewById(R.id.num5);

        num5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"5");
                txt2+=(txt1.getText());
            }
        });


        Button num6 = (Button) findViewById(R.id.num6);

        num6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"6");
                txt2+=(txt1.getText());
            }
        });


        Button num7 = (Button) findViewById(R.id.num7);

        num7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"7");
                txt2+=(txt1.getText());
            }
        });


        Button num8 = (Button) findViewById(R.id.num8);

        num8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"8");
                txt2+=(txt1.getText());
            }
        });


        Button num9 = (Button) findViewById(R.id.num9);

        num9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"9");
                txt2+=(txt1.getText());
            }
        });

        Button op_add = (Button) findViewById(R.id.op_add);

        op_add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                operation = "+";
                //val1 = Double.parseDouble(txt1.getText().toString());
                //txt1.setText(txt1.getText()+"+");
                txt1.setText("");
                val1 = Double.parseDouble(txt2);
                txt2="";
            }
        });


        Button op_sub = (Button) findViewById(R.id.op_sub);

        op_sub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"-");
            }
        });


        Button op_mul = (Button) findViewById(R.id.op_mul);

        op_mul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"x");
            }
        });


        Button op_div = (Button) findViewById(R.id.op_div);

        op_div.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"/");
            }
        });


        Button op_cancel = (Button) findViewById(R.id.op_cancel);

        op_cancel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                txt1.setText("");
                val1= 0;
            }
        });


        Button op_dot = (Button) findViewById(R.id.op_dot);

        op_dot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+".");
            }
        });

        Button op_eq = (Button) findViewById(R.id.op_eq);

        op_eq.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                txt1.setText(Calc(operation, val1));

            }
        });


    }

    protected String Calc(String operation, double val1) {
        double res = 0;
        Log.i("Val2= ", txt2);
        double val2 = Double.parseDouble(txt2);
        Log.i("Val1= ", Double.toString(val1));


        if (operation == "+")
            res = val1+val2;

        else if (operation == "-")
            res = val1-val2;

        else if (operation == "*")
            res = val1*val2;

        else if (operation == "/") {
            if (val2 == 0)
                res = 0;
            else
                res = val1/val2;
        }
        Log.i("res= ", Double.toString(res));
        return Double.toString(res);
    }

}
