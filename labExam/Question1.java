package labExam;

public class Question1 {
	public static String insertChar(String str, String ch, int position) {
		return str.substring(0, position) + ch + str.substring(position);
		}

	public static void main(String[] args) {
		String s = "RCCIIT";
		String c = " in Kolkata ";
		int pos = 3;
		System.out.println(insertChar(s,c,pos));
	}
}
                                                                    