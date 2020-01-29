package _05_vault;

public class Jamesbond {
public static void main(String[] args) {
	Jamesbond j= new Jamesbond();
	j.findCode(new Vault());
	System.out.println(j.findCode(new Vault()));
}
int findCode(Vault v) {
	for (int i = 0; i < 1000000; i++) {
if (v.tryCode(i)==true) {
	return i;
}

	}
	return -1;
}
}
