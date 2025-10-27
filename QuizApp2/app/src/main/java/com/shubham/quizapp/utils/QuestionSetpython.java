package com.shubham.quizapp.utils;

public interface QuestionSetpython {

    String question1[] = {
            "1. Who developed the Python language?",
            "2. What is the maximum possible length of an identifier?",
            "3. In which year was the Python language developed?",
            "4. Which one of the following is the correct extension of the Python file?",
            "5. In which year was the Python 3.0 version developed?",
            "6. Which of the following is used to define a block of code in Python?",
            "7. Which of the following is the correct way to define a function in Python?",
            "8. What type of data type is None in Python?",
            "9. Which of the following methods is used to remove an item from a list in Python?",
            "10. Which method is used to add an item at the end of a list in Python?",
    };

    String question2[]={
            "1. Which of the following is the correct way to define a function in Python?",
            "2. Which of the following data types are immutable in Python?",
            "3. Which of the following methods can be used to remove an item from a Python list?",
            "4. What is the default value of the end parameter in the print() function? ",
            "5. What does the break statement do in a loop?",
            "6. Which of the following is the correct syntax for creating a dictionary in Python?",
            "7. What is the result of the following expression in Python? [1, 2] + [3, 4]",
            "8. Which of the following is used to handle exceptions in Python?",
            "9. Which of the following statements is used to define a class in Python?",
            "10. Which of the following data structures is ordered, changeable, and allows duplicate members in Python?"
    };

    String question3[]={
            "1. Which of the following is used to define an anonymous function in Python?",
            "2. Which of the following will raise an error in Python?",
            "3. How do you write a single-line comment in Python?",
            "4. Which of the following is used to import a specific function from a module in Python?",
            "5. What does the is keyword do in Python?",
            "6. How do you concatenate two lists list1 and list2 in Python?",
            "7. Which of the following is the correct way to define a class method in Python?",
            "8. Which of the following methods is used to remove a specific item from a Python dictionary?",
            "9. Which of the following methods is used to find the index of an element in a list in Python?",
            "10. Which of the following will correctly create a set in Python?",
    };


    String answer1[] = {
            "Guido van Rossum",
            "None of these above",
            "1989",
            ".py",
            "2008",
            "Indentation",
            "def myFunction():",
            "Null type",
            "Both A and B",
            "append()",
    };

    String answer2[]={
            "def function_name():",
            "Tuple",
            "All of the above",
            "\n",
            "Exits the loop entirely.",
            "d = {\"name\": \"John\", \"age\": 25}",
            "[1, 2, 3, 4]",
            "try and except",
            "class MyClass():",
            "List",
    };

    String answer3[]={
            "lambda",
            "int(\"hello\")",
            "# This is a comment",
            "from module import function_name",
            "Compares the identity of two objects.",
            "list1 + list2",
            "def method(cls):",
            "pop()",
            "list.index()",
            "set = {1, 2, 3, 4}",
    };

    String option1[] = {
            "Zim Den","Guido van Rossum","Niene Stom","Wick van Rossum",
            "16","32","64","None of these above",
            "1995","1972","1981","1989",
            ".py",".python",".p","None of these",
            "2008","2000","2010","2005",
            "Parentheses","Curly braces {}","Indentation","Square brackets []",
            "function myFunction():","def myFunction():","create function myFunction:","function = myFunction()",
            "Integer","Boolean","Null type","String",
            "remove()","pop()","delete()","Both A and B",
            "extend()","insert()","append()","add()",
    };

    String option2[]={
            "def function_name[]:","function function_name():","def function_name():","func function_name[]:",
            "List","Dictionary","Set","Tuple",
            "remove()","del","pop()","All of the above",
            "None","\n","(space)","\t",
            "Exits the loop entirely.","Continues to the next iteration of the loop.","Pauses the loop temporarily.","Skips the current iteration and moves to the next.",
            "d = {\"name\": \"John\", \"age\": 25}","d = [\"name\": \"John\", \"age\": 25]","d = (\"name\": \"John\", \"age\": 25)","d = name: \"John\", age: 25",
            "[1, 2, 3, 4]","[4, 3, 2, 1]","None","[1, 2]",
            "try and catch","try and except","try and finally","atch and finally",
            "class MyClass():","class MyClass:","def MyClass:","def MyClass():",
            "Set","List","Tuple","Dictionary",
    };

    String option3[]={

            "def","lambda","function","anonymous",
            "int(\"100\")","str(100)","list(\"hello\")","int(\"hello\")",
            "// This is a comment","# This is a comment","/* This is a comment */","-- This is a comment",
            "import function_name","from module import function_name","import from module function_name","module.function_name()",
            "Compares the values of two objects.","Compares the identity of two objects.","Assigns a value to a variable.","Checks if two values are of the same data type.",

            "list1.concat(list2)","list1 + list2","list1.append(list2)","list1.extend(list2)",
            "def method(cls):","def method(self):","def method(self, cls):","def classmethod(method):",
            "popitem()","remove()","pop()","delete()",
            "list.index()","list.find()","list.get()","list.search()",
            "set = {1, 2, 3, 4}","set = (1, 2, 3, 4)","set = [1, 2, 3, 4]","set = {1, 2, 2, 3}",

    };


}
