import java.util.Scanner;

class student {
    int USN;
    String Name;

    Student() {
    }

    Student(int usn, String name) {
        USN = usn;
        Name = name;
    }

    void accept(Scanner x) {
        System.out.print("USN: ");
        USN = x.nextInt();

        System.out.print("Name: ");
        Name = x.next();
    }

    void display() {
        System.out.println("USN: " + USN + " Name: " + Name);
    }
}

class studentrun {
    public static void main(String a[]) {
        Scanner y = new Scanner(System.in);

        System.out.print("Number of students: ");
        int stunum = y.nextInt();

        student s[] = new student[stunum];

        for (int i = 0; i < stunum; i++) {
            s[i] = new student();
            s[i].accept(y);
        }

        System.out.println("\nstudent details:");

        for (int i = 0; i < stunum; i++) {
            s[i].display();
        }
    }
}
