package Basic;

/**
 * Insertion
 */

public class Insertion {
  static class Heap {

    int[] arr;
    int size;

    Heap(int size) {
      arr = new int[size];
      this.size = 0;
    }

    void insert(int val) {

      if (size >= 10) {
        System.out.println("Heap overflow");
        return;
      }

      int index = size;
      arr[index] = val;

      
      while (index > 0) {

        int par = (index - 1) / 2;
        if (arr[index] > arr[par]) {
          int temp = arr[par];
          arr[par] = arr[index];
          arr[index] = temp;
          index = par;
        }else{
          break;
        }
      }
      size++;
    }

    void delete() {

      if (size == 0) {
        System.out.println("Heap underflow");
        return;
      }

      System.out.println(arr[0] +" is Deleted "+size);
      arr[0] = arr[size - 1];
      size--;

      // take it to correct position
      heapify(0);
      
    }

    void heapify(int index){

        int largest = index;
        int left = index * 2  + 1;
        int right = index * 2 + 2;

        if(left < size && arr[left] > arr[largest]){
          largest = left;
        }
        if(right < size && arr[right] > arr[largest]){
          largest = right;
        }

        if(largest != index){
          int temp = arr[largest];
          arr[largest] = arr[index];
          arr[index] = temp;
          heapify(largest);
        }
    }

    void print() {
      for (int i = 0; i < size; i++) {
        System.out.print(arr[i] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {

    Heap h = new Heap(10);
    h.insert(50);
    h.insert(55);
    h.insert(53);
    h.insert(52);
    h.insert(54);
    h.insert(4);
    h.print();
    h.delete();
    h.print();

  }
}
