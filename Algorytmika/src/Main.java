import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //stworzenie tablic text oraz pattern
        Random rand = new Random();
        int[] text = new int [7];            //wartość zmniejszona dla celów testowych, zmienić 7 na 10000
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
            int key = text[i];
            int j = i-1;

            while (j >=0 && text[j]>key){
                text[j + 1] = text[j];
                j = j-1;
            }
            text[j+1] = key;
        }

        //sortowanie tabeli pattern za pomocą InsertionSort
        for (n = 1; n<pattern.length; n++){
            int key2 = pattern[n];
            int m = n-1;

            while (m >=0 && pattern[m]>key2){
                pattern[m + 1] = pattern[m];
                m = m-1;
            }
            pattern[m+1] = key2;

        }



        //testowe wyświetlenie tabel
        for (i = 0; i<text.length; i++){
            System.out.print(text[i] + " ");
        }
        System.out.println("\n");

        for (n = 0; n<pattern.length; n++){
            System.out.print(pattern[n] + " ");
        }
    }
}