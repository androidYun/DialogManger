package com.lgy.dialogmanager.builder.base;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ${lgy} on 2018/4/1609:25
 * 邮箱1343168198@qq.com
 * 描述： describe
 * 修改内容：
 */

public abstract class BaseBulder<T> implements Builder {
    private Context context;

    private Dialog dialog;

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
}
