package com.lgy.dialogmanager.dialog.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.lgy.dialogmanager.R;

import java.util.List;

/**
 * Created by ${lgy} on 2018/4/1614:05
 * 邮箱1343168198@qq.com
 * 描述： describe
 * 修改内容：
 */

public class ListItemAdapter extends BaseAdapter {
    private List<String> mListData;

    private Context context;

    public ListItemAdapter( Context context,List<String> mListData) {
        this.mListData = mListData;
        this.context = context;
    }

    @Override
    public int getCount() {
        return mListData.size();
    }

    @Override
    public Object getItem(int position) {
        return mListData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_select_item, null, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.tvContent.setText(mListData.get(position));
        return convertView;
    }

    class ViewHolder {
        View view;

        TextView tvContent;

        public ViewHolder(View view) {
            this.view = view;
            tvContent = view.findViewById(R.id.tv_content);
        }
    }
}
