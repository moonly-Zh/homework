package fibonacci;

public class fibonacci {
    public static int of(int num){
        if(num == 1 || num == 2){
            return 1;
        }
        else{
            return of(num-1)+of(num-2);
        }
    }

    public static void main(String[] args){
        for(int i = 1;i <= 12;i++){
            System.out.printf("Fibonacci of %d is: %d\n",
                    i, of(i));
        }
    }
}
