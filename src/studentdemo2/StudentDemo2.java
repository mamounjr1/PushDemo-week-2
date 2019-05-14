/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Update version week 2
 */
package studentdemo2;
import java.util.Scanner;
/**
 *
 * @author Mamou
 */
public class StudentDemo2 {

    /**
     * @param args the command line arguments
     */
    
    //Declarre variables
    int id;
    String name;
    public static void main(String[] args) {
        //Intialize Scanner Stream
        Scanner scanNS = new Scanner(System.in);
      
        StudentDemo2 stud = new StudentDemo2();
        
        StudentDemo2[] names = new StudentDemo2[5];
        names[0].id = 1;
        names[0].name = "mamoun";
        
        for(int i = 0; i<names.length; i++){
            
            names[i] = new StudentDemo2();
            System.out.println("enter ID");
            names[i].id = scanNS.nextInt();
            
            System.out.println("enter name");
            names[i].name = scanNS.nextLine();
            
        }
        
      
        for (int i = 0; i <names.length -1; i++) {
              System.out.print("student id: "+names[i].id+"student name:"+
                      names[i].name+"\n");
        }
        
        
       
        
        
    }//end of main
    
}//end of class
