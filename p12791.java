import java.io.*;
import java.util.StringTokenizer;

/**
 * Created by jinhyuk on 2017. 11. 8..
 */
public class p12791 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter printWriter = new PrintWriter(new BufferedOutputStream(System.out));
    StringTokenizer stringTokenizer;
    StringBuilder stringBuilder = new StringBuilder("");

    int s,e;
    Music arr[] = new Music[25];
    void start(){
        init();
        try{
            int tc = Integer.parseInt(bufferedReader.readLine());
            for (int i = 0; i < tc; i++) {
                input();
                solve();
            }
            printWriter.print(stringBuilder.toString());
            printWriter.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    void input() throws IOException {
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        s = Integer.parseInt(stringTokenizer.nextToken());
        e = Integer.parseInt(stringTokenizer.nextToken());
    }
    void solve(){
        int count=0;
        for (int i = 0; i < 25; i++) {
            if(s<=arr[i].year && arr[i].year<=e){
                count++;
            }
        }
        stringBuilder.append(count+"\n");
        for (int i = 0; i < 25; i++) {
            if(s<=arr[i].year && arr[i].year<=e){
                stringBuilder.append(arr[i].toString());
            }
        }
    }

    public static void main(String[] args) {
        new p12791().start();
    }

    void init(){
        arr[0] = new Music("DavidBowie",1967);
        arr[1] = new Music("SpaceOddity",1969);
        arr[2] = new Music("TheManWhoSoldTheWorld",1970);
        arr[3] = new Music("HunkyDory",1971);
        arr[4] = new Music("TheRiseAndFallOfZiggyStardustAndTheSpidersFromMars",1972);
        arr[5] = new Music("AladdinSane",1973);
        arr[6] = new Music("PinUps",1973);
        arr[7] = new Music("DiamondDogs",1974);
        arr[8] = new Music("YoungAmericans",1975);
        arr[9] = new Music("StationToStation",1976);
        arr[10] = new Music("Low",1977);
        arr[11] = new Music("Heroes",1977);
        arr[12] = new Music("Lodger",1979);
        arr[13] = new Music("ScaryMonstersAndSuperCreeps",1980);
        arr[14] = new Music("LetsDance",1983);
        arr[15] = new Music("Tonight",1984);
        arr[16] = new Music("NeverLetMeDown",1987);
        arr[17] = new Music("BlackTieWhiteNoise",1993);
        arr[18] = new Music("1.Outside",1995);
        arr[19] = new Music("Earthling",1997);
        arr[20] = new Music("Hours",1999);
        arr[21] = new Music("Heathen",2002);
        arr[22] = new Music("Reality",2003);
        arr[23] = new Music("TheNextDay",2013);
        arr[24] = new Music("BlackStar",2016);
    }
    class Music{
        String name;
        int year;
        Music(String name, int year){
            this.name = name;
            this.year = year;
        }
        @Override
        public String toString() {
            return year+" "+name+"\n";
        }
    }
}
