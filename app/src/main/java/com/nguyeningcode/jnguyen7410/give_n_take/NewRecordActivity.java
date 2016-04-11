package com.nguyeningcode.jnguyen7410.give_n_take;

//import android.content.Intent;
import android.app.DatePickerDialog;
import android.app.Dialog;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;

import android.support.v4.app.DialogFragment;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.DatePicker;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
//import android.view.View;

public class NewRecordActivity extends AppCompatActivity {

    DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("NewRecordActivity", "[onCreate] Successfully entered activity!");
        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_record);
        Log.i("NewRecordActivity", "[onCreate] getSupportActionBar() = " + getSupportActionBar());
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab_save);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("NewRecordActivity", "[onCreate] Setting the onClickListener for FAB!");
                saveRecord(view);
            }
        });

        TextInputEditText borrowField = (TextInputEditText) findViewById(R.id.input_record_borrowDate);
        Log.e("NewRecordActivity", "borrowField = " + (R.id.input_record_borrowDate) );
        TextInputEditText returnField = (TextInputEditText) findViewById(R.id.input_record_returnDate);
        Log.e("NewRecordActivity", "returnField = " + (R.id.input_record_returnDate) );
        String today = getToday();
        borrowField.setText(today);

        borrowField.setInputType(InputType.TYPE_NULL);
        returnField.setInputType(InputType.TYPE_NULL);

    }

    public void showDatePickerDialog(View v) {
        DialogFragment datePicker = new DatePickerFragment();
        datePicker.show(getSupportFragmentManager(), "datePicker");
    }

    public String getToday() {
        Calendar c = Calendar.getInstance();

        SimpleDateFormat df = new SimpleDateFormat("MM-dd-yyyy");
        return df.format(c.getTime());
    }

    public void saveRecord(View view) {
        //Snackbar.make(view, "Saving...", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public static class DatePickerFragment extends DialogFragment
            implements DatePickerDialog.OnDateSetListener {

        @Override
        public DatePickerDialog onCreateDialog(Bundle savedInstanceState) {
            // Use the current date as the default date in the picker
            final Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);

            // Create a new instance of DatePickerDialog and return it
            return new DatePickerDialog(getActivity(), this, year, month, day);
        }

        public void onDateSet(DatePicker view, int year, int month, int day) {
            // Do something with the date chosen by the user
            Log.e("NewRecordActivity" , "View = " + view.getId() + ", year = " + year + ", month = " + month + ", day = " + day);
        }
    }

}


