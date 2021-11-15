import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner cout = new Scanner(System.in);
        SortingStudentsByGPA obj = new SortingStudentsByGPA();

        int marks[] = new int[5];
        String names[] = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("Напишите имя и оценку студента №%d: ", i + 1);
            names[i] =cout.next();
            marks[i] =cout.nextInt();
        }
        
        obj.sort(marks, names);
    }
}

interface Comparator { void sort(int marks[], int names[]); }

class SortingStudentsByGPA {

    public int x;
    public String y;

    void sort(int marks[], String names[]) {
        for (int i = 1; i < marks.length; i++)
            for (int j = 0; j < marks.length - i; j++)
                if (marks[j] < marks[j + 1]) {
                    x = marks[j + 1];
                    y = names[j + 1];
                    marks[j + 1] = marks[j];
                    names[j + 1] = names[j];
                    marks[j] = x;
                    names[j] = y;
                }

        for (int i = 0; i < 5; i++)
            System.out.print(names[i] + ": " + marks[i] + "\n");
    }
}
