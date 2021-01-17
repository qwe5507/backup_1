package ex3_autowiring;

import java.io.FileWriter;

public class Outputer {
	String path;
	
	public void setPath(String path) {
		this.path = path;
	}
	
	public void writeMessage(String msg) throws Exception {
		FileWriter out = new FileWriter(path);
		out.write(msg);
		out.close();
	}
}