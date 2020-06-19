/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import java.util.Scanner;

/**
 *
 * @author Ana Karen
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Tamaño del arreglo a: ");
        int x = sc.nextInt();
        System.out.print("Tamaño del arreglo k: ");
        int y = sc.nextInt();
        
        int arr1[] = new int[x];
        int arr2[] = new int[y];
        int mult[] = new int[x+y];
       
        for (int a=0; a<x; a++) {
               System.out.print(arr1[a]+a+ "   ");
        }
        
        System.out.println("");
        
        for (int k=1; k<y; k++) {
            System.out.print(arr2[k]+k+" "+""+" ");
            
            for (int a=1; a<x; a++) {
                mult[a] = (arr1[a]+a) * (arr2[k]+k);
                if(((arr1[a]+a) * (arr2[k]+k)) <10){
                System.out.print(mult[a]+" "+"  ");
                }
                else{
                System.out.print(mult[a]+" "+" ");
                }
            }
            System.out.println("");
        }
    }
    
}
