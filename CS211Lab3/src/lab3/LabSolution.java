package lab3;

import java.util.*;

public class LabSolution {

    String names[];
    int length;

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        LabSolution sorter = new LabSolution();
        int num = sc.nextInt();
        String jerryRig= sc.nextLine();
        String[] words = new String[num];
        for(int i=0;i<words.length;i++){
    		words[i]=sc.nextLine();
    	}
        sorter.sort(words);

        for (int i=0;i<words.length;i++) {
            System.out.println(words[i]+ " ");
        }
    }

    void sort(String array[]) {
        if (array == null || array.length == 0) {
            return;
        }
        this.names = array;
        this.length = array.length;
        quickSort(0, length - 1);
    }

    void quickSort(int lowerIndex, int higherIndex) {
        int i = lowerIndex;
        int j = higherIndex;
        String pivot = this.names[lowerIndex + (higherIndex - lowerIndex) / 2];

        while (i <= j) {
            while (this.names[i].compareToIgnoreCase(pivot) < 0) {
                i++;
            }

            while (this.names[j].compareToIgnoreCase(pivot) > 0) {
                j--;
            }

            if (i <= j) {
                exchangeNames(i, j);
                i++;
                j--;
            }
        }
        //call quickSort recursively
        if (lowerIndex < j) {
            quickSort(lowerIndex, j);
        }
        if (i < higherIndex) {
            quickSort(i, higherIndex);
        }
    }

    void exchangeNames(int i, int j) {
        String temp = this.names[i];
        this.names[i] = this.names[j];
        this.names[j] = temp;
    }
}