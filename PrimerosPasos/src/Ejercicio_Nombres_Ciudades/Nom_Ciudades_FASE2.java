package Ejercicio_Nombres_Ciudades;

import java.util.*;
import java.lang.*;
public class Nom_Ciudades_FASE2 {

	public static void main(String[] args) {
		//Scanner lector = new Scanner(System.in);
		String ciudad1="Barcelona", ciudad2="Madrid", ciudad3="Valencia";
		String ciudades;
		int i=0, j=0,o=0, p=0, q=0, m=0, cantfila=1;
		char[] ciudadesCha=new char[45];
		char[] auxs=new char[45];
		char[][] ciudadesCham = new char[4][45];
		
		
		ciudades=ciudad1+' '+ciudad2+' '+ciudad3;
		//System.out.println(ciudades);
		
		ciudadesCha=ciudades.toCharArray();
		
		for(int a=0; a<ciudadesCha.length;a++)
		{
			//System.out.print (ciudadesCha[a]);
			if(ciudadesCha[a]!=' ')
			{
				//System.out.print(ciudadesCha[k]);
				ciudadesCham[i][j]=ciudadesCha[a];
				j++;
			}
			else
			{
				j=0;
				i++;
			}
		}
		

		while((ciudadesCham[m][0]>='A' && ciudadesCham[m][0]<='Z') || (ciudadesCham[m][0]>='a' && ciudadesCham[m][0]<='z'))
	    {
	        cantfila++;
	        m++;
	    }

	    for(o=0;o<cantfila;o++)
	    {
	        for(p=o+1;p<cantfila;p++)
	        {
	            if(ciudadesCham[p][0]<ciudadesCham[o][0])
	            {
	                auxs=ciudadesCham[o];
	                for(q=0;q<25;q++)
	                {
	                    ciudadesCham[o][q]='\0';
	                }
	                ciudadesCham[o]=ciudadesCham[p];
	                for(q=0;q<25;q++)
	                {
	                	ciudadesCham[p][q]='\0';
	                }
	                ciudadesCham[p]=auxs;
	            }
	        }
	    		
				
		for (int x=0; x < ciudadesCham.length; x++)
		{
			for (int y=0; y < ciudadesCham[x].length; y++)
			{
				System.out.print (ciudadesCham[x][y]);	
			}
			System.out.println();
		}
	}
}
}
		
		
