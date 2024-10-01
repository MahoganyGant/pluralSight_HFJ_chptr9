## Working with strings introduction 
# topics covered
string class
string equality 
string method 
string conversions 
string builder.

The class is a blueprint. The object is the actual thing based on the blueprint
string class- What is it? a blueprint for starring a sequence of characters that are enclosed and double quotes

# side note : what does static mean when you declare a variable or a method as static? 
it belongs to the class rather than a specific instance this is important because each instance of a class can have its own unique values 
when you make it static only one instance of that static can exist it will be shared by all objects that are created from that specific class.

# Question: does the context of static and instance differ in Java and how does that affect accessing variables from each other?
instances are part of objects they live within an object the operator allows you to access instance, variables, or methods tied to that object actions.
like modifying a string need to happen inside a method or constructor because they're actions that need to be executed
# Strings are immutable 
string variables do not directly hold the string value.
They hold a reference to the instance of a string string equality. If you compare strings with the equality operator = = check to see if the string variables reference the same instance so even
if they hold the same value, if the instances are different, the return will be false. if you are comparing strings and you want to check that the values are the same. You need to use the equals 
method.

why is my code returning when I use both my equals method and = = comparison in the video it says using the = = comparison checks for the same instance, but mine are different. 

Java uses a feature called string interning and when creating string literal Java stores them in an area of memory call the string pool.
when creating another string with the same value Java points it to the same memory location to save space.

in my code username.equals(firstNameLastInitial) returns true because the characters are the same whereas username = = firstNameLastInitial returns true because
both variables referred to the same memory location due to string Interning.

# forcing different memory locations in Java if you want to string variables with the same value to have different memory locations

you’ll need to explicitly create a new strength instance using new string () Creating new string instances can help you avoid unnecessary memory retention from the string pool
most times you will not need to use this because stringing is efficient and saves memory useful for handling sensitive data 
should be used if your frequently comparing strings 
# string builder 

use toString to extract string content 
parallel arrays means the elements in one array directly matches the elements in another array 

# chapter 8 
declaring classes
class members 
working
with objects
encapsulation and access modifiers
field accessories and mutators 

Java an object oriented language,objects encapsulate, data operations and usage semantics they allow storage and manipulation
to be hidden in separates what is to be done from how it is done.

a class a template for creating objects class class name { //class members} fields, methods, constructors 

reference types
allow variables to reference the same object instance 

# encapsulation access modifiers 

modifiers: no access modifier, only visible with his own package and this can be used on classes and members 
a public modifier is visible everywhere. This can also be used on classes and members
a private modifier is only visible within. The declaring class is normally not usable classes however it can be used on nested classes special references 

this – implicitly reference to current object
null – represents uncreated object 

field encapsulation - in most cases these details should not be directly accessible outside the class, 
use method to control field accessor and mutator pattern accessors retrieve or get and you use method name: fieldName 
mutators modifies field value also called Setter method name setFieldName

constructors – executable code that runs during object creation sets initial state use method to provide access 

# chapter 9 
default initial state of Fields
field initializes
constructors
chaining constructors
constructor visibility
initialization blocks

# initialization and construction order three ways to establish initial state

number one field initializer "=", specify initial value as part of fields declaration 
number two constructors 
number three initialization blocks 

constructors. A class can have multiple constructors in each constructor must have its own signature

chain constructors one constructor can call another constructor must be first line of the constructor use this keyword followed by the parameter list, 

constructor visibility constructors can be non-public, limits which code can perform specific types of instance creation 

initialization blocks share code across all constructors cannot receive parameters place code within brackets outside 
any method or constructor classes can have multiple initialization blocks all of the blocks, always execute execute from top to bottom

# initialization and construction order 
number one initializer this is when all the values are set
number two initialization blocks from top to bottom 
number three Constructors last to be executed during initialization

# chapter 10 

static members 
remember static members all the different instances of the classes all share the same value for static members 
static field fields are attributes of the class. If you modify a static field of a class, it 
affects the value for every instance of that class static methods can only access other static members 
static import statement used with static methods allows method to be used without being class
qualified, static initialization blocks execute before types. First use has access to static members only statements, enclosed, and brackets outside of any constructor or method.

## HEAD FIRST Java Chapter Nine

