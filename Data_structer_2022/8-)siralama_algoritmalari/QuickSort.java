import java.util.Random;

public class QuickSort {

  public static void main(String[] args) {
    Random rand = new Random();
    int[] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = rand.nextInt(100);
    }

    System.out.println("Önceki Hali:");
    printArray(numbers);

    quicksort(numbers);

    System.out.println("\nSıralanmış Hali:");
    printArray(numbers);
  }

  private static void quicksort(int[] array) {
    quicksort(array, 0, array.length - 1);
  }

  private static void quicksort(int[] array, int lowIndex, int highIndex) {

    if (lowIndex >= highIndex) {
      return;
    }

    int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
    int pivot = array[pivotIndex];
    swap(array, pivotIndex, highIndex);

    int leftPointer = partition(array, lowIndex, highIndex, pivot);

    quicksort(array, lowIndex, leftPointer - 1);
    quicksort(array, leftPointer + 1, highIndex);

  }

  private static int partition(int[] array, int lowIndex, int highIndex, int pivot) {
    int leftPointer = lowIndex;
    int rightPointer = highIndex - 1;

    while (leftPointer < rightPointer) {

      // pivottan daha küçük eleman bulana kadar sol tarafta arama
      while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
        leftPointer++;
      }

      // pivottan daha küçük eleman bulana kadar sağ tarafta arama
      while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
        rightPointer--;
      }

      swap(array, leftPointer, rightPointer);
    }

    if(array[leftPointer] > array[highIndex]) {
      swap(array, leftPointer, highIndex);
    }
    else {
      leftPointer = highIndex;
    }
    
    return leftPointer;
  }

  private static void swap(int[] array, int index1, int index2) {
    int temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
  }

  private static void printArray(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i]+" ");
    }
  }
}