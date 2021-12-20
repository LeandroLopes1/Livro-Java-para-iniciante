import java.util.ArrayList;
import java.util.List;

public class App {
    public static List<Integer> fibonacci(int n) {
        List<Integer> result = new ArrayList<>();
        result.add(0);
        result.add(1);
        for (int i = 2; i < n; i++) {
            result.add(result.get(i - 1) + result.get(i - 2));
        }

        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        fibonacci(15);
    }
    public static Boolean isFibonacci(Integer a) {
        List<Integer> result = fibonacci(a);
        if(result.contains(a)) {
            return true;
        }
        return false;
    }
}

      
 


