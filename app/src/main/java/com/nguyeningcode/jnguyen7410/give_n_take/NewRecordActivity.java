package com.nguyeningcode.jnguyen7410.give_n_take;

//import android.content.Intent;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
//import android.view.View;

public class NewRecordActivity extends AppCompatActivity {

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

}
