package busyqa.userdefinedExceptions;

public class NotEligibleToVoteException extends RuntimeException {
    public NotEligibleToVoteException(String message){
        super(message);
    }
}