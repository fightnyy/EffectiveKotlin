package chap3.item24;

public class Snippet1 {


    public static void main(String[] args) {
        Integer[] numbers = {1, 4, 2, 1};
        Object[] objects = numbers;
        objects[2] = "B";
    }


}
