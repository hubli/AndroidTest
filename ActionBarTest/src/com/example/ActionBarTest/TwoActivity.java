package com.example.ActionBarTest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.*;
import android.support.v7.app.ActionBar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-12-9
 * Time: 下午5:15
 * To change this template use File | Settings | File Templates.
 */
public class TwoActivity extends ActionBarActivity {

<<<<<<< HEAD
    public void onCreate(Bundle savedInstanceState) {
=======
    public void onCreate(Bundle savedInstanceState){
>>>>>>> 5eafc9cb394900c90a03122f0e309ce86119ebb3
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        textView.setText("我是2222");
        setContentView(textView);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
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

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            /*case android.R.id.home:
                getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_HOME);
                break;*/
            case R.id.action_search:
                Intent intent = new Intent(this, ThreeActivity.class);
                startActivity(intent);
                break;
        }
        return false;
    }

}
