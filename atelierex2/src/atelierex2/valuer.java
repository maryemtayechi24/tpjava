package atelierex2;

public class valuer {

	public static void main(String[] args) {
		int x=2;
		int y=6;
		int z=x++ +y;
		System.out.println(x);
		int compteur=58;
		if(compteur>10)
		{
			System.out.println("compteur est plus grand que 10");
		}
		x++;
		int total=8;
		x-=total;
		System.out.println("totale="+x);
		int q=15;
		int diviseur=3;
		int r;
		r=q%diviseur;
		System.out.println("r="+r);
		q=r;
		r=q-(q/diviseur)*diviseur;
		System.out.println("r="+r);
				
        
	}

}
