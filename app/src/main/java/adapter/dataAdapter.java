package adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import model.produk;

import com.example.salahudin.gridimageviewaction.MainActivity;
import com.example.salahudin.gridimageviewaction.R;
import com.example.salahudin.gridimageviewaction.detailData;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
/**
 * Created by SALAHUDIN on 27/05/2018.
 */
public class dataAdapter extends RecyclerView.Adapter<dataAdapter.ViewHolder> {
    private ArrayList<produk> produks;
    private Context context;

    public dataAdapter(Context context, ArrayList<produk>produks){
        this.context=context;
        this.produks=produks;
    }

    @Override
    public dataAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,int i){
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(dataAdapter.ViewHolder holder,int position){
        holder.nama_produk.setText(produks.get(position).getNama_produk());
        Picasso.with(context).load(produks.get(position).getUrl_produk()).resize(240,240).into(holder.img_produk);
    }

    View.OnClickListener clickListener= new View.OnClickListener(){
        @Override
        public void onClick(View v){
            detailData vholder=(detailData) v.getTag();
            int position = vholder.getPosition();

            if (position == 0 && position < getItemCount()) {
                Intent intent = new Intent(context, MainActivity.class);
                context.startActivity(intent);
            }
        }
    };

    @Override
    public int getItemCount(){
        return produks.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView img_produk;
        public TextView nama_produk;

        public ViewHolder(View itemView){
            super(itemView);

            nama_produk=(TextView)itemView.findViewById(R.id.nm_produk);
            img_produk=(ImageView)itemView.findViewById(R.id.img_produk);
        }

    }



}
