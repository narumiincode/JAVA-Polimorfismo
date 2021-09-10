package polimorfismo;

public class EX1polimorfismoclassecachorro extends 
EX1polimorfismo{
	
 private String cachorro;


public String getCachorro() {
	return cachorro;
}
public void setCachorro(String string) {
	this.cachorro = string;
}

public String getsomanimal()
{
	return "auawawauauuuu" +super.getSomanimal()+"\tcachorro"+this.getCachorro();
}
	
}

 
