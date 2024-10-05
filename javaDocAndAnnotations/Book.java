/**
 * @author Greninja
 * @version 1.0
 * @since 2024.3
 */

package javaDocAndAnnotations;

/**
 *
 * Class for library book tally
 */
public class Book {
    /**
     * value 43 default value
     */
    static int val = 43;

    /**
     * parameterized constructor
     * @param s Book name
     */

    public Book(String s) {
    }

    /**
     * Issue Books to a student
     * @param rollNo number of the student
     * @throws Exception if book is not available throws exception
     */
    public void issue(int rollNo) throws Exception {

    }

    /**
     * Check whether required book is available or not
     * @param str Book name
     * @return if book is available returns true else false
     */
    public boolean available(String str) {
        return true;
    }

    /**
     * get value by id
     * @param id specific id generated for each book
     * @return it gives the name of book
     */
    public static String getVal(int id) {
        return "";
    }

    /**
     * the main method
     * @param args argument are the value of literals and variables
     */
    public static void main(String[] args) {

    }
}
