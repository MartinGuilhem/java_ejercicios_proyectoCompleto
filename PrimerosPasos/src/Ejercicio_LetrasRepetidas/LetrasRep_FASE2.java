package Ejercicio_LetrasRepetidas;

import java.util.*;


public class LetrasRep_FASE2 {

	public static void main(String[] args) {
		
		
		List<Character> nombre = new ArrayList <Character>();
		
		nombre.add('M');
		nombre.add('a');
		nombre.add('r');
		nombre.add('t');
		nombre.add('i');
		nombre.add('n');
		nombre.add('2');
		
		
		System.out.println(nombre);
		
		for(Character letra: nombre )
		{
			if(letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U' || letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
			{
				System.out.println("La " + letra + " es Vocal");
			}
			else if(!Character.isLetter(letra))
			{
				System.out.println("Los nombres de personas no contienen números!");
			}
			else
			{
				System.out.println("La " + letra + " es Consoanante");
			}
		}
	
		
		
		

		
	}

}
