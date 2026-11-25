//// Task 1
//public class Main {
//    public static void main(String[] args) {
//        int[] numbers = {5, -3, 8, -1, 0, 12, -7, 4, 9, -2};
//        int replacements = 0;
//
//        System.out.print("Original: ");
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//        System.out.println();
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] < 0) {
//                numbers[i] = 0;
//                replacements++;
//            }
//        }
//
//        System.out.print("Modified: ");
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//        System.out.println();
//
//        System.out.println("Replacements: " + replacements);
//    }
//}
// Task 2
//public class Main {
//    public static void main(String[] args) {
//        int[] numbers = {10, 25, 8, 30, 15, 30};
//
//        System.out.print("Array: ");
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//        System.out.println();
//
//        int largest = numbers[0];
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[i] > largest) {
//                largest = numbers[i];
//            }
//        }
//
//        boolean foundSecond = false;
//        int secondLargest = 0;
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] < largest) {
//                if (!foundSecond || numbers[i] > secondLargest) {
//                    secondLargest = numbers[i];
//                    foundSecond = true;
//                }
//            }
//        }
//
//        System.out.println("Largest: " + largest);
//        if (foundSecond) {
//            System.out.println("Second largest: " + secondLargest);
//        } else {
//            System.out.println("No second largest distinct number.");
//        }
//    }
//}
// Task 3
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        int[] numbers = {10, 20, 30, 40, 50};
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Original: ");
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//        System.out.println();
//
//        System.out.print("Enter index to remove: ");
//        int index = scanner.nextInt();
//
//        if (index < 0 || index >= numbers.length) {
//            System.out.println("Invalid index.");
//            scanner.close();
//            return;
//        }
//
//        for (int i = index; i < numbers.length - 1; i++) {
//            numbers[i] = numbers[i + 1];
//        }
//
//        System.out.print("Updated: ");
//        for (int i = 0; i < numbers.length - 1; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//        System.out.println();
//
//    }
//}
// Task 4
//public class Main {
//    public static void main(String[] args) {
//        int[] numbers = {4, 7, 2, 4, 9, 7, 1, 2, 8, 4};
//
//        System.out.print("Array: ");
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//        System.out.println();
//
//        boolean hasDuplicates = false;
//        System.out.print("Duplicate numbers: ");
//
//        for (int i = 0; i < numbers.length; i++) {
//            boolean alreadyPrinted = false;
//            for (int k = 0; k < i; k++) {
//                if (numbers[k] == numbers[i]) {
//                    alreadyPrinted = true;
//                    break;
//                }
//            }
//
//            if (alreadyPrinted) {
//                continue;
//            }
//
//            int count = 0;
//            for (int j = 0; j < numbers.length; j++) {
//                if (numbers[j] == numbers[i]) {
//                    count++;
//                }
//            }
//
//            if (count > 1) {
//                System.out.print(numbers[i] + " ");
//                hasDuplicates = true;
//            }
//        }
//
//        if (!hasDuplicates) {
//            System.out.print("No duplicate numbers.");
//        }
//        System.out.println();
//    }
//} 😭😭