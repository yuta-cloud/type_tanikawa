class Main {

  public static void main(String args[]) {
    // 昇順にソートされた配列
    int[] sortedArray = { 1, 2, 3, 5, 12, 7890, 12345 };
    // 探索対象の番号
    int targetNumber = 7890;
    // 探索実行
    int targetIndex = new Main().serchIndex(sortedArray, targetNumber);
    // 結果出力
    System.out.println(targetIndex);
  }

  private int serchIndex(int[] sortedArray, int targetNumber) {

    // ここから記述

    int min = 0;
    int max = sortedArray.length - 1;
    int mid;

    while(min <= max){
      mid = (min + max) / 2;

      //探索する数値が存在するとインデックスを返す
      //存在しない場合はmin, maxを更新
      if(sortedArray[mid] == targetNumber){
        return mid;
      }else if(sortedArray[mid] < targetNumber){ 
        min = mid + 1;
      }else{
        max = mid - 1;
      }

    }

    // ここまで記述

    // 探索対象が存在しない場合、-1を返却
    return -1;
  }
}
