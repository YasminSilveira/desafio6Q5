/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio6q5;

/**
 *
 * @author yasmi
 */
public class Desafio6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
           int ordem, n, termo; String r="";String r1="";
        termo = -1; 
        n=Integer.parseInt(JOptionPane.showInputDialog("Informe o valor N:"));
        
        for(ordem=1; ordem<=n;ordem++){
           if(ordem==1){
            r1 = r1 + "Ordem:";   
            r = r   + "Termo: "+termo;
           }else{
             
               r = r + " "+termo;
           }
           if(ordem>n){
               r1 = r1 + "  "+ordem+"\n";
           }else{
            r1 = r1 + "  "+ordem;
           }
            if(ordem % 2 != 0){
                termo++;
            }else{
                termo+=5;
            }
 
        }
        JOptionPane.showMessageDialog(null,"Resultado\n"+r1+"\n"+r);
    }
    