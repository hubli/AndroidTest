package com.example.IntentAction;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MyActivity extends ListActivity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        String[] menus = {"查看电话信息","编辑电话信息","显示打电话界面","直接打电话"};
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,menus));
        getListView().setTextFilterEnabled(true);
    }
}
