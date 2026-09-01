class Kamar {
    String nomorKamar;
    String tipeKamar;
    boolean statusTersedia;

    void tampilkanData() {
        System.out.println("=== Data Kamar ===");
        System.out.println("Nomor Kamar : " + nomorKamar);
        System.out.println("Tipe Kamar  : " + tipeKamar);
        System.out.println("Status      : " + (statusTersedia ? "Tersedia" : "Terisi"));
        System.out.println("------------------");
    }
}