package com.hellokaton.blade;

// Example3.java
public class Example3 {

    private Integer number = 100;

    public void checkEquality() {
        Integer anotherNumber = 100;
        if (number == anotherNumber) {  // Сравнение объектов оператором == вместо equals, потенциальная ошибка
            System.out.println("Numbers are equal.");
        } else {
            System.out.println("Numbers are not equal.");
        }
    }

    @SuppressWarnings("unchecked")
    public void unsafeCast() {
        Object obj = "This is a string";
        Integer num = (Integer) obj;  // Небезопасное приведение, вызывает ClassCastException
        System.out.println("Number: " + num);
    }

    public static void main(String[] args) {
        Example3 example = new Example3();
        example.checkEquality();
        example.unsafeCast();  // Этот вызов приведет к исключению во время выполнения
    }
}
