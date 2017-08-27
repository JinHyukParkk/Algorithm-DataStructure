import java.io.*;

/**
 * Created by jinhyuk on 2017. 8. 24..
 */
public class p10989 {
    int numbers[];
    int countArr[];
    int result[];
    int max=0;
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    void inputNumber() throws IOException{
//        Scanner scanner = new Scanner(System.in);
//        int size = scanner.nextInt();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size=Integer.parseInt(br.readLine().trim());
        numbers = new int[size];
        for (int i = 0; i <numbers.length ; i++) {
//            int num = scanner.nextInt();
            int num = Integer.parseInt(br.readLine().trim());
            numbers[i] = num;
            if(max<num){
                max = num;
            }
        }
    }
    void display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    void sort() throws IOException{
        inputNumber();

        int maxnumber = max;
        countArr = new int[maxnumber+1];
        result = new int[numbers.length];

        for (int i = 0; i < numbers.length ; i++) {
            countArr[numbers[i]]++;
        }
        for (int i = 0; i < countArr.length; i++) {
            for (int j = 0; j < countArr[i]; j++) {
                bw.write(i+"\n");
            }
        }
        bw.close();

    }


    public static void main(String[] args) throws IOException{
        new p10989().sort();
    }
}
