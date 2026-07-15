public class InsertionSort {
    public static void main(String[] args) {
        int a[]={1,2,5,3,4};
        int temp,i,j;
        for(i=1;i<a.length;i++){
            temp=a[i];
            for(j=i-1; j>0 && a[j]>temp; j--){
                a[j+1]=a[j];
            }
            a[j+1]=temp;
        }
        System.out.println("Sorted array:");
        for(i=0;i<a.length;i++){
            System.out.println(" " +a[i]);
        }
    }
}
