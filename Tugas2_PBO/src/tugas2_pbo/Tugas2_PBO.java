/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2_pbo;

import java.util.Scanner;
import tugas2_pbo2.*;

/**
 *
 * @author OWNER
 */
public class Tugas2_PBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Makanan eat = new Makanan();
    Minuman drink = new Minuman();
    Camilan snack = new Camilan();
        do{
        System.out.println("");
        System.out.println("Menu :");
        System.out.println("1. Makanan");
        System.out.println("2. Minuman");
        System.out.println("3. Camilan");
        System.out.print("Pilih : ");
        int pilih = input.nextInt();
        
        switch(pilih){
            case 1:
                System.out.println("1. Makanan :");
                System.out.println("    1. Steak");
                System.out.println("    2. Spagetti");
                System.out.print("Pilih : ");
                int pilih1 = input.nextInt();
                
                if(pilih1 == 1){
                    System.out.println("Steak (Rp 30000)");
                    System.out.print("Jumlah : ");
                    int steak = input.nextInt();
                    eat.steak(steak);
           
                }
                else if(pilih1 == 2){
                    System.out.println("Spagetti (Rp 20000)");
                    System.out.print("Jumlah : ");
                    int spagetti = input.nextInt();
                    eat.spagetti(spagetti);
                    
                }
                break;
            case 2:
                System.out.println("2. Minuman :");
                System.out.println("    1. Blue Ocean");
                System.out.println("    2. Pink Lava");
                System.out.print("Pilih : ");
                int pilih2 = input.nextInt();
                
                if(pilih2 == 1){
                    System.out.println("Blue Ocean (Rp 13000)");
                    System.out.print("Jumlah : ");
                    int blueocean = input.nextInt();
                    drink.blueocean(blueocean);
           
                }
                else if(pilih2 == 2){
                    System.out.println("Pink Lava (Rp 13000)");
                    System.out.print("Jumlah : ");
                    int pinklava = input.nextInt();
                    drink.pinklava(pinklava);
                    
                }
                break;
            case 3:
                System.out.println("3. Camilan :");
                System.out.println("    1. French Fries");
                System.out.println("    2. Nacho");
                System.out.print("Pilih : ");
                int pilih3 = input.nextInt();
                
                if(pilih3 == 1){
                    System.out.println("French Fries (Rp 10000)");
                    System.out.print("Jumlah : ");
                    int frenchfries = input.nextInt();
                    snack.frenchfries(frenchfries);
           
                }
                else if(pilih3 == 2){
                    System.out.println("Nacho (Rp 15000)");
                    System.out.print("Jumlah : ");
                    int nacho = input.nextInt();
                    snack.nacho(nacho);
                    
                }
                break;
        }
    }while(true);
    
}
}
