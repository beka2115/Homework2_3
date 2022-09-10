import javax.naming.LimitExceededException;

public class LimitException extends Exception {
    private Double remainAmount;

    public LimitException(String message, Double remainAnount) {
        super(message);
        this.remainAmount = remainAnount;
    }

    public Double getRemainAmount() {
        return remainAmount;
    }


}
