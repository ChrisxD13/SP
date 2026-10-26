/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lesson;

/**
 *
 * @author chris
 */
import java.util.Arrays;
public class Week5 {
    public static void main(String[] args) {
        System.out.println("===Basic===");
        System.out.println("");
        String[] favoriteThings = {"Coding", "Reading", "Gaming", "Music", "Hiking"};
        for (int i = 0; i < favoriteThings.length; i++) {
        System.out.println((i + 1) + ". " + favoriteThings[i]);
    }
        System.out.println("Total length: " + favoriteThings.length);
        
        System.out.println("");
        System.out.println("Intermediate");
        
        int[] scores = {85, 90, 78, 92, 88, 76, 95, 89};
        int sum = 0;
        int highest = scores[0];
        int lowest = scores[0];

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
            if (scores[i] > highest) {
                highest = scores[i];
            }
            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }

        double average = (double) sum / scores.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
        
        System.out.println("");
        System.out.println("===Advance===");
       
        
        int[] advscores = {85, 90, 78, 92, 88, 76, 95, 89};
        int target = 92;
        int foundIndex = -1;

        for (int i = 0; i < scores.length; i++) {
            if (advscores[i] == target) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println("Target found at index: " + foundIndex);
        } else {
            System.out.println("Target not found.");
        }

        int[] sortedScores = Arrays.copyOf(advscores, advscores.length);
        Arrays.sort(sortedScores);

        System.out.println("Original array: " + Arrays.toString(advscores));
        System.out.println("Sorted array: " + Arrays.toString(sortedScores));

        System.out.println("");
        System.out.println("Expert");
        class Student {
        String name;
        int[] quizzes;
        double average;
        
        Student(String name, int[] quizzes) {
            this.name = name;
            this.quizzes = quizzes;
            int sum = 0;
            for (int q : quizzes) {
                sum += q;
            }
            this.average = (double) sum / quizzes.length;
        }
    }

        String[] names = {"Alice", "Bob", "Charlie", "Diana"};
        int[][] rawData = {
            {85, 90, 88, 92},
            {75, 80, 85, 70},
            {90, 95, 92, 98},
            {85, 90, 88, 92}
        };

        Student[] students = new Student[names.length];
        for (int i = 0; i < names.length; i++) {
            students[i] = new Student(names[i], rawData[i]);
        }

        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].average < students[j + 1].average) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        String searchName = "Charlie";
        int rank = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i].name.equals(searchName)) {
                rank = i + 1;
                break;
            }
        }

        System.out.println("--- Leaderboard ---");
        int currentRank = 1;
        for (int i = 0; i < students.length; i++) {
            if (i > 0 && students[i].average < students[i - 1].average) {
                currentRank = i + 1;
            }
            System.out.println("Rank " + currentRank + ": " + students[i].name + " (Average: " + students[i].average + ")");
        }

        System.out.println("\nSearch Result: " + searchName + " is at rank " + rank);
    }
}
