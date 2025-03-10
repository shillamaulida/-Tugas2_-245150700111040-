public class MainClass {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai();
        pegawai1.setNama("Diandra");
        pegawai1.setJabatan("Staff");
        pegawai1.setGajiPokok(8000000);
        pegawai1.setTunjangan(1000000);
        pegawai1.setPotongan(700000);
        pegawai1.setBonus(1000000);
        
        Pegawai pegawai2 = new Pegawai("Ani Rahayu", "Junior Staff", 5000000, 600000, 400000, 500000);
        
        System.out.println("=== Data Pegawai 1 ===");
        pegawai1.displayInfo();
        
        pegawai1.tambahBonus(500000);
        pegawai1.displayInfo();
        
        System.out.println("\n=== Data Pegawai 2 ===");
        pegawai2.displayInfo();
        
        pegawai2.tambahBonus(300000);
        pegawai2.displayInfo();
    }
}

