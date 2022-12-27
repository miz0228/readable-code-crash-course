package readablecode.week1;

public class Strings {
	// TODO 1: 7.5,7.7 and 9.1
	public static String capitalize(String str) {
		// 変数を削除する(retという変数)
		//関数の先頭に異常系となる条件を集めて即座にreturnする
		if(str==null || str.length()==0) return str;
		//ネストを浅くする
		if(str.length()==1) {
			return str.toUpperCase();
		}else {
			return str.substring(0, 1).toUpperCase() + str.substring(1);
		}
	}
}
	
//既存のコード
//	String ret = str;
//	if (str == null) {
//		ret = str;
//	} else if (str.length() == 0) {
//		ret = str;
//	} else {
//		if (str.length() == 1) {
//			ret = str.toUpperCase();
//		} else {
//			ret = str.substring(0, 1).toUpperCase() + str.substring(1);
//		}
//	}
//	return ret;
//}
