package com.globallogic.conditionsloops;

public class Task {

    /* https://www.e-olymp.com/en/problems/902
    Determine the level of educational achievements for the pupil (elementary, average, sufficient, high) according to the given grade (from 1 to 12).

    Input
        One number that is a grade for the pupil.

    Output
        Print Initial for elementary level (grade from 1 to 3), Average for average level (grade from 4 to 6), Sufficient for sufficient level (grade from 7 to 9) and High for high level (grade from 10 to 12).
    */
    public String levelEducationAchievements(int grade) {
        switch (grade) {
            case 1:
            case 2:
            case 3:
                return "Initial";
            case 4:
            case 5:
            case 6:
                return "Average";
            case 7:
            case 8:
            case 9:
                return "Sufficient";
            case 10:
            case 11:
            case 12:
                return "High";
            default:
                System.out.println("Don't know such grade, range from 1 to 12");
        }
        return null;
    }

    /* https://www.e-olymp.com/en/problems/923
    Determine the season name by the month number using the compound conditions.

    Input
        The number of the month.

    Output
        For spring months print Spring, for summer - Summer, for autumn - Autumn and for winter - Winter.
     */
    public String season(int month) {
        switch (month) {
            case 3:
            case 4:
            case 5:
                return "Spring";
            case 6:
            case 7:
            case 8:
                return "Summer";
            case 9:
            case 10:
            case 11:
                return "Autumn";
            case 1:
            case 2:
            case 12:
                return "Winter";
            default:
                System.out.println("Don't know such month, range from 1 to 12");
        }
        return null;
    }

    /* https://www.e-olymp.com/en/problems/107
    Blank compact discs are on sale in packages of three kinds. A package with 100 disсs costs 100 UAH, one with 20 discs costs 30 UAH, and one disс costs 2 UAH. What minimal sum of money should you pay to buy n such disсs?

    Input
        The natural number n (n ≤ 1000).

    Output
        Print the minimal sum to buy n disсs.
 */
    public int compactDiscs(int numberOfDiscs) {
        int Pack_1 = 1;
        int Pack_1Costs = 2;

        int Pack_20 = 20;
        int Pack_20Costs = 30;

        int Pack_100 = 100;
        int Pack_100Costs = 100;

        int numberCosts = 0;

        if (numberOfDiscs >= Pack_100) {
            int numOf100 = 0;
            numOf100 = numberOfDiscs / Pack_100;
            numberOfDiscs = numberOfDiscs - (numOf100 * Pack_100);
            numberCosts = numOf100 * Pack_100Costs;
        }

        if (numberOfDiscs >= Pack_20) {
            int numOf20 = 0;
            numOf20 = numberOfDiscs / Pack_20;
            numberOfDiscs = numberOfDiscs - (numOf20 * Pack_20);
            numberCosts += numOf20 * Pack_20Costs;
        }

        if (numberOfDiscs >= Pack_1) {
            int numOf1 = 0;
            numOf1 = numberOfDiscs / Pack_1;
            numberOfDiscs = numberOfDiscs - (numOf1 * Pack_1);
            numberCosts += numOf1 * Pack_1Costs;
        }

        return numberCosts;
    }

    /* https://www.e-olymp.com/en/problems/918
    Which quarter?
        It set a point with co-ordinates х and y. Define, in what co-ordinate quarter it is located.

    Input
        In a unique line through a blank 2 material numbers - co-ordinates of a point are set, value of co-ordinates on the module do not exceed 100.

    Output
        The singular is the number of a corresponding quarter, or 0 if unequivocally define a quarter it is impossible.
     */
    public int whichQuarter(int x, int y) {
        if (x == 0 || y == 0) {
            return 0;
        }

        if (x > 0) {
            if (y > 0) {
                return 1;
            } else {
                return 4;
            }
        } else {
            if (y > 0) {
                return 2;
            } else {
                return 3;
            }
        }
    }

    /*https://www.e-olymp.com/en/problems/903
    First or last?
        Three digit number is given. What digit is bigger: the first digit or the last digit?

    Input
        One three digit number.

    Output
        Print the bigger digit between first and last. In case of equality, print "=" (without quotes).
    */
    public String firstOrLast(int number) {
        String lineNumber = "" + number;

        String firstChar = lineNumber.substring(0, 1);
        String lastChar = lineNumber.substring(lineNumber.length() - 1);

        int first = new Integer(firstChar);
        int last =  new Integer(lastChar);

        if (first == last) {
            return "=";
        }

        if (first > last) {
            return firstChar;
        }

        return lastChar;
    }

    /*https://www.e-olymp.com/en/problems/108
    Median number
        Three different numbers a, b, c are given. Print the median number.

    Input
        Integers a, b, c that do not exceed 1000 by absolute value.

    Output
        Print the median among three numbers.
     */
    public int medianNumber(int a, int b, int c) {
        int medianNum = (a + b + c) / 3;

        return medianNum;
    }

    /*https://www.e-olymp.com/en/problems/906
    Product of digits
        Three digital number is given. Find the product of its digits.

    Input
        One three digital positive integer n.

    Output
        Print the product of digits in n.
     */
    public int productOfDigits(int digit) {
        String stringOfDigits = "" + digit;
        String[] arrStringOfDigits = stringOfDigits.split("");

        int product = 1;

        for (int i = 0; i < arrStringOfDigits.length; i++) {
            product *= new Integer(arrStringOfDigits[i]);
        }

        return product;
    }

    /*https://www.e-olymp.com/en/problems/2
    Digits
        Find the number of digits in a nonnegative integer n.

    Input
        One nonnegative integer n (0 ≤ n ≤ 2 *109).

    Output
        Print the number of digits in number n.
     */
    public int numberOfDigits(int digit) {
        String lineOfDigits = "" + digit;
        return lineOfDigits.length();
    }
}
