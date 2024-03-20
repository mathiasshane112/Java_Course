//package homework_file.School;
//
//public class TesterCourse_Student {
//
//    // HW 3 - Question 3
//
////    public static void main(String[] args) {
////        Course math = new Course("Math", 101, 3, "Calculus");
////        Course math2 = new Course("Math", 101, 3, "Calculus");
////        Course history = new Course("History", 101, 3, "US History");
////        System.out.println(math.equals(math2));
////        System.out.println(math.equals(history));
////    }
//
//    // HW 3 - Question 8
//
//    public static void main(String[] args) {
//        Student bob = new Student("Bob", 123);
//        Course math = new Course("Math", 101, 3, "Calculus");
//        Course history = new Course("History", 101, 3, "US History");
//        Course english = new Course("English", 101, 3, "English 101");
//        Course science = new Course("Science", 101, 3, "Biology");
//        Course art = new Course("Art", 101, 3, "Art History");
//
//        // adding and dropping courses
//        bob.addingCourse(math);
//        bob.addingCourse(history);
//        bob.addingCourse(english);
//        bob.addingCourse(science);
//        System.out.println(bob);
//
//        bob.droppingCourse(english);
//        bob.addingCourse(art);
//        bob.droppingCourse(math);
//        System.out.println(bob);
//
//        System.out.println(" ");
//
////        // adding same class twice and dropping a class that is not in the list
//
//        Student alice = new Student("Alice", 456);
//        alice.droppingCourse(art);
//        System.out.println(alice);
//
//        alice.addingCourse(history);
//        alice.addingCourse(history);
//        System.out.println(alice);
//
//        // adding a course back after dropping it
//        alice.addingCourse(english);
//        alice.droppingCourse(english);
//        System.out.println(alice);
//        alice.addingCourse(english);
//        System.out.println(alice);
//
//        System.out.println(" ");
//
////        // putting more than 4 courses in the list
//
//        Student trent = new Student("Trent", 789);
//        trent.addingCourse(math);
//        trent.addingCourse(history);
//        trent.addingCourse(english);
//        trent.addingCourse(science);
//        trent.addingCourse(art);
//        System.out.println(trent);
//
//        System.out.println(" ");
//
//        Student jessica = new Student("Jessica", 101);
//        System.out.println(jessica);
//
//
//// test the qualifyForMajor method
//
//        System.out.println(math.qualifyForMajor(bob.courses));
//        System.out.println(history.qualifyForMajor(bob.courses));
//        System.out.println(english.qualifyForMajor(bob.courses));
//        System.out.println(science.qualifyForMajor(bob.courses));
//        System.out.println(art.qualifyForMajor(bob.courses));
//
//
//
//    }
//}
//
