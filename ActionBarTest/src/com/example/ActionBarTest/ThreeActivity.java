package com.example.ActionBarTest;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
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
public class ThreeActivity extends ActionBarActivity {

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        textView.setText("我是3333");
        setContentView(textView);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.actions, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case android.R.id.home:
                getSupportActionBar().setDisplayOptions(android.support.v7.app.ActionBar.DISPLAY_HOME_AS_UP);
                break;
            /*case R.id.action_search:
                Intent intent = new Intent(this, ThreeActivity.class);
                startActivity(intent);
                break;*/
        }
        return false;
    }

}
