package com.example.midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity2<year> extends AppCompatActivity {
    EditText date
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final Button x1 = (Button)findViewById(R.id.gotox1);
        final Button x2 = (Button)findViewById(R.id.gotox3);
        final Button done = (Button)findViewById(R.id.done1);
        final EditText name = (EditText) findViewById(R.id.editTextTextPersonName);
        final EditText date = (EditText) findViewById(R.id.editTextDate);
        final RadioButton female = (RadioButton) findViewById(R.id.radioButton1);
        final RadioButton male = (RadioButton) findViewById(R.id.radioButton2);
        final RadioButton ins = (RadioButton) findViewById(R.id.radioButton3);
        final RadioButton stu = (RadioButton) findViewById(R.id.radioButton4);
        final TextView result = (TextView) findViewById(R.id.result) ;


        x1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this,MainActivity.class ));
            }
        });
        x2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this,MainActivity3.class ));
            }
        });
        done.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(female.isChecked()){
                result.setText("Hi Mrs,"+name+" you are years old" );}
                if(male.isChecked()){
                    result.setText("Hi Mr,"+name+" you are years old" );
                }
                if(ins.isChecked()){
                    result.setText("Hi professor,"+name );
                }



            }
        });
        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(MainActivity.this, d,
                        c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH)).show();
            }
        });

    }
    Calendar c = Calendar.getInstance();
    DateFormat fmtDate = DateFormat.getDateInstance(); DatePickerDialog.OnDateSetListener d = new DatePickerDialog.OnDateSetListener()
    @SuppressLint("SetTextI18n")
    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth){
        c.set(Calendar.YEAR, year); c.set(Calendar.MONTH, month); c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        date.setText("Your reservation is " +
            fmtDate.format(c.getTime()));
} };

}