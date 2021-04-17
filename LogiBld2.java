import java.util.Scanner;
public class LogiBld2 {
	public static void rep(String[] s2) {
		String result="";
		for(int i=0;i<s2.length;i++) {
			char[] c1=s2[i].toCharArray();
			for(int j=0;j<c1.length;j++) {
				if(j==0 || j%2==0) {
					result+=c1[j];
				}
			}
			for(int j=0;j<c1.length;j++) {
				if(j%2==1) {
					result+=c1[j];
				}
			}
			result+=" ";
			
		}
		System.out.println(result);
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String[] s2=s1.split(" ");
		rep(s2);
	}
}
