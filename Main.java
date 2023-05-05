import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //stworzenie tablic text oraz pattern
        Random rand = new Random();
        int[] text = new int [8];            //wartość zmniejszona dla celów testowych, zmienić 7 na 10000
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
        //testowe wyświetlenie tabeli text
        for (i = 0; i<text.length; i++){
            System.out.print(text[i] + " ");
        }
        System.out.println("\n");

        //wyszukiwanie wartości wylosowanej z zakresu <65,90> za pomocą Binary Search
        BinarySearch ob = new BinarySearch();
        Random rand3 = new Random();
        int x = rand3.nextInt(26) + 65;
        int result = ob.binarySearch (text, x);
        System.out.println("Wyszukiwany element: " + x);
        if (result == -1)
            System.out.println( "Elementu nie udało sie znaleźć");
        else
            System.out.println("Element znajduje się na pozycji " + result);
        }

//
//        for (n = 0; n<pattern.length; n++){                                 //wyświetlanie tabeli pattern w celach testowych
//            System.out.print(pattern[n] + " ");
//        }
    }
