package by.goncharov.task03.exeptions;

public class MatrixException extends Exception {
    public MatrixException() {
    }
    public MatrixException(String message) {
        super(message);
    }
    public MatrixException(String message, Throwable cause) {
        super(message, cause);
    }
    public MatrixException(Throwable cause) {
        super(cause);
    }
}
//TODO exception