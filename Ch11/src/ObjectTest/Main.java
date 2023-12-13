package ObjectTest;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		String obj1 = new String(); 
		
//		MyClass m = new MyClass();
//		System.out.println(m.toString()); 
//
		
//		Object obj1 = new Object();
//		Object obj2 = new Object();
//		
//		System.out.println(obj1 == obj2);
//		System.out.println(obj1.equals(obj2)); 
//		
//		String str1 = new String("HI");
//		String str2 = new String("HI");
//		
//		System.out.println(str1 == str2); 
//		System.out.println(str1.equals(str2));
//		
//		Object str3 = new String("HI");
//		Object str4 = new String("HI"); 
//		
//		System.out.println(str3 == str4);
//		System.out.println(str3.equals(str4)); 
//		
//		Object obj3 = new MyClass(123);
//		Object obj4 = new MyClass(123);
//		
//		System.out.println(obj3 == obj4);
//		System.out.println(obj3.equals(obj4)); 
		
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		Key k1 = new Key(1);
		Key k2 = new Key(1);
		
		System.out.println(k1.equals(k2));
		
		hashMap.put(k1, "HongBakSa");
		String value = hashMap.get(k2);
		System.out.println(value); 
		
		
		
		
	}

}
