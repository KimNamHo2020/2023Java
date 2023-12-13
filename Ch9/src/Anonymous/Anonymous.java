package Anonymous;

public class Anonymous {
	int field = 1;
	
	void method(final int arg1, final int arg2) {
		final int var1 = 2;
		final int var2 = 3;
		
//		arg1 = 4;
//		arg2 = 5;
		
//		var1 = 6;
//		var2 = 7;
		
		Calculatable c = new Calculatable() {
			public int sum() {
				int result = field+arg1+arg2+var1+var2;
				return result;
			}
		};
		
		System.out.println(c.sum());
	}
}
