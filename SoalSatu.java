import java.util.Scanner;

public class SoalSatu {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        
                System.out.print("Masukkan angka batas: ");
                int batas = scanner.nextInt();
        
                int angka = 6;
                while (angka <= batas) {
                    System.out.print(angka + " ");
                    angka += 6;
                }
            }
        }
 

