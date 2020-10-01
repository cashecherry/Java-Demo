import java.util.*;

public class insomniacure {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        
        int k = Integer.parseInt(args[0]);
        int l = Integer.parseInt(args[1]);
        int m = Integer.parseInt(args[2]);
        int n = Integer.parseInt(args[3]);
        int d = Integer.parseInt(args[4]);


        int count = 0;
        for(int i=1; i <= d; i++){
            if(i%k == 0 || i%l == 0 || i%m == 0 || i%n ==0){
                count++;
            }
        }
        System.out.println("count: " + count);
        scan.close();
    }
}