package com.lgy.dialogmanager.dialog;

import android.view.View;
import android.view.ViewStub;
import android.widget.ListView;

import com.lgy.dialogmanager.R;
import com.lgy.dialogmanager.builder.ListBuilder;
import com.lgy.dialogmanager.builder.base.BaseMiddleBuilde;
import com.lgy.dialogmanager.dialog.adapter.ListItemAdapter;
import com.lgy.dialogmanager.dialog.base.BaseDialog;

/**
 * Created by ${lgy} on 2018/4/1611:14
 * 邮箱1343168198@qq.com
 * 描述： describe
 * 修改内容：
 */

public class ListDialog extends BaseDialog {

    private ListBuilder listBuilder;

    private ListView lvList;

    public ListDialog(BaseMiddleBuilde baseMiddleBuilde) {
        super(baseMiddleBuilde);
        this.listBuilder = (ListBuilder) baseMiddleBuilde;
    }

    @Override
    public void inflateView() {
        super.inflateView();
        ViewStub vsbView = listBuilder.getDialog().findViewById(R.id.vsb_content);
        vsbView.setLayoutResource(R.layout.layout_list_data);
        View inflate = vsbView.inflate();
        lvList = inflate.findViewById(R.id.lv_list);
    }

    @Override
    public void controllerView() {
        super.controllerView();
        ListItemAdapter  listItemAdapter=new ListItemAdapter(listBuilder.getContext(),listBuilder.getListData());
        lvList.setAdapter(listItemAdapter);
    }
}
