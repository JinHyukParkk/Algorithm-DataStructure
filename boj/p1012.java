import java.io.*;
import java.util.StringTokenizer;

public class p1012 {

    static int arr[][];
    static boolean visied[][];

    static int count;

    static int dx[] = {0,0,-1,1};
    static int dy[] = {1,-1,0,0};

    static int m,n;

    static void dfs(int x,int y){
        visied[y][x] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x+dx[i];
            int ny = y+dy[i];
            if(nx<0 || m<=nx || ny<0 || n<=ny) continue;

            if(arr[ny][nx] == 1 && !visied[ny][nx]){
                dfs(nx,ny);
            }

        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");
        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            arr = new int[n][m];
            visied = new boolean[n][m];
            count = 0;

            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                arr[b][a] = 1;
                count = 0;
            }

//            for (int j = 0; j < n; j++) {
//                for (int l = 0; l < m; l++) {
//                    System.out.print(arr[j][l] + " ");
//                }
//                System.out.println();
//            }

            for (int j = 0; j < n; j++) {
                for (int l = 0; l < m; l++) {
                    if(arr[j][l] == 1 && !visied[j][l]){
                        count++;
                        dfs(l,j);
                    }
                }
            }
            sb.append(count);
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.close();

    }
}
