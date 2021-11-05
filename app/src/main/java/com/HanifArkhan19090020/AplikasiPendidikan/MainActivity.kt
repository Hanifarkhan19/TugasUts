package com.HanifArkhan19090020.AplikasiPendidikan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()


        //Simpan data

        data?.add(
            DataModel(R.drawable.stan,"STAN","Jl. Bintaro Utama Sektor V, Jurang Manggu Tim., Banten 15222","STAN " +
                "Sekolah ikatan dinas di Indonesia yang pertama adalah Politeknik Keuangan Negara STAN.\n" +
                "Sekolah ini berada di bawah Badan Pendidikan dan Pelatihan Keuangan, Kementerian Keuangan. Politeknik Keuangan Negara STAN (PKN STAN) adalah perguruan tinggi vokasi di bawah naungan Kementerian Keuangan (Kemenkeu) yang menyelenggarakan program studi diploma di bidang keuangan negara. " +
                "Selama pendidikan, mahasiswa tidak dipungut biaya pendidikan dan tidak diasramakan. Setelah lulus, para alumni akan mengikuti ujian seleksi CPNS untuk ditempatkan di instansi lingkungan Kemenkeu." +
                "ataupun instansi di pemerintahan pusat dan daerah. Lulus dari sekolah ini, peserta didik bisa ditempatkan di berbagai instansi pemerintah yang tengah membutuhkan aparatur pengelola keuangan negara.")
        )

        data?.add(
            DataModel(R.drawable.akmil,"AKMIL","Jl. Gatot Subroto Jurangombo Magelang Selatan,Magelang, Jawa Tengah 56172", "AKMIL " +
                "Akademi Militer (Akmil) adalah sekolah pendidikan TNI Angkatan Darat dan Sekolah Perwira Prajurit Karier TNI (Sepa PK TNI) di Kota Magelang, Jawa Tengah, Indonesia.\n" +
                "Mako Akademi Militer berada di Jl. Gatot Subroto, Magelang, Jawa Tengah. Pendidikan Politeknik Ilmu Militer ditempuh dalam 4 tahun.  " +
                "Pendidikan di Akademi Militer dimulai dari Pendidikan Dasar Integratif Kemitraan Tahap I Taruna/Taruni Akademi TNI & Akademi Kepolisian selama 3 Bulan. Kemudian Pendidikan Chandradimuka yang dilaksanakan bersama taruna AAL & AAU selama 9 bulan. Setelah pendidikan dasar integratif dan Pendidikan Chandradimuka selesai para Taruna/Taruni kembali ke akademi masing-masing. Setelah 4 tahun menyelesaikan pendidikan di Akademi Militer, Taruna/Taruni Akmil berhak menyandang gelar sebagai Sarjana Terapan Pertahanan (S.Tr.Han). Calon Taruna Akmil merupakan lulusan SMA atau MA (IPA dan IPS untuk Taruna/Taruni). Akademi Militer merupakan pendidikan ikatan dinas yang dibiayai oleh negara.")
        )

        data?.add(
            DataModel(R.drawable.akpol,"AKPOL","Jl. Sultan Agung No.131, Kec. Gajahmungkur, Kota Semarang, Jawa Tengah 50232", "AKPOL " +
                "Akademi Kepolisian atau sering disingkat Akpol adalah sebuah lembaga pendidikan untuk mencetak Perwira Polri. Akpol adalah unsur pelaksana pendidikan pembentukan Perwira Polri yang berada di bawah Lemdiklat Polri (Lembaga Pendidikan dan Latihan Polri). " +
                "Berdasarkan Peraturan Kapolri Nomor 21 Tahun 2010, Akpol bertujuan menyelenggarakan pendidikan pembentukan Perwira Polri tingkat Akademi dan lama pendidikan adalah 4 tahun (8 Semester) dengan output pangkat Inspektur Polisi Dua (Ipda). Pendekatan pendidikan melalui metode pembelajaran, pelatihan dan pengasuhan. Akpol tergabung sebagai anggota INTERPA (International Association of Police Academies) dari 36 negara anggota lainnya.\n")
        )

        data?.add(
            DataModel(R.drawable.stis,"STIS","Jl. Otto Iskandardinata No.64C, RT.1/RW.4, Daerah Khusus Ibukota Jakarta 13330", "STIS " +
                "Politeknik Statistika STIS (Polstat STIS) merupakan perguruan tinggi kedinasan program Diploma IV, yang dikelola oleh Badan Pusat Statistik (BPS) sejak tahun 1958, memberi kesempatan lulusan sekolah menengah umum jurusan IPA untuk dididik menjadi ahli statistik. STIS merupakan lembaga pendidikan tinggi kedinasan yang berfungsi untuk mengembangkan dan menyebarluaskan ilmu pengetahuan, khususnya di bidang statistika dan komputasi statistik dengan mendidik kader yang memiliki kemampuan akademik/profesional. " +
                "STIS mempunyai dua jurusan: Jurusan Statistika (Ekonomi dan Sosial-Kependudukan) dan Jurusan Komputasi Statistik. Jurusan Statistika menghasilkan tenaga ahli statistik ekonomi serta tenaga ahli statistik sosial-kependudukan, dan Jurusan Komputasi Statistik menghasilkan tenaga ahli komputasi dan sistem informasi. Tenaga Pengajar merupakan lulusan perguruan tinggi dalam negeri dan luar negeri dengan jenjang S2 dan S3. Lulusan STIS mendapat gelar Sarjana Sains Terapan (S.S.T.).")
        )

        data?.add(
            DataModel(R.drawable.stpi,"STPI","Jl. Raya PLP Curug, Serdang Wetan, Kec. Legok, Tangerang, Banten 15820", "STPI " +
                "Sekolah Tinggi Penerbangan Indonesia - Curug (STPI Curug) merupakan salah satu perguruan tinggi kedinasan yang berada di bawah Kementerian Perhubungan Indonesia. STPI Curug terletak di Kecamatan Curug, Tangerang, Provinsi Banten.\n" +
                "STPI Curug memiliki tugas dan fungsi mendidik putra-putri terbaik bangsa Indonesia untuk menjadi sumber daya manusia yang ahli dan terampil di bidang penerbangan, " +
                "yang diakui secara nasional maupun internasional." +
                "Dalam melaksanakan tugas dan fungsinya STPI Curug memiliki 4 (empat) jurusan pendidikan, yaitu Jurusan Penerbang, Jurusan Teknik Penerbangan, Jurusan Keselamatan Penerbangan dan Jurusan Manajemen Penerbangan. Setiap jurusan pendidikan terbagi dalam beberapa program studi sesuai dengan minat dan bakat peserta pendidikan dan pelatihan.")
        )

        data?.add(
            DataModel(R.drawable.ipdn,"IPDN","3Q87+QC5, Hegarmanah, Kabupaten Sumedang, Jawa Barat 45363", "IPDN " +
                "IPDN merupakan singkatan dari Institut Pemerintahan Dalam Negeri,\n" +
                "di mana sekolah ini bertujuan untuk menghasilkan kader pemerintahan. IPDN memiliki tujuan untuk mempersiapkan kader pemerintah, baik di tingkat daerah maupun di tingkat pusat. Lembaga pendidikan tinggi ini menyelenggarakan menyelenggarakan program pendidikan meliputi program Diploma IV, Sarjana, Pascasarjana dan Program Profesi Kepamongprajaan." +
                "IPDN adalah lembaga pendidikan tinggi milik pemerintah yang bergerak di bidang kepamongprajaan. Mulai tahun 2018, IPDN hanya menyelanggarakan program pendidikan vokasi (D4, S2 Terapan, S3 Terapan) dan program pendidikan profesi Kepamongprajaan. " +
                "Bagi siswa yang ingin terjun dalam persoalan dalam negeri bisa mencoba sekolah ikatan dinas IPDN. Sekolah ini terletak di Sumedang, Jawa Barat dan membuka kuota sebanyak 1.164 orang di tahun ini." +
                "adalah lembaga pendidikan tinggi kedinasan dalam lingkungan Kementerian Dalam Negeri Republik Indonesia.")
        )

        data?.add(
            DataModel(R.drawable.sttd,"STTD","Sttd Bekasi, Jkt Tenggara, Jl. Raya Setu No.58,Kec. Setu, Bekasi, Jawa Barat 17530", "STTD " +
                "Merupakan Sekolah Tinggi Transportasi Darat (STTD) saat ini menjadi Politeknik Transportasi Darat Indonesia – STTD adalah perguruan tinggi di lingkungan Kementerian Perhubungan, yang menyelenggarakan pendidikan yang berbasis vokasi dan akademik dalam bidang Transportasi Darat yang ada di Indonesia. " +
                "Politeknik Transportasi Darat – STTD berlokasi di kabupaten Bekasi,Porvinsi Jawa Barat. Tugas Utama STTD adalah Sebagai salah satu UPT dari Badan Pengembangan Sumber Daya Manusia Perhubungan, Sekolah Tinggi Transportasi Darat (STTD) mempunyai tugas menyelenggarakan Program Pendidikan Profesional di bidang transportasi darat.")
        )


        data?.add(
            DataModel(R.drawable.stsn,"STSN","Jl. Raya Haji Usa, Putat Nutug, Ciseeng,Kec. Ciseeng, Bogor, Jawa Barat 16120", "STSN " +
                "Sekolah Tinggi Sandi Negara (STSN) atau yang sekarang disebut dengan Politeknik Siber dan Sandi Negara (Poltek SSN), merupakan perguruan tinggi yang diselenggarakan oleh Badan Siber dan Sandi Negara atau yang biasa kita kenal sebagai BSSN. dimana STSN atau Poltek SSN ini memiliki visi untuk menjadi Politeknik kelas dunia yang menghasilkan SDM siber dan sandi yang unggul dan berjiwa pancasila. " +
                "Untuk mewujudkan visi tersebut, maka kompetensi yang diterapkan oleh perguruan tinggi ini adalah seperti kemampuan menganalisis, merancang serta mengimplementasikan sistem kriptografi, selain itu pada peserta didik juga akan dilatih memiliki kemampuan mengelola, mengevaluasi, dan mengembangkan keamanan siber dan sandi negara, demi mendukung pemerintah dalam aspek pertahanan dan keamanan negara.")
        )

        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("lokasi", item?.lokasi)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}