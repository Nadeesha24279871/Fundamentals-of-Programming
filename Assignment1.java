import java.util.Scanner;

/**
 * This is a program  to compute statistics of 'students' marks in an assignment.
 *
 * @author (Nadeesha Adasuriya)
 * @version (1.0 31/08/2023)
 */
public class Assignment1
{
    // instance variables - replace the example below with your own
    public String[] assiNames = new String[30];
    public int[] userMarks = new int[30];
    
    

    /**
     * Constructor for objects of class Assignment1
     */
    public Assignment1()
    {
        // initialise instance variables
      
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void getName()
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter Your Name: ");
        
        String userName = userInput.nextLine();
        System.out.println("Welcome "+ userName);
    }
    
    public void getAssignmentname()
    { for (int i=0; i<30; i++){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter the Assignment Name: ");
        String assiNames = userInput.nextLine();
    }
}
    
    public void getMarks(){
      for (int i=0; i<30; i++){
      Scanner userInput = new Scanner(System.in);
      System.out.println("Please Enter Your Marks: ");  
    
      int userMarks = userInput.nextInt();
      
      if (userMarks <0 || userMarks >= 30)
      {
       System.out.println("The mark " +userMarks+ "is not valid. Please type a number between 0 and 30");
       
       getMarks();
       }
    }
         
}
public void printNames(){
        for(int i=0; i < assiNames.length; i++){
            System.out.println("The marks for " +assiNames[i]+ "is" +userMarks);
            
        }
    }



public void printHighestMarkLowestMark(){
    double highestMark = userMarks[0];
        double lowestMark = userMarks[0];

        for (int i = 1; i < 30; i++) {
            if (userMarks[i] > highestMark) {
                highestMark = userMarks[i];
            }
            if (userMarks[i] < lowestMark) {
                lowestMark = userMarks[i];
            }
        }
}
}






