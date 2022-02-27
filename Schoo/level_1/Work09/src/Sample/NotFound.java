package Sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class NotFound {
	public void throwSample() throws FileNotFoundException {
		// 存在しないファイルを読み込ませる処理
		String filePath = "";
		File dummy = new File(filePath);
		FileReader f = new FileReader(dummy);
	}
}