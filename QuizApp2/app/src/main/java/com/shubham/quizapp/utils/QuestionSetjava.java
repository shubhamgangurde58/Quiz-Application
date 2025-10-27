package com.shubham.quizapp.utils;

public interface QuestionSetjava {

    String question1[] = {

            "1. Who invented the Java programming language?",
            "2. In which year was the Java programming language invented?",
            "3. Which of the following is an immediate subclass of the Panel class?",
            "4. In which memory a String is stored, when we create a string using new operator?",
            "5. Which of the following is a marker interface?",

            "6. Which of the following option leads to the portability and security of Java?",
            "7. Which of the following is not a Java features?",
            "8.  _____ is used to find and fix bugs in the Java programs.",
            "9. Which of the following tool is used to generate API documentation in HTML format from doc comments in source code?",
            "10. Which of the following for loop declaration is not valid?",
    };

    String question2[] = {
            "1. Which of the following is a valid declaration of a string in Java?",
            "2. Which method is used to find the length of a string in Java?",
            "3. What is the result of the following Java code?\nString str = \"Java\";\nstr = str.concat(\" Programming\");\nSystem.out.println(str);",
            "4. Which of the following methods is used to convert a string to lowercase in Java?",
            "5. Which of the following is true about the String class in Java?",
            "6. What does the equals() method in the String class do?",
            "7. What is the output of the following code?\nString s1 = \"Hello\";\nString s2 = \"hello\";\nSystem.out.println(s1 == s2);",
            "8. Which method is used to extract a substring in Java?",
            "9. Which of the following methods in the String class returns a character at a specified index?",
            "10. What does the replace() method in the String class do?",
    };

    String question3[]={

            "1. What is the default value of a boolean variable in Java?",
            "2. Which of the following is the correct way to create an object of a class in Java?",
            "3. Which keyword is used to prevent method overriding in Java?",
            "4. Which of the following is not a valid data type in Java?",
            "5. What will be the output of the following code: System.out.println(2 + 3 + 'A');",
            "6. Which method is used to start a thread in Java?",
            "7. Which collection class does not allow duplicate elements?",
            "8. Which of the following is used to declare an array in Java?",
            "9. Which of the following statements is true about Java?",
            "10. Which of the following is a feature of Java?"

    };

    String answer1[] = {

            "James Gosling",
            "1991",
            "Applet class",
            "Heap memory",
            "Remote interface",

            "Bytecode is executed by JVM",
            "Use of pointers",
            "JDB",
            "Javadoc tool",
            "for ( int i = 99; i >= 0; i / 9 )",

    };


    String answer2[] = {
            "String s = \"Hello\";",
            "length()",
            "Java Programming",
            "toLowerCase()",
            "Strings are immutable in Java.",
            "Compares two strings lexicographically.",
            "false",
            "substring()",
            "charAt()",
            "Replaces all occurrences of a character or substring with another.",
    };

    String answer3[]={

            "false",
            "ClassName obj = new ClassName();",
            "final",
            "integer",
            "53",
            "start()",
            "HashSet",
            "Both A and B",
            "Java is platform independent.",
            "All of the above" ,
    };

    String option1[] = {

            "Dennis Ritchie","Bjarne Stroustrup","James Gosling","Guido van Rossum",
            "1985","1991","1995","2000",
            "Applet class","Window class","Frame class","Dialog class",
            "Stack","String memory","Heap memory","Random storage space",
            "Runnable interface","Remote interface","Readable interface","Result interface",

            "Bytecode is executed by JVM","The applet makes the Java code secure and portable","Use of exception handling","Dynamic binding between objects",
            "Dynamic","Architecture Neutral","Use of pointers","Object-oriented",
            "JVM","JRE","JDK","JDB",
            "javap tool","javaw command","Javadoc tool","javah command",
            "for ( int i = 99; i >= 0; i / 9 )","for ( int i = 7; i <= 77; i += 7 )","for ( int i = 20; i >= 2; - -i )","for ( int i = 2; i <= 20; i = 2* i )",

    };

    String option2[] = {
            "String s = \"Hello\";","String s = 'Hello';","string s = \"Hello\";", "String s = new String();",
            "length()","getLength()", "size()", "getSize()",
            "Java","Java Programming","Programming Java","Error",
            "toLowerCase()","toLower()","convertToLower()","lowercase()",
            "Strings are mutable in Java.","Strings are immutable in Java.","Strings are both mutable and immutable.","None of the above.",
            "Compares two strings lexicographically.","Compares two strings by reference.","Checks if two strings are anagrams.","Converts a string to uppercase.",
            "true","false","NullPointerException","Error",
            "substring()","subString()","c)extract()", "d) getSubstring()",
            "charAt()","getChar()", "c) characterAt()", "d) indexOfChar()",
            "Replaces all occurrences of a character or substring with another.","Replaces a specific character in the string.","Replaces the first occurrence of a character.","None of the above.",
    };

    String option3[]={

            "true", "false", "null", "0",
            "new ClassName();", "ClassName obj = new ClassName();", "ClassName obj = ClassName();", "ClassName obj = new();",
            "final", "static", "private", "protected",
            "int", "integer", "float", "real",
            "5", "53", "55", "A5",
            "start()", "run()", "execute()", "init()",
            "HashSet", "ArrayList", "LinkedList", "Vector",
            "int[] arr = new int[5];", "int arr[] = new int[5];", "Both A and B", "None of the above",
            "Java is platform dependent.", "Java is platform independent.", "Java is both platform dependent and independent.", "None of the above.",
            "Multithreading", "Garbage Collection", "Object-Oriented", "All of the above" ,
    };


}
