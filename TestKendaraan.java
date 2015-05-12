/**
 * Created by TOSHIBA on 5/12/2015.
 */
public class TestKendaraan {
    public static void main(String[] args) {
        Mobil porsche = new Mobil(200, 5000, 2, 4);
        porsche.CetakSpesifikasi();
        porsche.Jalankan(100);
        porsche.Jalankan(180);
    }
}