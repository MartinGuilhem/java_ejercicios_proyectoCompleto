package Exercici_restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
import javax.swing.*;
import java.util.Scanner;


public class Restaurant_FASE2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cinco=5, diez=10, veinte=20, cincuenta=50, cien=100, quinientos=500, i=0, aux=0, yesNo=0;
		
		String [] menu= new String[5];
		int [] precioIntArray= new int [5]; //cambiar a array de integers
		ArrayList <String> pedido = new ArrayList <String>();
		
		
		
		//menu1: Asado
		//menu2: Fideos
		//menu3: Milanesa
		//menu4: Paella
 		//menu5: Tortilla
				
		for(i=0; i<5; i++)
		{
			System.out.println("Seleccione menu "+(i+1)+"/5 : ");
			precioIntArray[i]=sc.nextInt();
					
			menu[i]=JOptionPane.showInputDialog("Introduce Menu "+ (i+1)+"/5");
			precio[i]=JOptionPane.showInputDialog("Introduce Precio para "+menu[i]);
		}
		
		
		for(i=0; i<5;i++)
		{
			System.out.println("Menu"+(i+1)+": "+menu[i]+" / Precio: "+precio[i]+"euros");
		}
				
		do
		{
			System.out.println("Que desea comer? Seleccione #menu(1-5)");
			aux=sc.nextInt(); //cambiar a metodo de entrada de lectura de palabra y guardar el pedido (palabra) directo en la lista
			aux=aux-1;
			
			if(aux>=1 && aux<=5)
			{
				
				pedido.add(menu[aux]);
				System.out.println("El pedido: "+ menu[aux]+" ha sido confimado.");
			}
			else
			{
				System.out.println("El numero indicado es incorrecto");
			}
			
			System.out.println("Desea ordenar algo mas? 1=Si / 0=No");
			yesNo=sc.nextInt(); // cambiar metodo de entrada a ventana emergente
			
			if(yesNo==0) // cambiar lectura del dato a "" string sobre respuesta
			{
				System.out.println("Gracias, vuelva pronto!"); // que lo imprima en la ventana emergente
			}
					
		}
		while(yesNo==1); // mismo, lectura sobre string de ventana emergente
		
		
		for(i=0; i<pedido.size(); i++)
		{
			System.out.println("Pedido Nº"+(i+1)+": "+pedido.get(i));
		}
		
	}

}
