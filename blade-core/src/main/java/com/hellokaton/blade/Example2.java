package com.hellokaton.blade;

// Example2.java
public class Example2 {

    private boolean flag = false;

    @Deprecated
    public void oldMethod() {
        System.out.println("This method is outdated.");
    }

    public void checkFlag() {
        if (flag == true) {  // Избыточное условие, рекомендуется использовать просто `if (flag)`
            System.out.println("Flag is true.");
        } else if (flag == false) {  // Избыточное условие, рекомендуется использовать просто `if (!flag)`
            System.out.println("Flag is false.");
        }
    }

    public void callOldMethod() {
        oldMethod();  // Вызов устаревшего метода, будет предупреждение
    }

    public static void main(String[] args) {
        Example2 example = new Example2();
        example.checkFlag();
        example.callOldMethod();
    }
}
