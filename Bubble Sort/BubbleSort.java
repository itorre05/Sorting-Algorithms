public class BubbleSort {

	void bubbleSort(int[] array) {
		for(int i=0;i<array.length-1;i++) {
			for(int j=0;j<array.length-i-1;j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	
	void printArray(int[] array){ 
		for(int i=0;i<array.length;i++)
			System.out.print(array[i] + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		BubbleSort object = new BubbleSort();
		int[] array = {5,10,2,1,4,12,8};
		System.out.println("Unsorted array");
		object.printArray(array);
		System.out.println("Sorted array");
		object.bubbleSort(array);
		object.printArray(array);
	}
}
