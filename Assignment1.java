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
    public String assiName;
    public double userMarks;
    private ArrayList<Double> marksArrayList;
    private ArrayList<String> namesArrayList;
    //double[] marksArrayList = new double[0];

    /**
     * Constructor for objects of class Assignment1
     */
    public Assignment1()
    {
        // initialise instance variables

        getName();
        getAssignmentname();
        getMarks();
        printAssiName();
        printHighestMarkLowestMark();
        marksArrayList= new ArrayList<>();
        namesArrayList= new ArrayList<>();

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
    { 
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter the Assignment Name: ");
        this.assiName = userInput.nextLine();
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

    public void printAssiName(){
        System.out.println("The Assignment " +this.assiName);

    }

    public void printMarks(){
        System.out.println("Students Marks : ");
        for(int i=0; i < marksArrayList.size(); i++){
            System.out.println(marksArrayList.get(i));
        }
    }

    public void printHighestMarkLowestMark(){
        double highestMark = marksArrayList[0];
        double lowestMark = marksArrayList[0];

        for (int i = 1; i < 30; i++) {
            if (marksArrayList[i] > highestMark) {
                highestMark = marksArrayList[i];
            }
            if (marksArrayList[i] < lowestMark) {
                lowestMark = marksArrayList[i];
            }
        }
        System.out.println( " The highest mark is " +highestMark);
        System.out.println( " The lowest mark is " +lowestMark);

    }

}
