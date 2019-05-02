package com.example.puasasunnah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    //Deklarasi
    ListView ListPuasa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //inisialisasi

        ListPuasa = findViewById(R.id.ListPuasa);

        ListPuasa.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent seninKamis = new Intent(MainActivity.this, Detail.class);
                    seninKamis.putExtra("posisi", position);
                    seninKamis.putExtra("link", "http://www.almunawwar.net/manfaat-puasa-senin-kamis/");
                    startActivity(seninKamis);
                }else if (position == 1) {
                    Intent daud = new Intent(MainActivity.this, Detail.class);
                    daud.putExtra("posisi", position);
                    daud.putExtra("link","https://muslim.or.id/17877-puasa-daud-sebaik-baiknya-puasa.html");
                    startActivity(daud);
                }else if (position == 2) {
                    Intent arofah = new Intent(MainActivity.this, Detail.class);
                    arofah.putExtra("posisi", position);
                    arofah.putExtra("link", "https://muslim.or.id/18509-keutamaan-puasa-arafah.html");
                    startActivity(arofah);
                }else if (position == 3) {
                    Intent asyuro = new Intent(MainActivity.this, Detail.class);
                    asyuro.putExtra("posisi", position);
                    asyuro.putExtra("link", "https://konsultasisyariah.com/33154-artikel-seputar-puasa-asyura-yang-perlu-anda-tahu.html");
                    startActivity(asyuro);
                }else if (position == 4) {
                    Intent syaban = new Intent(MainActivity.this, Detail.class);
                    syaban.putExtra("posisi", position);
                    syaban.putExtra("link", "https://muslim.or.id/15917-anjuran-puasa-syaban.html");
                    startActivity(syaban);
                }else if (position == 5) {
                    Intent syawal = new Intent(MainActivity.this, Detail.class);
                    syawal.putExtra("posisi", position);
                    syawal.putExtra("link", "https://muslim.or.id/17782-tata-cara-puasa-syawal.html");
                    startActivity(syawal);
                }else if (position == 6) {
                    Intent ayyamul = new Intent(MainActivity.this, Detail.class);
                    ayyamul.putExtra("poisisi", position);
                    ayyamul.putExtra("link", "https://muslim.or.id/17851-puasa-tiga-hari-setiap-bulan-dan-puasa-ayyamul-bidh.html");
                    startActivity(ayyamul);
                }
            }
        });
    }
}
