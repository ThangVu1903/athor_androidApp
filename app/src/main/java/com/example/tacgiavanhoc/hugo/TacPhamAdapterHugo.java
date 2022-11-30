package com.example.tacgiavanhoc.hugo;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tacgiavanhoc.R;

import java.util.List;

public class TacPhamAdapterHugo extends BaseAdapter {
    Activity activity;
    List<TacPham> tacPhams;

    public TacPhamAdapterHugo(Activity activity, List<TacPham> tacPhams) {
        this.activity = activity;
        this.tacPhams = tacPhams;
    }

    @Override
    public int getCount() {
        return tacPhams.size();
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
        view = inflater.inflate(R.layout.itemtacpham, null);
        TextView tvName = (TextView) view.findViewById(R.id.tvTacPham);
        TextView soSao = view.findViewById(R.id.soSao);
        ImageView img = view.findViewById(R.id.anhTacPham);

        tvName.setText(tacPhams.get(i).getTenTp());
        soSao.setText(tacPhams.get(i).getSoSao()+" Sao");
        img.setImageResource(tacPhams.get(i).getAnh());

        return view;
    }
}
