package sess05_arrays_and_strings;

public class StringMethodDemo {
    public static void main(String[] args) {
        //Sample string
        String s1 = "Java", s2="programming";
        String s3 = "hamburger", s4 = "urge";
        System.out.println("---------STRING CLASS DEMO--------");

        // 1. length() -> returns the number characters in a string
        System.out.println("1. \tlength");
        System.out.println("\'" + s1 + "\' has " + s1.length() + " characters");
        System.out.println("\'" + s2 + "\' has " + s2.length() + " characters\n");

        // 2. charAt() -> returns the the character at a given position in a string
        System.out.println("2. \tcharAt");
        System.out.println("Character at index 1 in " + s1 + " is " + s1.charAt(1) + "'.");
        System.out.println("Character at index 4 in " + s2 + " is " + s2.charAt(4) + "'.\n");

        // 3. charAt() -> returns the string in lowercase
        System.out.println("3. \ttoUpper");
        System.out.println("\'" + s1 + " to lowercase " + s1.toUpperCase());
        System.out.println("\'" + s2 + " to lowercase " + s2.toUpperCase() + ".\n");

        // 4. charAt() -> returns the string in uppercase
        System.out.println("4. \ttoLower");
        System.out.println("\'" + s1 + " to lowercase " + s1.toLowerCase());
        System.out.println("\'" + s2 + " to lowercase " + s2.toLowerCase() + ".\n");

        // 5. equals() -> checks exact equality ( Case sensitive )
        System.out.println("5. \tequals");
        System.out.println("Does '" + s1 + "' equal 'Java'" + s1.equals("Java"));
        System.out.println("Does '" + s1 + "' equal 'java'" + s1.equals("java") + ".\n");

        //6. equalsIgnoreCase -> checks equality without considering Case
        System.out.println("6. \tequalsIgnoreCase");
        System.out.println("");
        System.out.println();

        //7. compareTo() -> lexicographically compare strings
        System.out.println("7. \tcompareTo()");
        System.out.println("'" +s1 + "' compare to '" + s2 + "' gives: " +s1.compareTo("Java"));
        System.out.println();

        //8. substring() -> extract a portion of a string from a given index
        System.out.println("8. \tsubstring()");
        System.out.println("Substring of '" + s2 + "' from index 0 - 6: " + s2.substring(0,6));
        System.out.println("Substring of '" + s3 + "' from index 3 - 8: " + s3.substring(3,8) + ".\n");

        //9. indexOf() -> first occurrence of a character in a string
        System.out.println("9. \tindexOf()");
        System.out.println("Index of 'a' on '" +s3 + "'is: " +s3.indexOf('a'));
        System.out.println("Index of 'urge' on '" +s3 + "'is: " +s3.indexOf(s4) + ".\n");

        //10. lastIndexOf() -> last occurrence of a character in a string
        System.out.println("10. \tlastIndexOf()");
        System.out.println("Last index of 'a' on '" +s3 + "'is: " +s3.lastIndexOf('a'));
        System.out.println("Last index of 'm' on '" +s2 + "'is: " +s2.lastIndexOf('m') + ".\n");

        // 11. contains() -> check occurrence of a substring in a string
        System.out.println("11. \tcontains()");
        System.out.println("Does '" + s3 + "' contain '" + s4 + "'? " + s3.contains(s4));
        System.out.println("Does '" + s3 + "' contain 'gram'? " + s3.contains("gram") + ".\n");

        //12 startsWith(prefix) -> check if the string starts prefix
        System.out.println("12. \tstartsWith()");
        System.out.println("Does '" + s2 + "' starts with 'pro'?" + s2.startsWith("pro"));
        System.out.println("Does '" + s3 + "' starts with 'ham'?" + s2.startsWith("ham") + ".\n");

        //13 endsWith(suffix) -> check if the string starts prefix
        System.out.println("13. \tendsWith()");
        System.out.println("Does '" + s3 + "' ends with 'ger'?" + s3.startsWith("ger"));
        System.out.println("Does '" + s1 + "' ends with 'va'?" + s1.startsWith("va") + ".\n");

        //14 concat() -> combines one string to the end of another
        System.out.println("14 \tconcat");
        String combined = s1.concat(" ").concat(s2); // method chaining
        System.out.println("After concatenating '" + s1 + "' a space ' ' and '" + s2 + "', we get : '" + combined + ".\n");

        //15 replace() -> substitutes on string for another in a string
        System.out.println("15 \treplace()");
        System.out.println("Replacing 'a' with '@' in '" + s1 + "' gives : " + s1.replace("a", "@") + ".\n");
    }
}
