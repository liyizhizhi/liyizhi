package com.bawei.zuoye.presenter;

import com.bawei.zuoye.view.interfaces.IBaseView;

/**
 * <p>文件描述：<p>
 * <p>作者：黎怡志<p>
 * <p>创建时间：2019/8/5<p>
 * <p>更改时间：2019/8/5<p>
 */
public class BasePresenter <T extends IBaseView> {
    private  T view;

    public void AttachView(T baseview) {
        this.view = baseview;
    }
    public void DatachView() {
        this.view = null;
    }

    public T getView() {
        return view;
    }
}
