
package eu.nexume.fragmentsviewpager;

/**
 * {@link Students} represents lists of students.
 */
public class Students {

    /**
     * String resource for the name the Student
     */
    private final String mStudentName;

    /**
     * String resource for the number of the Student
     */
    private final String mStudentNumber;

    /**
     * Create a new Site object.
     * @param studentName   is the string resource for the name of the Student
     * @param studentNumber is the string resource for address of the the Student
     */
    public Students(String studentName, String studentNumber) {
        mStudentName = studentName;
        mStudentNumber = studentNumber;
    }

    /**
     * Get the string resource for the name of the Student.
     */
    public String getStudentName() {
        return mStudentName;
    }

    /**
     * Get the string resource for the number of the Student.
     */
    public String getStudentNumber() {
        return mStudentNumber;
    }


}