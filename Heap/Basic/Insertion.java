package Basic;

/**
 * Insertion
 */

class Heap {

  int[] arr;
  int size;

  Heap() {
    arr = new int[100];
    size = 0;
  }

  void insert(int val) {
    size = size + 1;
    int index = size;
    arr[index] = val;

    while (index > 1) {
      int parent = index / 2;

      if (arr[parent] < arr[index]) {
        int temp = arr[parent];
        arr[parent] = arr[index];
        arr[index] = temp;
        index = parent;
      } else {
        return;
      }
    }
  }

  void delete(){

    if(size == 0){
        System.out.println("Heap is Empty");
        return;
    }

    arr[1] = arr[size];
    size--;

    // take it to correct position
    int i = 1;
    while(i < size){
        int leftIndex = 2 * i;
        int rightIndex = 2 * i + 1;

        if(leftIndex < size && arr[i] < arr[leftIndex]){
            int temp = arr[i];
            arr[i] = arr[leftIndex];
            arr[leftIndex] = temp;
            i = leftIndex;

        }else if(rightIndex < size && arr[i] < arr[rightIndex]){
            int temp = arr[i];
            arr[i] = arr[rightIndex];
            arr[rightIndex] = temp;
            i = rightIndex;
        }else{
            return;
        }

    }
  }

  void print() {
    for (int i = 1; i <= size; i++) {
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
}

public class Insertion {

  public static void main(String[] args) {
    Heap h = new Heap();
    h.insert(50);
    h.insert(55);
    h.insert(53);
    h.insert(52);
    h.insert(54);

    h.print();
    h.delete();
    h.print();


  }
}
