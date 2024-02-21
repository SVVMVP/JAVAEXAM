import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(50);
        integerList.add(100);
        integerList.add(150);
        integerList.add(200);

        List<String> stringList = filterIntegers(integerList);
        System.out.println(stringList);
    }

    public static List<String> filterIntegers(List<Integer> integerList) {
        List<String> filteredList = new ArrayList<>();
        for (Integer num : integerList) {
            if (num > 100) {
                filteredList.add(String.valueOf(num));
            }
        }
        return filteredList;
    }
}