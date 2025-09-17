import java.util.Scanner;

public class Sieve {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a natural number greater than 1: ");
        int n = in.nextInt();

        int[] array = new int[n-1];
        for(int i = 0; i < n-1; i++){
            array[i] = i+2;
        }
        
        int t = 0;

        for(int i = 0; i < n-1; i++){
            t = array[i];
            if (t != 0){
                for (int j = t-1; j < array.length; j++){
                    if (array[j] % t == 0){
                       array[j] = 0;
                    }
                }
            }

        }

        for (int a = 0; a < n-1; a++){
            if (array[a] != 0){
                System.out.print(array[a] + " ");
            }
        }
    }

}
