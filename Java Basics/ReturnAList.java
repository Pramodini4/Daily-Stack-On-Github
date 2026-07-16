import java.util.ArrayList;
import java.util.List;
public class ReturnAList {
    public static List<Integer> getNumbers() {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        return list;
    }

     public static void main(String[] args) {
        List<Integer> result = getNumbers();

        System.out.println(result);
    }
}
