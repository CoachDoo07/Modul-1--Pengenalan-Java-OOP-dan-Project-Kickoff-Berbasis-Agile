public class Main {
    public static void main(String[] args) {
        Kamar kamar1 = new Kamar();
        kamar1.nomorKamar = "K01";
        kamar1.tipeKamar = "Single";
        kamar1.statusTersedia = true;
        kamar1.tampilkanData();

        Kamar kamar2 = new Kamar();
        kamar2.nomorKamar = "K02";
        kamar2.tipeKamar = "Double";
        kamar2.statusTersedia = false;
        kamar2.tampilkanData();
    }
}