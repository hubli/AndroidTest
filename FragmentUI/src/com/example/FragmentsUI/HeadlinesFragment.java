package com.example.FragmentsUI;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-12-10
 * Time: 上午10:27
 * To change this template use File | Settings | File Templates.
 */
public class HeadlinesFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
        return inflater.inflate(R.layout.article_headerline, container, false);
    }
}