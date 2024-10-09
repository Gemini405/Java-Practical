public class StringExample {
    public static void main(String[] args) {
        String s1, s2, s3, s4, s5, s6, s7, s8;
        int x, y;

        s1 = "Computer Science";
        x = 304;
        s2 = s1 + " " + x;
        s3 = s1 + s2.substring(10, 17);
        s4 = " is fun";
        s5 = s1 + s4;
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);
        System.out.println("s4: " + s4);
        System.out.println("s5: " + s5);
        y = 10;
        s6 = x + y + "total";
        s7 = "total" + x + y;
        s8 = " " + x + y + "total";
        System.out.println("s6: " + s6);
        System.out.println("s7: " + s7);
        System.out.println("s8: " + s8);
    }
}
