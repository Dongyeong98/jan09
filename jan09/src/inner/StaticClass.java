package inner;
/*
 * 	정적 클래스 Static Class
 * class앞에 Static이 붙은 것이 차이점입니다.
 * Static이 붙었기 때문에 객체 생성없이 사용가능합니다.
 * 클래스의 Static변수처럼 사용됩니다.
 * 외부 클래스와 내부 클래스는 다르게 동작합니다.
 * 외부 클래스와 내부 클래스의 멤버가 private라도 접근 가능
 * 경로만 지정되면 단독으로 활용할 수 있습니다.
 * 
 */
public class StaticClass {
	private int outMember = 10;
	public static int outStatic = 55;
	
	public static class Inner{
		public static void innerMethod() {
			System.out.println(outStatic);
		}
	
		public void innerMethod2() {
			System.out.println(outStatic);
		}
	}
	
	
	public static void main(String[] args) {
		StaticClass.Inner in = new StaticClass.Inner();
		//in.innerMethod(); //이렇게 호출하면 안 됩니다. (static이 붙어있어서 클래스명으로 호출되야한다)
		StaticClass.Inner.innerMethod(); //non static
		in.innerMethod2();
		
		
	}
}
