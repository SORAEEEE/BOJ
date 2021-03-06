import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		
		for(int i = 0; i<arr.length ;i++){
			arr[i] = sc.nextInt();
		}
		
		mergeSort(arr);
		
		for(int i =0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		sc.close();
	}
	
	
	//divide
	public static void mergeSort(int[] arr){
		if(arr.length ==1)
			return;
		
		int middle = arr.length/2;
		int[] leftArr = new int[middle];
		int[] rightArr = new int[arr.length - middle];
		
		for(int i = 0; i<leftArr.length;i++){
			leftArr[i] = arr[i];
		}
		for(int i =0; i<rightArr.length;i++){
			rightArr[i] = arr[middle+i];
		}
		
		mergeSort(leftArr);
		mergeSort(rightArr);
		
		merge(leftArr, rightArr, arr);
	}
	
	//conquer
	public static void merge(int[] leftArr, int[] rightArr, int[] arr){
		int leftIndex = 0;
        int rightIndex = 0;
        int mergedIndex = 0;

        while(leftIndex != leftArr.length && rightIndex != rightArr.length) {


            if(leftArr[leftIndex] < rightArr[rightIndex]) {
                arr[mergedIndex] = leftArr[leftIndex];
                mergedIndex++;
                leftIndex++;
            } else {
                arr[mergedIndex] = rightArr[rightIndex];
                mergedIndex++;
                rightIndex++;
            }

        }

        while(leftIndex != leftArr.length) {
            arr[mergedIndex] = leftArr[leftIndex];
            mergedIndex++;
            leftIndex++;
        }

        while(rightIndex != rightArr.length) {
            arr[mergedIndex] = rightArr[rightIndex];
            mergedIndex++;
            rightIndex++;
        }

	}
	
}
