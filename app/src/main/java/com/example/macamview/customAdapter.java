package com.example.macamview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

public class customAdapter extends BaseAdapter {

    Context context;
    String [] pemain;
    String [] posisi;
    int [] nomor;
    LayoutInflater inflater;

    public customAdapter(Context context, String[] pemain, String[] posisi, int[] nomor){
        this.context = context;
        this.pemain = pemain;
        this.posisi = posisi;
        this.nomor = nomor;
        this.inflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return pemain.length;
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
        view = inflater.inflate(R.layout.list_player, null  );
        TextView tvPlayers = (TextView) view.findViewById(R.id.tv_player);
        TextView tvpos = (TextView) view.findViewById(R.id.tv_pos);
        TextView tvNumber = (TextView) view.findViewById(R.id.tv_nomor);

        tvPlayers.setText(pemain[i]);
        tvpos.setText(posisi[i]);
        tvNumber.setText(nomor[i]+"");

        return view;
    }
}
