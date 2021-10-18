package com.example.menumakanan;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class myAdapter extends  RecyclerView.Adapter<myAdapter.ViewHolder>{
    private ArrayList<String> foto = new ArrayList<>();
    private ArrayList<String> Nama = new ArrayList<>();
    private ArrayList<String> Harga = new ArrayList<>();
    private ArrayList<String> info = new ArrayList<>();
    private Context context;

    public myAdapter(ArrayList<String> foto, ArrayList<String> nama, ArrayList<String> harga, ArrayList<String> info, Context context) {
        this.foto = foto;
        Nama = nama;
        Harga = harga;
        this.info = info;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.desain, parent, false);
        ViewHolder holder = new ViewHolder((view));
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(context).asBitmap().load(foto.get(position)).into(holder.foto);

        holder.namaMakanan.setText(Nama.get(position));
        holder.hargamkn.setText(Harga.get(position));
        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, detailmakanan.class);
                intent.putExtra("images", foto.get(position));
                intent.putExtra("nama", Nama.get(position));
                intent.putExtra("harga", Harga.get(position));
                intent.putExtra("info", info.get(position));

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return foto.size();
    }

    public  class  ViewHolder extends RecyclerView.ViewHolder{
        ImageView foto;
        TextView namaMakanan, hargamkn;
        ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            foto = itemView.findViewById(R.id.fotoMakanan);
            namaMakanan = itemView.findViewById(R.id.NamaMakanan);
            hargamkn = itemView.findViewById(R.id.HargaMakanan);
            constraintLayout = itemView.findViewById(R.id.constraintLayout);
        }
    }
}
