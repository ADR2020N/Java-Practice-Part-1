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
public class ReverseNumber {
    public static void main(String[] args) {
         int s=reverseNumber(1234);
        System.out.print(s);
    }
    public static int reverseNumber(int n){
        int revNum=0,rem;
     while(n!=0){
            rem=n%10;     //1234%10=4;     //123%10=3  12%10=2   1%10=1
            revNum=revNum*10+rem; //0+0*10+4=4;  //4*10+3=43  //43*10+2=342   //324*10+1=4321
            n=n/10;  //1234/10=123 123/10=12    //12/10=1     1/10=0;
     }
    return revNum; //4321
}
}