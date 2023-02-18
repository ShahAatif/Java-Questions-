import java.util.*;

class an_student {
    int marks, roll;
    String name = "";
    static int rollgen = 100;
    
    void getData() {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        marks = sc.nextInt();
    }
    boolean eligibility() {
        if (marks > 59) {
            roll = ++rollgen;
            return true;
        }
        else    return false;
    }

    void showData() {
        System.out.println("name : " + name);
        System.out.println("Roll no : " + roll);
    }
}

public class an_classwork {
    public static void main(String args[]) {
        an_student s[2] = new an_student();

        for (int i = 0; i < s.length; i++) {
            s[i].getData();
        }

        for (int i = 0; i < s.length; i++) {
            if (s[i].eligibility())     s[i].showData();
            else    System.out.println(s[i].name + " is Not elligible");
        }

        // s.getData();
        // if (s.eligibility())     s.showData();
        //     else    System.out.println(s.name + " is Not elligible");

    }
}