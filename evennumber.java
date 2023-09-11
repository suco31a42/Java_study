// イーブンナンバーズというクラスを宣言している
public class EvenNumbers {
  // メソッドのプログラムの実行を開始
  public static void main(String[] args) {
    // 繰り返し処理
    for (int number = 1; number <= 9; number++) {
      // 2で割り切れる華道家のチェック
      if(number % 2 == 0) {
        // numberの値を出力
        System.out.println(number);
      }
    }
  }
}