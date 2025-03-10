class Pegawai {
    private String nama;
    private String jabatan;
    private double gajiPokok;
    private double tunjangan;
    private double potongan;
    private double bonus;

    public Pegawai() {
        this.nama = "";
        this.jabatan = "";
        this.gajiPokok = 0;
        this.tunjangan = 0;
        this.potongan = 0;
        this.bonus = 0;
    }

    public Pegawai(String nama, String jabatan, double gajiPokok, double tunjangan, double potongan, double bonus) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
        this.potongan = potongan;
        this.bonus = bonus;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public void setPotongan(double potongan) {
        this.potongan = potongan;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double hitungGajiTotal() {
        return gajiPokok + tunjangan + bonus - potongan;
    }

    public void displayInfo() {
        System.out.println("\nInformasi Pegawai:");
        System.out.println("Nama: " + nama);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Gaji Pokok: Rp" + gajiPokok);
        System.out.println("Tunjangan: Rp" + tunjangan);
        System.out.println("Potongan: Rp" + potongan);
        System.out.println("Bonus: Rp" + bonus);
        System.out.println("Total Gaji: Rp" + hitungGajiTotal());
    }


    public void tambahBonus(double tambahanBonus) {
        this.bonus += tambahanBonus;
        System.out.println("Bonus ditambahkan: Rp" + tambahanBonus);
    }
}
