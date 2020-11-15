package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText textinput;
    TextView textdata;

    public String inputnum = "";
    public String outputnum = "";
    public String numview = "";

    public char operator=' ';
    public String result;

    public boolean pointer = false;

    public float firstnum;
    public float secondnum;

    public String logdata = "";

    public String Mresult = "";
    public float Mfirst;
    public float Msecond;
    public float mresultnum;
    public boolean MSdata = false;

    public ArrayList<String> logdataArr = new ArrayList<String>();
    public ArrayList<String> logmdata = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textdata = findViewById(R.id.Textdata);
        textinput = findViewById(R.id.Textinput);

        Button  BtnMC2 = (Button) findViewById(R.id.BtnMC);
        BtnMC2.setEnabled(false);

        Button  BtnMR2 = (Button) findViewById(R.id.BtnMR);
        BtnMR2.setEnabled(false);

        Button  BtnMview2 = (Button) findViewById(R.id.BtnMview);
        BtnMview2.setEnabled(false);

        Button  BtnPlus2= (Button) findViewById(R.id.BtnMPlus);
        BtnPlus2.setEnabled(false);

        Button  BtnMminus2 = (Button) findViewById(R.id.BtnMminus);
        BtnMminus2.setEnabled(false);

        findViewById(R.id.Btn01).setOnClickListener(mClickListener);
        findViewById(R.id.Btn02).setOnClickListener(mClickListener);
        findViewById(R.id.Btn03).setOnClickListener(mClickListener);
        findViewById(R.id.Btn04).setOnClickListener(mClickListener);
        findViewById(R.id.Btn05).setOnClickListener(mClickListener);
        findViewById(R.id.Btn06).setOnClickListener(mClickListener);
        findViewById(R.id.Btn07).setOnClickListener(mClickListener);
        findViewById(R.id.Btn08).setOnClickListener(mClickListener);
        findViewById(R.id.Btn09).setOnClickListener(mClickListener);
        findViewById(R.id.Btn00).setOnClickListener(mClickListener);
        findViewById(R.id.BtnC).setOnClickListener(mClickListener);
        findViewById(R.id.BtnCE).setOnClickListener(mClickListener);
        findViewById(R.id.sign).setOnClickListener(mClickListener);
        findViewById(R.id.BtnDel).setOnClickListener(mClickListener);
        findViewById(R.id.Btnequal).setOnClickListener(mClickListener);
        findViewById(R.id.BtnDiv).setOnClickListener(mClickListener);
        findViewById(R.id.BtnMul).setOnClickListener(mClickListener);
        findViewById(R.id.BtnPlus).setOnClickListener(mClickListener);
        findViewById(R.id.BtnMinus).setOnClickListener(mClickListener);
        findViewById(R.id.BtnPoint).setOnClickListener(mClickListener);
        findViewById(R.id.BtnMC).setOnClickListener(mClickListener);
        findViewById(R.id.BtnMR).setOnClickListener(mClickListener);
        findViewById(R.id.BtnMS).setOnClickListener(mClickListener);
        findViewById(R.id.BtnMPlus).setOnClickListener(mClickListener);
        findViewById(R.id.BtnMminus).setOnClickListener(mClickListener);
        findViewById(R.id.BtnMview).setOnClickListener(mClickListener);
        findViewById(R.id.Btnlog).setOnClickListener(mClickListener);


    }
    public void mlog(){
        Intent intent = new Intent(this, mlogval.class);
        intent.putStringArrayListExtra("value", logmdata);

        startActivityForResult(intent, 1);
    }

    public void log(){
        Intent log = new Intent(this, logval.class);
        log.putStringArrayListExtra("logvalue", logdataArr);

        startActivityForResult(log, 3);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

            if(resultCode==1){
                numview = "";
                operator = ' ';
                firstnum = 0;
                textdata.setText("");

                inputnum = data.getExtras().getString("onepick");
                textinput.setText(inputnum);
                outputnum = inputnum;
                result = inputnum;
            }
            else if(resultCode==3){
                numview = "";
                operator = ' ';
                firstnum = 0;
                textdata.setText("");

                inputnum = data.getExtras().getString("pick");
                textinput.setText(inputnum);
                outputnum = inputnum;
                result = inputnum;
            }
    }


    Button.OnClickListener mClickListener = new Button.OnClickListener()
    {

        public void onClick(View v)
        {

            switch(v.getId())
            {
                // Set Number Buttons
                case R.id.Btn01:
                    if(numview.endsWith("=")){
                        inputnum = "";
                        numview = "";
                    }
                    inputnum += "1";
                    outputnum = inputnum;
                    break;
                case R.id.Btn02:
                    if(numview.endsWith("=")){
                        inputnum = "";
                        numview = "";
                    }
                    inputnum += "2";
                    outputnum = inputnum;
                    break;
                case R.id.Btn03:
                    if(numview.endsWith("=")){
                        inputnum = "";
                        numview = "";
                    }
                    inputnum += "3";
                    outputnum = inputnum;
                    break;
                case R.id.Btn04:
                    if(numview.endsWith("=")){
                        inputnum = "";
                        numview = "";
                    }
                    inputnum += "4";
                    outputnum = inputnum;
                    break;
                case R.id.Btn05:
                    if(numview.endsWith("=")){
                        inputnum = "";
                        numview = "";
                    }
                    inputnum += "5";
                    outputnum = inputnum;
                    break;
                case R.id.Btn06:
                    if(numview.endsWith("=")){
                        inputnum = "";
                        numview = "";
                    }
                    inputnum += "6";
                    outputnum = inputnum;
                    break;
                case R.id.Btn07:
                    if(numview.endsWith("=")){
                        inputnum = "";
                        numview = "";
                    }
                    inputnum += "7";
                    outputnum = inputnum;
                    break;
                case R.id.Btn08:
                    if(numview.endsWith("=")){
                        inputnum = "";
                        numview = "";
                    }
                    inputnum += "8";
                    outputnum = inputnum;
                    break;
                case R.id.Btn09:
                    if(numview.endsWith("=")){
                        inputnum = "";
                        numview = "";
                    }
                    inputnum += "9";
                    outputnum = inputnum;
                    break;
                case R.id.Btn00:
                    if(numview.endsWith("=")){
                        inputnum = "";
                        numview = "";
                    }
                    if(inputnum.equals("0")){
                        break;
                    }
                    inputnum += "0";
                    outputnum = inputnum;
                    break;
                case R.id.sign:
                    if(numview.endsWith("=")){
                        numview = "";
                    }

                    if(outputnum.charAt(0) == '-')
                        outputnum=outputnum.substring(1);
                    else
                        outputnum = "-" + outputnum;

                    operator = ' ';
                    inputnum = outputnum;
                    textinput.setText(inputnum);


                    /*
                    if(numview.endsWith("=")){
                        numview = "";
                    }
                    if(inputnum.equals(""))
                        break;

                    if(inputnum.charAt(0) == '-')
                        inputnum=inputnum.substring(1);

                    else
                        inputnum = "-" + inputnum;

                    outputnum = inputnum;
                    */
                    break;
                case R.id.BtnPoint:
                    pointer = false;
                    for(int i=0; i<inputnum.length(); i++){
                        if(inputnum.charAt(i)=='.')
                            pointer = true;
                    }
                    if(pointer==false) {
                        inputnum += ".";
                        outputnum = inputnum;
                    }
                    break;
                case R.id.BtnC:
                case R.id.BtnCE:
                    inputnum = "";
                    numview = "";
                    outputnum="";
                    operator=' ';
                    firstnum=0;
                    secondnum=0;
                    textinput.setText(outputnum);
                    textdata.setText(numview);
                    break;
                case R.id.BtnDel:
                    if(!inputnum.equals(""))
                    {
                        inputnum = outputnum;
                        inputnum=inputnum.substring(0, inputnum.length()-1);
                        outputnum = inputnum;
                        if(operator=='=')
                            firstnum = Float.parseFloat(inputnum);
                    }
                    break;
                // +, -, /, * Buttons
                case R.id.BtnPlus:
                    if(numview.endsWith("=")){
                        operator = '+';
                        numview = result + operator;
                        textdata.setText(numview);
                        inputnum = "";
                        break;
                    }

                    if(operator == '+' && inputnum.equals(""))
                        break;


                    else if(inputnum.equals("")&&(operator=='-'||operator=='x'||operator=='÷')){
                        numview=numview.substring(0, numview.length()-1);
                        operator='+';
                        numview+=operator;
                        textdata.setText(numview);
                        break;
                    }
                    else if(inputnum.equals(""))
                        inputnum = "0";

                    result = calculate(inputnum, operator);
                    operator = '+';
                    numview += inputnum;
                    numview += operator;
                    textdata.setText(numview);

                    inputnum = "";

                    break;

                case R.id.BtnMinus:
                    if(numview.endsWith("=")){
                        operator = '-';
                        numview = result + operator;
                        textdata.setText(numview);
                        inputnum = "";
                        break;
                    }
                    if(operator == '-' && inputnum.equals(""))
                        break;
                    else if(inputnum.equals("")&&(operator=='+'||operator=='x'||operator=='÷')){
                        numview=numview.substring(0, numview.length()-1);
                        operator='-';
                        numview+=operator;
                        textdata.setText(numview);
                        break;
                    }
                    else if(inputnum.equals(""))
                        inputnum = "0";
                    result = calculate(inputnum, operator);
                    operator = '-';
                    numview += inputnum;
                    numview += operator;
                    textdata.setText(numview);

                    inputnum = "";
                    break;

                case R.id.BtnDiv:
                    if(numview.endsWith("=")){
                        operator = '÷';
                        numview = result + operator;
                        textdata.setText(numview);
                        inputnum = "";
                        break;
                    }
                    if(operator == '÷' && inputnum.equals(""))
                        break;
                    else if(inputnum.equals("")&&(operator=='+'||operator=='x'||operator=='-')){
                        numview=numview.substring(0, numview.length()-1);
                        operator='÷';
                        numview+=operator;
                        textdata.setText(numview);
                        break;
                    }
                    else if(inputnum.equals(""))
                        inputnum = "0";
                    result = calculate(inputnum, operator);
                    operator = '÷';
                    numview += inputnum;
                    numview += operator;
                    textdata.setText(numview);

                    inputnum = "";
                    break;


                case R.id.BtnMul:
                    if(numview.endsWith("=")){
                        operator = 'x';
                        numview = result + operator;
                        textdata.setText(numview);
                        inputnum = "";
                        break;
                    }
                    if(operator == 'x' && inputnum.equals(""))
                        break;
                    else if(inputnum.equals("")&&(operator=='+'||operator=='-'||operator=='÷')){
                        numview=numview.substring(0, numview.length()-1);
                        operator='x';
                        numview+=operator;
                        textdata.setText(numview);
                        break;
                    }
                    else if(inputnum.equals("")&&(Mresult.equals("")))
                        inputnum = "0";
                    result = calculate(inputnum, operator);
                    operator = 'x';
                    numview += inputnum;
                    numview += operator;
                    textdata.setText(numview);

                    inputnum = "";
                    break;

                case R.id.Btnequal:
                    if (inputnum.equals(""))
                        inputnum = result;
                    if (numview.endsWith("=")) {
                        logdata += (result + operator + inputnum + "=" + "\n");
                        textdata.setText(outputnum + operator + inputnum + "=");
                        result = calculate(inputnum, operator);
                        logdata += result;
                        logdataArr.add(result);
                        outputnum = result;
                        break;
                    }
                    numview += inputnum;
                    numview += "=";
                    result = calculate(inputnum, operator);
                    textdata.setText(numview);
                    outputnum = result;
                    logdata += (numview + "\n" + result);
                    logdataArr.add(result);
                    Mresult = outputnum;
                    break;

                case R.id.Btnlog:
                    if(logmdata.isEmpty())
                        logmdata.add("0");
                    log();

                    break;

                case R.id.BtnMS:
                    MSdata = true;
                    Button  BtnMC = (Button) findViewById(R.id.BtnMC);
                    BtnMC.setEnabled(true);

                    Button  BtnMR = (Button) findViewById(R.id.BtnMR);
                    BtnMR.setEnabled(true);

                    Button  BtnMview = (Button) findViewById(R.id.BtnMview);
                    BtnMview.setEnabled(true);

                    Button  BtnMPlus= (Button) findViewById(R.id.BtnMPlus);
                    BtnMPlus.setEnabled(true);

                    Button  BtnMminus = (Button) findViewById(R.id.BtnMminus);
                    BtnMminus.setEnabled(true);

                    if(inputnum.equals(""))
                        inputnum = "0";

                    if(Mresult.equals("")){
                        Mfirst = Float.parseFloat(inputnum);
                        Mresult = inputnum;
                    }

                    DecimalFormat mv = new DecimalFormat("#.##");
                    logmdata.add(Mresult);

                    break;

                case R.id.BtnMC:
                    Button  BtnMC2 = (Button) findViewById(R.id.BtnMC);
                    BtnMC2.setEnabled(false);

                    Button  BtnMR2 = (Button) findViewById(R.id.BtnMR);
                    BtnMR2.setEnabled(false);

                    Button  BtnMview2 = (Button) findViewById(R.id.BtnMview);
                    BtnMview2.setEnabled(false);

                    Button  BtnMPlus2 = (Button) findViewById(R.id.BtnMPlus);
                    BtnMPlus2.setEnabled(false);

                    Button  BtnMminus2 = (Button) findViewById(R.id.BtnMminus);
                    BtnMminus2.setEnabled(false);

                    logmdata.clear();
                    mresultnum = 0;
                    Mfirst = 0;
                    Msecond = 0;
                    Mresult = "";

                    break;

                case R.id.BtnMPlus:
                    MSdata = false;
                    if(Msecond == 0)
                        Msecond  = Mfirst;
                        if(inputnum.equals("")){
                            mresultnum += Mfirst;
                            DecimalFormat mp = new DecimalFormat("#.##");
                            Mresult = mp.format(mresultnum);
                            Msecond = mresultnum;
                            break;
                        }
                    Mfirst = Float.parseFloat(outputnum);
                    mresultnum = Msecond + Mfirst;
                    Msecond = mresultnum;

                        DecimalFormat mp = new DecimalFormat("#.##");
                        Mresult = mp.format(mresultnum);
                        //inputnum = "";

                    break;

                case R.id.BtnMminus:
                    MSdata = false;
                    if(Msecond == 0)
                        Msecond = Mfirst;
                    if(inputnum.equals("")){
                        mresultnum -= Mfirst;
                        DecimalFormat mm = new DecimalFormat("#.##");
                        Mresult = mm.format(mresultnum);
                        Msecond = mresultnum;
                        break;
                    }
                    Mfirst = Float.parseFloat(outputnum);
                    mresultnum = Msecond - Mfirst;
                    Msecond = mresultnum;

                    DecimalFormat mm = new DecimalFormat("#.##");
                    Mresult = mm.format(mresultnum);
                   // inputnum = "";

                    break;

                case R.id.BtnMR:
                    outputnum = Mresult;
                    inputnum = outputnum;
                    Mfirst = Float.parseFloat(outputnum);
                    firstnum = Mfirst;
                    result = inputnum;
                    break;

                case R.id.BtnMview:
                    if(MSdata==false)
                        logmdata.add(Mresult);
                    mlog();
                    break;


            }
            textinput.setText(outputnum);
        }



        public String calculate(String number, char operator){
            if(number.endsWith("."))
                number=number.substring(0, number.length()-1);
            float result = 0;
            String calculated;


                    secondnum  = Float.parseFloat(number);
                switch (operator)
                {
                    case '+':
                        result = firstnum + secondnum;
                        break;
                    case '-':
                        result = firstnum - secondnum;
                        break;
                    case 'x':
                        result = firstnum * secondnum;
                        break;
                    case '÷':
                        result = firstnum / secondnum;
                        break;
                    case ' ':
                        result = secondnum;
                }
            DecimalFormat df=new DecimalFormat("#.##");
            calculated = df.format(result);
            firstnum = result;
            return calculated;
        }
    };


}
