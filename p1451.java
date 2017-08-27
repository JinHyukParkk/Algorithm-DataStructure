import java.util.Scanner;

/**
 * Created by jinhyuk on 2017. 6. 28..
 */
public class p1451 {
    public static int arr[][];
    public static long s[][];
    public static long sum(int x1, int y1, int x2, int y2){
        return s[x2][y2] - s[x2][y1-1] - s[x1-1][y2] + s[x1-1][y1-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        arr = new int[n+1][m+1];
        for (int i=1; i<=n; i++) {
            String line = " " + sc.nextLine();
            System.out.println(line);
            for (int j=1; j<=m; j++) {
                arr[i][j] = line.charAt(j) - '0';
            }
        }
        s = new long[n+1][m+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                s[i][j] = s[i][j - 1] + s[i - 1][j] - s[i - 1][j - 1] + (long) arr[i][j];
            }
        }
        long ans = 0;
        for (int i = 1; i <= m-2; i++) {
            for (int j = i+1; j <=m-1 ; j++) {
                long r1 = sum(1, 1, n, i);
                long r2 = sum(1, i + 1, n, j);
                long r3 = sum(1, j + 1, n, m);
                if (ans < r1 * r2 * r3) {
                    ans = r1 * r2 * r3;
                }
            }
        }
        for (int i = 1; i <=n-2 ; i++) {
            for (int j = 1; j <=n-1 ; j++) {
                long r1 = sum(1, 1, i, m);
                long r2 = sum(i + 1, 1, j, m);
                long r3 = sum(j + 1, 1, n, m);
                if (ans < r1 * r2 * r3) {
                    ans = r1 * r2 * r3;
                }
            }
        }
        for (int i=1; i<=n-1; i++) {
            for (int j=1; j<=m-1; j++) {
                long r1 = sum(1,1,n,j);
                long r2 = sum(1,j+1,i,m);
                long r3 = sum(i+1,j+1,n,m);
                if (ans < r1*r2*r3) {
                    ans = r1*r2*r3;
                }
                r1 = sum(1,1,i,j);
                r2 = sum(i+1,1,n,j);
                r3 = sum(1,j+1,n,m);
                if (ans < r1*r2*r3) {
                    ans = r1*r2*r3;
                }
                r1 = sum(1,1,i,m);
                r2 = sum(i+1,1,n,j);
                r3 = sum(i+1,j+1,n,m);
                if (ans < r1*r2*r3) {
                    ans = r1*r2*r3;
                }
                r1 = sum(1,1,i,j);
                r2 = sum(1,j+1,i,m);
                r3 = sum(i+1,1,n,m);
                if (ans < r1*r2*r3) {
                    ans = r1*r2*r3;
                }
            }
        }
        System.out.println(ans);
    }
}
