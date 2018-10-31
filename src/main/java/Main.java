/*
Part b) acts as a driver project creating a handful of fictional students with mock data,
adding the students to a number of modules and adding a number of modules to a course.
Further on, the program should print out a list of all the courses, their respective modules,
and all students, their usernames, assigned modules and the course(s) they are registered
for to the console.
 */

public class Main {
    public static void main(String args[]) {
        String csModuleIds[] = {"CT417", "CT421", "CT445"};
        String eeModuleIds[] = {"CT417", "EE425", "EE462"};

        Student student1 = new Student("John Doe", 18, "1/1/2000", 12345678, "CS&IT", csModuleIds);
        Student student2 = new Student("Mary Doe", 19, "1/1/1999", 87654321, "CS&IT", csModuleIds);
        Student student3 = new Student("James Smith", 18, "1/1/2000", 13572468, "ECE", eeModuleIds);
        Student student4 = new Student("Andrew O'Connor", 22, "1/1/1996", 86427531, "ECE", eeModuleIds);

        // shared modules
        Student[] ct417Students = {student1, student2, student3, student4};
        String[] ct417Courses = {"CS&IT", "ECE"};
        Module ct417 = new Module("Software Engineering III", "CT417", ct417Students, ct417Courses);

        // CS modules
        Student[] ct421Students = {student1, student2};
        String[] ct421Courses = {"CS&IT"};
        Module ct421 = new Module("Java Programming III", "CT421", ct421Students, ct421Courses);

        Student[] ct445Students = {student1, student2};
        String[] ct445Courses = {"CS&IT"};
        Module ct445 = new Module("Database Systems II", "CT445", ct445Students, ct445Courses);

        // EE modules
        Student[] ee425Students = {student3, student4};
        String[] ee425Courses = {"ECE"};
        Module ee425 = new Module("Digital Systems III", "EE425", ee425Students, ee425Courses);

        Student[] ee462Students = {student3, student4};
        String[] ee462Courses = {"ECE"};
        Module ee462 = new Module("Analogue Systems Design", "EE462", ee462Students, ee462Courses);

        // Add modules to courses
        Module[] csModules = {ct417, ct421, ct445};
        Module[] eeModules = {ct417, ee425, ee462};

        Course csit = new Course("CS&IT", csModules, "1/09/2018", "10/05/2019");
        Course ece = new Course("ECE", eeModules, "1/09/2018", "10/05/2019");

        // Print course data
        System.out.println(csit.getCourseDetails());
        System.out.println(ece.getCourseDetails());

    }
}
