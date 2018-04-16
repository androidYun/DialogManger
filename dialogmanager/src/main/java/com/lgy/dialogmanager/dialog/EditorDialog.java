package com.lgy.dialogmanager.dialog;

import android.view.View;
import android.view.ViewStub;
import android.widget.EditText;

import com.lgy.dialogmanager.R;
import com.lgy.dialogmanager.builder.EditorBuilder;
import com.lgy.dialogmanager.builder.base.BaseMiddleBuilde;
import com.lgy.dialogmanager.dialog.base.BaseDialog;

/**
 * Created by ${lgy} on 2018/4/1611:14
 * 邮箱1343168198@qq.com
 * 描述： describe
 * 修改内容：
 */

public class EditorDialog extends BaseDialog {

    private EditText evContent;

    private EditorBuilder editorBuilder;

    public EditorDialog(BaseMiddleBuilde baseMiddleBuilde) {
        super(baseMiddleBuilde);
        this.editorBuilder = (EditorBuilder) baseMiddleBuilde;
    }

    @Override
    public void inflateView() {
        super.inflateView();
        ViewStub vsbView = editorBuilder.getDialog().findViewById(R.id.vsb_content);
        vsbView.setLayoutResource(R.layout.layout_editor_content);
        View inflate = vsbView.inflate();
        evContent = inflate.findViewById(R.id.ev_message);
    }

    @Override
    public void controllerView() {
        super.controllerView();
        evContent.setHint(editorBuilder.getHintContent());
        evContent.setInputType(editorBuilder.getInputType());
        tvSingleConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editorBuilder.getOnEditorListener() != null) {
                    editorBuilder.getOnEditorListener().onSuccess(evContent.getText().toString());
                }
            }
        });
        tvBothConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editorBuilder.getOnEditorListener() != null) {
                    editorBuilder.getOnEditorListener().onSuccess(evContent.getText().toString());
                }
            }
        });
    }
}
