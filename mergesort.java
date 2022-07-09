
package dsa;

import java.util.Arrays;

class merge_sort
{
    int a[],b[];
  public static int[] merge(int[] array1, int[] array2) {
        int[] combined = new int[array1.length + array2.length];
        int index = 0;
        int i = 0;
        int j = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                combined[index] = array1[i];
                index++;
                i++;
            } else {
                combined[index] = array2[j];
                index++;
                j++;
            }
        }
        while (i < array1.length) {
            combined[index] = array1[i];
            index++;
            i++;
        }

        while (j < array2.length) {
            combined[index] = array2[j];
            index++;
            j++;
        }
        System.out.println("Array1 :" + Arrays.toString(array1));
        System.out.println("Array2 :" + Arrays.toString(array2));
        System.out.println("Combined :" + Arrays.toString(combined));
        System.out.println("-*-*-*-*-*");
        return combined;
    }


    public static int[] mergeSort(int[] array) {
        if (array.length == 1) return array;

        int mid = array.length/2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        return merge(mergeSort(left), mergeSort(right));
    }
    
}
public class mergesort {
    public static void main(String[] args) {
        int a[]={1,5,6,8,10};
        int b[]={2,4,7,9,11,12,15};
        merge_sort finalarray= new merge_sort();
        System.out.println( Arrays.toString(finalarray.mergeSort(b)));
    }
}
