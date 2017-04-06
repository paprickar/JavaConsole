import java.io.Console;

class CalcApp
{
    public static void main ( String [] arguments )
    {
    	 Console cnsl = null;
    	 
         Integer x = null;
         Integer y = null;
         String op = null;
         
         try {
         
            // creates a console object
            cnsl = System.console();
            
            // if console is not null
            if (cnsl != null) {
               
               // read line from the user input
               x = Integer.parseInt(cnsl.readLine("Nummer 1: "));
              
              

               op = cnsl.readLine("Operator: ");
               y = Integer.parseInt(cnsl.readLine("Nummer 2: "));
               switch(op.charAt(0)){
               case '+' :
            	   System.out.println(x + y);
            	   break;
               case '-' :
            	   System.out.println(x - y);
            	   break;
               case '*' :
            	   System.out.println(x * y);
            	   break;
               case '/' :
            	   System.out.println(x / y);
            	   break;
               }
               // prints
               //System.out.println("Name entered : " + name);
            }     
            
         } catch(Exception ex) {
            
            // if any error occurs
            ex.printStackTrace();      
         }
    }
}
