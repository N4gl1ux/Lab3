package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.itis.libs.parserng.android.expressParser.MathExpression;
public class MainActivity extends AppCompatActivity {

    TextView calculatorScreen;
    Button back;
    Button clear;
    Button root;
    Button equation;
    Button n7;
    Button n8;
    Button n9;
    Button division;
    Button n4;
    Button n5;
    Button n6;
    Button multiplication;
    Button n1;
    Button n2;
    Button n3;
    Button add;
    Button n0;
    Button dot;
    Button subtraction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.calculatorScreen = findViewById(R.id.calculatorScreen);
        this.back = findViewById(R.id.back);
        this.clear = findViewById(R.id.clear);
        this.root = findViewById(R.id.root);
        this.equation = findViewById(R.id.equation);
        this.n7 = findViewById(R.id.n7);
        this.n8 = findViewById(R.id.n8);
        this.n9 = findViewById(R.id.n9);
        this.division = findViewById(R.id.division);
        this.n4 = findViewById(R.id.n4);
        this.n5 = findViewById(R.id.n5);
        this.n6 = findViewById(R.id.n6);
        this.multiplication = findViewById(R.id.multiplication);
        this.n1 = findViewById(R.id.n1);
        this.n2 = findViewById(R.id.n2);
        this.n3 = findViewById(R.id.n3);
        this.add = findViewById(R.id.add);
        this.n0 = findViewById(R.id.n0);
        this.dot= findViewById(R.id.dot);
        this.subtraction = findViewById(R.id.subtraction);
    }

    public void onBtn0Click(View view){

        String currentText = calculatorScreen.getText().toString();
        String newText = currentText + "0";
        calculatorScreen.setText(newText);
    }

    public void onBtn1Click(View view){

        String currentText = calculatorScreen.getText().toString();
        String newText = currentText + "1";
        calculatorScreen.setText(newText);
    }

    public void onBtn2Click(View view){

        String currentText = calculatorScreen.getText().toString();
        String newText = currentText + "2";
        calculatorScreen.setText(newText);
    }

    public void onBtn3Click(View view){

        String currentText = calculatorScreen.getText().toString();
        String newText = currentText + "3";
        calculatorScreen.setText(newText);
    }

    public void onBtn4Click(View view){

        String currentText = calculatorScreen.getText().toString();
        String newText = currentText + "4";
        calculatorScreen.setText(newText);
    }

    public void onBtn5Click(View view){

        String currentText = calculatorScreen.getText().toString();
        String newText = currentText + "5";
        calculatorScreen.setText(newText);
    }

    public void onBtn6Click(View view){

        String currentText = calculatorScreen.getText().toString();
        String newText = currentText + "6";
        calculatorScreen.setText(newText);
    }

    public void onBtn7Click(View view){

        String currentText = calculatorScreen.getText().toString();
        String newText = currentText + "7";
        calculatorScreen.setText(newText);
    }

    public void onBtn8Click(View view){

        String currentText = calculatorScreen.getText().toString();
        String newText = currentText + "8";
        calculatorScreen.setText(newText);
    }

    public void onBtn9Click(View view){

        String currentText = calculatorScreen.getText().toString();
        String newText = currentText + "9";
        calculatorScreen.setText(newText);
    }

    public void onBtnDotClick(View view){

        String currentText = calculatorScreen.getText().toString();

        if (currentText.length() == 0) {

            calculatorScreen.setText("0.");
        }
        else {

            char lastChar = currentText.charAt(currentText.length() - 1);

            if (lastChar == '+' || lastChar == '-' || lastChar == '*' || lastChar == '/' || lastChar == '√') {

                calculatorScreen.setText(currentText + "0.");
            }
            else if (lastChar == '.') {

                calculatorScreen.setText(currentText);
            }
            else {

                if (currentText.contains(".")){

                    calculatorScreen.setText(currentText);
                }
                else {

                    calculatorScreen.setText(currentText + ".");
                }
            }
        }
    }

    public void onBtnBackClick(View view){

        String currentText = calculatorScreen.getText().toString();
        if (currentText.length() > 0) {
            String newText = currentText.substring(0, currentText.length() - 1);
            calculatorScreen.setText(newText);
        }
    }

    public void onBtnClearClick(View view){

        calculatorScreen.setText("");
    }

    public void onBtnSubtractionClick(View view) {

        String currentText = calculatorScreen.getText().toString();

        if (currentText.length() == 0) {

            calculatorScreen.setText("-");
        }
        else {

            char lastChar = currentText.charAt(currentText.length() - 1);

            if (lastChar == '*' || lastChar == '/' || lastChar == '√') {

                calculatorScreen.setText(currentText + "-");
            }
            else if (lastChar == '.') {

                calculatorScreen.setText(currentText + "0-");
            }
            else if (lastChar == '+') {

                calculatorScreen.setText(currentText.substring(0, currentText.length() - 1) + "-");
            }
            else if (lastChar == '-') {

                calculatorScreen.setText(currentText);
            }
            else {

                calculatorScreen.setText(currentText + "-");
            }
        }
    }

    public void onBtnAddClick(View view) {

        String currentText = calculatorScreen.getText().toString();

        if (currentText.length() == 0) {

            calculatorScreen.setText("");
        }
        else {

            char lastChar = currentText.charAt(currentText.length() - 1);

            if (currentText.length() == 1 && currentText == "-"){

                calculatorScreen.setText(currentText.substring(0, currentText.length() - 1));
            }
            else {

                if (lastChar == '√' || lastChar == '+') {

                    calculatorScreen.setText(currentText);
                }
                else if (lastChar == '.') {

                    calculatorScreen.setText(currentText + "0+");
                }
                else if (lastChar == '*' || lastChar == '/') {

                    calculatorScreen.setText(currentText.substring(0, currentText.length() - 1) + "+");
                }
                else if (lastChar == '-') {

                    char isThereAnyOperatorAlready = currentText.charAt(currentText.length() - 2);

                    if (isThereAnyOperatorAlready == '*' || isThereAnyOperatorAlready == '/'){

                        calculatorScreen.setText(currentText.substring(0, currentText.length() - 1));
                    }
                    else{
                        calculatorScreen.setText(currentText.substring(0, currentText.length() - 1) + "+");
                    }
                }
                else {

                    calculatorScreen.setText(currentText + "+");
                }
            }
        }
    }

    public void onBtnDivisionClick(View view) {

        String currentText = calculatorScreen.getText().toString();

        if (currentText.length() == 0) {

            calculatorScreen.setText("");
        }
        else {

            char lastChar = currentText.charAt(currentText.length() - 1);

            if (currentText.length() == 1 && currentText == "-"){

                calculatorScreen.setText(currentText.substring(0, currentText.length() - 1));
            }
            else {

                if (lastChar == '*' || lastChar == '+') {

                    calculatorScreen.setText(currentText.substring(0, currentText.length() - 1) + "/");
                }
                else if (lastChar == '-') {

                    char isThereAnyOperatorAlready = currentText.charAt(currentText.length() - 2);

                    if (isThereAnyOperatorAlready == '*' || isThereAnyOperatorAlready == '/'){

                        calculatorScreen.setText(currentText);
                    }
                    else{

                        calculatorScreen.setText(currentText.substring(0, currentText.length() - 1) + "/");
                    }
                }
                else if (lastChar == '.') {

                    calculatorScreen.setText(currentText + "0/");
                }
                else if (lastChar == '/' || lastChar == '√') {

                    calculatorScreen.setText(currentText);
                }
                else {

                    calculatorScreen.setText(currentText + "/");
                }
            }
        }
    }

    public void onBtnMultiplicationClick(View view) {

        String currentText = calculatorScreen.getText().toString();

        if (currentText.length() == 0) {

            calculatorScreen.setText("");
        }
        else {

            char lastChar = currentText.charAt(currentText.length() - 1);

            if (currentText.length() == 1 && currentText == "-"){

                calculatorScreen.setText(currentText.substring(0, currentText.length() - 1));
            }
            else {

                if (lastChar == '/' || lastChar == '+') {

                    calculatorScreen.setText(currentText.substring(0, currentText.length() - 1) + "*");
                }
                else if (lastChar == '-') {

                    char isThereAnyOperatorAlready = currentText.charAt(currentText.length() - 2);

                    if (isThereAnyOperatorAlready == '*' || isThereAnyOperatorAlready == '/'){

                        calculatorScreen.setText(currentText);
                    }
                    else{

                        calculatorScreen.setText(currentText.substring(0, currentText.length() - 1) + "*");
                    }
                }
                else if (lastChar == '.') {

                    calculatorScreen.setText(currentText + "0*");
                }
                else if (lastChar == '*' || lastChar == '√') {

                    calculatorScreen.setText(currentText);
                }
                else {

                    calculatorScreen.setText(currentText + "*");
                }
            }
        }
    }

    public void onBtnRootClick(View view) {

        String currentText = calculatorScreen.getText().toString();

        if (currentText.length() == 0) {

            calculatorScreen.setText("√");
        }
        else {

            char lastChar = currentText.charAt(currentText.length() - 1);

            if (lastChar == '*' || lastChar == '/') {

                calculatorScreen.setText(currentText);
            }
            else if (lastChar == '.') {

                calculatorScreen.setText(currentText + "0√");
            }
            else if (lastChar == '+' || lastChar == '-' || lastChar == '√') {

                calculatorScreen.setText(currentText + "√");
            }
            else {

                calculatorScreen.setText(currentText + "√");
            }
        }
    }

    public void onBtnEquationClick(View view) {

        MathExpression expression = new MathExpression (calculatorScreen.getText().toString());
        String result = expression.solve();

        if(result == "SYNTAX ERROR"){
            result = calculatorScreen.getText().toString();
        }
        else{
            calculatorScreen.setText(result);
        }
    }

}