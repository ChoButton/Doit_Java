package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	public Class loadClass(String fileName, String classNeme) throws
		FileNotFoundException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(classNeme);
		return c;
	}
	public static void main(String[] args) {
		ThrowsException test = new ThrowsException();
		try {
		test.loadClass("a.txt", "java.lang.String");
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}