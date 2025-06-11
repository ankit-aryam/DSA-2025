import java.util.*;

// Student class implementing Comparable for sorting by marks
class Student implements Comparable<Student> {
    String name;
    int marks;

    // Constructor
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Implementing compareTo() for default sorting by marks
    public int compareTo(Student s) {
        return this.marks - s.marks;  // Ascending order by marks
    }

    public String toString() {
        return name + " - " + marks;
    }
}

// Comparator class to sort students by name
class SortByName implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.name.compareTo(b.name);  // Sorting by name alphabetically
    }
}

// Comparator class to sort students by marks in descending order
class SortByMarksDescending implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return b.marks - a.marks;  // Sorting by marks in descending order
    }
}

public class comparatorVsComparable {
    public static void main(String[] args) {
        // Creating a list of Student objects
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Rahul", 85));
        list.add(new Student("Aman", 92));
        list.add(new Student("Neha", 78));
        list.add(new Student("Simran", 85));

        // ----- Comparable Example -----
        System.out.println("Sorted by marks (using Comparable):");
        Collections.sort(list);  // Uses compareTo() from Comparable
        for (Student s : list) {
            System.out.println(s);
        }

        System.out.println();

        // ----- Comparator Example 1: Sorting by name -----
        System.out.println("Sorted by name (using Comparator):");
        Collections.sort(list, new SortByName());  // Uses compare() from SortByName
        for (Student s : list) {
            System.out.println(s);
        }

        System.out.println();

        // ----- Comparator Example 2: Sorting by marks descending -----
        System.out.println("Sorted by marks (descending, using Comparator):");
        Collections.sort(list, new SortByMarksDescending());  // Uses compare() from SortByMarksDescending
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
