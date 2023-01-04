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
	
	public static String createTables(List<String> listTexts, int c) throws IllegalArgumentException {
		//7.7のネストを浅くするために関数の先頭に異常系となる条件を集めて即座にreturnする。
		if(listTexts==null && listTexts.isEmpty() && c<=0) {
			throw new IllegalArgumentException("");
		}
		StringBuilder table = new StringBuilder();
		
		//4.7から各コードを段落に分割しています
		for (String text : listTexts) {
			table.append("|");
			table.append(text);
		}
		table.append("|");
		table.append(System.lineSeparator());
		
		for (String text : listTexts) {
			tmp.append("|");
			for (int i = 0; i < e.length(); i++) {
				tmp.append("-");
			}
		}
		tmp.append("|");
		tmp.append(System.lineSeparator());
		
		for (int i = 0; i < c; i++) {
			for (String e : listTexts) {
				tmp.append("|");
				for (int j = 0; j < e.length(); j++) {
					tmp.append(" ");
				}
			}
			tmp.append("|");
			tmp.append(System.lineSeparator());
		}
		//9.1のように役に立たない一時変数を削除して返す
		return table.toString();
	}
		
//既存のコード
//if (l != null && !l.isEmpty() && c > 0) {
//	StringBuilder tmp = new StringBuilder();
//	for (String e : l) {
//		tmp.append("|");
//		tmp.append(e);
//	}
//	tmp.append("|");
//	tmp.append(System.lineSeparator());
//	for (String e : l) {
//		tmp.append("|");
//		for (int i = 0; i < e.length(); i++) {
//			tmp.append("-");
//		}
//	}
//	tmp.append("|");
//	tmp.append(System.lineSeparator());
//	for (int i = 0; i < c; i++) {
//		for (String e : l) {
//			tmp.append("|");
//			for (int j = 0; j < e.length(); j++) {
//				tmp.append(" ");
//			}
//		}
//		tmp.append("|");
//		tmp.append(System.lineSeparator());
//	}
//	String result = tmp.toString();
//	return result;
//} else {
//	throw new IllegalArgumentException("");
//}