class pattern11 {
  public static void main(String args[]) {
    int k = 25;
    for (int i = 1; i <= 3; i++) {
      // Print leading spaces
      for (int j = i; j < 3; j++) {
        System.out.print(" ");
      }
      // Print numbers
      for (int j = 1; j <= i; j++) {
        System.out.print(k + " ");
        k--;
      }
      System.out.println();
    }
  }
}