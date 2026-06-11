public class BubbleSort {
    public static void main(String[] args) {
        int a[]={5,2,4,1,3};
        int temp;
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i] +" ");
        }
    }
}

//simple code I took from VJ tech C data structure notes
