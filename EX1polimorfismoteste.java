package polimorfismo;

public class EX1polimorfismoteste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EX1polimorfismoclassecachorro xxx = new EX1polimorfismoclassecachorro();
		xxx.setSomanimal("auawawauauuuu");
		xxx.setCachorro("cachorro");
		
		Ex1polimorfismoclassecavalo yyy = new Ex1polimorfismoclassecavalo();
		yyy.setSomanimal("iiirrrôôôôôôôôpxi");
		yyy.setCavalo("cavalo");
		
		EX1polimorfismoclassepreguica zzz =new EX1polimorfismoclassepreguica();
		zzz.setSomanimal("aghhhh");
		zzz.setPreguica("preguiça");
		
		System.out.println("\n"+xxx.getSomanimal()+": "+xxx.getCachorro());
		System.out.println("\n"+yyy.getSomanimal()+": "+yyy.getCavalo());
		System.out.println("\n"+zzz.getSomanimal()+": "+zzz.getPreguica());
		
	}
}