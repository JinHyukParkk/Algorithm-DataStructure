public class bitmaskEx {
    public static void main(String[] args) {
        // AND
        System.out.println(111 & 101);
        // OR
        System.out.println(101 | 10);
        // XOR
        System.out.println(101 ^ 111);
        // NOT
        System.out.println(~(1011));
        // LEFT SHIFT 연산
        System.out.println(1 << 5);
        // RIGHT SHIFT 연산
        System.out.println(4 >> 1);
        // 11111(2) == 63
        System.out.println((1 << 6)-1);
        // 1 추가
        int a = 2;// 10
        a = a | (1<<4);   // 1010
        System.out.println(a);
        // 1 삭제
        a = a & ~(1<<4);
        System.out.println(a);
        
    }
}
