package Ejercicio_Nombres_Ciudades;

import java.util.Arrays;

public class Nom_Ciudades_FASE3 {

	public static void main(String[] args) {
		
		String ciudad1="Barcelona", ciudad2="Madrid", ciudad3="Valencia", ciudad4="Málaga", ciudad5="Cádiz", ciudad6="Santander";
		String [] arrayCiutats = new String[6];
		int cantfila=0, m=0;
		
		
		arrayCiutats[0]=ciudad1;
		arrayCiutats[1]=ciudad2;
		arrayCiutats[2]=ciudad3;
		arrayCiutats[3]=ciudad4;
		arrayCiutats[4]=ciudad5;
		arrayCiutats[5]=ciudad6;
		
		for(int i=0; i<6;i++)
		{
			arrayCiutats[i]=arrayCiutats[i].replace('A', '4').replace('a', '4').replace('Á', '4').replace('á', '4');			
		}
	    	    
	    for(int i=0; i<6;i++)
		{
			System.out.println(arrayCiutats[i]);
		}
	    
	    System.out.println();
	    
	    Arrays.sort(arrayCiutats);
		
	    for(int i=0; i<6;i++)
		{
			System.out.println(arrayCiutats[i]);
		}
	     
	}

}
