public class Main {
    public static void main(String[] args) {

        // create an integer variable
        // create a second integer variable
        // create an `if` statement which compares the two variables and prints to the console if they are equal

        int numOne = 1;
        int numTwo = 1;
        if (numOne == numTwo) {
            System.out.println(numOne + " " + numTwo);

        }

        // create a string variable
        // create a second string variable which has the same value as the first
        // create an `if` statement which compares the two variables and prints to the console if they are equal
        String strOne = "Hello";
        String strTwo = "Hello";
        if (strOne.equals(strTwo)) ;
        System.out.println(strOne + " " + strTwo);

        // create an string variable using the `new` keyword
        // create a second string variable which has the same value as the first, again using the `new` keyword
        // create an `if` statement which compares the two variables and prints to the console if they are equal

        String string = new String("hi");
        String stringTwo = new String("hi");
        if (string.equals(stringTwo)) {
            System.out.println("string is " + string + " stringTwo is also " + stringTwo);
        }

        // create two `int` variables. Assign them values
        // create an `if` statement which compares whether one value is greater than the other
        // print something to the console if the condition is met
        // create an `else` statement which prints to the console if the above condition is NOT met

        int n1 = 1;
        int n2 = 1;
        if (n1 == n2) {
            System.out.println("n1 and n2 are equal");
        } else {
            System.out.println("n1 and n2 are not equal");
        }
        // create three `int` variables. Assign them values with the first value sitting between the other two
        // create an `if` statement which compares whether the first value is greater than the second AND less than the third
        // print something to the console if the condition is met
        // create an `else` statement which prints to the console if the above condition is NOT met

        //Modify your answer to Question 5 to instead use an OR operator. Play about with the values assigned to your three variables, noting how the behaviour changes.

        int num1 = 10;
        int num2 = 11;
        int num3 = 9;
        if (num1 > num2 || num1 < num2) {
            System.out.println("condition met");
        } else {
            System.out.println("condition not met");
        }
        // create a String variable and assign it a value
        // create an `if` statement which grabs the first letter of your word and compares it against a Character value
        // print something to the console if the condition is met

//        String myString = "Hello world";
//        char h = 'h';
//        if (Character.toLowerCase(myString.charAt(0)) == h) ;
//        System.out.println("condition met");


// create a String variable and assign it a value
        // create a `for` loop which wraps around your answer from Question 7
        // modify your `if` statement to check the character at each index
        // Hint: use your internal, incrementing value of your `for` loop within the `.charAt()` method
        // print something to the console if the condition is met

        String myString = "Hello world";
        Character charChecking = 'o';

        for (int i = 0; i < myString.length(); i++) {

            if (Character.toLowerCase(myString.charAt(i)) == charChecking) {
                System.out.println("condition mets");
                break;


            }


        }
    }
}


