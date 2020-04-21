package Ejercicio_Nombres_Ciudades;

import java.util.*;
import java.util.Arrays;

public class auxiliar {

	public static void main(String[] args) {
		String ciudad1="Barcelona", ciudad2="Madrid", ciudad3="Valencia";
		String [] ciudades = new String[3];
		
		
		ciudades[0]=ciudad3;
		ciudades[1]=ciudad2;
		ciudades[2]=ciudad1;
	
		
		Arrays.sort(ciudades);
		for(int i=0; i<3;i++)
		{
			System.out.println(ciudades[i]);
		}
	


		
	}

}
