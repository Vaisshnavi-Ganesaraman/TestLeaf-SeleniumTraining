package assignments.day2;

public class FrequencyOfElementsInArrays {

	public static void main(String[] args) {

		int[] arr = { 3, 4, 2, 5, 1, 2, 6, 3, 6, 2, 4, 7, 1 };
		int[] frequencies = new int[arr.length];
		int count=1, visited=-1;

		for (int i = 0; i < arr.length; i++) {
			if (frequencies[i] != -1) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						frequencies[j] = visited;
						count++;
					}					
				}
					frequencies[i]=count;
					count=1;
			}
		}
		for (int i = 0; i < frequencies.length; i++) {
			if(frequencies[i]==-1) {
				continue;
			}
			System.out.println("The element "+arr[i]+" occured "+frequencies[i]+" times.");
		}
		
	}
}