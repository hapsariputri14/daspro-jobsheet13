import java.util.Scanner;

public class ModifUcapanTerimaKasih_23 {
    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan:");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + ", for being the best teacher in the world.\n" +
                "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }

    public static void UcapanTambahan(String tambahan) {
        System.out.println("Additional Message: " + tambahan);
    }

    public static void main(String[] args) {
        UcapanTerimaKasih();
        // Contoh penggunaan UcapanTambahan
        UcapanTambahan("I appreciate your dedication to education.");
    }
}
