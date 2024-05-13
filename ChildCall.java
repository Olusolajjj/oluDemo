import org.testng.annotations.Test;

public class ChildCall {
	
	@Test
	
	public void exec1() {
		
		Parent obj1 = new Parent(3);
	
		System.out.println(obj1.add());
		System.out.println(obj1.sub());
		
		//Parent2 obj2 = new Parent2 (4);
		System.out.println(obj1.mult());
		System.out.println(obj1.div());
		
		
		
	}
	

}
