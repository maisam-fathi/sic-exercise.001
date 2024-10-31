package loop.nestedLoops;

public class CombineStudentProjects {
    /*
    Task 3: Combine student projects
    Create a string array students with the names of 4 students (e.g. {"Max", "Anna", "Lukas", "Sophia"}).
    Use a nested for loop to find all possible pairs of students who could do a project together.

    Print each combination to the console (e.g. "Max and Anna").
    Example output:
    Max and Anna
    Max and Lukas
    Max and Sophia
    Anna and Lukas
    Anna and Sophia
    Lukas and Sophia
     */
    public static void main(String[] args) {

        String[] students = {"Max", "Anna", "Lukas", "Sophia"};

        System.out.println("Student team Possibility");

        for (int i = 0 ; i < students.length; i++){
            for (int j = i+1; j < students.length; j++){
                System.out.println(students[i] + " und " + students[j]);
            }
        }
    }
}
