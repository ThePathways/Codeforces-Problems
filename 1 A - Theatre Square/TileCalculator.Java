import java.util.Scanner;
 
public class TileCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        long a = scanner.nextLong();
        
        long totalTiles = (long) Math.ceil((double) n / a) * (long) Math.ceil((double) m / a);
        
        System.out.println(totalTiles);
        
        scanner.close();
    }
}
