package com.lgy.dialogmanager.dialog;

import android.app.Dialog;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;

import com.lgy.dialogmanager.R;
import com.lgy.dialogmanager.builder.ContentBuilder;
import com.lgy.dialogmanager.builder.base.BaseMiddleBuilde;
import com.lgy.dialogmanager.dialog.base.BaseDialog;

/**
 * Created by ${lgy} on 2018/4/1609:43
 * 邮箱1343168198@qq.com
 * 描述： describe
 * 修改内容：
 */

public class ContentDialog extends BaseDialog {

    private ContentBuilder baseMiddleBuilde;

    Dialog dialog;//获取对话框

    private TextView tvMessage;

    public ContentDialog(BaseMiddleBuilde baseMiddleBuilde) {
        super(baseMiddleBuilde);
        this.baseMiddleBuilde = (ContentBuilder) baseMiddleBuilde;
        dialog = baseMiddleBuilde.getDialog();
        inflateView();
        controllerView();
    }

    @Override
    public void inflateView() {
        super.inflateView();
        ViewStub vsbView = dialog.findViewById(R.id.vsb_content);
        vsbView.setLayoutResource(R.layout.layout_message);
        View inflate = vsbView.inflate();
        tvMessage = inflate.findViewById(R.id.tv_message);
    }

    @Override
    public void controllerView() {
        super.controllerView();
        tvMessage.setText(baseMiddleBuilde.getMessage());
        tvMessage.setTextColor(ContextCompat.getColor(mContext, baseMiddleBuilde.getMessageColor()));
    }
}
