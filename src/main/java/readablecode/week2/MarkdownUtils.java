package readablecode.week2;

import java.util.List;

public class MarkdownUtils {
	// TODO1 : use early return:Readable code 7.5, 7.7 and remove the 1 nest(you
	// might need to change if condition and if condition is complicated such as
	// if(!(...)) please refactor it after you read 7.2)
	// * you do not need to improve exception handling
	
	// TODO2 : add line break and comment for each block/paragraph after you read
	// Readable code 4.7
	
	// TODO3 : re-name the variables after you read Readable code 2.2 2.7, 3.8
	
	// TODO4 : re-name method as it is after you read Readable code 3.0, 3.9
	
	// TODO5 : remove the unnecessary variable after you read Readable code 9.1
	private static final String PIPE = "|";

	public static String createTables(List<String> listTexts, int emptyRowCount) throws IllegalArgumentException {
		//7.7のネストを浅くするために関数の先頭に異常系となる条件を集めて即座にreturnする。
		if (listTexts == null) {
			throw new IllegalArgumentException("引数listTextがnullです");
		}
		if (listTexts.isEmpty()) {
			throw new IllegalArgumentException("引数listTextが空です");
		}
		if (emptyRowCount <= 0) {
			throw new IllegalArgumentException("引数emptyRowCountが0以下です");
		}

		StringBuilder table = new StringBuilder();

		for (String text : listTexts) {
			table.append(PIPE);
			table.append(text);
		}
		table.append(PIPE);
		table.append(System.lineSeparator());

		for (String text : listTexts) {
			table.append(PIPE);
			for (int i = 0; i < text.length(); i++) {
				table.append("-");
			}
		}
		table.append(PIPE);
		table.append(System.lineSeparator());

		for (int i = 0; i < emptyRowCount; i++) {
			for (String text : listTexts) {
				table.append(PIPE);
				for (int j = 0; j < text.length(); j++) {
					table.append(" ");
				}
			}
			table.append(PIPE);
			table.append(System.lineSeparator());
		}
		return table.toString();
	}
}

