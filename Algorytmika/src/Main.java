import java.util.*;

public class Main {
    public static void main(String[] args) {
        //stworzenie tablic text oraz pattern
        Random rand = new Random();
        int[] text = new int [10000];
        int i;
        for (i = 0; i < text.length; i++) {
            int numText = rand.nextInt(27) + 65;
            text[i] = numText;
        }
        Random rand2 = new Random();
        int[] pattern = new int[5];
        int n;
        for(n = 0; n < pattern.length; n++){
            int numPattern = rand2.nextInt(26) + 65;
            pattern[n] = numPattern;
        }

        //sortowanie tabeli text za pomocą InsertionSort
        for (i = 1; i<text.length; i++){
            int sort = text[i];
            int j = i-1;

            while (j >=0 && text[j]>sort){
                text[j + 1] = text[j];
                j = j-1;
            }
            text[j+1] = sort;
        }

        //sortowanie tabeli pattern za pomocą InsertionSort
        for (n = 1; n<pattern.length; n++){
            int sort2 = pattern[n];
            int m = n-1;

            while (m >=0 && pattern[m]>sort2){
                pattern[m + 1] = pattern[m];
                m = m-1;
            }
            pattern[m+1] = sort2;

        }

        //wyszukiwanie wartości wylosowanej z zakresu <65,90> za pomocą Binary Search
        //oraz mierzenie czasu wyszukiwania
        long start = System.currentTimeMillis();

        BinarySearch ob = new BinarySearch();
        Random rand3 = new Random();
        int x = rand3.nextInt(26) + 65;
        int result = ob.binarySearch (text, x);
        System.out.println("Wyszukiwany element: " + x + "\n");
        if (result == -1)
            System.out.println( "Elementu nie udało sie znaleźć" + "\n");
        else
            System.out.println("Element znajduje się na pozycji " + result + "\n");

        long stop = System.currentTimeMillis();
        System.out.println("Czas wyszukiwania wartości wylosowanej (w milisekundach): " + (stop - start) + "\n");

        //zamiana wartości numerycznych w tablicach text oraz pattern na wartości tekstowe (ASCII)
        List<String> lista = new ArrayList<String>();
        for (i=0; i<text.length; i++) {
            String str = Character.toString(text[i]);
            lista.add(str);
        }

        List<String> lista2 = new ArrayList<>();
        for (n=0;n<pattern.length;n++){
            String str2 = Character.toString(pattern[n]);
            lista2.add(str2);
        }

        //Wyszukiwanie w tablicy text wzoru pattern za pomocą algorytmu KMP
        String txt = String.valueOf(lista);
        String pat = String.valueOf(lista2);

        new KMP_String_Matching().KMPSearch(pat, txt);

    }

}