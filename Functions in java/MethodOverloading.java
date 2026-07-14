public class MethodOverloading {
    public static int add(int num1,int num2){
        return num1 + num2;
    }
    public static int add(int num1,int num2,int num3){
        return num1 + num2 + num3;
    }
    public static void main(String args[]){
        int sumofTwoNumbers = MethodOverloading.add(10,20);
        int sumofThreeNumbers = MethodOverloading.add(10,20,30);
        System.out.println(sumofTwoNumbers);
        System.out.println(sumofThreeNumbers);
    }
}
                            