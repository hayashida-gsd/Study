package Sample;

import java.io.FileNotFoundException;

public class NotFoundSample {
	public static void main(String[] args) {
		NotFound n = new NotFound();
		try {
			n.throwSample();
			System.out.println("通常の処理");
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			System.out.println("finallyの処理");
		}
	}
}