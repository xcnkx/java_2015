public class CannotReplaceException extends Exception{
    public CannotReplaceException(){}
    public CannotReplaceException(String message){
	super(message);
    }
    public CannotReplaceException(String message,Throwable cause){
	super(message,cause);
    }
}