import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3};
        ArrayList<Integer> al = arrayToList(arr);
        System.out.println(al);


        Box<Apple> box2 = new Box<>(new Apple());
        Box<Orange> box1 = new Box<>(new Orange());
        Box<Orange> anotherBox = new Box<>();
        System.out.println("A box of apples weighs " + box2.getWeight());
        System.out.println("A box of oranges weight " + box1.getWeight());
        System.out.println(box2.compare(box1));
        box1.replaceFruitsToAnotherBox(anotherBox);

    }

    public static <T> ArrayList<T> arrayToList(T[] arr){
        return new ArrayList<>(Arrays.asList(arr));
    }

    public static <T> void swap(T[] arr, int index1, int index2){
        T obj = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = obj;
    }
}
