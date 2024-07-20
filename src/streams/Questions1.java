package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Questions1 {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student(1, "Rohit", "Mall", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122),
                new Student(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67),
                new Student(3, "Ankit", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164),
                new Student(4, "Satish Ray", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
                new Student(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12),
                new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),
                new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
                new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
                new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
                new Student(10, "Shubham", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98));


        System.out.println("Find list of students whose first name starts with alphabet A");
        List<Student> q1 = studentList.stream()
                .filter(student -> student.getFirstName().startsWith("A"))
                .toList();
        System.out.println(q1);
        System.out.println("----------");

        System.out.println("Group The Student By Department Names");
        Map<String, List<Student>> q2 = studentList.stream()
                .collect(Collectors.groupingBy(Student::getDepartmantName));
        System.out.println(q2);
        System.out.println("----------");

        System.out.println("Find the total count of student using stream");
        long q3 = studentList.stream()
                .count();
        System.out.println(q3);
        System.out.println("----------");

        System.out.println("Find the max age of student");
        Student q4 = studentList.stream()
                .max(Comparator.comparing(Student::getAge)).get();
        System.out.println(q4);
        System.out.println("----------");

        System.out.println("Find all departments names");
        List<String> q5 = studentList.stream()
                .map(Student::getDepartmantName)
                .distinct()
                .sorted()
                .toList();
        System.out.println(q5);
        System.out.println("----------");

        System.out.println("Find the count of student in each department. Sort the map based on highest number of students");
        Map<String, Long> q6 = studentList.stream()
                .collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println(q6);
        System.out.println("----------");

        System.out.println("Find the list of students whose age is less than 30");
        List<Student> q7 = studentList.stream()
                .filter(student -> student.getAge() < 30)
                .sorted(Comparator.comparing(Student::getAge))
                .toList();
        System.out.println(q7);
        System.out.println("----------");

        System.out.println("Find the list of students whose rank is in between 50 and 100");
        List<Student> q8 = studentList.stream()
                .filter(student -> student.getRank() >= 50 && student.getRank() <= 100)
                .sorted(Comparator.comparing(Student::getRank))
                .toList();
        System.out.println(q8);
        System.out.println("----------");

        System.out.println("Find the average age of male and female students");
        Map<String, Double> q9 = studentList.stream()
                .collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));
        System.out.println(q9);
        System.out.println("----------");

        System.out.println("Find the department who is having maximum number of students");
        Map.Entry<String, Long> q10 = studentList.stream()
                .collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue()).get();
        System.out.println(q10.getKey());
        System.out.println("----------");

        System.out.println("Find the Students who stays in Delhi and sort them by their names");
        List<Student> q11 = studentList.stream()
                .filter(student -> student.getCity().equals("Delhi"))
                .sorted(Comparator.comparing(Student::getFirstName).thenComparing(Student::getLastName))
                .toList();
        System.out.println(q11);
        System.out.println("----------");

        System.out.println("Find the average rank in all departments and sort by average rank in ascending order");
        LinkedHashMap<String, Double> q12 = studentList.stream()
                .collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.averagingInt(Student::getRank)))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println(q12);
        System.out.println("----------");

        System.out.println("Find the highest rank in each department");
        Map<String, Optional<Student>> q13 = studentList.stream()
                .collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.maxBy(Comparator.comparing(Student::getRank))));
        System.out.println(q13);
        System.out.println("----------");

        System.out.println("Find the student who has second rank");
        Student q14 = studentList.stream()
                .sorted(Comparator.comparing(Student::getRank))
                .skip(1)
                .findFirst().get();
        System.out.println(q14);
        System.out.println("----------");

    }
}

/**
 * The Class Student.
 */
class Student {

    /**
     * The id.
     */
    private int id;

    /**
     * The first name.
     */
    private String firstName;

    /**
     * The last name.
     */
    private String lastName;

    /**
     * The age.
     */
    private int age;

    /**
     * The gender.
     */
    private String gender;

    /**
     * The departmant name.
     */
    private String departmantName;

    /**
     * The joined year.
     */
    private int joinedYear;

    /**
     * The city.
     */
    private String city;

    /**
     * The rank.
     */
    private int rank;

    /**
     * Instantiates a new employee.
     *
     * @param id             the id
     * @param firstName      the first name
     * @param lastName       the last name
     * @param age            the age
     * @param gender         the gender
     * @param departmantName the departmant name
     * @param joinedYear     the joined year
     * @param city           the city
     * @param rank           the rank
     */
    public Student(int id, String firstName, String lastName, int age, String gender, String departmantName,
                   int joinedYear, String city, int rank) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.departmantName = departmantName;
        this.joinedYear = joinedYear;
        this.city = city;
        this.rank = rank;
    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id the new id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name.
     *
     * @param firstName the new first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name.
     *
     * @param lastName the new last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the age.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age.
     *
     * @param age the new age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets the gender.
     *
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the gender.
     *
     * @param gender the new gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Gets the departmant name.
     *
     * @return the departmant name
     */
    public String getDepartmantName() {
        return departmantName;
    }

    /**
     * Sets the departmant name.
     *
     * @param departmantName the new departmant name
     */
    public void setDepartmantName(String departmantName) {
        this.departmantName = departmantName;
    }

    /**
     * Gets the joined year.
     *
     * @return the joined year
     */
    public int getJoinedYear() {
        return joinedYear;
    }

    /**
     * Sets the joined year.
     *
     * @param joinedYear the new joined year
     */
    public void setJoinedYear(int joinedYear) {
        this.joinedYear = joinedYear;
    }

    /**
     * Gets the city.
     *
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the city.
     *
     * @param city the new city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets the rank.
     *
     * @return the rank
     */
    public int getRank() {
        return rank;
    }

    /**
     * Sets the rank.
     *
     * @param rank the new rank
     */
    public void setRank(int rank) {
        this.rank = rank;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
                + ", gender=" + gender + ", departmantName=" + departmantName + ", joinedYear=" + joinedYear + ", city="
                + city + ", rank=" + rank + "]";
    }

}

