package com.lgy.dialogmanager.builder.base;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lgy.dialogmanager.DialogManager;
import com.lgy.dialogmanager.dialog.base.DialogInterface;

/**
 * Created by ${lgy} on 2018/4/1609:25
 * 邮箱1343168198@qq.com
 * 描述： describe
 * 修改内容：
 */

public abstract class BaseBulder<T> implements Builder {
    private Context context;

    private Dialog dialog;

    private DialogManager dialogManager;

    public BaseBulder(Context context) {
        this.context = context;
        dialog = new Dialog(context, getContentViewId());
        View dialogView = LayoutInflater.from(context).inflate(getContentViewId(), null);
        dialog.addContentView(dialogView, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));

    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public Dialog getDialog() {
        return dialog;
    }

    public void setDialog(Dialog dialog) {
        this.dialog = dialog;
    }

    public DialogManager getDialogManager() {
        return dialogManager;
    }

    public void setDialogManager(DialogManager dialogManager) {
        this.dialogManager = dialogManager;
    }

    @Override
    public void show() {
        if (dialog != null && !dialog.isShowing()) {
            dialog.show();
        }
    }

    @Override
    public void dismiss() {
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
    }

    protected abstract int getContentViewId();

    protected abstract T getBuilder();


    @Override
    public void create(DialogManager dialogManager) {//等加载好布局之后  就行加载布局组件
        this.dialogManager = dialogManager;
        DialogInterface dialog = initDialog();//创建对话框
        dialog.inflateView();
        dialog.controllerView();
    }
}
