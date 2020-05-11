import java.text.Normalizer;
import java.util.Scanner;
public class main{
    public static void main(String[] args) {
        char y_t;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("================MENU================");
            System.out.println("1. Asisten Laboraturium");
            System.out.println("2. Admin Laboratorium");
            System.out.println("Pilih menu : ");
            int pilih = 0;
            try{
                pilih = input.nextInt();
            }catch (Exception e){
                System.out.println("Input Harus Bilangan Bulat");
            }
            int bnyk;
            String nama, nim;
            float t, p, w, m;
            switch (pilih) {
                case 1:
                    System.out.println("===========Asisten Laboratorium===========");
                    System.out.println("Masukan Jumlah Data yang Akan di Masukan : ");
                    bnyk = input.nextInt();
                    Form[] formAsisten = new Form[bnyk];
                    for (int i=0;i<bnyk;i++){
                        System.out.println("Masukan NIM : ");
                        nim = input.next();
                        input = new Scanner(System.in);
                        System.out.println("Masukan Nama : ");
                        nama= input.nextLine();//nama = input.nextLine();
                        try{
                        System.out.println("Tes Tulis :");
                        t = input.nextFloat();
                        if (t < 0)
                            throw new Exception();
                        System.out.println("Tes Praktek Coding : ");
                        p = input.nextFloat();
                            if (p < 0)
                                throw new Exception();
                        System.out.println("Tes Wawancara : ");
                        w = input.nextFloat();
                            if (w < 0)
                                throw new Exception();
                        System.out.println("Tes Microteaching : ");
                        m = input.nextFloat();
                            if (m < 0)
                                throw new Exception();
                        formAsisten[i] = new Form(nama, nim, t, p, w, m, "Aslab");
                        formAsisten[i].hitungHasil();
                        formAsisten[i].tampilHasil();
                        }catch (Exception e){
                            System.out.println("Input Harus Bilangan Bulat Positif");
                        }
                        System.out.println("");
                        input = new Scanner(System.in);
                    }
                    break;

                case 2:
                    System.out.println("===========Admin Laboratorium===========");
                    System.out.println("Masukan Jumlah Data yang Akan di Masukan : ");
                    bnyk = input.nextInt();
                    Form[] formAdmin = new Form[bnyk];
                    for (int i=1;i<=bnyk;i++){
                        System.out.println("Masukan NIM : ");
                        nim = input.next();
                        System.out.println("Masukan Nama : ");
                        nama = input.nextLine();nama = input.nextLine();
                        try{
                            System.out.println("Tes Tulis :");
                            t = input.nextFloat();
                            if (t <= 0)
                                throw new Exception();
                            System.out.println("Tes Praktek Coding : ");
                            p = input.nextFloat();
                            if (p <= 0)
                                throw new Exception();
                            System.out.println("Tes Wawancara : ");
                            w = input.nextFloat();
                            if (w <= 0)
                                throw new Exception();
                            System.out.println("Tes Praktek Jaringan : ");
                            m = input.nextFloat();
                            if (m <= 0)
                                throw new Exception();
                            formAdmin[i] = new Form(nama, nim, t, p, w, m, "Admin");
                            formAdmin[i].hitungHasil();
                            formAdmin[i].tampilHasil();
                        }catch (Exception e){
                            System.out.println("Input Harus Bilangan Bulat Positif");
                        }
                        System.out.println("");
                        input = new Scanner(System.in);
                    }
                    break;

                default:
                    break;

            }
            System.out.println("Pilih menu lagi?");
            y_t = input.next().charAt(0);
        } while (y_t == 'y' || y_t == 'Y');
    }


}
