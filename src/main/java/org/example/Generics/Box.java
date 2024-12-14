package org.example.Generics;

public class Box<T> {

    private T obj;

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        String[] strArray = {"Hello", "World"};

        Box.printArray(intArray);
        Box.printArray(strArray);

        Box<String> str = new Box<>();
        str.setObj("\n \tUsing Generics...");
        System.out.println(str.getObj());
    }
}
