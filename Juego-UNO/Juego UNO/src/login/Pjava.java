/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

/**
 *
 * @author aldor
 */


public class Pjava {

    public static void New_ConnBD() throws ClassNotFoundException{
        ConnBD con = new ConnBD();
    }
        
    public static String Caesar(String phrase){ 
 
        int i,j; 
 
        char dePhrase[] = new char[phrase.length()]; 
 
        dePhrase = phrase.toCharArray(); 
 
        for(i = 0; i < phrase.length(); i++){ 
            for(j = 0; j < 5 * i; j++){ 
                if((dePhrase[i]>=65 && dePhrase[i]<90) || (dePhrase[i]>=97 && dePhrase[i]<122)){ 
                    dePhrase[i]++;               
                } 
                else if(dePhrase[i]==90) 
                    dePhrase[i]='A'; 
                else if(dePhrase[i]==122) 
                    dePhrase[i]='a'; 
            } 
        } 
 
        phrase = String.valueOf(dePhrase); 
 
        return phrase; 
    } 
 
     
    public static String deCaesar(String phrase){ 
 
        int i,j; 
 
        char dePhrase[] = new char[phrase.length()]; 
 
        dePhrase = phrase.toCharArray(); 
 
        for(i = 0;i < phrase.length(); i++){ 
            for(j = 0; j < 5 * i; j++){ 
                if((dePhrase[i]>65 && dePhrase[i]<=90) || (dePhrase[i]>97 && dePhrase[i]<=122)){ 
                    dePhrase[i]--;               
                } 
                else if(dePhrase[i]==65) 
                    dePhrase[i]='Z'; 
                else if(dePhrase[i]==97) 
                    dePhrase[i]='z'; 
            } 
        } 
 
        phrase = String.valueOf(dePhrase); 
 
        return phrase; 
    } 
} 
    
   
