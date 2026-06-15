package com.learning;




public class arrays {



    public static void main(String[] args) {
        int[] numbers2 = {3, -1, 7, 0, 9};
        int[] numbers1 = {10, 5, 8, 20, 15};
        int largest = Integer.MIN_VALUE;
        int SecondLargest = Integer.MIN_VALUE;

        for (int num1 : numbers1) {
            if (num1 > largest) {
                SecondLargest = largest;
                largest = num1;
            } else if (num1 > SecondLargest && num1 != largest) {
                SecondLargest = num1;

            }

        }
        System.out.println("SecondLargest: " + SecondLargest);


        int[] numbers = {-1, -2, -4, 5, 6, 7};
        int countPositive = 0;
        int countNegative = 0;

        for (int num : numbers) {
            if (num >= 0) {
                countPositive++;
            } else {
                countNegative++;
            }

        }
        System.out.println("count positive: " + countPositive + "countNegative: " + countNegative);

        int nums[][] = new int[3][4];


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.println(nums[i][j] + " ");
            }
            System.out.println();

            for (int n[] : nums) {
                for (int m : n) {
                    System.out.println(m + " ");
                }
                System.out.println();
            }


            {
                int[] numbe = {1, 2, 3, 4, 5};

                for (int k = 0; k < numbe.length; k++)
                    System.out.println(numbe[k]);
            }


            int[] calc = {1, 2, 3};
            int total = 0;
            {
                for (int r = 0; r < calc.length; r++) {
                    total += calc[r];

                }
            }
            System.out.println(total);


        }

        int[] num1 = new int[5];
        num1[0] = 3;
        num1[1] = 8;
        num1[2] = 1;
        num1[3] = 2;
        num1[4] = 6;

        for (int X = 0; X < num1.length; X++)

            System.out.println(num1[X]);

        int[] count = {1, 2, 3, 4, 5, 6};
        int even = 0;
        {
            for (int c = 0; c < count.length; c++) {
                if (count[c] % 2 == 0)
                    even++;
            }
        }


        System.out.println(even);

        int[] sai = {1, 2, 3, 4, 5, 6};

        for (int r = sai.length - 1; r >= 0; r--)
            if (sai[r] % 2 != 0) {
                System.out.println(sai[r]);
            }

        int[][] dimens = new int[4][4];

        for (int o = 0; o < dimens.length; o++) {
            for (int p = 0; p < dimens[o].length; p++)
                System.out.println(dimens[o][p]);


        }
        int[][] dimen = new int[2][2];
        dimen[0][0] = 2;
        dimen[0][1] = 2;
        dimen[1][0] = 2;
        dimen[1][1] = 2;
        int sum = 0;


        for (int h = 0; h < dimen.length; h++) {
            for (int y = 0; y < dimen[h].length; y++)
                sum = sum + dimen[h][y];
        }

        System.out.println(sum);

//          int result=Minimum();
//          System.out.println("Max Number: " + result );


        int[][] arr = {
                {10, 20, 30},
                {40, 50, 60}
        };

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }

        }


        numbers = new int[]{20, 30, 55, 89, 88};
        largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > largest
            ) {
                secondLargest = largest;
                largest = num;

            } else if (num > secondLargest) {
                secondLargest = num;

            }
        }
        System.out.println("secondLargest " + secondLargest);


        int array[] = {1, 2, 3, 4, 5};
        int small = array[1];
        for (int num : array) {
            if (num < small) {
                small = num;
            }

        }
        System.out.println(small);
    }

}









