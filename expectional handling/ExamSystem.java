// 12. Online Exam System
import java.io.IOException;

class InvalidStudentException extends Exception { public InvalidStudentException(String msg){super(msg);} }

class OnlineExam {
    public void validateStudent(String name) throws InvalidStudentException {
        if (!name.equals("Amit"))
            throw new InvalidStudentException("Invalid student record!");
    }

    public void submitExam(String name) throws InvalidStudentException, IOException {
        validateStudent(name);
        throw new IOException("Network error while submitting exam!");
    }
}

public class ExamSystem {
    public static void main(String[] args) {
        OnlineExam oe = new OnlineExam();
        try {
            oe.submitExam("Ravi");
        } catch (InvalidStudentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Exam submission process completed.");
        }
    }
}
