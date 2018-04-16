package com.lgy.dialogmanger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.lgy.dialogmanager.DialogManager;
import com.lgy.dialogmanager.builder.ContentBuilder;
import com.lgy.dialogmanager.builder.EditorBuilder;
import com.lgy.dialogmanager.builder.ListBuilder;
import com.lgy.dialogmanager.builder.listener.OnClickListener;
import com.zhy.adapter.recyclerview.MultiItemTypeAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    private List<String> mListData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv_demo);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ItemAdapter itemAdapter = new ItemAdapter(this, android.R.layout.simple_list_item_2, mListData);
        mListData.add("选择");
        mListData.add("输入框");
        mListData.add("列表选择");
        itemAdapter.setOnItemClickListener(new MultiItemTypeAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, RecyclerView.ViewHolder holder, int position) {
                switch (position) {
                    case 0:
                        new DialogManager.CreateBuilder(new ContentBuilder(MainActivity.this).setTitle("李桂云").setTitle("记录").setCancelText("取消").setShowBothBtn(true)).create().show();

                        break;
                    case 1:
                        new DialogManager.CreateBuilder(new EditorBuilder(MainActivity.this).setTitle("李桂云").setTitle("记录").setCancelText("取消").setShowBothBtn(false).setHintContent("请输入内容")).create().show();

                        break;
                    case 2:
                        new DialogManager.CreateBuilder(new ListBuilder(MainActivity.this).setTitle("李桂云").setTitle("记录").setCancelText("取消").setShowBothBtn(true).setListData(mListData).setOnConfirmClickListener(new OnClickListener() {
                            @Override
                            public void onClick(View v, DialogManager dialogManager) {
                                dialogManager.dismiss();
                                Toast.makeText(MainActivity.this, "显示确定提示", Toast.LENGTH_LONG).show();
                            }
                        }).setOnCancelClickListener(new OnClickListener() {
                            @Override
                            public void onClick(View v, DialogManager dialogManager) {
                                dialogManager.dismiss();
                                Toast.makeText(MainActivity.this, "显示取消提示", Toast.LENGTH_LONG).show();
                            }
                        })).create().show();
                        break;
                }
            }

            @Override
            public boolean onItemLongClick(View view, RecyclerView.ViewHolder holder, int position) {
                return false;
            }
        });
        recyclerView.setAdapter(itemAdapter);
        itemAdapter.notifyDataSetChanged();
    }
}
