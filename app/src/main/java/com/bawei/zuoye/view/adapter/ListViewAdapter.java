package com.bawei.zuoye.view.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bawei.zuoye.R;
import com.bawei.zuoye.model.bean.DataBean;
import com.bumptech.glide.Glide;
import com.bumptech.glide.TransitionOptions;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

/**
 * <p>文件描述：<p>
 * <p>作者：黎怡志<p>
 * <p>创建时间：2019/8/5<p>
 * <p>更改时间：2019/8/5<p>
 */
public class ListViewAdapter extends BaseAdapter {
    private List<DataBean.ItemsBean> list;
    private Context context;

    public ListViewAdapter(List<DataBean.ItemsBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = View.inflate(context, R.layout.item, null);
            holder = new ViewHolder();
            holder.textView = convertView.findViewById(R.id.list_text);
            holder.imageView = convertView.findViewById(R.id.list_image);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.textView.setText(list.get(position).getDesc());
        Glide.with(context).load(list.get(position).getImage()).apply(RequestOptions.circleCropTransform()).into(holder.imageView);

        return convertView;
    }

    class ViewHolder {
        ImageView imageView;
        TextView textView;
    }
}
