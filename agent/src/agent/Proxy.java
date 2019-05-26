package agent;

public class Proxy implements Code{
	private Code CodeOne;
	public Proxy(Code CodeOne){
		this.CodeOne=CodeOne;
	}
	public void Coding(){
		System.out.println("ÕýÔÚÐ´ÎÄµµ");
		this.CodeOne.Coding();
	}
}
