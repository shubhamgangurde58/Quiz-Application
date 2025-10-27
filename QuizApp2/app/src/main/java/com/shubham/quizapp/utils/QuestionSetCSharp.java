package com.shubham.quizapp.utils;

public interface QuestionSetCSharp {

    String question1[] = {

            "1. Which keyword is used to create an instance of a class?",
            "2. Which of the following is NOT a valid access modifier in C#?",
            "3. Which of the following data types can hold only true or false values in C#?",
            "4. Which of the following is used to handle exceptions in C#?",
            "5. Which of the following keywords is used for inheritance in C#?",

            "6. C# is a programming language, developed by ___.",
            "7. What is the extension of a C# language file?",
            "8. Who is the founder of C# programming language?",
            "9. .Net CLR is equivalent to?",
            "10. SOAP in C# stands for ___.",
    };

    String question2[]={

            "1. Which of the following is the correct way to declare a variable in C#?",
            "2. What is the default value of a boolean variable in C#?",
            "3. Which of the following is a value type in C#?",
            "4. Which access modifier makes a class member accessible only within the same assembly?",
            "5. What is the output of the following code: Console.WriteLine(5 + 3 + 'A');",
            "6. Which keyword is used to define a constant in C#?",
            "7. Which of the following is true about inheritance in C#?",
            "8. Which method is used to start a thread in C#?",
            "9. What will be the output of the following code: Console.WriteLine(\"C#\".Length);",
            "10. Which of the following is a feature of C#?",

    };

    String question3[]={

            "1. What does the 'async' keyword do in C#?",
            "2. What will happen if you try to call 'await' on a non-async method?",
            "3. What is the purpose of the 'using' statement in C#?",
            "4. Which of the following is correct about nullable types in C#?",
            "5. Which of the following statements is true about value types and reference types in C#?",
            "6. What is the difference between 'ref' and 'out' parameters in C#?",
            "7. Which of the following is used to define a custom exception in C#?",
            "8. What is the output of the following code: Console.WriteLine(10 / 3);",
            "9. What is the main purpose of the 'yield' keyword in C#?",
            "10. What is the purpose of the 'dynamic' keyword in C#?",

    };

    String answer1[] = {

            "new",
            "transient",
            "bool",
            "try-catch",
            ": (colon)",

            "Microsoft",
            ".cs",
            "Anders Hejlsberg",
            "Java Virtual Machine",
            "Simple Object Access Protocol",

    };

    String answer2[]={

            "int x;",
            "false",
            "int",
            "internal",
            "53",
            "const",
            "Inheritance allows the reuse of code.",
            "start()",
            "3",
            "All of the above",

    };

    String answer3[]={

            "Marks a method as asynchronous",
            "Compiler error",
            "Releases resources automatically",
            "Nullable types can hold both null and any value of their type",
            "Value types are stored on the heap",
            "'ref' can only be used with default-initialized variables",
            "throw new CustomException()",
            "3",
            "Defines the iterator pattern",
            "Makes an object dynamic during runtime",
    };

    String option1[] = {

            "class","struct","new","this",
            "private","public","transient","protected",
            "bool","int","char","string",
            "try-catch","try-except","exception-catch","error-catch",
            "extends","super","base"," : (colon)",

            "Oracle","Microsoft","GNU project","Google",
            ".c",".cpp",".cs",".csp",
            "Anders Hejlsberg","Douglas Crockford","Rasmus Lerdorf","Brendan Eich",
            "Common Type System","Common Language Specification","Common Language Runtime","Java Virtual Machine",
            "Simple Object Access Protocol","Simple Object Access Program","Standard Object Access Protocol","Standard Object Access Program",
    };

    String option2[]={

            "int x;", "x = int;", "variable int x;", "int: x;",
            "true", "false", "null", "0",
            "int", "string", "bool", "DateTime",
            "internal", "protected", "private", "public",
            "53", "8", "5A", "53A",
            "const", "readonly", "static", "define",
            "Only one class can inherit another class.", "A class can inherit from multiple classes.", "Inheritance allows the reuse of code.", "C# does not support inheritance.",
            "start()", "run()", "execute()", "begin()",
            "2", "3", "4", "5",
            "Multithreading", "Automatic Garbage Collection", "Object-Oriented", "All of the above",

    };

    String option3[]={

            "Marks a method as asynchronous", "Marks a method as synchronous", "Allows a method to be used in a thread", "None of the above",
            "Compiler error", "The method returns a task", "The method runs synchronously", "It runs as a background task",
            "Defines a namespace", "Releases resources automatically", "Creates a thread", "Defines a delegate",
            "Nullable types can hold both null and any value of their type", "Nullable types are only for reference types", "Nullable types are never used in C#", "None of the above",
            "Value types are stored on the heap", "Reference types are stored on the stack", "Value types contain references to data", "Reference types store the actual data",
            "'ref' can only be used with default-initialized variables", "'out' variables must be initialized before use", "'ref' allows initialization of variables outside the method", "There is no difference",
            "throw new Exception()", "throw new CustomException()", "throw CustomException()", "Exception.CustomException()",
            "3", "3.33", "0", "Error",
            "Allows lazy loading of data", "Defines the iterator pattern", "Specifies the data type", "None of the above",
            "Makes an object dynamic during runtime", "Defines a weak type", "Prevents a variable from being modified", "All of the above",


};

}
