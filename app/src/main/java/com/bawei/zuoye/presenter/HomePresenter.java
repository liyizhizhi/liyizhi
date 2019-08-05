package com.bawei.zuoye.presenter;

import com.bawei.zuoye.model.bean.DataBean;
import com.bawei.zuoye.model.conta.CaoJie;
import com.bawei.zuoye.model.http.HttpUtils;
import com.bawei.zuoye.view.interfaces.IMainView;

/**
 * <p>文件描述：<p>
 * <p>作者：黎怡志<p>
 * <p>创建时间：2019/8/5<p>
 * <p>更改时间：2019/8/5<p>
 */
public class HomePresenter <V extends IMainView.DataCALLSHU>  extends BasePresenter<V>{

    public void HomePresenter() {
        HttpUtils.getInstance().getdata(CaoJie.BAS_JIE, new HttpUtils.CallBackData() {
            @Override
            public void ok(DataBean dataBean) {
                getView().success(dataBean);
            }
        });
    }
}
