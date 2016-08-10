package com.devework.android.wxmoment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.app.Activity;
import android.os.Bundle;


public class MomentActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private MyAdapter mMyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moment);


        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        /*
        * 定义需要填充的数据，作为数据层填充到View 层
        * 数据来源于 recycler view
        * 分别为：name, avatar, content, time, pic
        * 
        * */
        ItemData itemsData[] = {
                new ItemData("马化腾",R.drawable.pony,"Ladies and 乡亲们，今年打算给腾讯全体员工涨薪！哈哈哈哈哈哈哈哈哈哈哈哈哈哈","1分钟前",R.drawable.pic),
                new ItemData("雷军",R.drawable.a2,"Ladies and 乡亲们，今年打算给小米全体员工涨薪！","3分钟前",0),
                new ItemData("李开复",R.drawable.a4,"Ladies and 乡亲们，今年打算给创新工场全体员工涨薪！","1小时前",0),
                new ItemData("罗永浩",R.drawable.a3,"Ladies and 乡亲们，今年打算给锤子全体员工涨薪！","10分钟前",R.drawable.pic2),
                new ItemData("周鸿祎",R.drawable.a5,"Ladies and 乡亲们，今年打算给360 全体员工涨薪！","2小时前",0),
                new ItemData("张朝阳",R.drawable.a6,"Ladies and 乡亲们，今年打算给搜狐全体员工涨薪！","1天前",0),
                new ItemData("比尔盖茨BillGates",R.drawable.a8,"Ladies and 乡亲们，今年打算盖茨基金会再裸捐50% 身家！","2天前",R.drawable.pic3),
                new ItemData("黄章",R.drawable.a7,"Ladies and 乡亲们，今年打算给魅族全体员工涨薪！","2天前",0),
                new ItemData("谢盖尔 布林",R.drawable.a9,"Ladies and 乡亲们，今年打算给谷歌全体员工涨薪！","2天前",0)
        };

        // 设置 layoutManger
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // 创建一个 adapter
        mMyAdapter = new MyAdapter(itemsData);

        // 设置 adapter
        mRecyclerView.setAdapter(mMyAdapter);

        // 设置item 的动画（默认）
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

        //为RecyclerView添加HeaderView和FooterView
        setHeaderView(mRecyclerView);

    }

    // 增加 setHeaderView 方法
    private void setHeaderView(RecyclerView view){
        View header = LayoutInflater.from(this).inflate(R.layout.header_view, view, false);
        mMyAdapter.setHeaderView(header);
    }

    // 增加 setFooterView 方法
    private void setFooterView(RecyclerView view){
        View footer = LayoutInflater.from(this).inflate(R.layout.footer, view, false);
        mMyAdapter.setFooterView(footer);
    }
}
