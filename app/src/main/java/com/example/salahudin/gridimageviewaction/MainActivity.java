package com.example.salahudin.gridimageviewaction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.GridLayoutManager;

import adapter.dataAdapter;
import model.produk;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private final String nama_produks[]={
            "Kaos Panjang"," Baju Bagus","Celana Levis","Celana Pendek","Kemeja","Jaket Gunung","janket Parasut"};

    private final String url_produks[] = {
            "https://images.thenorthface.com/is/image/TheNorthFace/NF0A33Q6_3YS_hero?$638x745$",
            "https://images.thenorthface.com/is/image/TheNorthFace/NF0A3JPG_2YZ_hero?$638x745$",
            "https://images.thenorthface.com/is/image/TheNorthFace/NF0A3JPG_4KF_hero?$60x70$",
            "https://images.thenorthface.com/is/image/TheNorthFace/NF0A3JPG_JK3_hero?$60x70$",
            "https://images.thenorthface.com/is/image/TheNorthFace/NF0A3JPG_3EF_hero?$60x70$",
            "https://images.thenorthface.com/is/image/TheNorthFace/NF0A3KSZ_HCJ_hero?$638x745$",
            "https://images.thenorthface.com/is/image/TheNorthFace/NF0A3KSZ_BCW_hero?$60x70$"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tampilProduk();
    }

    private void tampilProduk(){
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager=new GridLayoutManager(getApplicationContext(),2);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<produk> produks= prepareData();
        dataAdapter adapter=new dataAdapter(getApplicationContext(),produks);
        recyclerView.setAdapter(adapter);
    }

    private ArrayList<produk> prepareData(){
        ArrayList<produk> produks=new ArrayList<>();
        for (int i=0;i<nama_produks.length;i++){
            produk Produk = new produk();
            Produk.setNama_produk(nama_produks[i]);
            Produk.setUrl_produk(url_produks[i]);
            produks.add(Produk);
        }
        return produks;
    }
}
