import java.io.FileNotFoundException;
class ResourcesManager {
    void getResource() {
	try {
	    getFileResource();
	} catch (FileNotFoundException e) {
	    ResourseNotFoundException e2 = new ResourseNotFoundException(e);
	    throw e2;
	}
    }
    
    void getFileResource() throws FileNotFoundException {
	throw new FileNotFoundException();
    }
}

class ResourseNotFoundException extends RuntimeException{
    public ResourseNotFoundException(Throwable cause){
	super(cause);
    } 
}

public class ChainTest {
    
    public static void main(String[] args) {
	ResourcesManager obj = new ResourcesManager();
	obj.getResource();
    }   
}

/*回答
最初にgetFileResourse内でFileNotFoundExceptionをthrowし、getResourseがその例外をキャッチする。
キャッチ内の処理でResourseNotFoundExceptionクラスのオブジェクトe2を生成し、それをthrowする。
ResourseNotFoundException内でRuntimeExceptionをオーバーライドしているため、throwすることでエラーを出力する。
*/