package com.example.onpoint;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import java.util.Calendar;

public class AddActivity extends AppCompatActivity implements View.OnClickListener {

    EditText date_edt, time_edt;
    Button date_btn, time_btn;
    private int mYear, mMonth, mDay, mHour, mMinute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        date_btn= (Button)findViewById(R.id.date_btn);
        time_btn= (Button)findViewById(R.id.time_btn);
        date_edt= (EditText)findViewById(R.id.date_edt_text);
        time_edt= (EditText)findViewById(R.id.time_edt_text);

        date_btn.setOnClickListener(this);
        time_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        if(v==date_btn){
            final Calendar calendar=Calendar.getInstance();
            mYear=calendar.get(Calendar.YEAR);
            mMonth=calendar.get(Calendar.MONTH);
            mDay=calendar.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog datePickerDialog=new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                    date_edt.setText(dayOfMonth+"-"+(month+1)+"-"+year);
                }
            },mYear,mMonth,mDay);
            datePickerDialog.show();
        }

        if (v==time_btn){
            final Calendar c=Calendar.getInstance();
            mHour= c.get(Calendar.HOUR_OF_DAY);
            mMinute=c.get(Calendar.MINUTE);

            TimePickerDialog timePickerDialog=new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                    time_edt.setText(hourOfDay+":"+minute);
                }
            },mHour,mMinute,false);
            timePickerDialog.show();
        }
    }
}