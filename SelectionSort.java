//import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        int a[]={2,3,1,5,4};
        int temp,k;
        for(int i=0;i<a.length-1;i++){
            k=i;
            for(int j=i+1;j<a.length;j++){
                if (a[j]<a[k]) {
                    k=j;
                }
            }
            if (k!=i) {
                temp=a[i];
                a[i]=a[k];
                a[k]=temp;
            }
        }
        System.out.println("Sorted array:");
        for(int j=0;j<a.length;j++){
            System.out.println(" " +a[j]);
        }
    }
}


//This code is taken from VJ tech Data structure in C 