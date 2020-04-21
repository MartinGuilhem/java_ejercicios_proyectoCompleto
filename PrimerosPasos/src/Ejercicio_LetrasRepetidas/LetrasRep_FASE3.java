package Ejercicio_LetrasRepetidas;

import java.util.*;

public class LetrasRep_FASE3 {

	public static void main(String[] args) {
		
		List<Character> nombre = new ArrayList<Character>();
		Map<Character, Integer> letrasRepetidas = new HashMap<>();
		int cont = 1, i=0, j=0;
		
		nombre.add('M');
		nombre.add('A');
		nombre.add('R');
		nombre.add('T');
		nombre.add('I');
		nombre.add('N');
		nombre.add('G');
		nombre.add('U');
		nombre.add('I');
		nombre.add('L');
		nombre.add('H');
		nombre.add('E');
		nombre.add('M');
		
		for(i=0; i<nombre.size(); i++)
		{
			for(j=i+1; j<nombre.size(); j++)
			{
				if(nombre.get(i)==nombre.get(j))
				{
					cont++;			
				}
			}
			if(!letrasRepetidas.containsKey(nombre.get(i)))
			{
				letrasRepetidas.put(nombre.get(i), cont);
			}
			cont=1;
		}
					
		System.out.println(nombre);
		System.out.println(letrasRepetidas);
	}
}
