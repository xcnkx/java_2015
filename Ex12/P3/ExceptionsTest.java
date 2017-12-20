public class ExceptionsTest {
    private static String owners[] = {"Owner1","Owner2","Owner3"};
    private static String lpns[] = {"LPN1", "LPN2","LPN3"};
    
    private static int findVehicleByOwner(String ownerName) 
	throws NoSuchOwnerException 
    {
	for(int i=0; i<owners.length; i++) {
	    if (ownerName.equals(owners[i])) return i;
	}
	
	// Not found, write your code for raising the "NoSuchOwnerException".
	throw new NoSuchOwnerException("Owner not found: " + ownerName);
    }
    
    static void replaceLPN(String ownerName, String lpn) 
	throws CannotReplaceException
    // write a throws clause for the "CannotReplaceException" exception.
    {
	// Write your code to do the followings:
	try{
	    lpns[findVehicleByOwner(ownerName)] = lpn;
	}
	catch(NoSuchOwnerException e){
	    throw new CannotReplaceException("Cannot Replace: " + lpn,e);
	} 
    }
    
    public static void main(String[] args) {
	try {
	    replaceLPN("Owner4", "LPN4-2");
	} catch(CannotReplaceException e ) {
	    System.out.println("In main, Exceptions: " + e.getCause().getMessage() 
			       + ", " + e.getMessage());
	}
    }
}
