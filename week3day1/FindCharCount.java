package week3.day1;

public class FindCharCount {

	public static void main(String[] args) {
		String s="TestLeaf";
		int count=0;
			char[]ch=	s.toCharArray();
		for(int i=0;i<ch.length-1;i++) {
			if(ch[i]=='e') {
				count++;
			}
			}
		System.out.println("the count of 'e' in string is  " +count++);
		}
			
		
			

	}


