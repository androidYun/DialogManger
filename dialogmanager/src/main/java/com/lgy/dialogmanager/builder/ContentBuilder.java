package com.lgy.dialogmanager.builder;

import android.content.Context;

import com.lgy.dialogmanager.R;
import com.lgy.dialogmanager.builder.base.BaseMiddleBuilde;
import com.lgy.dialogmanager.dialog.ContentDialog;

/**
 * Created by ${lgy} on 2018/4/1609:37
 * 邮箱1343168198@qq.com
 * 描述： describe
 * 修改内容：
 */

public class ContentBuilder extends BaseMiddleBuilde<ContentBuilder> {
    private String message;

    private int messageColor;

    public ContentBuilder(Context context) {
        super(context);
    }

    @Override
    protected ContentBuilder getBuilder() {
        message = "提示内容";
        messageColor = R.color.default_message_color;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ContentBuilder setMessage(String message) {
        this.message = message;
        return this;
    }

    public int getMessageColor() {
        return messageColor;
    }

    public ContentBuilder setMessageColor(int messageColor) {
        this.messageColor = messageColor;
        return this;
    }

    @Override
    public void create() {
        new ContentDialog(this);
    }
}
