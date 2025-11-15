import java.io.File;
public class FileHandlingTwo{
	public static void main(String[] args){
		System.out.println("Jiya Gosain, 24csu313");
		File file = new File("D:\\java_NCU\\exp-9");
		if(file.exists()){
			System.out.println("Before changing permissions.");
			System.out.println("Readable: "+file.canRead());
			System.out.println("Writable: "+file.canWrite());

			file.setWritable(false);
            		file.setExecutable(false);

			System.out.println("After changing permissions.");
			System.out.println("Readable: "+file.canRead());
			System.out.println("Writable: "+file.canWrite());
		}
		else{
			System.out.println("File not found");
		}
	}
}