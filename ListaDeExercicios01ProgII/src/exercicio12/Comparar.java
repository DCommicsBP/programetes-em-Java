/*  Construa um método chamado ehPrimo que receba um valor int como parâmetro e retorne true
caso o número seja primo e false caso contrário. Utilize a lógica descrita acima e o método ehMultiplo para
saber se um número é divisível por outro.
Faça um programa em Java que utilize o método ehPrimo e mostre os números primos menores do
que 10000.
*/
package exercicio12;

import java.util.Scanner;

public class Comparar {

    private int var01;
    private int var02;
    private boolean ehDivisivel;
   
          public boolean divisivel(int varA, int varB) {
        this.var01 = varA;// var a é o numero que eu vou inserir!!!
        this.var02 = varB;
        this.ehDivisivel = ehDivisivel;
        Scanner scan = new Scanner(System.in);
        
        varA = 0; 
        for (varB = 2; varB < 10000; varB++) {
            ehDivisivel = false;
        
            for (varA = 2; varA < varB; varA++) {       
                        if (varB % varA == 0) {
                ehDivisivel = true;
                }
                        
            }
            if (ehDivisivel){
                ehDivisivel = false;
            }else{
                ehDivisivel = true;
            }
            System.out.println(ehDivisivel + " " + varB); 
        
        
        }
        return ehDivisivel;
     }
     
    
    public boolean ehPrimo(int var03){
        int var04 = 0;
        boolean naoPrimo = divisivel(var03,var04);
        boolean primo  = false; 
                
        if(this.isEhDivisivel() == true){
            primo = false;
        }else{
            primo = true; 
        }
    return primo;
    }
    

   
     public int getVar01() {
        return var01;
    }

    public void setVar01(int var01) {
        this.var01 = var01;
    }

    public int getVar02() {
        return var02;
    }

    public void setVar02(int var02) {
        this.var02 = var02;
    }

    public boolean isEhDivisivel() {
        return ehDivisivel;
    }

    public void setEhDivisivel(boolean ehDivisivel) {
        this.ehDivisivel = ehDivisivel;
    }

    private boolean divisivel02(int var03, int var04) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
