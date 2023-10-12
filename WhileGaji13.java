import java.util.Scanner;

public class WhileGaji13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur = 0, totalGajiLembur = 0;
        

        System.out.print("Masukkan jumlah karyawan: ");
        jumlahKaryawan = scan.nextInt();
        String jabatan;
        int i = 0;
        while (i < jumlahKaryawan){
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.println("Masukkan jabatan karyawan ke-" + (i+1) + ": ");
            jabatan = scan.next();
            System.out.println("Masukkan jumlah jam lembur: ");
            jumlahJamLembur = scan.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = jumlahJamLembur * 10000;
            }
            else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            } else {
                System.out.println("jabatan invalid ");
                continue;
            } 



            totalGajiLembur += gajiLembur;
            System.out.println("Total gaji lembur: " + totalGajiLembur);
        }
        
    }
}
