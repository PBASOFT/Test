# TTTGameTest

## Mockito powerups

1. How do you verify that a mock was called?\
You verify a mock call by using the Mockito.verify method\
![Code example](https://github.com/MadsMeinertAndersenCPHBusiness/TTTGameTest/blob/main/1.PNG)

2. How do you verify that a mock was NOT called?\
You verify a mock was NOT called by using the Mockito.verifyNoInteractions method\
![Code example](https://github.com/MadsMeinertAndersenCPHBusiness/TTTGameTest/blob/main/2.PNG)

3. How do you specify how many times a mock should have been called?\
You verify how many times a mock was called by using the Mockito.verify method with second argument\
![Code example](https://github.com/MadsMeinertAndersenCPHBusiness/TTTGameTest/blob/main/3.PNG)

4. How do you verify that a mock was called with specific arguments?\
You verify that a mock was called with a specific argument by using Mockito.eq method\
![Code example](https://github.com/MadsMeinertAndersenCPHBusiness/TTTGameTest/blob/main/CodeExample4.PNG)

5. How do you use a predicate to verify the properties of the arguments
given to a call to the mock?\
You can use predicate to verify the properties of the arguments given to a call to the mock by using the Mockito.args method\
![Code example](https://github.com/MadsMeinertAndersenCPHBusiness/TTTGameTest/blob/main/5.PNG)


To run our code you need to clone our repository or download the zip file and set your IDE to java version 14 and language version 14. To run the PITest you need to run maven verify and to run the JaCoCo test you need to run maven test. 
