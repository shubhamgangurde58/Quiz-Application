package com.shubham.quizapp.utils;

public interface QuestionSetc {

    String question1[] = {
            "1. Who invented the C programming language?",
            "2. Which of the following is the correct syntax to declare a pointer in C?",
            "3. Which of the following is not a valid data type in C?",
            "4. What is the 16-bit compiler allowable range for integer constants?",
            "5. Which of the following is used to allocate memory dynamically in C?",

            "6. What is the output of this statement \"printf(\"%d\", (a++))\"?",
            "7. Why is a macro used in place of a function?",
            "8. Which one of the following is a loop construct that will always be executed once?",
            "9. What is the correct syntax to include a header file in C?",
            "10. What is the default value of a static variable in C?",
    };
    String question2[] = {
            "1. What is a lint?",
            "2. In the C language, the constant is defined _______.",
            "3. Directives are translated by the",
            "4. Which of the following is a valid variable name in C?",
            "5. What is the size of an int in a 32-bit system?",

            "6. Which of the following is the correct syntax to define a function in C?",
            "7. Why is a macro used in place of a function?",
            "8. What is the correct way to declare a constant  variable in C?",
            "9. What is the correct syntax to include a header file in C?",
            "10. What is the correct syntax for a while loop in C?",
    };

    String question3[]={

            "1. Which of the following is the correct syntax for a for loop in C?",
            "2. What is the correct way to declare a variable in C to store an integer value?",
            "3. Which of the following operators is used to get the address of a variable in C?",
            "4. Which of the following is used to terminate a while loop in C?",
            "5. What is the correct way to allocate memory dynamically in C?",

            "6. Which of the following is true about the static keyword in C?",
            "7. Which of the following statements is true about the typedef keyword in C?",
            "8. In which situation will the sizeof operator return a value of 0 in C?",
            "9. Which of the following is used to prevent a header file from being included multiple times in a C program?",
            "10. Which of the following statements is true about recursion in C?",

    };
    String answer1[] = {

            "Dennis Ritchie",
            "int *ptr;",
            "boolean",
            "-32768 to 32767",
            "Both b and c",

            "The current value of a",
            "It reduces code size.",
            "do while",
            "#include <stdio.h>",
            "0",

    };
    String answer2[] = {

            "Analyzing tool",
            "Anywhere, but starting on a new line.",
            "Pre-processor",
            "variable_1",
            "4 bytes",

            "void function() {}",
            "It reduces code size.",
            "const int a = 10;",
            "#include <stdio.h>",
            "while (condition) {}",

    };

    String  answer3[]={

            "for (i = 0; i < 10; i++)",
            "int num;",
            "&",
            "break",
            "malloc()",

            "All of the above.",
            "It is used to create an alias for existing data types.",
            "When applied to an incomplete type",
            "#ifndef",
            "Both A and C are correct.",

    };
    String option1[] = {

            "Dennis Ritchie","Bjarne Stroustrup","James Gosling","Ken Thompson",
            "int *ptr;","int ptr*;","pointer int *ptr;","ptr int*;",
            "int","float","boolean","char",
            "3.4e38 to 3.4e38","-32767 to 32768","-32668 to 32667","-32768 to 32767",
            "alloc()","malloc()","calloc()","Both b and c",

            "The value of (a + 1)","The current value of a","Error message","Garbage",
            "It reduces execution time.","It reduces code size.","It increases execution time.","It increases code size",
            "for","while","switch","do while",
            "#include <stdio.h>","include <stdio.h>","#include \"stdio.h\"","import <stdio.h>",
            "0","-1","NULL","Undefined",

    };

    String option2[] = {

            "C compiler","Interactive debugger","Analyzing tool","C interpreter",
            "Before main","After main","Anywhere, but starting on a new line.","None of the these.",
            "Compiler","Pre-processor","Linker","Editor",
            "variable_1","1variable"," @variable","-variable",
            "2 bytes","8 bytes","4 bytes","It depends on the compiler",

            "void function() {}","function void() {}","function() void {}","def function() {}",
            "It reduces execution time.","It reduces code size.","It increases execution time.","It increases code size",
            "const int a = 10;","int const a = 10;","constant int a = 10;"," Both a and b",
            "#include <stdio.h>","include <stdio.h>","#include \"stdio.h\"","import <stdio.h>",
            "while (condition) {}","while {condition}-1","loop while (condition)","while [condition] {}",

    };

    String option3[]={

            "for (i = 0; i < 10; i++)","for (i = 0; i < 10)","for (i; i < 10; i++)","for (i = 0; i++)",
            "int num;","float num;","double num;","integer num;",
            "&","*","#","%",
            "continue","break","exit","return",
            "malloc()","calloc()","free()","delete()",

            "static variables are initialized only once.","static variables have a scope limited to the function in which they are declared.","static variables retain their values between function calls.","All of the above.",
            "It is used to define a new data type.","It is used to define a constant value.","It is used to create an alias for existing data types.","It is used to declare global variables",
            "When applied to a pointer","When applied to an incomplete type","When applied to a void pointer","When applied to a null pointer",
            "#define","#ifdef","#include_once","#ifndef",
            "A recursive function can call itself.","Recursion always leads to a stack overflow","A recursive function must have a base case.","Both A and C are correct.",

    };


}
