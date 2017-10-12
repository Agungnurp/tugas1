package resepmakanan.resepmakanan;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Resep> dataResep;
    private RecyclerView listResep;
    private ResepAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateData();
        listResep = (RecyclerView) findViewById(R.id.list_resep);

        adapter = new ResepAdapter(this, dataResep);
        listResep.setAdapter(adapter);
        listResep.setLayoutManager(new LinearLayoutManager(this));
    }

    private void generateData() {
        dataResep = new ArrayList<>();

        dataResep.add(new Resep("Nasi Kuning", "Nasi Kuning Sederhana Gurih Komplit",
                "<b>Bahan Dasar :</b><br>" +
                        "Beras : 1 kg ( kualitas sedang hingga bagus, jangan beras impor ya ).<br>" +
                        "Santan kelapa : ± 2 gelas ( 400 ml ), gunakan santan dari 1 butir kelapa tua. <br>" +
                        "Kunyit : ± 5 cm ( seruas jari ), jangan gunakan biang kunyit<br>" +
                        "Serai : 2 batang.<br>" +
                        "daun salam : 4 lembar” <br>" +
                        "<br>" +

                         "<b>Langkah Pembuatan :</b><br>" +
                        "1 Yang paling pertama tentunya memilih beras dengan kualitas bagus dan cuci hingga bersih dan tiriskan” <br>" +
                        "2 Buat santan dengan kekentalan sedang saja, jangan terlalu kental juga jangan ke enceran. Paling tidak sediakan sekitar 2 gelas santan kelapa.<br>" +
                        "3 Parut kunyit dan peras diatas santan kelapa.<br>" +
                        "4 Cuci serai dan potong bagian ujungnya. Cuci juga daun salam.<br>" +
                        "5 Siapkan panci ukuran secukupnya dan masukkan beras, santan kelapa + kunyit, dan serai <br>" +
                        "6 Masak dengan api kompor sedang. Jangan lupa kada di aduk aduk supaya matangnya merata.<br>" +
                        "7 Setelah air santan habis, aduk aduk sebentar dan angkat.<br>" +
                        "8 Sekarang siapkan langseng beserta air secukupnya. <br>" +
                        "9 Setelah airnya mendidih masukkan nasi kuning aron tadi. <br>" +
                        "10 Tunggu hingga matang sekitar 30 menit dan angkat. Sajikan nasi kuning dengan mentimun di potong tipis bulat, irisan telur dadar, emping dan bawang merah goreng, daun kemangi, atau juga dengan orek tempe. <br>"

                , "nasikuning"));

        dataResep.add(new Resep("mieayam", "mie ayam paling yoi",
                "<b>Bahan Dasar :</b><br>" +
                        "250 gram tepung terigu<br>" +
                        "35 gram tepung kanji atau tapioka<br>" +
                        "3 sendok makan minyak bawang<br>" +
                        "1 sendok teh garam halus<br>" +
                        "1 sendok teh kaldu ayam bubuk<br>" +
                        "2 butir telur ayam<br>" +
                        "40 ml air bersih<br>" +
                        "<br>" +
                        "<b>Langkah Pembuatan :</b><br>" +
                        "1.Masukkan tepung tapioka dan tepung terigu dalam satu wadah, kemudian aduk rata<br>" +
                        "2.Buatlah lubang ditengah-tengah campuran tepung, lalu masukkan telur ayam dan minyak bawang<br>" +
                        "3.Uleni adonan dengan tangan hingga tercampur rata<br>" +
                        "4.Masukkan air, kaldu ayam bubuk, dan garam dalam satu wadah. Lalu aduk sampai rata<br>" +
                        "5.Setelah rata, tuangkan air tersebut ke dalam adonan tepung sedikit demi sedikit sambil diuleni hingga kalis dan tidak lengket ditangan <br>" +
                        "6.Diamkan adonan selama kurang lebih 20 menit dalam wadah yang tertutup dengan plastik <br>" +
                        "7.Pipihkan adonan, kemudian digiling dengan menggunakan penggiling mie atau bisa juga dilakukan secara manual dipipihkan dengan botol atau kayu dan jangan sampai lupa untuk menaburi dengan tepung terigu supaya tidak lengket<br>" +
                        "8.Cetaklah adonan yang sudah dipipihkan menjadi bentuk mie. Setelah mie sudah terbentuk, taburi dengan tepung secukupnya supaya tidak menempel satu sama lain<br>" +
                        "9.ie basah sudah siap untuk diolah menjadi mie ayam yang mak nyoos<br>"


                , "mieayam"));


    }
}
