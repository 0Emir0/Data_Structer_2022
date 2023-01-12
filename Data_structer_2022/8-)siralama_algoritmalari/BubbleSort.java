import java.util.Random;

public class BubbleSort {
  public static void main(String[] args) {

    Random rand = new Random();
    int[] numbers = new int[10];
    
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = rand.nextInt(100);
    }
    
    System.out.print("Sıralanmadan önce:");
    printArray(numbers);
    
    boolean swappedSomething = true;
    
    while (swappedSomething) {
      swappedSomething = false;
      
      for (int i = 0; i < numbers.length - 1; i++) {
        if (numbers[i] > numbers[i + 1]) {
          swappedSomething = true;
          int temp = numbers[i];
          numbers[i] = numbers[i + 1];
          numbers[i + 1] = temp;
        }
      }
    }

    
    System.out.print("\nSıralanmış hali  :");
    printArray(numbers);
  }

  private static void printArray(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(" "+numbers[i]);
    }
  }
}