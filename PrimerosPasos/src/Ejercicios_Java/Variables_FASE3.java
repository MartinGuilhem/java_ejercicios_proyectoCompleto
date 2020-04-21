package Ejercicios_Java;

public class Variables_FASE3 {

	public static void main(String[] args) {
	
		int bisiesto=1948, nac=1988, i=0;
		boolean b=false;
		String SIbisiesto, NObisiesto;
		
		
		for(i=bisiesto; i<=nac; i=i+4)
		{
			System.out.println(i);
			
			if(i==nac)
			{
				b=true;				
			}
			
		}
		
		if(b==true)
		{
			SIbisiesto = "Tu año de nacimiento es bisiesto";
			System.out.println(SIbisiesto);
		}
		else
		{
			NObisiesto = "Tu año de nacimiento NO es bisiesto, lo siento mucho...";
			System.out.println(NObisiesto);
		}
		
	}

}

		
	
