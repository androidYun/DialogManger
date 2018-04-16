package com.lgy.dialogmanager.dialog.base;

import android.app.Dialog;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.lgy.dialogmanager.R;
import com.lgy.dialogmanager.builder.base.BaseMiddleBuilde;

/**
 * Created by ${lgy} on 2018/4/1316:58
 * 邮箱1343168198@qq.com
 * 描述： describe
 * 修改内容：
 */

public class BaseDialog implements DialogInterface {
    private TextView tvTitle;

    private TextView tvCancel;//取消按钮

    protected TextView tvSingleConfirm;//单个确定按钮

    protected TextView tvBothConfirm;//爽个确定按钮

    private LinearLayout lvBothBtn;

    private LinearLayout lvSingleBtn;

    private BaseMiddleBuilde baseMiddleBuilde;

    protected Context mContext;//全局上下文

    public BaseDialog(BaseMiddleBuilde baseMiddleBuilde) {
        this.baseMiddleBuilde = baseMiddleBuilde;
        mContext = baseMiddleBuilde.getContext();
    }

    @Override
    public void inflateView() {//加载布局
        Dialog dialog = baseMiddleBuilde.getDialog();
        tvTitle = dialog.findViewById(R.id.tv_title);
        tvCancel = dialog.findViewById(R.id.tv_cancel);
        tvSingleConfirm = dialog.findViewById(R.id.tv_single_confirm);
        tvBothConfirm = dialog.findViewById(R.id.tv_confirm);
        lvBothBtn = dialog.findViewById(R.id.lv_both_btn);
        lvSingleBtn = dialog.findViewById(R.id.lv_single_btn);
    }

    @Override
    public void controllerView() {
        /*显示标题*/
        tvTitle.setText(baseMiddleBuilde.getTitle());
        tvTitle.setTextColor(ContextCompat.getColor(baseMiddleBuilde.getContext(), baseMiddleBuilde.getTitleColor()));
        if (baseMiddleBuilde.isShowBothBtn()) {
            lvBothBtn.setVisibility(View.VISIBLE);
            lvSingleBtn.setVisibility(View.GONE);
        } else {
            lvBothBtn.setVisibility(View.GONE);
            lvSingleBtn.setVisibility(View.VISIBLE);
        }
        /*显示取消按钮*/
        tvCancel.setText(baseMiddleBuilde.getCancelText());
        tvCancel.setTextColor(ContextCompat.getColor(baseMiddleBuilde.getContext(), baseMiddleBuilde.getCancelColor()));
          /*显示多个确定按钮*/
        tvBothConfirm.setText(baseMiddleBuilde.getConfirmText());
        tvBothConfirm.setTextColor(ContextCompat.getColor(baseMiddleBuilde.getContext(), baseMiddleBuilde.getConfirmColor()));
          /*显示单个按钮*/
        tvSingleConfirm.setText(baseMiddleBuilde.getConfirmText());
        tvSingleConfirm.setTextColor(ContextCompat.getColor(baseMiddleBuilde.getContext(), baseMiddleBuilde.getConfirmColor()));
        tvCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (baseMiddleBuilde.getOnCancelClickListener() != null) {
                    baseMiddleBuilde.getOnCancelClickListener().onClick(v,baseMiddleBuilde.getDialogManager());
                }
            }
        });
        tvSingleConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (baseMiddleBuilde.getOnConfirmClickListener() != null) {
                    baseMiddleBuilde.getOnConfirmClickListener().onClick(v,baseMiddleBuilde.getDialogManager());
                }
            }
        });
        tvBothConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (baseMiddleBuilde.getOnConfirmClickListener() != null) {
                    baseMiddleBuilde.getOnConfirmClickListener().onClick(v,baseMiddleBuilde.getDialogManager());
                }
            }
        });
    }

}
