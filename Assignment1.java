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
    //private ArrayList<String> namesArrayList;
    //double[] marksArrayList = new double[0];
    double mean;
    int numOfStudents;
    

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
        printHighestMark();
        printLowestMark();
        meanMarks();
        marksArrayList= new ArrayList<>();
        //namesArrayList= new ArrayList<>();
        mean=0.0;
        numOfStudents = 3;
        

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
        this.assiName = userInput.nextLine(); // store user input assignment name in the current object
    }

    public void getMarks(){
        Scanner userInput = new Scanner(System.in);
        boolean userMarksValid = false; 
        for (int i=0; i<numOfStudents; i++){
            
            while (!userMarksValid){
                System.out.println("Please Enter Your Marks: ");  

                double userMarks = userInput.nextDouble();

                if (userMarks <=0 || userMarks >= 30)
                {
                    System.out.println("The mark " + userMarks + "is not valid. Please type a number between 0 and 30");
                    i=i-1;
                }
                else{
                    marksArrayList.add(userMarks);
                    userMarksValid=true;
                }
            }

        }
    }

    public void printAssiName(){
        System.out.println("The Assignment is  " +this.assiName); // print the user input assignement name 

    }

    public void printMarks(){
        System.out.println("Students Marks : ");
        for(int i=0; i < marksArrayList.size(); i++){
            System.out.println(marksArrayList.get(i));
        }
    }

    public void printHighestMark(){
        double highestMark = 0.0;

        for (int i = 0; i < 3; i++) {
            if (marksArrayList.get(i) > highestMark) {
                highestMark = marksArrayList.get(i);
            }

        }
        System.out.println( " The highest mark is " +highestMark);

    }
    public void printLowestMark(){
        double lowestMark = marksArrayList.get(1);
        for (int i = 0; i < 3; i++) {
            if (marksArrayList.get(i) < lowestMark) {
                lowestMark = marksArrayList.get(i);
            }
        }
        System.out.println( " The lowest mark is " +lowestMark);
    }
    public void meanMarks(){
        for(int i=0;i<marksArrayList.size();i++){
            mean = mean + marksArrayList.get(i);
        }
        System.out.println(mean/marksArrayList.size());
    }
}