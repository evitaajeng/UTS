/**
 * Created by TOSHIBA on 5/12/2015.
 */
public class Kendaraan {
    public int KecepatanMaks;
    public int Berat;
    public int Kapasitas;

    public Kendaraan() {
        KecepatanMaks = 20;
        System.out.println("Kecepatan Maks Kendaraan : " + KecepatanMaks);
    }
}

class Mobil extends Kendaraan {
    public int JumlahRoda;

    public Mobil(int KcM, int B, int K, int JumRod) {
        KecepatanMaks = KcM;
        Berat = B;
        Kapasitas = K;
        JumlahRoda = JumRod;
    }

    public void CetakSpesifikasi() {
        System.out.println("Kecepatan Maks Mobil : " + KecepatanMaks);
        System.out.println("Berat Mobil : " + Berat);
        System.out.println("Kapasitas Mobil : " + Kapasitas);
        System.out.println("Jumlah Roda Mobil : " + JumlahRoda + "\n");
        System.out.println();
    }

    public void Jalankan(int KcM) {
        KecepatanMaks = KcM;
        System.out.println("Mobil dijalankan dengan kecepatan " + KecepatanMaks);
    }
}