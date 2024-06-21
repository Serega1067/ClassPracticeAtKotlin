# Class practice at Kotlin.

## Task 1. Add classes.
Write an implementation of the Holder class and interface  
valueChangeListener, such that the program compiles,  
and when executing the main function, "New value is 1" is displayed  
on the screen.

## Task 2. Class hierarchy.
To build a hierarchy of classes in such a way that after executing  
the main function, the correct result of calculating 3 formulas is output.

## Task 2.2. Class hierarchy.
Another way to solve the Task2 problem is to declare classes in the 
body of the sealed interface.

## Homework.
0. We take the homework solution code from the previous workshop  
as a basis and refine it.
1. Create hierarchy of sealed classes that represent commands.  
At the root of the hierarchy is the Command interface.
2. Each class in the hierarchy must have the isValid(): Boolean function,  
which return true if the command is entered with the correct arguments.  
Phone and email verification needs to be moved to this function.
3. Write the readCommand(): Command function that reads a command  
from a text input, recognizes it, and return one of Command successor  
classes corresponding to the entered command.
4. Create the Person data class, which represents a record about a person.  
This class must contain fields:
* name - the name of the person
* phone - phone number
* email - the email address
5. Add a new show command that outputs the last value entered using  
the add command. To do this, value must be stored in  
a variable of type Person. If nothing was entered at the time of executing  
the show command, you need to display the message "Not initialized".
6. The main function should look like this. For each command from the user:  
a. Read the command using the read Command function  
b. Display the resulting instance of Command  
c. If the isValid for the command return false, output help. If true,  
we process the command inside when.

## An application with recipes.
Select entities.  
Define properties.  
Endow an entity with actions.  

In this application there will be a list of dishes divided into categories.  
There will be cooking instructions for the recipe. You can add it to your  
favorites or send it to someone from your contacts.

