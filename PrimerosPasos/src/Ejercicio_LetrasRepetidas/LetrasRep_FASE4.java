package Ejercicio_LetrasRepetidas;

import java.util.ArrayList;
import java.util.List;

public class LetrasRep_FASE4 {

	public static void main(String[] args) {
		List<Character> nombre = new ArrayList<Character>();
		List<Character> apellido = new ArrayList<Character>();
		List<Character> fullname = new ArrayList<Character>();
		int i=0, j=0, k=0;
		
		nombre.add('M');
		nombre.add('A');
		nombre.add('R');
		nombre.add('T');
		nombre.add('I');
		nombre.add('N');
		apellido.add('G');
		apellido.add('U');
		apellido.add('I');
		apellido.add('L');
		apellido.add('H');
		apellido.add('E');
		apellido.add('M');
		
		//cargo nombre a la list
		for(i=0; i<nombre.size(); i++)
		{
			fullname.add(nombre.get(i));
		}
		
		
		//cargo espacio a la list
		fullname.add(' ');

		//cargo apellido a la list
		for(j=0; j<apellido.size();j++)
		{
			fullname.add(apellido.get(j));
		}
		
		//imprimo
		for(k=0; k<fullname.size();k++)
		{
			System.out.print(fullname.get(k));
		}
	}

}
