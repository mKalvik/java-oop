package grinder;

public class GrinderNotCleanException extends RuntimeException {
    public GrinderNotCleanException(String errorMsg){
        super(errorMsg);
    }
}
