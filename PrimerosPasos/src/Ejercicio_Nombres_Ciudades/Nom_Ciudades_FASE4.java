package Ejercicio_Nombres_Ciudades;

public class Nom_Ciudades_FASE4 {

	public static void main(String[] args) {
		
		String Sciudad1="Barcelona", Sciudad2="Madrid", Sciudad3="Valencia", Sciudad4="Málaga", Sciudad5="Cádiz", Sciudad6="Santander";
		char [] ciudad1= new char [Sciudad1.length()];
		char [] ciudad2= new char [Sciudad2.length()];
		char [] ciudad3= new char [Sciudad3.length()];
		char [] ciudad4= new char [Sciudad4.length()];
		char [] ciudad5= new char [Sciudad5.length()];
		char [] ciudad6= new char [Sciudad6.length()];
		
		
		//completo letra por letra
		for(int i=0; i<Sciudad1.length();i++)
		{
			ciudad1[i]=Sciudad1.charAt(i);
		}
		for(int i=0; i<Sciudad2.length();i++)
		{
			ciudad2[i]=Sciudad2.charAt(i);
		}
		for(int i=0; i<Sciudad3.length();i++)
		{
			ciudad3[i]=Sciudad3.charAt(i);
		}
		for(int i=0; i<Sciudad4.length();i++)
		{
			ciudad4[i]=Sciudad4.charAt(i);
		}
		for(int i=0; i<Sciudad5.length();i++)
		{
			ciudad5[i]=Sciudad5.charAt(i);
		}
		for(int i=0; i<Sciudad6.length();i++)
		{
			ciudad6[i]=Sciudad6.charAt(i);
		}
		
		//imprimo
		for(int i=Sciudad1.length()-1; i>=0;i--)
		{
			System.out.print(ciudad1[i]);
		}
		System.out.println();
		for(int i=Sciudad2.length()-1; i>=0;i--)
		{
			System.out.print(ciudad2[i]);
		}
		System.out.println();
		for(int i=Sciudad3.length()-1; i>=0;i--)
		{
			System.out.print(ciudad3[i]);
		}
		System.out.println();
		for(int i=Sciudad4.length()-1; i>=0;i--)
		{
			System.out.print(ciudad4[i]);
		}
		System.out.println();
		for(int i=Sciudad5.length()-1; i>=0;i--)
		{
			System.out.print(ciudad5[i]);
		}
		System.out.println();
		for(int i=Sciudad6.length()-1; i>=0;i--)
		{
			System.out.print(ciudad6[i]);
		}
		System.out.println();
		
	}

}
