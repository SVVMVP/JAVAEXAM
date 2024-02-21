import java.util.*;
public class Task2 { public static void main(String[] args) {
    int[] array = {1, 4, 5, 1, 1, 3};
    int count = countUniqueElements(array);
    System.out.println("Кількість унікальних елементів у масиві: " + count);
}

    public static int countUniqueElements(int[] array) {
        Set<Integer> uniqueElements = new HashSet<>();
        for (int num : array) {
            uniqueElements.add(num);
        }
        return uniqueElements.size();
    }
}
