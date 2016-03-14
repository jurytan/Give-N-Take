package com.nguyeningcode.jnguyen7410.give_n_take;

//import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
//import android.view.View;

public class NewRecordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("NewRecordActivity", "[onCreate] Successfully entered activity!");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_record);
        Log.i("NewRecordActivity", "[onCreate] getSupportActionBar() = " + getSupportActionBar());
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Log.i("NewRecordActivity", "[onCreate] Creating the database...");
        SQLiteDatabase database = openOrCreateDatabase("Something", MODE_PRIVATE, null);

        database.execSQL("CREATE TABLE IF NOT EXISTS Transaction" +
                "(transaction_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "from TEXT, to TEXT, item TEXT, qty INTEGER, " +
                "favorite TEXT NOT NULL CHECK (typeof(\"favorite\") = \"text\" AND \"favorite\" IN (\"TRUE\", \"FALSE\")), " +
                "description TEXT, borrowed INTEGER, will_return INTEGER, category INTEGER, color TEXT");



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
