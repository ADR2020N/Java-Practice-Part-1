/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepareexam.Examen;

/**
 *
 * @author N.Adrien
 */
public class ReverseString {
    public static void main(String[] args) {
        String r=revers("Adrien Nkurikiyumukiza");
        System.out.print(r);
    }
    public static String revers(String rev){
        char [] letters=new char[rev.length()];
        int letterIndex=0;
        for(int i=rev.length()-1;i>=0;i--){
         //System.out.println(rev.charAt(i));
         letters[letterIndex]=rev.charAt(i);
         letterIndex++;
         
       
         }
          String reverse="";
                 for(int i=0;i<rev.length();i++){
                 reverse=reverse+letters[i];
        }
        return reverse;
    }
}
