package polimorfismo;

public class EX1polimorfismoclassepreguica extends 
EX1polimorfismo{
	
	private String preguica;
	
	
	public String getPreguica() {
		return preguica;
	}
	public void setPreguica(String string) {
		this.preguica = string;
	}
	public String getsomanimal()
	{
		return "aghhhh" +super.getSomanimal()+"\tpreguiça"+this.getPreguica();
	}
	

}
