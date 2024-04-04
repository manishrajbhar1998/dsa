class UniqueElment {

  public static void main(String[] args) {
    // System.out.println(1 << 1);
    // System.out.println(1 << 2);
    // System.out.println(1 << 3);
    // System.out.println(1 << 4);
    // System.out.println(1 << 5);

    // System.out.println(41 | (1 << 2));

    int[] ar = { 10, 9, 6, 6, 9 };

    int ans = 0;

    for(int i=0;i<ar.length;i++){
      ans = ans ^ ar[i];
    }

    System.out.println(ans);



    

  }
}
