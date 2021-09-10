package polimorfismo;

public class Ex1polimorfismoclassecavalo extends 
EX1polimorfismo{
	
	private String cavalo;


public String getCavalo() {
		return cavalo;
	}
	public void setCavalo(String string) {
		this.cavalo = string;
	}
public String getsomanimal()
{
	return "iiirrrôôôôôôôôpxi" +super.getSomanimal()+"\tcavalo"+this.getCavalo();
}
	
}


