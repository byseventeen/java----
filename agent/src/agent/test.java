package agent;

public class test {
	public static void main(String[] args){
		Code jerry= new CodeOne("jerry");
		jerry.Coding();
		
		Code jerryProxy =new Proxy(jerry);
		jerryProxy.Coding();
	}
}
