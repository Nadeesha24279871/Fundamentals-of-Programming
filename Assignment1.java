import java.util.Scanner;
import java.util.ArrayList;

/**
 * This is a program  to compute statistics of 'students' marks in an assignment.
 *
 * @author (Nadeesha Adasuriya)
 * @version (1.0 31/08/2023)
 */
public class Assignment1
{
    // instance variables - replace the example below with your own
    public String assiNames;
    public double userMarks;
    private ArrayList<Double> marksArrayList;
    private ArrayList<String> namesArrayList;


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

        Scanner userInput = new Scanner(System.in);
        for (int i=0; i<2; i++){
            boolean userMarksValid = false; 
            while (!userMarksValid){
            System.out.println("Please Enter Your Marks: ");  

            double userMarks = userInput.nextDouble();

            if (userMarks <0 || userMarks >= 30)
            {
                System.out.println("The mark " + userMarks + "is not valid. Please type a number between 0 and 30");

            }
            else{
                marksArrayList.add(userMarks);
                userMarksValid=true;
            }
        }

    }
}

    public void printNames(){
        for(int i=0; i < namesArrayList.length; i++){
            System.out.println("The marks for " + namesArrayList[i]+ "is" + userMarks);

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


