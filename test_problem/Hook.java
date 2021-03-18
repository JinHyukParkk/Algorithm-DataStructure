import java.io.*;
import java.util.StringTokenizer;

class Hook {
    Myscanner sc = new Myscanner();
	
    int n,k;
    // 1의 위치 index
	int point;

	void start() {
        // 입력
		try{
            input();
            
        } catch (IOException e){
            e.printStackTrace();
        }

        // 해결
        sovle();
	}
	
	void input() throws IOException {
        n = sc.nextInt();
        k = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (sc.nextInt() == 1) {
                point = i;
            }
        }

	}
	
	void solve() {
		
	}
	
	public static void main(String[] args) throws Exception {
		new Hook().start();
	}
}

class Myscanner {
        BufferedReader br;
        StringTokenizer st;

        Myscanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }