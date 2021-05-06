
// Java Strings

    // True or False: Strings only hold a single a character.
        // For example, 'b' would be a String. 
        FALSE

    // 2 What is the result?
        String a = "Good morning!";
        System.out.println(a.charAt(9));

            // => "i"

    // 3 How many objects are created with the following code?

        String a = new String(); 
        String b = a; 
        a = "Hello";
            // => 2

// Variables and Data Types

    // What is the difference between a primitive and a reference variable?

        // = > A primitive variable stores a value, a reference variable stores the memory address of an object
        A primitive variable stores a value, a reference variable stores an object
        A primitive variable stores the memory address of a value, a reference variable stores the memory address of an object
        There is no difference

    // 2 What is the proper format for assigning a value to a variable?

        // => int x = 5;
        int 5 = x;
        5 = x int;
        x = 5 int;

    // 3 A boolean variable can only hold the values true or false.
        TRUE

// Binary Representation & Arithmetic 

    // Convert the number 10 (base 2) to base 10? (Not employing one or two's complement)
    // Type in your answer as a number. For example, if the answer is 54, then type in 54.
        Your answer :  2

    // 2 Convert the number 10111 (base2) to base 10? (Not employing one or two's complement)
    // Type in just the number. For example, if the answer were 54, then type in 54. 
        Your answer :  23

    // 3 Convert -54 (negative fifty-four) to base 2 using two's complement. (Choose the best option)
        // => 1100 1010
        0011 0110
        0011 0111
        1100 1001

    // 4 The base 2 two's complement number 01111111 is what in decimal (base 10). (Choose the best answer)
        // => 127
        128
        -127
        -128 
//  Writing a Simple Program 

    // What is the purpose of the Java compiler?

        // => To transform Java code into instructions usable by the JVM
        To transform Java code into instructions usable by the operating system
        To transform Java code into instructions usable by a web browser


    // 2 Which command compiles Java code?
        // => javac
        java -version
        java
        compile

    // 3 Which one of these is NOT a benefit provided by an IDE?
        // They provide a GUI for writing code
        // They can compile your code for you
        true // => They automatically download 3rd-party libraries that you need from the internet
        // They make it easy to manage your project structure 

// Introduction to Java

    // Which of these is NOT true for Java?
        // Java allows direct manipulation of memory addresses
        Java is an Object Oriented language
        Java code only needs to be compiled once, then it can be run on any system.

    // 2 True or False: Java can be run on any machine that has a JVM
        TRUE
        
    // 3 What is a reserved word, or keyword?
        // A term used by the operating system to run Java code
        true // A word used by the JVM to represent an instruction
        // A word used by the IDE to understand Java code

// The Object Class  

    // The equals() method is equivalent to the == operator, unless overridden
        TRUE

    // 2 True or False: The Object reference can be used to polymorphically store a reference to an instance of any class in Java
        TRUE

    // 3 True or False: By default, toString() prints the values of each property
        False

// Inheritance 


    // True or False: Child classes must have the same variable values as their parent class
        FALSE

    // 2 What will be the result of this method, if we pass in a Bird object?

    public void whatIsThis(Animal a) {   
        if (a instanceof Dog)      
            System.out.println("This is a Dog!");   
        else      
            System.out.println("I don't know what this is");
    }

        "This is a Dog!"
        // "I don't know what this is"
        "This is a Bird!"

    // 3 True or False: Inherited behaviors can be overriden in a subclass
        TRUE
