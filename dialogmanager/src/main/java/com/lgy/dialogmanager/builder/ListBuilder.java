package com.lgy.dialogmanager.builder;

import android.content.Context;

import com.lgy.dialogmanager.builder.base.BaseMiddleBuilde;
import com.lgy.dialogmanager.dialog.ListDialog;
import com.lgy.dialogmanager.dialog.base.DialogInterface;

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
       mListData = new ArrayList<>();
    }

    public List<String> getListData() {
        return mListData;
    }

    public ListBuilder setListData(List<String> list) {
        mListData.clear();
        mListData.addAll(list);
        return this;
    }
    @Override
    protected ListBuilder getBuilder() {
        return this;
    }
    @Override
    public DialogInterface initDialog() {
        return new ListDialog(this);
    }

}
