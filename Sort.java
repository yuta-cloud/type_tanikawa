import java.util.Arrays;
import java.util.stream.IntStream;

class Main {

  public static void main(String[] args) {
    // ランダムに並べられた重複のない整数の配列
    var array = new int[] { 5, 4, 6, 2, 1, 9, 8, 3, 7, 10 };
    // ソート実行
    var sortedArray = new Main().sort(array);
    // 結果出力
    Arrays.stream(sortedArray).forEach(System.out::println);
  }

  private int[] sort(int[] array) {
    // 要素が一つの場合はソートの必要がないので、そのまま返却
    if (array.length == 1) {
      return array;
    }

    // 配列の先頭を基準値とする
    var pivot = array[0];

    // ここから記述
    int left = 0;
    int right = array.length - 1;
    int tmp; //スワップ用変数

    while(left <= right){
      //pivotを基準に探索
      while(array[left] < pivot){
          left++;
      }
      while(array[right] > pivot){
          right--;
      }

      //スワップを実行
      if(left <= right){
        tmp = array[left];
        array[left] = array[right];
        array[right] = tmp;
        if(left != right)right--;
        left++;
      }
    }

    //array_leftとarray_rightに分割
    var array_left = Arrays.copyOfRange(array, 0, right + 1);
    var array_right = Arrays.copyOfRange(array, left, array.length);

    //array_leftとarray_right内で再度ソートを実行
    var sortedArray_left = sort(array_left);
    var sortedArray_right = sort(array_right);

    //分割した配列を統合
    var sortedArray = new int[sortedArray_left.length + sortedArray_right.length];
    System.arraycopy(sortedArray_left, 0, sortedArray, 0, sortedArray_left.length);
    System.arraycopy(sortedArray_right, 0, sortedArray, sortedArray_left.length, sortedArray_right.length);

    return sortedArray;
    // ここまで記述

  }
}
