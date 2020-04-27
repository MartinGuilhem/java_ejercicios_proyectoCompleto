package Exercici_restaurant;

import java.util.ArrayList;
import java.util.Scanner;


public class Restaurant_FASE3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total=0,cinco=5, diez=10, veinte=20, cincuenta=50, cien=100, quinientos=500, i=0, aux=0, yesNo=0;
		
		String [] menu= new String[5];
		int [] precioIntArray= new int [5]; 
		ArrayList <String> pedido = new ArrayList <String>();
		ArrayList <String> ordenFinal = new ArrayList <String>();
		
		
		//menu1: Asado
		//menu2: Fideos
		//menu3: Milanesa
		//menu4: Paella
 		//menu5: Tortilla
		
		menu[0]="asado";
		precioIntArray[0]=20;
		menu[1]="fideos";
		precioIntArray[1]=10;
		menu[2]="milanesa";
		precioIntArray[2]=15;
		menu[3]="paella";
		precioIntArray[3]=20;
		menu[4]="tortilla";
		precioIntArray[4]=5;
		
		
		/*
		for(i=0; i<5; i++)
		{
			System.out.println("\nIntroduce Menu "+(i+1)+"/5 : ");
			menu[i]=sc.nextLine();
					
			System.out.println("\nIntroduzca el Precio :");
			precioIntArray[i]= Integer.parseInt(sc.nextLine());
			//leo la siguiente linea hasta el enter y convierto eso q leo (string) en un entero
			//Con esto solucione el skip line ya que tomo el \n
		}
		
		*/
		for(i=0; i<5;i++)
		{
			System.out.println("Menu"+(i+1)+": "+menu[i]+" / Precio: "+precioIntArray[i]+"euros");
		}
		
				
		do
		{
			System.out.println("Que desea comer? ");
			pedido.add(sc.nextLine());
			
			System.out.println("Desea ordenar algo mas? 1=Si / 0=No");
			yesNo=Integer.parseInt(sc.nextLine()); 
			
			if(yesNo==0) 
			{
				System.out.println("\n Gracias, hemos tomado su orden.\n"); 
			}
					
		}
		while(yesNo==1); 
		
		
		//comparo posiciones del arreglo y de la lista
		
		
		for(i=0; i<pedido.size(); i++)
		{
			for(int j=0; j<menu.length; j++)
			{
				if(pedido.get(i).equals(menu[j]))
				{
					System.out.println("El pedido: "+pedido.get(i)+" esta en preparación");
					ordenFinal.add(pedido.get(i));
					total=total+precioIntArray[j];
					pedido.remove(i);
				}				
			}
		}
		
		System.out.println("\n Los platos siguientes no coinciden con nuestro menu: \n");
		
		for(i=0; i<pedido.size();i++)
		{
			System.out.println(pedido.get(i));
			
		}
		
		
		System.out.println("\n Aqui esta su pedido: \n");
		
		for(i=0; i<ordenFinal.size();i++)
		{
			System.out.println(ordenFinal.get(i));		
		}
		
		System.out.println("\n Total= "+total+" Euros");
		
	}

}