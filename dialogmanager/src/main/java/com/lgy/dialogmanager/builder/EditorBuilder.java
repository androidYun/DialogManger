package com.lgy.dialogmanager.builder;

import android.content.Context;
import android.text.InputType;

import com.lgy.dialogmanager.builder.base.BaseMiddleBuilde;
import com.lgy.dialogmanager.builder.listener.onEditorListener;
import com.lgy.dialogmanager.dialog.EditorDialog;
import com.lgy.dialogmanager.dialog.base.DialogInterface;

/**
 * Created by ${lgy} on 2018/4/1609:37
 * 邮箱1343168198@qq.com
 * 描述： describe
 * 修改内容：
 */

public class EditorBuilder extends BaseMiddleBuilde<EditorBuilder> {
    private String hintContent;

    private int inputType;

    private onEditorListener onEditorListener;

    public EditorBuilder(Context context) {
        super(context);

    }

    @Override
    protected EditorBuilder getBuilder() {
        hintContent = "请输入内容";
        inputType = InputType.TYPE_CLASS_TEXT;
        return this;
    }

    public String getHintContent() {
        return hintContent;
    }

    public EditorBuilder setHintContent(String hintContent) {
        this.hintContent = hintContent;
        return this;
    }

    public int getInputType() {
        return inputType;
    }

    public EditorBuilder setInputType(int inputType) {
        this.inputType = inputType;
        return this;
    }

    public com.lgy.dialogmanager.builder.listener.onEditorListener getOnEditorListener() {
        return onEditorListener;
    }

    public EditorBuilder setOnEditorListener(com.lgy.dialogmanager.builder.listener.onEditorListener onEditorListener) {
        this.onEditorListener = onEditorListener;
        return this;
    }

    @Override
    public DialogInterface initDialog() {
        return new EditorDialog(this);
    }

}
