package StringTest;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "홍길동";
		String str2 = new String("홍길동");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
	
		String str3 = "Hi하이";
		String str4 = "HiHi";
		String str5 = "하이하이";
		
		byte[] bytes1 = str3.getBytes();
		byte[] bytes2 = str4.getBytes();
		byte[] bytes3 = str5.getBytes();
		System.out.println("bytes1.length = " + bytes1.length);
		System.out.println("bytes2.length = " + bytes2.length);
		System.out.println("bytes3.length = " + bytes3.length);
		
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		if(subject.indexOf("자바") != -1) {
			System.out.println("Book about Java");
		} else
		{System.out.println("Book about something else");}
		
		
		
	}

}
