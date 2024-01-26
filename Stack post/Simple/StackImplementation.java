class Stack {

  int[] arr = new int[5];
  int idx = 0;

  public void push(int data) {
    if (idx == arr.length) {
      System.out.println("Stack is full");
      return;
    }

    arr[idx] = data;
    idx++;
  }

  public int pop(){

    if(idx == 0) return -1;

    int s = arr[idx];
    arr[idx] = 0;
    idx--;
    return s;
  }

  public void display(){
    for(int i=0;i<idx;i++){
        System.out.print(arr[i]+" ");
    }

    System.out.println();
  }

  public int size() {
    return idx;
  }


}

class StackImplementation {

  public static void main(String[] agrs) {
    Stack st = new Stack();
    System.out.println(st.size());
    st.push(10);
    // System.out.println(st.size());

    st.push(20);
    // System.out.println(st.size());

    st.push(30);
    // System.out.println(st.size());
    st.display();
    st.pop();
    st.display();




  }
}
