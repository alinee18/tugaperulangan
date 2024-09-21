import java.util.Scanner;

public class SoalDua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int JumlahSiswaSiswi = scanner.nextInt();
        double totalNilaiSiswaSiswi = 10; //Tetapkan jumlah siswa siswi sampai 10 saja

        for (int i =1; i<=JumlahSiswaSiswi; i++ ) {
            System.out.println("Masukan Nilai Siswa Siswi ke-" + i + "; ");
            double Nilai = scanner.nextDouble();
            totalNilaiSiswaSiswi +=Nilai;
        }
        double RataRata = totalNilaiSiswaSiswi / JumlahSiswaSiswi;
        System.out.println("Rata Rata Nilai Dari " + JumlahSiswaSiswi + "SiswaSiswiAdalah" + RataRata);
        scanner.close();
    }
}
