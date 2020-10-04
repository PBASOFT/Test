Test \ Soft2020fall

# Assignment  #2


## Reflections


### Computer mouse
___Identify the types of testing you would perform on a computer mouse, to
make sure that it is of the highest quality.___

### Catastrophic failure
___Find a story where a software system defect had a bad outcome. Describe
what happened. Can you identify a test that would have prevented it?___



## Two katas

### String utility
_Use TDD to create a string utility with the following methods:_

  _• Reverse string (aBc -> cBa)_

  _• Capitalize string (aBc -> ABC)_

  _• Lowercase string (aBc -> abc)_



##  __[String Utility TDD](https://github.com/maleneH/Test/tree/master/Assignment2/stringUtility)__


###  Bowling game kata
_Complete the Bowling Game Kata using TDD._
_The slides can be found here: http://butunclebob.com/files/downloads/Bowling%20Game%20Kata.ppt_



##  __[Bowling Game TDD](https://github.com/maleneH/Test/tree/master/Assignment2/BowlingGame)__

## Investigation of tools

### JUnit 5
__Investigate JUnit 5 (Jupiter). Explain the following, and how they are useful.___

  __• @Tag__

  _Used to "categorize" test classes and -methods, so that you fx can choose to only execute tests of a given tag._

      @Test
      @Tag("Math")
      private void testDivide() {
          . . .
      }

  _Useful if you fx want to only test a certain part or funcionality of a system._

  __• @Disabled__

  _Can be used over both classes and methods, that you don't want to be executed. It is good practice provide the annotation with a reason to why it is disabled._

      @Test
      @Disabled("Feature is still under construction")
      private void testDivide() {
          . . .
      }



  __• @RepeatedTest__

  _Runs a test a specified number of times. The annotation has attributes for adding display names for each repetition, and for specifying the number of repetitions.

      @RepeatedTest (value = 5,
                      name = {currentRepetition} of {totalRepetitions})
      @DisplayName ("Divide method")
                     private void testDivide() {
                        . . .
                     }

  _Is fx useful for testing lists or the like. Or when conditions change from one execution of a test to another._


  __• @BeforeEach, @AfterEach__

  _The annotated methods will run **before** or **after** each test in the class. These methods must NOT be static or private, and must have return type void_


      @BeforeEach
      public void setupEach(){
        . . .
      }

      @AfterEach
      private static void cleanEach(){
          . . .
        }

  _They are useful for fx (re)setting variables before or after each test in the class has been executed._     


  __• @BeforeAll, @AfterAll__

  _Can only be used over a static method. The methods are run **before** or **after** all the tests in the class. The @BeforeAll-annotated method is even executed before the class is instanciated (which is why it has to be static)._

      @BeforeAll
      private static void setup(){
          . . .
      }

      @AfterAll
      private static void cleanUp(){
          . . .
      }

  _The @BeforeAll annotation is useful for fx creating objects, that are used by several tests in the class, to avoid redundance._

  _The @AfterAll annotaion is useful for executing some statement after a test class has run, or for fx releasing resources after running all test cases.


  __• @DisplayName__

  _Can be used over both classes and methods. Lets you overwrite the method name displays when tests have been executed._

        @Test
        @DisplayName("Divide method")
        private void testDivide() {
          . . .
        }

  _Is useful for making sense of the many tests beeing executed, if you give the methods and classes meaningful names._

  __• @Nested__

_Allows you to have inner classes, and thereby group several test classes under the same parent (whit the same initialization).

      public class calculatorTest(){

          Calculator calculator = new Calculator;

          @Nested
          Class Divide {
            @Test
            void divide(. . .)
            . . .
          }  

          @Nested
          Class Multiply {
            @Test
            void multiply(. . .)
            . . .
          }  

      }

_Is useful for keeping tests clean and readable: By grouping tests together, you can create a hierachical structure to the output, making the output much more readable.._


  __• assumeFalse, assumeTrue__

_For testing conditional methods. If you expect/**assume** som value to be true, then the test code will only be executed if so._


      @Test
        private void testMultiply() {
        int firstNumber;
        assumeTrue(firstNumber); //test will not execute,
                                  as the variable is uninitiated ==> null

          . . .
        }


      @Test
      private void testDivide() {
        assumeTrue(server instanceof ReactorHttpServer ||
                   server instanceof UndertowHttpServer);
        //remainder of test will proceed
          . . .
      }

_Useful for tests (or testclasses), that you only want to run under certain conditions._


### Mocking frameworks
___Investigate mocking frameworks for your preferred language. Choose at least two frameworks, and answer the questions. (One could be Mockito, which we saw in class.)___

  ___• What are their similarities?___

  ___• What are their differences?___

  ___• Which one would you prefer, if any, and why?___
