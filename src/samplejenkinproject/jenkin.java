package samplejenkinproject;

public class jenkin {

	    public static void main(String[] args) {
	        // Creating a string
	        String greeting = "Hello, Java!";

	        // Displaying the string
	        System.out.println(greeting);

	        // Concatenating strings
	        String firstName = "John";
	        String lastName = "Doe";
	        String fullName = firstName + " " + lastName;
	        System.out.println("Full Name: " + fullName);

	        // String length
	        int length = greeting.length();
	        System.out.println("Length of the greeting: " + length);

	        // Accessing characters in a string
	        char firstChar = greeting.charAt(0);
	        System.out.println("First character: " + firstChar);

	        // Substring
	        String substring = greeting.substring(0, 5);
	        System.out.println("Substring: " + substring);

	        // Checking if a string contains a specific substring
	        boolean containsJava = greeting.contains("Java");
	        System.out.println("Contains 'Java': " + containsJava);

	        // Converting to uppercase and lowercase
	        String uppercaseGreeting = greeting.toUpperCase();
	        String lowercaseGreeting = greeting.toLowerCase();
	        System.out.println("Uppercase: " + uppercaseGreeting);
	        System.out.println("Lowercase: " + lowercaseGreeting);
	    }
	}


