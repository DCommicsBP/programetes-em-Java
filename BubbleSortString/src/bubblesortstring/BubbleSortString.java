/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesortstring;
 import java.util.Scanner;

/**
 *
 * @author Daione
 */
public class BubbleSortString {

    /**
     * @param args the command line arguments
     */

       
	public static void main(String[] args)
	{
		String[] Array;
		Array=new String[10];
		String temp;
		
		Scanner input=new Scanner(System.in);
			
		for(int i=0;i<10;i++){
			System.out.println("Give me the name ");
			Array[i]=input.next();
			}
		
	for(int x=1;x<10;x++)
		{
		for(int y=0;y<10-x;y++)
			{
			if(Array[y].compareTo(Array[y+1])>0)
				{
				temp=Array[y];
				Array[y]=Array[y+1];
				Array[y+1]=temp;
				
                                                                                    }
                                                                            }           
				}
						
	for(int i=0;i<10;i++){
		System.out.println("The sorted values are "+Array[i]);
		}	
    
                        }        
                }
    