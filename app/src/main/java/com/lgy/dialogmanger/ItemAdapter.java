package com.lgy.dialogmanger;

import android.content.Context;

import com.zhy.adapter.recyclerview.CommonAdapter;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.util.List;

/**
 * Created by ${lgy} on 2018/4/1317:09
 * 邮箱1343168198@qq.com
 * 描述： describe
 * 修改内容：
 */

public class ItemAdapter extends CommonAdapter<String> {
    public ItemAdapter(Context context, int layoutId, List<String> datas) {
        super(context, layoutId, datas);
    }

    @Override
    protected void convert(ViewHolder holder, String s, int position) {
        holder.setText(android.R.id.text1, s);
    }
}
