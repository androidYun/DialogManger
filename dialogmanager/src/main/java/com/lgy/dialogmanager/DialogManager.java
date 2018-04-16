package com.lgy.dialogmanager;

import com.lgy.dialogmanager.builder.base.Builder;

/**
 * Created by ${lgy} on 2018/4/1609:10
 * 邮箱1343168198@qq.com
 * 描述： describe
 * 修改内容：
 */

public class DialogManager {
    /**
     * 继承Dialog  编写对话框  根据经常使用类型 进行编写 1,中间布局有三种   确定框  输入框  列表框  2，下面布局的  有列表款，选择框  根据不同需求可以自定义布局
     */
    /**
     * 1,初始化参数 参数类型设置
     * <p>
     * 2, 显示 消失控制
     * <p>
     * 3，创建AlertManager
     */
    public Builder builder;

    public DialogManager(Builder builder) {
        this.builder = builder;
        builder.create();
    }

    public static final class CreateBuilder {
        Builder builder;


        public CreateBuilder(Builder builder) {
            this.builder = builder;
        }

        public DialogManager create() {
            return new DialogManager(builder);
        }
    }

    public void show() {
        builder.show();
    }

    public void dismiss() {
        builder.dismiss();
    }
}
