public class Factorial {
    public int getFactorial(int input){
        int factorial = 1;
        for(int i=2;i<=input;i++){
            factorial = factorial*i;
        }
        return factorial;
    }
}