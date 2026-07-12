public class TypeC {
    public static void findEvenOdd(int num){
        if(num % 2 ==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
    public static void main(String[] args) {
        int num = 24;
        findEvenOdd(num);
    }
}
