package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class detailmakanan extends AppCompatActivity {

    ImageView ImageViewFoto;
    TextView textViewNama, textViewHarga, textViewInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailmakanan);

        ImageViewFoto = findViewById(R.id.ImageViewFoto);
        textViewNama = findViewById(R.id.textViewNama);
        textViewHarga = findViewById(R.id.textViewHarga);
        textViewInfo = findViewById(R.id.textViewInfo);

        getIncomingExtra();
    }

    private void getIncomingExtra(){
        if (getIntent().hasExtra("images")&&getIntent().hasExtra("nama")&&getIntent().hasExtra("harga")&&getIntent().hasExtra("info")) {

            String fotoMakanan = getIntent().getStringExtra("images");
            String namaMakanan = getIntent().getStringExtra("nama");
            String hargaMakanan = getIntent().getStringExtra("harga");
            String infoMakanan = getIntent().getStringExtra("info");

            setDataActivity(fotoMakanan, namaMakanan, hargaMakanan, infoMakanan);
        }
    }

    private void setDataActivity(String fotoMakanan, String namaMakanan, String hargaMakanan, String infoMakanan){
        Glide.with(this).asBitmap().load(fotoMakanan).into(ImageViewFoto);

        textViewNama.setText(namaMakanan);
        textViewHarga.setText(hargaMakanan);
        textViewInfo.setText(infoMakanan);
    }
}