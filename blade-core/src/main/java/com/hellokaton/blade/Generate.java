package com.hellokaton.blade;

class Generate {
    int xxx = 5;

    public Generate(int xxx) {
        this.xxx = xxx;
    }

    public static void main(String[] args) {
        Generate test = new Generate();
        System.out.println(test.xxx);//test
        System.out.println("test");
    }
}
