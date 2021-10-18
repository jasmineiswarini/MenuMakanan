package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ArrayList<String> foto = new ArrayList<>();
    private ArrayList<String> Nama = new ArrayList<>();
    private  ArrayList<String> Harga = new ArrayList<>();
    private ArrayList<String> infoMakanan = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();
    }

    private  void prosesRecycler(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        myAdapter adapter = new myAdapter(foto, Nama, Harga, infoMakanan, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private  void getDataFromInternet(){

        foto.add("https://www.piknikdong.com/wp-content/uploads/2021/06/Resep-Pindang-Serani-Bandeng-640x429.jpg");
        Nama.add("Pindang Serani");
        Harga.add("Rp.35.000");
        infoMakanan.add("Pindang serani adalah makanan khas dari Jepara berupa semacam sup ikan laut. Rasa pindang serani merupakan perpaduan rasa pedas, asem dan manis yang umumnya disajikan pada siang hari. Sajian ikan pindang bening dengan ikan laut ini terasa ringan dan segar. Pindang serani ini berbeda dengan sajian pindang ikan Betawi. Pindang serani Jepara tidak mengandung kecap sehingga memiliki kuah yang bening. Bahan utamanya berupa ikan laut segar, dengan beberapa bumbu khas seperti belimbing wuluh, daun kemangi, tomat, dan bawang daun");

        foto.add("https://asset.kompas.com/crops/H4OmrbIi-wvuhi85e1H5oMMFPRs=/37x0:627x393/750x500/data/photo/2020/04/21/5e9e30574a573.jpg");
        Nama.add("Sup Pangsit");
        Harga.add("Rp.25.000");
        infoMakanan.add("Sup pangsit merupakan paduan antara kuliner lokal dan asing. Konon ini adalah salah satu makanan kesukaan RA Kartini. Sup pangsit terdiri dari pangsit, tetapi pangsit ini berbeda dengan pangsit kebanyakan yang sering dilihat. Bentuk pangsit Jepara mirip rolade, dan kulitnya terbuat dari telur dadar. Sup pangsit jepara kemudian hidangan dilengkapi dengan seafood dan sayuran agar lebih sehat. Untuk bumbu, sup pangsit dibuat menggunakan banyak bumbu termasuk rempah lokal.");

        foto.add("https://cdn.idntimes.com/content-images/community/2019/10/52116034-381874312614759-3171552166465805635-n-31bbcee59bbe9e740df1934a07f305b6-600x400-73c60896c6de793107691d14cea6a520_600x400.jpg");
        Nama.add("Garang Asem");
        Harga.add("Rp.20.000");
        infoMakanan.add("Garang asem merupakan makanan tradisional khas Jawa Tengah. Garang asem adalah masakan olahan ayam yang dimasak menggunakan daun pisang dan didominasi oleh rasa asam dan pedas. Garang asem berasal dari Grobogan namun kini garang asem populer di Kudus, bahkan kini Garang Asem ada di beberapa kota di provinsi Jawa Tengah dan DI Yogyakarta memiliki makanan tradisional ini. Antara lain Semarang, Surakarta, Magelang, Yogyakarta, Demak, Kudus, Pati, dan Pekalongan. Garang asem biasa disajikan sebagai lauk pendamping nasi, ditambah dengan tusukan ayam asam manis, tempe goreng, dan perkedel.");

        foto.add("https://asset.kompas.com/crops/n1uxnc4SPRGIm3kf_0C-7RScrk0=/0x0:1000x667/750x500/data/photo/2020/12/14/5fd72d361e8e6.jpg");
        Nama.add("Es Gempol Pleret");
        Harga.add("Rp.10.000");
        infoMakanan.add("Gempol pleret terbuat dari bahan utama beras yang digiling halus. Setelah menjadi tepung beras, kemudian diaduk dengan sedikit air sehingga menjadi adonan. Setelah menjadi adonan, kemudian untuk gempol dibentuk menjadi bulat sementara pleret dibentuk pipih dan berwarna merah muda. Dua bentuk adonan yang berbeda inilah kemudian menjadi sebuah minuman yang diberi nama gempol pleret. Sajian gempol pleret ini bertambah nikmat dengan campuran bahan seperti sirup, santan dan diberi es.");

        foto.add("https://asset.kompas.com/crops/ealQT06HjgcU-Xe3HfchLLexttg=/2x0:1000x665/750x500/data/photo/2020/04/21/5e9e325b907fe.jpg");
        Nama.add("Kuluban");
        Harga.add("Rp.5.000");
        infoMakanan.add("Kuluban terdiri dari berbagai macam sayuran. Bumbu kelapa digunakan untuk penyajiannya. Jika dilihat, kuluban hampir mirip dengan urap. Kendati demikian, kuluban memiliki nangka muda yang sudah direbus dan tauge mentah yang disajikan di dalamnya." );

        foto.add("https://asset.kompas.com/crops/GEmMFsQ9vNE9UlNy3FLaaDSthEA=/0x0:360x240/750x500/data/photo/2020/04/21/5e9e33eaa8177.jpg");
        Nama.add("Sayur Betik");
        Harga.add("Rp.15.000");
        infoMakanan.add("Terbuat dari daging tetelan dan pepaya muda, sayur betik dimasak menggunakan bumbu keluak. Hidangan tersebut merupakan menu sehari-hari di Jepara. Selain daging tetelan dan pepaya muda, bahan-bahan yang perlu disiapkan untuk membuat sayur betik adalah daun salam, daun jeruk, serai, garam, gula pasir, air asam, santan, dan minyak. Untuk bumbu halus, kamu hanya perlu siapkan bawang merah, bawang putih, kemiri, ketumbar, keluak, merica, jinten bubuk, kunyit yang sudah dibakar, dan kencur." );

        foto.add("https://asset.kompas.com/crops/pgn0kAo7OUx7sLiLKMdpVNttkZw=/0x0:360x240/750x500/data/photo/2020/04/21/5e9e333870738.jpg");
        Nama.add("Bongko Mento");
        Harga.add("Rp.5000");
        infoMakanan.add("Hidangan tersebut merupakan hidangan asal keraton Jepara. Bongko mento terdiri dari kulit risol yang sudah diisi dengan dada ayam suwir. Suwiran daging tersebut lalu dicampur dengan jamur kuping, soun, dan santan. Kemudian, kulit risol tersebut dibungkus dengan daun pisang yang menghasilkan aroma yang nikmat.");

        foto.add("https://www.goodnewsfromindonesia.id/uploads/post/large-adon-adon-cara-wedang-blung-foto-resep-utama-inibaruid-be4b0fe5dcb2cfe79eda3af55c73d9.jpg");
        Nama.add("Adon-adon Coro");
        Harga.add("Rp10.000");
        infoMakanan.add("Adon-adon coro merupakan minuman khas Kota Jepara, Jawa Tengah. Minuman tersebut sangat cocok dinikmati ketika cuaca sedang hujan atau pada waktu malam hari, karena bahan-bahannya yang terbuat dari beragam package com.example.menumakanan; ");

        foto.add("https://upload.wikimedia.org/wikipedia/id/a/af/Horok-Horok_Makanan_Khas_Jepara.jpeg");
        Nama.add("Horok-horok");
        Harga.add("Rp.5000");
        infoMakanan.add("Horok-horok adalah makanan ringan yang terbuat dari tepung pohon aren. Horok-Horok adalah makanan yang tergolong langka, di karenakan Horok-horok umumnya hanya ditemukan di Jepara, Sulit bahkan tidak dapat ditemukan di luar Jepara. Horok-horok umumnya dimakan dengan Sate Kikil, soto, bakso, gulai, dan sayur pecel. Selain itu dapat juga dimakan dengan diberi santan dan sedikit gula pasir, seperti bubur.");

        prosesRecycler();
    }

}