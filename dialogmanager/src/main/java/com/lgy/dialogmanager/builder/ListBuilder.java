package com.lgy.dialogmanager.builder;

import android.content.Context;

import com.lgy.dialogmanager.builder.base.BaseMiddleBuilde;
import com.lgy.dialogmanager.dialog.ContentDialog;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ${lgy} on 2018/4/1609:37
 * 邮箱1343168198@qq.com
 * 描述： describe
 * 修改内容：
 */

public class ListBuilder extends BaseMiddleBuilde<ListBuilder> {
    private List<String> mListData;

    public ListBuilder(Context context) {
        super(context);
    }

    @Override
    protected ListBuilder getBuilder() {
        mListData = new ArrayList<>();
        return this;
    }

    public ListBuilder(Context context, List<String> mListData) {
        super(context);
        this.mListData = mListData;
    }

    @Override
    public void create() {
        new ContentDialog(this);
    }
}
