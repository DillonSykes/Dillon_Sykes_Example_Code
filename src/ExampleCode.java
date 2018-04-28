/**
 * @author Dillon Sykes
 * @date 4/27/2018
 * @version 1.0.0
 * This class is example code for Developers to better understand my coding ability.
 */
public class ExampleCode {

    /**
     * #1 Print the number of integers in an array that are above the given input and the number that are below,
     * e.g. for the array [1, 5, 2, 1, 10] with input 6, print “above: 1, below: 4”.
     * @param inputArray the array used to determine which are integers are above and below .
     * @param input the integer that will be our decision maker.
     * @return a String with the number of above or below (Ex. “above: 1, below: 4”).
     */
    public static String printAboveBelow(Integer [] inputArray, Integer input){
        int above = 0;
        int below = 0;
        for (int i : inputArray) {
            if (i < input) {
                below++;
            } else if (i > input) {
                above++;
            }
        }
        return "above: " + above + ", below: " + below;
    }

    /**
     * #2  Rotate the characters in a string by a given input and have the overflow appear at the beginning,
     * e.g. “MyString” rotated by 2 is “ngMyStri”.
     * @param inputString String that will be rotated.
     * @param limToRotate integer that will determine rotation criteria.
     * @return the rotated string.
     */
    public static String rotateChars(String inputString, Integer limToRotate){
        String firstPart = inputString.substring(inputString.length() - limToRotate, inputString.length());
        String secondPart = inputString.substring(0, inputString.length() - limToRotate);
        return firstPart + secondPart;
    }
}
