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
    private double sum;
    private int numOfStudents;
    private double mean;
    private double x;
    private double stdDeviation;
    private double difference;

    /**
     * Constructor for objects of class Assignment1
     */
    public Assignment1()
    {
        // initialise instance variables
        marksArrayList= new ArrayList<>();
        getName();
        getAssignmentname();
        numOfStudents = 4; // number of users can be changed here
        setMarks();
        printAssiName();
        printMarks();
        printHighestMark();
        printLowestMark();
        meanMarks();
        calculateStandardDeviation();
        //namesArrayList= new ArrayList<>();
        sum=0.0;
        x=0.0;

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

    public void setMarks(){
        Scanner userInput = new Scanner(System.in);
        boolean userMarksValid = false; 
        for (int i=0; i<numOfStudents; i++){
            if(!userMarksValid){

                System.out.println("Please Enter Your Marks: ");  

                double userMarks = userInput.nextDouble();

                if (userMarks <=0 || userMarks >= 30)
                {
                    System.out.println("The mark " + userMarks + "is not valid. Please type a number between 0 and 30");
                    i=i-1;
                }
                else{
                    marksArrayList.add(userMarks);
                    userMarksValid=false;
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
        double highestMark = marksArrayList.get(0);

        for (int i = 0; i < marksArrayList.size(); i++) {
            if (marksArrayList.get(i) > highestMark) {
                highestMark = marksArrayList.get(i);
            }

        }
        System.out.println( " The highest mark is " +highestMark);

    }

    public void printLowestMark(){
        double lowestMark = marksArrayList.get(0);
        for (int i = 0; i < marksArrayList.size(); i++) {
            if (marksArrayList.get(i) < lowestMark) {
                lowestMark = marksArrayList.get(i);
            }
        }
        System.out.println( " The lowest mark is " +lowestMark);
    }

    public void meanMarks(){
        for(int i=0;i<marksArrayList.size();i++){
            sum = sum + marksArrayList.get(i);
        }
        mean = sum/marksArrayList.size();
        System.out.println("The mean value is " +mean);
    }

    public void calculateStandardDeviation(){
        for(int i=0;i<marksArrayList.size();i++){
            difference = marksArrayList.get(i)-mean;
            x = x + Math.pow(difference,2);

        }
        stdDeviation = Math.sqrt(x/marksArrayList.size());
        System.out.println("The Standard Deviation is  " +stdDeviation);
    }
}
