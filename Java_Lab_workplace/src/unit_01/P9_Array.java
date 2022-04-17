
package unit_01;
import java.util.*;
/* Tasks given below:
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array); 
		obj.removeElementInArray(array);//(Optional)
 */
public class P9_Array {
	public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5, 4, 6, 2, 3 };

        QuestionsOnArray obj = new QuestionsOnArray();
        obj.sortAnArray(array);
        obj.findTheDuplicateElements(array);
        obj.findSecondLargestAndSecondSmallestElement(array);
        obj.leftRotationInAnArray(array);
        obj.removeElementInArray(array); // (Optional)

    }

}
class QuestionsOnArray {

    void sortAnArray(int[] arr) {
        // write code here!
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    void findTheDuplicateElements(int[] arr) {
        // write code here!
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate element is: " + arr[i]);
                }
            }
        }
    }

    void findSecondLargestAndSecondSmallestElement(int[] arr) {
        // write code here!
        int largest = arr[0];
        int secondLargest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Second largest element is: " + secondLargest);
    }

    void leftRotationInAnArray(int[] arr) {
        // write code here!
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
        System.out.println("Left rotated array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println('\n');
    }

    void removeElementInArray(int[] arr) {
        // write code here!
        int elementToBeRemoved = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementToBeRemoved) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = 0;
            }
        }
        System.out.println("Array after removing element: ");
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
