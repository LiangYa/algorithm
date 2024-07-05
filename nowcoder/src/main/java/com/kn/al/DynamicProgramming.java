package com.kn.al;

/**
 * 动态规划
 */
public class DynamicProgramming {

//    自顶向下
    public static int Fibonacci(int n){
        if (n <= 0) {
            return n;
        }
        int[] memory = new int[n+1];
        for (int i = 0; i <= n; i++){
            memory[i] = -1;
        }
        return fib(n, memory);
    }

    public static int fib(int n, int[] memory) {
        if (memory[n] != -1) {
            return memory[n];
        }
        if (n < 2){
            memory[n] = 1;
        } else {
            memory[n] = fib(n-2, memory) + fib(n-1, memory);
        }
        return memory[n];
    }

    // 自底向上
    public static int fib2(int n){
        if(n <= 0){
            return 0;
        }
        int[] Memory = new int[n+1];
        Memory[0] = 1;
        Memory[1] = 1;
        for (int i = 2; i <= n; i++){
            Memory[i] = Memory[i-2] + Memory[i-1];
        }
        return Memory[n];
    }

    public static void main(String[] args) {
//        System.out.println(Fibonacci(3));
        System.out.println(fib2(3));
    }
}
