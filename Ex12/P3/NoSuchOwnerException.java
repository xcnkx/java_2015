public class NoSuchOwnerException extends Exception{
    // public NoSuchOwnerException(){}
    public NoSuchOwnerException(String message){
    	super(message);
     }
    public NoSuchOwnerException(String message,Throwable cause){
    	super(message,cause);
    }
}
