package agent;

public class CodeOne implements Code{
	private String name;
	public CodeOne(String name) {
		this.name=name;
	}
	public void Coding(){
		System.out.println("程序员"+name+"写代码中...");
	}	
}
