// import java.util.Scanner;

class Arrays {
  
    public static void main(String[] args) {

        //  question 1
        // float[] arr = new float[5];
        // int sum =0;

        // // Initializing the `arr` array
        // for (int i = 0; i < 5; i++) {
        //     arr[i] = i + 1; // Assign values 1, 2, 3, 4, 5 to the `arr` array
        //     System.out.println("Element at index " + i + " in arr is " + arr[i]);
        // }

        // // Adding values of `arr` to `sum`
        // for (int i = 0; i < 5; i++) {
        //     sum += arr[i]; // Add values from `arr` to `sum`
        // }

        // System.out.println(sum);


    // question 2
    // Scanner input = new Scanner(System.in);

    //     // Taking array input
    //     System.out.print("Enter the size of the array: ");
    //     int size = input.nextInt();

    //     int[] arr = new int[size]; // Creating an array of the given size
    //     System.out.println("Enter " + size + " elements for the array:");

    //     for (int i = 0; i < size; i++) {
    //         arr[i] = input.nextInt(); // Reading elements into the array
    //     }

    //     // Taking key input
    //     System.out.print("Enter the key to search: ");
    //     int key = input.nextInt();

    //     // Close the scanner
    //     input.close();

    //     // implementation of the code
    //     boolean found = false;
    //      for (int index = 0; index <arr.length; index++) {
    //         if (arr[index]==key) {
    //             found = true;
    //             System.out.println("Element found at index: " + index);
    //             break;
    //         }
           
    //      }
    //      if (!found) {
    //         System.out.println("Element not found at any index");

    //      }

    // Question 5 Reverse an Array

    int[] arr = {1, 4, 6, 8, 9};
//     int start = 0;
//     int end = arr.length - 1;

    
//     while (start < end) {

//         int temp = arr[start];
//         arr [start] = arr[end];
//         arr[end] = temp;

//         start++;
//         end--;
//     }
// for (int i : arr) {
//     System.out.println(i);
// }

     
    // Question 6 Find the  largest number in an array
//    int maximumNumber =arr[0];

//    for (int i = 0; i < arr.length; i++) {
//     if (arr[i] > maximumNumber) {
//         maximumNumber = arr[i];
//     }
//    }
// System.out.println("maximumNumber: " + maximumNumber);

// question 7 minimun number

// int minimumNumber =arr[0];

//    for (int i = 0; i < arr.length; i++) {
//     if (arr[i] < minimumNumber) {
//         minimumNumber = arr[i];
//     }
//    }
//    System.out.println(minimumNumber);
//     }

// write a pogram to find tht array is sorted or not

boolean isSorted = true; // Assume array is sorted initially

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false; // Found an unsorted pair
                break;
            }
        }

        if (isSorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }

}
}