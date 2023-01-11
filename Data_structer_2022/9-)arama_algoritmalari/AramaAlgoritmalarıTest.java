import java.util.Arrays;

public class AramaAlgoritmalarıTest implements ICalısabilirDataStructure {
    @Override
    public void calıstır() {
AramaAlgoritmaları aramaAlgoritmaları = new AramaAlgoritmaları();

        int[] dizi = {3, 6, 1, 2, 9, 5, 7, 4, 8, 0};

        // Doğrusal arama
        int aranan = 5;
        int sonuç = aramaAlgoritmaları.linearSearch(dizi, aranan);
        if (sonuç == -1) {
            System.out.println(aranan + " değeri dizide bulunamadı.");
        } else {
            System.out.println(aranan + " değeri dizinin " + sonuç + ". indeksinde bulundu.");
        }

        // İkili arama
        // Önce diziyi sırala
        QuickSort quickSort = new QuickSort();
        quickSort.sırala(dizi);

        aranan = 7;
        sonuç = aramaAlgoritmaları.binarySearch(dizi, aranan);
        if (sonuç == -1) {
            System.out.println(aranan + " değeri dizide bulunamadı.");
        } else {
            System.out.println(aranan + " değeri dizinin " + sonuç + ". indeksinde bulundu.");
        }

    }

    @Override
    public String uygulamaIsminiAl() {
        return Sabitler.ARAMA_ALGORITMALARI;
    }
}
