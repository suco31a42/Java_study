public class Exercise {
  public static void main(String[] args) {
    // 1-1
    System.out.println("hello world");
    // 1-2
    int x = 11;
    // 1-3
    int x2 = 13;
    int y = 17;
    // 1-4
    System.out.println(x2 + y);
    // 1-5
    System.out.println(13 * 17);
    // 1-6
    int x3 = 7;
    x3 *= 3;
    System.out.println("x=" + x3);
    x3 /= 2;
    System.out.println("x=" + x3);
    // 1-7 
    int x4 = 3;
    int y2 = 7;
    int z = y2;
    y2 = x4;
    x4 = z;
    System.out.println("x4=" + x4 + ",y2=" + y2);
    // 1-8
    int x5 = 19;
    int y3 = 23;
    int z2 = x5 * y3;
    System.out.println(x5 + "*" + y3 + "の合計は" + z2);
    // 1-9
    int xx = 12;
    System.out.println(xx * 2);
    System.out.println(xx * 3);
    System.out.println(xx * 4);
    // 1-10
    int x6 = 3;
    System.out.println(x6);
    System.out.println(x6 * x6);
    System.out.println(x6 * x6 * x6);
    // 1-11
    int x7 = 44;
    System.out.print(x7 / 3);
    System.out.println("あまり" + x7 % 3);
    // 1-12
    int x8 = 10;
    x8++;
    System.out.println(x8);
    x8--;
    x8--;
    System.out.println(x8);
  }
}
