package model;

/**
 * Created by SALAHUDIN on 27/05/2018.
 */
public class produk {
    private String nama_produk;
    private String url_produk;

    public String getUrl_produk(){
        return url_produk;
    }

    public void setUrl_produk(String url_produk){
        this.url_produk=url_produk;
    }

    public String getNama_produk(){
        return nama_produk;
    }

    public void setNama_produk(String nama_produk){
        this.nama_produk=nama_produk;
    }
}
