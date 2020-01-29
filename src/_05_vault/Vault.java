package _05_vault;

public class Vault {
	int secretcode;
	public Vault(int secretcode) {
	this.secretcode=secretcode;
	
	}
public static void main(String[] args) {
	Vault v= new Vault(900);
	
	boolean p=v.tryCode(100);
System.out.println(p);
	}
boolean tryCode (int x) {
	if (x==secretcode) {
		return true;
	}else {
		return false;
	}
}
}
