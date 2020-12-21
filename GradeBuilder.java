package cs1.a;

import java.util.Scanner;
/**
 * Program takes user input of 20
 * grades, performs calculations, and
 * outputs lowest, highest, and average grade
 * @author $Charles Owens
 */
public class GradeBuilder {
    
    public static int[] getGrades()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter up to 20 grades followed by a -1 when you are done.");       
        int[] grade = new int[20];
        for(int i = 0; i < grade.length; i++){
            grade[i] = keyboard.nextInt();
          if(grade[i] == -1)
                break;
        }
        return grade;
    }
    
    public static double calcAvg(int[] grade, int length){        
        int sum = 0;
        for(int i = 0; i < length; i++){
            if(grade[i] == -1)
                grade[i] = 0;
            sum = sum + grade[i];
            if(grade[i] == 0)
                break;
            length--;        
        }
        int newLength = 20 - length;
        double average = sum / newLength;
        return average;
    }
    
    
    public static int calcMin(int[] grade){
        int lowestGrade = grade[0];
        for(int i = 1; i < 20; i++){
            int newGrade = grade[i];
            if(newGrade == 0)
                break;
            else if(newGrade < lowestGrade)
                lowestGrade = newGrade;
        }
        return lowestGrade;
    }
    
    public static int calcMax(int[] grade){
        int highestGrade = grade[0];
        for(int i = 1; i < 20; i++){
            int nextGrade = grade[i];
            if(nextGrade > highestGrade)
                highestGrade = nextGrade;
        }
        return highestGrade;
    }
    
    public static void main(String[] args) { 
        int[] gradeBook = new int[20];
        int[] userGrades = getGrades();
        
        int length = userGrades.length;
        double average = calcAvg(userGrades, length);
        int lowest = calcMin(userGrades);
        int highest = calcMax(userGrades);
        
        System.out.println("Lowest grade is: " + lowest);
        System.out.println("Highest grade is: " + highest);
        System.out.println("Average grade is: " + average);
        
        }   
    }

