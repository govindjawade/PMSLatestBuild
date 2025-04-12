package JavaPractise.inheritanceTheory.Inheritance1;
//java agar exception handle karega to prog terminate karega isiliye apan hum handle karenge with try catch
public class ExceptionHandlingTherory {
    public static void main(String[] args) {
        // System.out.println(5 / 0);
        String s = null;
        System.out.println(s.length());

    }
}
                 /*
 * Java Throwable Class Structure
 *
 * java.lang.Object
 * └── java.lang.Throwable               // Root class for all errors & exceptions
 *        |
 *        |-- java.lang.Error            // Serious errors (mostly JVM-related, not recoverable)
 *        |       |
 *        |       |-- OutOfMemoryError            // JVM runs out of memory
 *        |       |-- StackOverflowError          // Infinite recursion overflows call stack
 *        |       |-- VirtualMachineError         // JVM internal critical errors
 *        |       |-- LinkageError                // Class definition mismatch
 *        |       └── AssertionError              // Assert statement fails
 *        |
 *        |-- java.lang.Exception         // Application-level exceptions (can handle in code)
 *                |
 *                |-- Checked Exceptions         // Must handle using try-catch or throws
 *                |       |
 *                |       |-- IOException             // Input/Output operation failure
 *                |       |-- SQLException            // Database access error
 *                |       |-- ClassNotFoundException  // Class not found at runtime
 *                |       |-- InterruptedException    // Thread got interrupted
 *                |       └── FileNotFoundException   // Specific file not found
 *                |
 *                |-- Unchecked Exceptions (RuntimeException)  // Logical errors in code
 *                        |
 *                        |-- NullPointerException        // Object reference is null
 *                        |-- ArithmeticException         // Math error (e.g. division by zero)
 *                        |-- ArrayIndexOutOfBoundsException // Invalid index for array
 *                        |-- NumberFormatException       // Invalid string to number conversion
 *                        |-- IllegalArgumentException    // Invalid arguments to method
 */
