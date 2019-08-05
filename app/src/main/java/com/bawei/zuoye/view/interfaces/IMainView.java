package com.bawei.zuoye.view.interfaces;

import com.bawei.zuoye.model.bean.DataBean;

/**
 * <p>文件描述：<p>
 * <p>作者：黎怡志<p>
 * <p>创建时间：2019/8/5<p>
 * <p>更改时间：2019/8/5<p>
 */
public interface IMainView {

    interface DataCALLSHU extends IBaseView{
        void success(DataBean dataBean);
    }
}
