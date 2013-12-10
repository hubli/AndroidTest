package com.example.ActionBarTest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class ActionBar extends ActionBarActivity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

<<<<<<< HEAD
    public boolean onCreateOptionsMenu(Menu menu) {
=======
    public boolean onCreateOptionsMenu(Menu menu){
>>>>>>> 5eafc9cb394900c90a03122f0e309ce86119ebb3
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.actions, menu);
        return super.onCreateOptionsMenu(menu);
    }

<<<<<<< HEAD
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
=======
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
>>>>>>> 5eafc9cb394900c90a03122f0e309ce86119ebb3
            case R.id.action_search:
                Intent intent = new Intent(this, TwoActivity.class);
                startActivity(intent);
                break;
        }
        return false;
    }
}
