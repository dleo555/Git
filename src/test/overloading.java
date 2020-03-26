package test;

public class overloading {
// 1. Different Number of parameters
    public static void sum(int num1){
    }
    public static void sum(int num1, int num2){
    }
//2. Different Data Type of parameters
    public static void add(int num1){
    }
    public static void add(double num1){
    }
//3. Different Sequence of parameters
    public static void add(int num1, String str){
    }
    public static void add(String str, int num1){
    }
}


