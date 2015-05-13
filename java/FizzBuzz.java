package jp.co.mycom.myapp.fizzbuzz;

public class FizzBuzz {
  
  public enum lineType {
    NONE("-"),
    FIZZ("Fizz"),
    BUZZ("Buzz"),
    FIZZ_BUZZ("FizzBuzz"),
    ;
    
    public String msg;
    lineType(String msg) {
      this.msg = msg;
    }
    @Override
    public String toString() {
      return msg;
    }
  }
  
  /**
   * 指定された数値範囲をFizzBuzz判定する
   * 
   * @param start FizzBuzz判定する数の開始値
   * @param end FizzBuzz判定する数の終了値
   * @return
   */
  public String saidIn(int start, int end) {
    validateParameterRange(start, end);
    int[] target = prepareTargetNumbers(start, end);
    return said(target);
  }

  /**
   * 渡された数値群をFizzBuzz判定する
   * @param target FizzBuzz判定する数値群
   * @return
   */
  public String said(int... target) {
    validateNumbers(target);
    
    StringBuilder said = new StringBuilder();
    for (int oneTarget : target) {
      said.append(generateFizzBuzzLine(oneTarget));
    }
    said.delete(said.length() - 1, said.length());

    return said.toString();
  }

  StringBuilder generateFizzBuzzLine(int target) {
    StringBuilder appended = new StringBuilder();
    appended.append(target + ": ");
    appended.append(judgeFizzOrBuzz(target));
    appended.append("\n");
    return appended;
  }

  StringBuilder judgeFizzOrBuzz(int target) {
    StringBuilder which = new StringBuilder();

    if (target == 0) {
      which.append(lineType.NONE);
    } else if (target % 3 == 0 && target % 5 == 0) {
      which.append(lineType.FIZZ_BUZZ);
    } else if (target % 3 == 0) {
      which.append(lineType.FIZZ);
    } else if (target % 5 == 0) {
      which.append(lineType.BUZZ);
    } else {
      which.append(lineType.NONE);
    }

    return which;
  }

  private void validateParameterRange(int start, int end) {
    if(start > end) {
      String errorMsg =
          "Last parameter need to be bigger than previous parameter.";
      throw new RuntimeException(errorMsg);
    }
  }
  
  private void validateNumbers(int[] target) {
    if(target.length < 1) {
      String errorMsg = String.format(
          "<%s> is invalid param. Need to set numbers.", target);
      throw new RuntimeException(errorMsg);
    }
  }
  
  private int[] prepareTargetNumbers(int start, int end) {
    int targetLength = end - start + 1;
    int[] target = new int[targetLength];
    for (int i = 0; i < targetLength; i++) {
      target[i] = start + i;
    }
    return target;
  }

  public static void main(String[] args) {
    System.out.println(new FizzBuzz().saidIn(0, 100));
  }
}
