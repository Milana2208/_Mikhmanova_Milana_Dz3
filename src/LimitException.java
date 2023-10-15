public class LimitException {
    private int remainingAmount;

    public LimitException(String message,int remainingAmount){
        super(message);
        this.remainingAmount = remainingAmount;
    }

    public Integer getRemainingAmount() {
        return remainingAmount;
    }
}
