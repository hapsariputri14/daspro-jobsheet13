import java.util.Scanner;
public class Percobaan623Fungsi{
        Scanner input = new Scanner(System.in);
        static int hitungLuas (int pjg, int lb){
        int Luas = pjg*lb;
        return Luas;
    }
    static int hitungVolume (int tinggi, int a, int b){
        int volume = hitungLuas(a,b)*tinggi;
        return volume;
    }
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int p, l, t, L, vol;
        System.out.println("Masukkan panjang");
        p = input.nextInt();
        System.out.println("Masukkan lebar");
        l = input.nextInt();
        System.out.println("Masukkan tinggi");
        t = input.nextInt();

        L = hitungLuas(p,l);
        System.out.println("LuasPersegi Panjang adalah "+L);
        vol=hitungVolume(t,p,l);
        System.out.println("Volume Balok adalah "+vol);
        input.close();
    }
}