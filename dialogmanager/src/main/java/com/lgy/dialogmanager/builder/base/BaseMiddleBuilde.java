package com.lgy.dialogmanager.builder.base;

import android.content.Context;
import android.view.View;

import com.lgy.dialogmanager.R;

/**
 * Created by ${lgy} on 2018/4/1609:31
 * 邮箱1343168198@qq.com
 * 描述： describe
 * 修改内容：
 */

public abstract class BaseMiddleBuilde<T> extends BaseBulder<T> {
    private View.OnClickListener onCancelClickListener;

    private View.OnClickListener onConfirmClickListener;

    protected String title;//标题

    protected int titleColor;//取消文字颜色

    protected String cancelText;//取消内容文字

    protected int cancelColor;//取消文字颜色

    protected String confirmText;//确定文字

    protected int confirmColor;//确定文字颜色

    private int contentLayoutId;//内容布局

    private boolean isShowBothBtn = true;//是否显示两个Btn  1btn  就一个确定按钮  2两个btn  一个取消按钮 和一个确定按钮

    private T t;

    public BaseMiddleBuilde(Context context) {
        super(context);
        title = "提示";
        titleColor = R.color.default_title_color;
        cancelText = "取消";
        cancelColor = R.color.default_cancel_color;
        confirmText = "确定";
        confirmColor = R.color.default_confirm_color;
        contentLayoutId = getContentViewId();
        t = getBuilder();
    }

    public String getTitle() {
        return title;
    }

    public T setTitle(String title) {
        this.title = title;
        return t;
    }

    public int getTitleColor() {
        return titleColor;
    }

    public T setTitleColor(int titleColor) {
        this.titleColor = titleColor;
        return t;
    }

    public String getCancelText() {
        return cancelText;
    }

    public T setCancelText(String cancelText) {
        this.cancelText = cancelText;
        return t;
    }

    public int getCancelColor() {
        return cancelColor;
    }

    public T setCancelColor(int cancelColor) {
        this.cancelColor = cancelColor;
        return t;
    }

    public String getConfirmText() {
        return confirmText;
    }

    public T setConfirmText(String confirmText) {
        this.confirmText = confirmText;
        return t;
    }

    public int getConfirmColor() {
        return confirmColor;
    }

    public T setConfirmColor(int confirmColor) {
        this.confirmColor = confirmColor;
        return t;
    }

    public T setOneConfirmColor(int confirmColor) {
        this.confirmColor = confirmColor;
        return t;
    }

    public int getContentLayoutId() {
        return contentLayoutId;
    }


    public View.OnClickListener getOnCancelClickListener() {
        return onCancelClickListener;
    }

    public T setOnCancelClickListener(View.OnClickListener onCancelClickListener) {
        this.onCancelClickListener = onCancelClickListener;
        return t;
    }

    public View.OnClickListener getOnConfirmClickListener() {
        return onConfirmClickListener;
    }

    public boolean isShowBothBtn() {
        return isShowBothBtn;
    }

    public T setShowBothBtn(boolean showBothBtn) {
        isShowBothBtn = showBothBtn;
        return t;
    }

    public T setOnConfirmClickListener(View.OnClickListener onConfirmClickListener) {
        this.onConfirmClickListener = onConfirmClickListener;
        return t;
    }

    @Override
    protected int getContentViewId() {
        return R.layout.layout_middle_alert;
    }

}
