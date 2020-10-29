package com.example.regex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    TextView mmTextview ;
    String re ;
    String text ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mmTextview = findViewById (R.id.t2);
        String re = "(\\s*(^[A-Z_a-z]{1,32})(\\s*)(\\s*=\\s*\\d+))\\s*;$";
        Pattern pt= Pattern.compile(re);
        Matcher mt = pt.matcher( mmTextview.getText());

        if(mt.matches()){
            Toast.makeText(this,"true" ,Toast.LENGTH_LONG).show() ;
        }
        else {
        Toast.makeText(this,"false",Toast.LENGTH_LONG).show() ;
        }

}}