import mygame.server.*;
import mygame.shared.*;
import mygame.client.*;
class Package{
    public static void main(String[] args){
	Server v1 = new Server();
	Utilities v2 = new Utilities();
	Client v3 = new Client();
	v1.methodServer();
	v2.methodUtilities();
	v3.methodClient();
    }
}