/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul7;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Latihan2_JoptionPane {
    public static void main( String[] args ){
        int batas, i,max;
        int arr[] = new int[100];
        
        batas = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Batas = "));
        for(i=1;i<batas+1;i++){
                arr[i] = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai ke-"+i+" ="));
            }
            max=arr[0];
            for(i=0;i<arr.length;i++){
                if(arr[i] > max){
                    max= arr[i];
                  }
            }
        
        String msg = "Nilai Terbesar = "+max;

        JOptionPane.showMessageDialog(null, msg);

     }
}
