import java.io.File;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;

public class Test {

    public static void main(String[] args){
        System.out.println("hello world");
        HashSet<Integer> sickList = new HashSet<Integer>();
        HashSet<Integer> sickListFinal = new HashSet<Integer>();

        TreeMap<Integer, int[]> shakeHistory = new TreeMap<Integer, int[]>();
        Scanner scanner;
        try {
            scanner = new Scanner(new File("tracing.in"));
        }
        catch (Exception e) {
            System.out.println("file not found:" + e.toString());return;}

        int N = scanner.nextInt();
        int times = scanner.nextInt();
        scanner.nextLine();//skip to end of line
        String sickData = scanner.nextLine();
        for (int i=0; i<sickData.length();i++)
        {
            if (sickData.charAt(i) == '1')
                sickListFinal.add(i);
        }

        int[] cows = new int[2];

        for (int i=0; i<times; i++)
        {
            int time = scanner.nextInt();
            cows[0] = scanner.nextInt();
            cows[1] = scanner.nextInt();
            shakeHistory.put(time, cows);
        }
        scanner.close();

        for (int K=0; K<N; K++)
        {
            if (K>0)

        }
    }
}
