
public class Main{

	public static void main(String[] args) {
		
		int array[] = new int[10000];
		int target = 1453;
		
		for(int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		int index = binarySearch(array, target);
		
		if(index == -1) {
			System.out.println(target + " Bulunamadı.");
		}
		else {
			System.out.println("Eleman bulundu: " + index);
		}
		
	}

	private static int binarySearch(int[] array, int target) {
		
		int low = 0;
		int high = array.length - 1;
		
		while(low <= high) {
			
			int middle = low + (high - low) / 2;
			int value = array[middle];
			
			System.out.println("pivot: " + value);
			
			if(value < target) low = middle + 1;
			else if(value > target) high = middle - 1;
			else return middle;
		}
		
		return -1;
	}
}

