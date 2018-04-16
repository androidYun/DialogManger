package com.lgy.dialogmanger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.lgy.dialogmanager.DialogManager;
import com.lgy.dialogmanager.builder.ContentBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new DialogManager.CreateContentBuilder(new ContentBuilder(this).setTitle("李桂云").setTitle("记录").setCancelText("取消").setShowBothBtn(false)).create().show();
    }
}
