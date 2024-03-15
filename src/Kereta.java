public class Kereta {
    // Atribut untuk menyimpan nama kereta
private String namaKereta;

// Atribut untuk menyimpan jumlah tiket yang tersedia
private int jumlahTiketTersedia;

// Atribut untuk menyimpan daftar nama penumpang
private String[] namaPenumpang;

// Atribut untuk menyimpan daftar asal penumpang
private String[] asal;

// Atribut untuk menyimpan daftar tujuan penumpang
private String[] tujuan;

//objek member
Ticket tiket;

// Konstruktor untuk kereta komuter
public Kereta() {
    this.namaKereta = "Kereta Komuter";
    this.jumlahTiketTersedia = 1000;
    this.namaPenumpang = new String[jumlahTiketTersedia];
    this.asal = new String[jumlahTiketTersedia];
    this.tujuan = new String[jumlahTiketTersedia];
}

// Konstruktor untuk kereta jarak jauh
public Kereta(String namaKereta, int jumlahTiketTersedia) {
    this.namaKereta = namaKereta;
    this.jumlahTiketTersedia = jumlahTiketTersedia;
    this.namaPenumpang = new String[jumlahTiketTersedia];
    this.asal = new String[jumlahTiketTersedia];
    this.tujuan = new String[jumlahTiketTersedia];
}

// Metode untuk menambahkan tiket kereta komuter
public void tambahTiket(String namaPenumpang) {
    if (jumlahTiketTersedia > 0 ) {
        this.namaPenumpang[this.namaPenumpang.length - jumlahTiketTersedia] = namaPenumpang;
        jumlahTiketTersedia--;
        System.out.println("==========================================");
        System.out.println("Tiket berhasil dipesan");
    } else {
        System.out.println("Kereta telah habis dipesan, silahkan cari jadwal keberangkatan lainnya");
    }
}

// Metode untuk menambahkan tiket kereta jarak jauh
public void tambahTiket(String namaPenumpang, String asal, String tujuan) {
    if (jumlahTiketTersedia > 0) {
        int index = this.namaPenumpang.length - jumlahTiketTersedia;   // untuk menentukan index ke- di dalam array tiap objek yang dibuat
        this.namaPenumpang[index] = namaPenumpang;
        this.asal[index] = asal;
        this.tujuan[index] = tujuan;
        jumlahTiketTersedia--;
        System.out.println("==========================================");
        System.out.println("Tiket berhasil dipesan. Sisa tiket tersedia: " + jumlahTiketTersedia);
    } else {
        System.out.println("Kereta telah habis dipesan, silahkan cari jadwal keberangkatan lainnya");
    }
}



// Metode untuk menampilkan daftar penumpang KAJJ dan
public void tampilkanTiket() {
    System.out.println("==========================================");
    System.out.println("Daftar penumpang " + namaKereta + ":");
    System.out.println("----------------------------------");

    for (int i = 0; i < namaPenumpang.length; i++) {
        if (namaPenumpang[i] != null) { 
            if (asal[i] != null && !asal[i].isEmpty()) {    // untuk mengecek apakah asal indeks ke-i tidak null dan tidak kososng
                System.out.println("Nama: " + namaPenumpang[i]);
                System.out.println("Asal: " + asal[i]);
            } else {
                System.out.println("Nama: " + namaPenumpang[i]);
            }

            if (tujuan[i] != null && !tujuan[i].isEmpty()) { // untuk mengecek apakah tujuan indeks ke-i tidak null dan tidak kososng
                System.out.println("Tujuan: " + tujuan[i]);
                System.out.println("----------------------------------");
            }
            System.out.println();
        }
    }

    // if (jumlahTiketTersedia < 30) {
    //     System.out.println("Sisa tiket tersedia: " + jumlahTiketTersedia);
    // }
}

}
