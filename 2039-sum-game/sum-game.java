class Solution {
  public boolean sumGame(String num) {
    final int n = num.length();
    double av = 0.0;

    for (int i = 0; i < n / 2; ++i)
      av += getExpectation(num.charAt(i));

    for (int i = n / 2; i < n; ++i)
      av -= getExpectation(num.charAt(i));

    return av != 0.0;
  }

  private double getExpectation(char c) {
    return c == '?' ? 4.5 : c - '0';
  }
}