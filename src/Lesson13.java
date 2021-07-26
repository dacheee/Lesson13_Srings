public class Lesson13 {
    public static void main(String[] args) {

        String newString = "abc";
        String newStringNew = "abc";

        String loremIpsumString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Sem viverra aliquet eget sit amet tellus cras.";

//        LENGTH : .length()

        System.out.println("Length of loremIpsumString is : " + loremIpsumString.length());

//        Character in the string : .charAT()

        System.out.println("The 4 character in loremIpsumString is : " + loremIpsumString.charAt(4) + " because it starts with an index 0");

//        Equal? : equals()

        System.out.println("They are not identical : " + newString.equals(loremIpsumString));
        System.out.println("They are identical : " + newString.equals(newStringNew));


//      Equal ignoring capital cases : equalsIgnoreCase()

        String lowerCaseName = "dace";
        String upperCaseName = "Dace";


        System.out.println("Case sensitive equals method: " + lowerCaseName.equals(upperCaseName));
        System.out.println("Case IN-sensitive equals method: " + lowerCaseName.equalsIgnoreCase(upperCaseName));

//      REGEX + Matches()
//        contains only one word and should match it

        System.out.println("This should contain word 'LOREM' " + loremIpsumString.matches("Lorem"));

//        contains the word somewhere in the text .*

        System.out.println("This should contain word 'LOREM' " + loremIpsumString.matches("Lorem.*"));

//      REGEX does it start with a word LOREM? (case sensitive)
        loremIpsumString.matches("^Lorem.*");
//      REGEX does it end with a word LOREM? (case sensitive)
        loremIpsumString.matches("Lorem$");

//      Number is String

        String numberString = "10";

//        byte-Byte, short-Short, Int-Integer, long-Long, float-Float, double-Double

        byte parsedNumberString = Byte.parseByte(numberString);

        System.out.println("Number is : " + parsedNumberString);
        System.out.println("Transformed to number and can do math with it and add 5 = " + (parsedNumberString + 5));


//        combined String
        String combinedNumbers = "15026.652 Error. Error.";
        System.out.println(combinedNumbers);
//      will not work - check errors :
//        double errorCombinedNumber = Double.parseDouble(combinedNumbers);

        String answerTrue = "True";

//        Formatting the String

        float price = 1.99235626f;

        System.out.println(String.format("The price is %.2f eur",price));











    }
}
