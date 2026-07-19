import java.util.*;
public class FindLargestNo {
    public static void main(String args[]){
        int largest,size;
        int[]  arr = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array (1-10):");
        size = sc.nextInt();
        System.out.println("Enter array elements:");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        largest = arr[0];
        for(int i = 0; i < size ;i++){
            if(arr [i] > largest){
                largest =arr[i];
            }
        }
        System.out.println("Largest:" + largest);

        sc.close();
    }

}
