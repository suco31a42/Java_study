public class oddTotal{
  public static void main(String[] args) {
    int count = 0;//偶数の個数をカウントする変数
    int sum = 0;//偶数の合計を計算する変数
    
    for(int i = 1; i <= 10; i++) {
      count++; //偶数の場合、カウントを増やす
      sum += i; //偶数の場合、合計を計算に加える
    }
    System.out.println("偶数の個数" + count);
    System.out.println("偶数の合計" + sum);
  }
}