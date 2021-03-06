package com.lgy.dialogmanager.builder.base;

import com.lgy.dialogmanager.DialogManager;
import com.lgy.dialogmanager.dialog.base.DialogInterface;

/**
 * Created by ${lgy} on 2018/4/1313:23
 * 邮箱1343168198@qq.com
 * 描述： describe
 * 修改内容：
 */

public interface Builder {
    DialogInterface initDialog();

    void create(DialogManager dialogManager);

    void show();

    void dismiss();
}
