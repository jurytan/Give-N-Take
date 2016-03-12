package com.nguyeningcode.jnguyen7410.give_n_take;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NewRecord extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_record);

        Intent intent = getIntent();
    }

    public void goBack(View view) {
        Intent intent = new Intent(this, MainActivity.class);
    }
}
