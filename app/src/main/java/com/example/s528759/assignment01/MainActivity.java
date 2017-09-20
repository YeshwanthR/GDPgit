package com.example.s528759.assignment01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText orginalText;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
// This is a GDP commit

    public void buttonAction(View view)
    {
        EditText et = (EditText) findViewById(R.id.editText);
        String value = et.getText().toString();
        String nValue="";
        for(int i=0;i<value.length();i++){
            if(value.charAt(i)=='o')
                nValue=nValue+'a';
            else if(value.charAt(i)=='a')
                nValue=nValue+'o';
            else if(value.charAt(i)=='A')
                nValue=nValue+'O';
            else if(value.charAt(i)=='O')
                nValue=nValue+'A';
            else
                nValue=nValue+value.charAt(i);



        }
        et.setText(nValue);

        }


public void clear(View view)
{ EditText et = (EditText) findViewById(R.id.editText);
    String nValue="";
    et.setText(nValue);

}



    }







