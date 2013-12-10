package com.example.FragmentsUI;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;

public class MyActivity extends FragmentActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_articles);


        //检查activity的布局是使用fragment_container FrameLayout的版本
        if (findViewById(R.id.fragment_container) != null) {

            // 但是，如果是从前一个状态恢复的话
            // 我们不需要做任何事情，直接返回就行了,否则就会重叠fragments。
            if (savedInstanceState != null) {
                return;
            }

            //创建一个Fragment实例
            HeadlinesFragment firstFragment = new HeadlinesFragment();

            //有可能activity是从Intent中的特殊指令创建的，
            //把Intent的extras当参数传递给fragment
            firstFragment.setArguments(getIntent().getExtras());

            // 把fragment加入到'fragment_container' FrameLayout
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, firstFragment).commit();
        }

        //替换activity
        ArticleFragment secondFragment = new ArticleFragment();
        Bundle args = new Bundle();
        args.putInt("args", 2);
        secondFragment.setArguments(args);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        transaction.replace(R.id.fragment_container, secondFragment);
        transaction.addToBackStack(null);

        //提交transaction
        transaction.commit();


    }
}
