package Recursion;

public class Fact {
    public static void main(String[] args) {
        fact(5);
    }

    private static int fact(int n) {
        if (n<=1){
            return 1;
        }
        return n*fact(n-1);
    }
}
