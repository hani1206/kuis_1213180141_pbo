public class Form extends Mhs implements Data{
    private double tesTulis;
    private double tesKoding;
    private double tesWawancara;
    private double tesMicroJaringan;
    private double nilaiAkhir;
    private String bagian;

    public Form(String nama, String nim, double tesTulis, double tesKoding, double tesWawancara, double tesMicroJaringan, String bagian) {
        super(nama, nim);
        this.tesTulis = tesTulis;
        this.tesKoding = tesKoding;
        this.tesWawancara = tesWawancara;
        this.tesMicroJaringan = tesMicroJaringan;
        this.bagian = bagian;
    }

    @Override
    public void hitungHasil() {
        nilaiAkhir = (tesTulis+tesKoding+tesWawancara+ tesMicroJaringan)/4;
    }

    @Override
    public void tampilHasil() {
        System.out.printf("Nilai Akhir : %.0f \n", nilaiAkhir);
        if (nilaiAkhir > 85){
            System.out.println("KETERANGAN : LOLOS");
            System.out.println("Selamat kepada " + super.getNim() + " telah diterima sebagai " + bagian);
        } else {
            System.out.println("KETERANGAN : GAGAL");
            System.out.println("Mohon maaf kepada " + super.getNim() + " telah ditolak sebagai " + bagian);
        }
    }
}
