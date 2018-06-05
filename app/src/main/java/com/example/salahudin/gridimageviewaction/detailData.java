package com.example.salahudin.gridimageviewaction;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by SALAHUDIN on 27/05/2018.
 */
public class detailData extends RecyclerView.ViewHolder {

    TextView tv1,tv2;//Deklarasi textView
    ImageView imageView;//Deklarasi imageView

    public detailData(View itemView){
        super(itemView);

        //menampilkan text dari widget cardView pada id daftar-judul
        tv1= (TextView) itemView.findViewById(R.id.daftar_judul);
        //menampilkan text dari widget cardView pada id daftar-desk
        tv2= (TextView) itemView.findViewById(R.id.daftar_des);
        //menampilkan gambar/icon dari widget cardView pada id daftar-icon
        imageView= (ImageView)itemView.findViewById(R.id.daftar_icon);
    }
}
