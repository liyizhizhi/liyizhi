package com.bawei.zuoye.view.activity;

import android.util.Log;
import android.widget.ListView;

import com.bawei.zuoye.R;
import com.bawei.zuoye.model.bean.DataBean;
import com.bawei.zuoye.presenter.HomePresenter;
import com.bawei.zuoye.view.adapter.ListViewAdapter;
import com.bawei.zuoye.view.interfaces.IMainView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity implements IMainView.DataCALLSHU {

    private HomePresenter presenter;
    private ListView listView;
    private List<DataBean.ItemsBean> items;
    private ListViewAdapter adapter;

    @Override
    protected int onLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void InitView() {
        listView = findViewById(R.id.listview);
        items = new ArrayList<>();


    }

    @Override
    protected void InitData() {
        presenter = new HomePresenter();
        presenter.HomePresenter();
        presenter.AttachView(this);
    }

    @Override
    public void success(DataBean dataBean) {
        items = dataBean.getItems();
        adapter = new ListViewAdapter(items, this);
        listView.setAdapter(adapter);

    }
}
