package javaSE_Fundamentals;

public class Notes {
    //following along with String class demo
    static String name = "Jim";
    String greeting = "Hello " + name; // values can be concatenated using + or +=

 public Notes(){ //constructor being used to modify the instance variable
     greeting +=" good to see you!";
     System.out.println(greeting);
 }

    public static void main(String[] args) {
       Notes greet = new Notes(); /* creating an object of notes class

        System.out.println(greet.greeting); // accessing instance variable

        copied line 16 to line 10 demonstrate that the constructor is run everytime a new
        instance of the notes class is created */

        System.out.println(name);
        //This variable being static makes it accessible without needing to go through a object

        Notes greet2 = new Notes(); //new object created constructor ran a second time

        //String equality- performs a character by character comparison (example)
        String test1 = "mahoganyG";
        String test2 = "mahoganyG";
        //it's yellow because the code is always true
        if(test1.equals(test2)){
            System.out.println("prints because the characters are the same");
            //but
            if(test1 == test2){
                System.out.println("prints because java uses string interning and both variables point to the same area in memory");
            }
            //ran into a concept called string interning trying to view the difference between using the equals methods and the comparison ==

            //String class method notes
            int iVal = 100;
            String sVal = String.valueOf(iVal); //manually converting value of val to a string
            System.out.println(sVal);

            int i = 2, j = 3;
            int result = i * j;
            String output = i + " * " + j + " = " + result; //implicitly allowing the compilier to convert
            System.out.println(output);
        }
        //StringBuilder demo
        String location ="Florida";
        int flightNumber = 175;
        StringBuilder sb = new StringBuilder(40);
        sb.append("I flew to ");
        sb.append(location);
        sb.append("on flight #");
        sb.append(flightNumber);
        String message = sb.toString();
        System.out.println(message);

       // String time = "9:00pm"; //inserting a time into a string already created
        //int pos = sb.indexOf(" on");
        //sb.insert(pos, " at ");
        //sb.insert(pos + 4, time);
        //message = sb.toString();
        //System.out.println(message);


    }


    }

