// 9. Online Exam Submission
import java.time.LocalDateTime;

class LateSubmissionException extends Exception { public LateSubmissionException(String msg){super(msg);} }
class InvalidFileFormatException extends Exception { public InvalidFileFormatException(String msg){super(msg);} }

class ExamPortal {
    private LocalDateTime deadline = LocalDateTime.of(2025, 11, 10, 10, 0);

    public void submitExam(String fileName, LocalDateTime submissionTime)
            throws LateSubmissionException, InvalidFileFormatException {
        if (!fileName.endsWith(".pdf"))
            throw new InvalidFileFormatException("Submission failed: invalid file format.");
        if (submissionTime.isAfter(deadline))
            throw new LateSubmissionException("Submission failed: exam submitted late.");
        System.out.println("Exam submitted successfully!");
    }
}

public class ExamSubmission {
    public static void main(String[] args) {
        ExamPortal ep = new ExamPortal();
        try {
            ep.submitExam("assignment.docx", LocalDateTime.now());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

