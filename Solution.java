import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        //1.sum of array.
        System.out.println("Solution 1 :");
        sumOfArr(new int [] {1,2,3,4,5});
        System.out.println();

        //2.largest element of the array
        System.out.println("Solution 2 :");
        largestElementOfArra(new int[] {1, 4 , 5 , 3 , 7});
        System.out.println();

        //3.Even or Odd number
        System.out.println("Solution 3 :");
        checkEvenOrOdd(8) ;
        System.out.println();

        //4.Reserve an arra
        System.out.println("Solution 4 :");

        reverseAnArray(new int [] {1,2,3,4,5,69});
        System.out.println();


        //5.Factorial
        System.out.println("Solution 5 :");

        factCalculation(10);
        System.out.println();

        //6.Palindrome check
        System.out.println("Solution 6 :");

        if (checkPalindrome("mam")) {
            System.out.println("palindrome.");
        } else {
            System.out.println("is not palindrome.");
        }
        System.out.println();

        //7.check prime number.
        System.out.println("Solution 7 :");

        if (isPrime(5)) {
            System.out.println("Prime number.");
        }else {
            System.out.println("Not a prime number.");
        }
        System.out.println();


        //8.Fibonacchi series.
        System.out.println("Solution 8 :");

        System.out.print("Fibonacchi Series 10th : ");
        fiboSeries(10);
        System.out.println();

        //9.Linear Search algorithm
        System.out.println("Solution 9 :");

        if (linearSearch(new int[] {1,2,3,4,5,6})==1) {
           System.out.println("item is found.");
       } else System.out.println("item is not found.");
        System.out.println();


       //10.binary search
        System.out.println("Solution 10 :");

        System.out.println("\nbinary search algorithm : ");
        binary_search(new int[] {1,2,3,4,5}, 4);
        System.out.println();

        //11.duplicate element of arr and print;
        System.out.println("Solution 11 :");

        System.out.print("Duplicate element of arr :");

        duplicateElement(new int[] {1, 2, 3, 4, 5, 2, 6, 7, 8, 9, 10, 1});
        System.out.println();



        //12.count vowel and constrant
        System.out.println("Solution 12:");
        countVowelsConsonants("Hello Programmer");
        System.out.println();

        //13Mul.Table
        System.out.println("Solution 13 :");

        System.out.println();
        multiplicationTable(10);
        System.out.println();


        //14.Sum of two matrices.
        System.out.println("Solution 14 :");

        System.out.println();
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrix2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        sumOfTwoMatrix(matrix1, matrix2);
        System.out.println();

        //15.calculate average of arr.
        System.out.println("Solution 15 :");

        calculateAgvOfArr(new int[] { 1,2,3,4});
        System.out.println();



        //16.check leap year.
        System.out.println("Solution 16 :");

        if (isLeapYear(2002)) {
            System.out.println("leap year.");
        } else {
            System.out.println("is not a leap year.");
        }
        System.out.println();



        //18.String reverse
        System.out.println("Solution 18 :");

        reverseStr("Hafizur rahman arfin vaiya");
        System.out.println();


        //19.armstrongNumber
        System.out.println("Solution 19 :");

        if (isArmstrongNumber(153)) {
            System.out.println("armstrong number.");
        } else {
            System.out.println("is not a armstrong number.");
        }
        System.out.println();


        //20.find a min and max num of arr
        System.out.println("Solution 20 :");

        findMinAndMaxNumberOfArray(new int[] {3,4,5,6,1,2});

        System.out.println();



        //21.Calculate the simple interest for given principal, rate of interest, and time.
        System.out.println("Solution 21 :");
        double simpleInterest = calculateSimpleInterest(2500.00,10,5);
        System.out.println("simple interest : " + simpleInterest);

        System.out.println();


        //22.Write a program to convert temperatures from Celsius to Fahrenheit and vice versa.
        System.out.println("Solution 22 :");

        Random random = new Random();
        double temperature = random.nextDouble() * 100;
        char scale = (random.nextBoolean()) ? 'C' : 'F';
        if (scale == 'C') {
            System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(temperature));
        } else if (scale == 'F') {
            System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(temperature));
        } else {
            System.out.println("Invalid scale. Please enter 'C' or 'F'.");
        }
        System.out.println();


        //22.Write a program that checks whether the input character is an uppercase letter, lowercase letter, a digit, or a special 24. character.
        System.out.println("Solution 23 :");

        checkCharacterType('4');

        System.out.println();



        //24.Write a program to find the second largest number in a given array.

        System.out.println("Solution 24 :");
        int secondLargest = findSecondLargest(new int[] {1,2,3,4,5,6});
        System.out.println("Second largest number  : " + secondLargest);
        System.out.println();


        //25. Given a string containing both letters and numbers, find the sum of all the numbers in the string.
        System.out.println("Solution 25 :");

        int sumOfNumbers = calculateSumOfNumbers("345EGg4");
        System.out.println("sum of number in string  : " + sumOfNumbers);

    }

    private static int findSecondLargest(int[] arr) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : arr) {
            if (number > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = number;
            } else if (number > secondLargest && number < firstLargest) {
                secondLargest = number;
            }
        }

        return secondLargest;
    }

    private static void checkCharacterType(char ch) {
        if (Character.isUpperCase(ch)) {
            System.out.println("Uppercase letter");
        } else if (Character.isLowerCase(ch)) {
            System.out.println("Lowercase letter");
        } else if (Character.isDigit(ch)) {
            System.out.println("Digit");
        } else {
            System.out.println("Special character");
        }




    }

    private static int calculateSumOfNumbers(String str) {
        int sum = 0 ;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += c - '0';
            }
        }
        return sum ;
    }


    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    private static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    private static void findMinAndMaxNumberOfArray(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0 ; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }

            if (min >= arr[i]) {
                min = arr[i] ;
            }
        }

        System.out.println("Minimum value of arr : " + min);
        System.out.println("Maximum value of arr : " + max);
    }


    private static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;
        int numDigits = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }

        return sum == originalNumber;
    }

    private static void reverseStr(String s) {
        String ans = "";
        for (int i = s.length() -1; i >= 0 ; i --) {
            ans += s.charAt(i);
        }

        System.out.println("Reverse of String : " + ans);
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private static void calculateAgvOfArr(int[] arr) {
        int  sum = 0 ;
        for (int x : arr) {
            sum += x ;
        }

        float avg = 0.0F;
        avg = (float) sum / arr.length ;
        System.out.printf ("Sum of Arr :  %.2f" , avg);
    }

    private static void sumOfTwoMatrix(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int [][] ans = new int[rows][columns];

        for (int i = 0 ; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                ans[i][j] = matrix1[i][j] + matrix2[i][j] ;
            }
        }
        System.out.println("Sum of two Matrix :");
        for (int [] row : ans) {
            for (int x : row) {
                System.out.print(x + "\t");
            }
            System.out.println();
        }

    }

    private static void multiplicationTable(int n) {
        System.out.println("\t\t..........Multiplication Table..........");
        for (int i = 1; i <= n; i++) {
            System.out.print("\t " +  i);
            for (int j = 1; j <= n; j++) {
                System.out.print("\t" + ( i * j));
            }
            System.out.println();
        }
    }

    private static void countVowelsConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;


        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);


            if (Character.isLetter(ch)) {

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Vowel count: " + vowelCount);
        System.out.println("Consonant count: " + consonantCount);
    }

    private static void duplicateElement(int[] arr) {

        for (int i = 0 ; i < arr.length - 1; i = i + 1 ) {
            for (int j = i + 1; j < arr.length; j = j + 1) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }

    private static void binary_search(int[] arr, int item) {
        int h = arr.length - 1;
        int l = 0;

        while (l <= h) {
            int mid = (l + h) / 2 ;
            if (arr[mid] == item) {
                System.out.println("item is found.");
                return;
            }else if (arr[mid] < item) {
                l = mid + 1 ;
            } else {
                h = mid - 1 ;
            }
        }
        System.out.println("itme is not found.");
    }

    private static int  linearSearch(int[] arr) {
        System.out.print("arr is : ");
        for (int x : arr) System.out.print(x + " ");
        System.out.println("Search item 4 :");
        for (int x : arr) {
            if (x == 4) {
                return  1;
            }
        }
        return -1;
    }

    private static void fiboSeries(int n) {
        int [] series = new int[n];
        series[0] = 0;
        series[1] = 1;

        for (int i = 2 ; i < series.length ; i++) {
            series[i] = series[i -1] + series [ i - 2] ;
        }

        for (int x : series )   System.out.print(x + " ");
        System.out.println();
    }


    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n %2 == 0 ) {
            return false;
        } else {
            int sqrt_N = (int) Math.sqrt(n);
            for (int i = 3; i <= sqrt_N ; i = i + 2) {
                if (n % i == 0 ) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkPalindrome(String x) {
        boolean isPalindrome = true;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) != x.charAt(x.length()-i-1)) {
                isPalindrome = false;
            }
        }
        return isPalindrome ? true : false;
    }

    private static void factCalculation(int n) {
        int factorial = 1 ;
        for (int x = 1 ; x <= n; x = x + 1) {
            factorial  = factorial * x;
        }

        System.out.println("\nthe factorial of : " + factorial);

    }

    private static void reverseAnArray(int[] arr) {
        for (int i = arr.length -1 ; i >= 0 ; i--) {
            System.out.print(arr[ i] + " ");
        }
    }

    private static void checkEvenOrOdd(int n) {
         String ans = (n & 1) == 0 ? "Even" : "Odd";
         System.out.println(n + " is a " + ans + " number.");
    }

    private static void largestElementOfArra(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int x : arr ) {
            if ( x >= max) {
                max = x ;
            }

        }
        System.out.println("Max element of arr : " + max);

    }

    private static void sumOfArr(int[] arr) {
        int sum = 0 ;
        for (int x : arr) {
            sum += x ;
        }
        System.out.println("Sum of array : " + sum);
    }

}
