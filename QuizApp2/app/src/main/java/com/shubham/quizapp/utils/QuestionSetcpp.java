package com.shubham.quizapp.utils;

public interface QuestionSetcpp {


    String question1[] = {

            "1. Who invented the C++ programming language?",
            "2. In which year was the C++ programming language invented",
            "3. Which of the following is used to declare a constant in C++?",
            "4. Which of the following is the correct syntax to read the single character to console in the C++ language?",
            "5. What is the default access specifier for members of a class in C++?",

            "6. Which of the following is the correct syntax to print the message in C++ language?",
            "7. Which of the following is a feature of object-oriented programming?",
            "8. The C++ language is ______ object-oriented language.",
            "9. C++ is a ___ type of language.",
            "10. Which of the following features must be supported by any programming language to become a pure object-oriented programming language?",
    };

    String question2[] = {

            "1. Which of the following is not a valid constructor in C++?",
            "2. Which of the following is used to create a virtual function in C++?",
            "3. Which of the following is the correct syntax for a while loop in C++?",
            "4. Which of the following C++ containers stores elements in a non-sequential manner and allows fast insertions and deletions?",
            "5. Which of the following C++ features is used to achieve polymorphism?",

            "6. Which of the following is the correct way to declare and define a class template in C++?",
            "7. Which of the following C++ standard containers allow fast access and modification of data but does not allow duplicates?",
            "8. What is the purpose of the try, catch, and throw keywords in C++?",
            "9. Which of the following is the correct way to define a copy constructor in C++?",
            "10. Which of the following C++ features is used to reduce code duplication and allow code reuse? ",

    };

    String question3[]={

            "1. Which of the following is the correct way to declare a const member function in C++?",
            "2. Which of the following correctly demonstrates the concept of dynamic polymorphism in C++?",
            "3. In C++, which of the following containers does not allow duplicates and stores elements in sorted order?",
            "4. Which of the following C++ keywords is used to define a function that cannot be overridden in derived classes?",
            "5. Which of the following is true about C++11 lambda functions?",

            "6. Which of the following C++ features allows the creation of a generic function or class?",
            "7. Which of the following C++ features allows the function to call itself?",
            "8. Which of the following is not a valid constructor in C++?",
            "9. What will happen if you try to delete a pointer that has already been deleted in C++?",
            "10. Which of the following is true about destructors in C++?",

    };

    String answer1[] = {

            "Bjarne Stroustrup",
            "1979",
            "const",
            "get(ch)",
            "private",

            "cout <<\"Hello world!\";",
            "Inheritance",
            "Semi Object-oriented or Partial Object-oriented",
            "Middle-level language",
            "All of the above",

    };

    String answer2[] = {

            "int MyClass() {}",
            "virtual",
            "while (i < 10) {}",
            "set",
            "Virtual functions",

            "template <typename T> class MyClass { };",
            "set",
            "They are used to handle exceptions.",
            "MyClass(const MyClass& obj)",
            "Template functions",

    };

    String answer3[]={

            "void display() const;",
            "Using function overriding with virtual functions.",
            "map",
            "final",
            "Lambdas can capture variables by reference or by value.",

            "Templates",
            "Recursion",
            "Destructor Constructor",
            "A runtime error will occur.",
            "A destructor cannot accept arguments.",

    };



    String option1[] = {

            "Dennis Ritchie","Bjarne Stroustrup","James Gosling","Guido van Rossum",
            "1972","1979","1983","1990",
            "const","static","final","immutable",
            "Read ch()","Getline vh()","get(ch)","Scanf(ch)",
            "public","private","protected","none",

            "cout <<\"Hello world!\";","Cout << Hello world! ;","Out <<\"Hello world!;","None of the above",
            "Inheritance","Multithreading","Exception handling","None of the above",
            "Pure Object oriented","Not Object oriented","Semi Object-oriented or Partial Object-oriented","None of the above",
            "High-level Language","Low-level language","Middle-level language","None of the above",
            "Encapsulation","Inheritance","Polymorphism","All of the above",

    };

    String option2[] = {

            "MyClass() {}","MyClass(int a) {}","MyClass(int a, int b) {}","int MyClass() {}",
            "virtual","friend","override","static",
            "while i < 10 {}","while (i < 10)","while i < 10 do {}","while (i < 10) {}",
            "vector","list","deque","set",
            "Classes","Inheritance","Virtual functions","Friend functions",

            "template <typename T> class MyClass { };","class template <T> MyClass { };","template <T> MyClass { };","template <typename T> class MyClass { };",
            "vector","map","unordered_map","set",
            "They are used to handle exceptions.","They are used to implement polymorphism.","They are used for template specialization.","They are used to define virtual functions",
            "MyClass(MyClass& obj)","MyClass(const MyClass& obj)","MyClass(MyClass obj)","void MyClass(const MyClass& obj)",
            "Inheritance","Polymorphism","Template functions","Friend functions",

    };

    String option3[]={

            "void display() const;","const void display();","void const display();","void display(const);",
            "Using function overloading.","Using function overriding with virtual functions.","Using operator overloading.","Using static methods.",
            "unordered_map ","map","set","unordered_set",
            "virtual","final","override","static",
            "Lambdas cannot capture variables from the enclosing scope","Lambda functions can only return void.","Lambdas can capture variables by reference or by value.","Lambda functions are slower than normal functions.",

            "Inheritance","Polymorphism","Templates","Exception Handling",
            "Recursion","Inheritance","Polymorphism","Templates",
            "Default Constructor","Parameterized Constructor","Copy Constructor","Destructor Constructor",
            "The program will work correctly.","A runtime error will occur.","The pointer will be nullified.","The program will crash at compilation.",
            "A destructor has the same name as the class.","A class can have multiple destructors.","A destructor cannot accept arguments.","A destructor must be explicitly called.",

    };


}
