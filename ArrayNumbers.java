public class ArrayNumbers {
  public static void main(String[] args) {
    // 要素数20の配列を宣言
    int[] array = new int[20];
    
    // 配列に0から5ずつ加算して代入
    for (int i = 0; i < array.length; i++) {
      array[i] = i * 5;
    }
    System.out.print("奇数の値: "); 
    for (int i = 0; i <= 10; i++) {
      if(array[i] % 2 != 0) {
        System.out.print(array[i]);
        if(i != 10) {
          System.out.print(", ");
        }
      }
    }
    System.out.println(); //改行
    System.out.print("偶数の値: ");
    // 11から19の偶数をカンマ区切りで表示
    for (int i = 11; i < array.length; i++) {
      if (array[i] % 2 == 0) {
        System.out.print(array[i]);
        if (i != 19) {
          System.out.print(", ");
        }
      }
    }
    System.out.println(); 
  }
}