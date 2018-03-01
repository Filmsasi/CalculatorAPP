package com.feemsasi.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;
    private Button btnMul;
    private Button btnDiv;
    private Button btnSub;
    private Button btnAdd;
    private Button btnEqual;
    private Button btnClear;
    private Button btnPoint;
    private Button btnDEL;

    private TextView txtVResult;

    private Double operand1 = 0.0;
    private Double operand2 = 0.0;
    private int choperand2 = 0;
    private int cheq = 0;
    private String operator = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn6 = findViewById(R.id.btn_6);
        btn7 = findViewById(R.id.btn_7);
        btn8 = findViewById(R.id.btn_8);
        btn9 = findViewById(R.id.btn_9);
        btn0 = findViewById(R.id.btn_0);
        btnMul = findViewById(R.id.btn_mul);
        btnDiv = findViewById(R.id.btn_div);
        btnSub = findViewById(R.id.btn_sub);
        btnAdd = findViewById(R.id.btn_add);
        btnEqual = findViewById(R.id.btn_equal);
        btnClear = findViewById(R.id.btn_clear);
        btnPoint = findViewById(R.id.btn_point);
        btnDEL = findViewById(R.id.btn_DEL);

        txtVResult =findViewById(R.id.textView_ans);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(operator.equals("")) && choperand2 == 0) {
                    choperand2 = 1;
                    txtVResult.setText("0");
                }

                if (txtVResult.getText().toString().equals("0")) {
                    txtVResult.setText("0");
                }
                else {
                    String oldRes = txtVResult.getText().toString();
                    oldRes = oldRes + "0";
                    txtVResult.setText(oldRes);
                }
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(operator.equals("")) && choperand2 == 0) {
                    choperand2 = 1;
                    txtVResult.setText("0");
                }

                if (txtVResult.getText().toString().equals("0")) {
                    txtVResult.setText("1");
                }
                else {
                    String oldRes = txtVResult.getText().toString();
                    oldRes = oldRes + "1";
                    txtVResult.setText(oldRes);
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(operator.equals("")) && choperand2 == 0) {
                    choperand2 = 1;
                    txtVResult.setText("0");
                }

                if (txtVResult.getText().toString().equals("0")) {
                    txtVResult.setText("2");
                }
                else {
                    String oldRes = txtVResult.getText().toString();
                    oldRes = oldRes + "2";
                    txtVResult.setText(oldRes);
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(operator.equals("")) && choperand2 == 0) {
                    choperand2 = 1;
                    txtVResult.setText("0");
                }

                if (txtVResult.getText().toString().equals("0")) {
                    txtVResult.setText("3");
                }
                else {
                    String oldRes = txtVResult.getText().toString();
                    oldRes = oldRes + "3";
                    txtVResult.setText(oldRes);
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(operator.equals("")) && choperand2 == 0) {
                    choperand2 = 1;
                    txtVResult.setText("0");
                }

                if (txtVResult.getText().toString().equals("0")) {
                    txtVResult.setText("4");
                }
                else {
                    String oldRes = txtVResult.getText().toString();
                    oldRes = oldRes + "4";
                    txtVResult.setText(oldRes);
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(operator.equals("")) && choperand2 == 0) {
                    choperand2 = 1;
                    txtVResult.setText("0");
                }

                if (txtVResult.getText().toString().equals("0")) {
                    txtVResult.setText("5");
                }
                else {
                    String oldRes = txtVResult.getText().toString();
                    oldRes = oldRes + "5";
                    txtVResult.setText(oldRes);
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(operator.equals("")) && choperand2 == 0) {
                    choperand2 = 1;
                    txtVResult.setText("0");
                }

                if (txtVResult.getText().toString().equals("0")) {
                    txtVResult.setText("6");
                }
                else {
                    String oldRes = txtVResult.getText().toString();
                    oldRes = oldRes + "6";
                    txtVResult.setText(oldRes);
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(operator.equals("")) && choperand2 == 0) {
                    choperand2 = 1;
                    txtVResult.setText("0");
                }

                if (txtVResult.getText().toString().equals("0")) {
                    txtVResult.setText("7");
                }
                else {
                    String oldRes = txtVResult.getText().toString();
                    oldRes = oldRes + "7";
                    txtVResult.setText(oldRes);
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(operator.equals("")) && choperand2 == 0) {
                    choperand2 = 1;
                    txtVResult.setText("0");
                }

                if (txtVResult.getText().toString().equals("0")) {
                    txtVResult.setText("8");
                }
                else {
                    String oldRes = txtVResult.getText().toString();
                    oldRes = oldRes + "8";
                    txtVResult.setText(oldRes);
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(operator.equals("")) && choperand2 == 0) {
                    choperand2 = 1;
                    txtVResult.setText("0");
                }

                if (txtVResult.getText().toString().equals("0")) {
                    txtVResult.setText("9");
                }
                else {
                    String oldRes = txtVResult.getText().toString();
                    oldRes = oldRes + "9";
                    txtVResult.setText(oldRes);
                }
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String oldResult = txtVResult.getText().toString();
                if (operand2 == 0 && choperand2 == 1) {
                    operand2 = Double.valueOf(oldResult);
                }
                else if (operand2 != 0 && choperand2 == 1) {
                    operand2 = Double.valueOf(oldResult);
                }
                choperand2 = 0;
                if (!(operator.equals("+")) && operand1 != 0) {
                    operand1 = Double.valueOf(oldResult);
                    operand2 = 0.0;
                    operator = "+";
                }
                else if (!(operator.equals("")) && cheq == 0) {
                    switch (operator) {
                        case "+":
                            operand1 = operand1 + operand2;
                            break;
                        case "-":
                            operand1 = operand1 - operand2;
                            break;
                        case "*":
                            operand1 = operand1 * operand2;
                            break;
                        case "/":
                            if (Double.valueOf(oldResult) != 0) {
                                operand1 = operand1 / operand2;
                            }
                            else {
                                txtVResult.setText("Error!");
                                return;
                            }
                            break;
                    }
                    operator = "+";
                    if ((operand1 % 1) != 0) {
                        txtVResult.setText(String.format(Locale.getDefault(), "%.1f", operand1));
                    }
                    else {
                        int toIntResult = (int) Math.ceil(operand1);
                        txtVResult.setText(String.format(Locale.getDefault(), "%d", toIntResult));
                    }
                }
                else {
                    operand1 = Double.valueOf(oldResult);
                    operator = "+";
                }
                cheq = 0;
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtVResult.setText("0");
                operator = "";
                operand1 = 0.0;
                operand2 = 0.0;
            }
        });
        btnDEL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(txtVResult.getText().toString().equals("0"))) {
                    if (operand1 != 0) {
                        String oldResult = txtVResult.getText().toString();
                        if (oldResult.length() > 1) {
                            oldResult = oldResult.substring(0, oldResult.length() - 1);
                            operand1 = operand1 / 10;
                            operand2 = 0.0;
                            operator = "";
                        }
                        else {
                            operand1 = 0.0;
                            oldResult = "0";
                        }
                        txtVResult.setText(oldResult);
                    }
                    else {
                        String oldResult = txtVResult.getText().toString();
                        if (oldResult.length() > 1) {
                            oldResult = oldResult.substring(0, oldResult.length() - 1);
                        }
                        else {
                            oldResult = "0";
                        }
                        txtVResult.setText(oldResult);
                    }
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String oldResult = txtVResult.getText().toString();
                if (operand2 == 0 && choperand2 == 1) {
                    operand2 = Double.valueOf(oldResult);
                }
                else if (operand2 != 0 && choperand2 == 1) {
                    operand2 = Double.valueOf(oldResult);
                }
                choperand2 = 0;

                if (!(operator.equals("/")) && operand1 != 0) {
                    operand1 = Double.valueOf(oldResult);
                    operand2 = 0.0;
                    operator = "/";
                }
                else if (!(operator.equals(""))) {
                    switch (operator) {
                        case "+":
                            operand1 = operand1 + operand2;
                            break;
                        case "-":
                            operand1 = operand1 - operand2;
                            break;
                        case "*":
                            operand1 = operand1 * operand2;
                            break;
                        case "/":
                            if (Double.valueOf(oldResult) != 0) {
                                operand1 = operand1 / operand2;
                            }
                            else {
                                txtVResult.setText("Error!");
                                return;
                            }
                            break;
                    }
                    operator = "/";
                    if ((operand1 % 1) != 0) {
                        txtVResult.setText(String.format(Locale.getDefault(), "%.1f", operand1));
                    }
                    else {
                        int toIntResult = (int) Math.ceil(operand1);
                        txtVResult.setText(String.format(Locale.getDefault(), "%d", toIntResult));
                    }
                }
                else {
                    operand1 = Double.valueOf(oldResult);
                    operator = "/";
                }
                cheq = 0;
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cheq = 1;
                String oldResult = txtVResult.getText().toString();
                if (operand2 == 0 && choperand2 == 1) {
                    operand2 = Double.valueOf(oldResult);
                }
                else if (operand2 != 0 && choperand2 == 1) {
                    operand2 = Double.valueOf(oldResult);
                }
                choperand2 = 0;
                if (!(operator.equals(""))) {
                    switch (operator) {
                        case "+":
                            operand1 = operand1 + operand2;
                            break;
                        case "-":
                            operand1 = operand1 - operand2;
                            break;
                        case "*":
                            operand1 = operand1 * operand2;
                            break;
                        case "/":
                            if (Double.valueOf(oldResult) != 0) {
                                operand1 = operand1 / operand2;
                            }
                            else {
                                txtVResult.setText("Error!");
                                return;
                            }
                            break;
                    }
                    //operator = "+";
                    if ((operand1 % 1) != 0.00) {
                        txtVResult.setText(String.format(Locale.getDefault(), "%.1f", operand1));
                    }
                    else {
                        int toIntResult = (int) Math.ceil(operand1);
                        txtVResult.setText(String.format(Locale.getDefault(), "%d", toIntResult));
                    }
                }
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String oldResult = txtVResult.getText().toString();
                if (operand2 == 0 && choperand2 == 1) {
                    operand2 = Double.valueOf(oldResult);
                }
                else if (operand2 != 0 && choperand2 == 1) {
                    operand2 = Double.valueOf(oldResult);
                }
                choperand2 = 0;

                if (!(operator.equals("*")) && operand1 != 0) {
                    operand1 = Double.valueOf(oldResult);
                    operand2 = 0.0;
                    operator = "*";
                }
                else if (!(operator.equals(""))) {
                    switch (operator) {
                        case "+":
                            operand1 = operand1 + operand2;
                            break;
                        case "-":
                            operand1 = operand1 - operand2;
                            break;
                        case "*":
                            operand1 = operand1 * operand2;
                            break;
                        case "/":
                            if (Double.valueOf(oldResult) != 0) {
                                operand1 = operand1 / operand2;
                            }
                            else {
                                txtVResult.setText("Error!");
                                return;
                            }
                            break;
                    }
                    operator = "*";
                    if ((operand1 % 1) != 0) {
                        txtVResult.setText(String.format(Locale.getDefault(), "%.1f", operand1));
                    }
                    else {
                        int toIntResult = (int) Math.ceil(operand1);
                        txtVResult.setText(String.format(Locale.getDefault(), "%d", toIntResult));
                    }
                }
                else {
                    operand1 = Double.valueOf(oldResult);
                    operator = "*";
                }
                cheq = 0;
            }
        });
        btnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String oldRes = txtVResult.getText().toString();
                oldRes = oldRes + ".";
                txtVResult.setText(oldRes);
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String oldResult = txtVResult.getText().toString();
                if (operand2 == 0 && choperand2 == 1) {
                    operand2 = Double.valueOf(oldResult);
                }
                else if (operand2 != 0 && choperand2 == 1) {
                    operand2 = Double.valueOf(oldResult);
                }
                choperand2 = 0;
                if (!(operator.equals("-")) && operand1 != 0) {
                    operand1 = Double.valueOf(oldResult);
                    operand2 = 0.0;
                    operator = "-";
                }
                else if (!(operator.equals(""))) {
                    switch (operator) {
                        case "+":
                            operand1 = operand1 + operand2;
                            break;
                        case "-":
                            operand1 = operand1 - operand2;
                            break;
                        case "*":
                            operand1 = operand1 * operand2;
                            break;
                        case "/":
                            if (Double.valueOf(oldResult) != 0) {
                                operand1 = operand1 / operand2;
                            }
                            else {
                                txtVResult.setText("Error!");
                                return;
                            }
                            break;
                    }
                    operator = "-";
                    if ((operand1 % 1) != 0) {
                        txtVResult.setText(String.format(Locale.getDefault(), "%.1f", operand1));
                    }
                    else {
                        int toIntResult = (int) Math.ceil(operand1);
                        txtVResult.setText(String.format(Locale.getDefault(), "%d", toIntResult));
                    }
                }
                else {
                    operand1 = Double.valueOf(oldResult);
                    operator = "-";
                }
                cheq = 0;
            }
        });
    }
}
