package Ejercicios_Java;

public class Variables_FASE2 {

	public static void main(String[] args) {

		int bisiesto=1948, i=0, CantBisiestos=0;
		
		for(i=bisiesto; i<=1988; i=i+4)
		{
			CantBisiestos++;
		}
		
		CantBisiestos=CantBisiestos-1;
		
		System.out.println( " Cantidad de bisiestos = " + CantBisiestos);
		
	}

}
