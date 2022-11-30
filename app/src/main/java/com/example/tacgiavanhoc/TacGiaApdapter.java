package com.example.tacgiavanhoc;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TacGiaApdapter extends BaseAdapter {
    Activity activity;
    List<TacGia> tacGias;

    public TacGiaApdapter(Activity activity, List<TacGia> tacGias) {
        this.activity = activity;
        this.tacGias = tacGias;
    }

    @Override
    public int getCount() {
        return tacGias.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = activity.getLayoutInflater();
        view = inflater.inflate(R.layout.itemtacgia, null);

        TextView tvName = (TextView) view.findViewById(R.id.tvTacGia);
        TextView sotacpham = (TextView) view.findViewById(R.id.sotacpham);

        tvName.setText(tacGias.get(i).getTen());
        sotacpham.setText(tacGias.get(i).getSoTacPham()+"Tác phẩm");


        return view;
    }
}
