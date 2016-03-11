public class Palindrome{
	public static void main(String[]args){
		int b = 0, p = 0;
		String recep = args [0];
		String tst;
		int tmnho = 5;
//tmnhp e o tamanho do parametro informado;	
		int tmnhp = recep.length();
		int teste = tmnhp - tmnho;	
		for(int i=0; i<= teste; i++){
			if(p==0){
				tst = recep.substring(i,i+tmnho);
//inverter a String para descobrir o palindrome;
				StringBuffer tstrev = new StringBuffer(tst);
				tstrev.reverse();
				String inver = tstrev.toString();
				if(tst.equals(inver)){
					System.out.println("O palindrome foi encotrado e ele é: " + tst);
					System.out.println("A posição dele é: " + (i) + " até " + (i+(tmnho-1)));
					b=1;
					p=1;
				}
			}
		}
		if(b==0){
			System.out.println("O parametro informado não existe palíndrome");
		}
		
	}
}
