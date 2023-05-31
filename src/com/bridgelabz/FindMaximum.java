package com.bridgelabz;

    public class FindMaximum<T extends Comparable<T>>
    {
        private T value1;
        private T value2;
        private T value3;

        public FindMaximum(T value1, T value2, T value3)
        {
            super();
            this.value1 = value1;
            this.value2 = value2;
            this.value3 = value3;
        }

        public void findMax()
        {
            findMaximum(this.value1, this.value2, this.value3);
        }

        public static <T extends Comparable<T>> void findMaximum(T value1, T value2, T value3)
        {
            T maximum = value1;
            if (maximum.compareTo(value2) < 0)
            {
                maximum = value2;
            }
            if (maximum.compareTo(value3) < 0 )
            {
                maximum = value3;
            }
            System.out.println("The Maximum is "+ maximum);
        }

        public static void main(String[] args)
        {
            Integer number1 = 30;
            Integer number2 = 10;
            Integer number3 = 80;

            Double doubleNumber1 = 20.53;
            Double doubleNumber2 = 30.40;
            Double doubleNumber3 = 80.90;

            String fruit1 = "Apple";
            String fruit2 = "Banana";
            String fruit3 = "Peach";

            FindMaximum<Integer> integer = new FindMaximum<Integer>(number1,number2,number3);
            integer.findMax();
            FindMaximum<Double> floatingNumber = new FindMaximum<Double>(doubleNumber1,doubleNumber2,doubleNumber3);
            floatingNumber.findMax();
            FindMaximum<String> stringValue  = new FindMaximum<String>(fruit1,fruit2,fruit3);
            stringValue.findMax();

        }}

