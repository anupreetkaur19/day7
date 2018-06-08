/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylisttest;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author macstudent
 */
public class arraylisttest {
    
    public static void main(String args[]){
        ArrayList<String> productsname = new ArrayList<>();
        
        productsname.add("Projector");
        productsname.add("Excel");
        productsname.add("contigo");
        productsname.add("apple");
        
        productsname.add(2, "oracle");
        if (productsname.contains("oracle")){
        productsname.remove("oracle");
        }else{
            System.err.println("buy oracle first");
        }
        productsname.forEach((raman) -> {
            System.out.println(raman);
        });
         Collections.sort(productsname);
         System.out.println("========");
        for(String raman : productsname){
            System.out.println(raman);
        }
        
        ArrayList<books> library = new ArrayList<books> ();
        books book1 = new books(101, "The sky is falling",9);
        books book2 = new books(102, "Pride and Prejudice",5);
        books book3 = new books(103, "The monk",7);
        books book4 = new books(104, "Courage",12);
        
        library.add(book1);
        library.add(book2);
        library.add(book3);
        library.add(book4);
        
        for(books bk : library){
            bk.displayinfo();
        }
            System.out.println("No of books in library :" + library.size());
            if(library.contains(book2)){
                library.remove(book2);
            }
            System.out.println("no of books in library :" + library.size());
          
            library.add(2, new books(120,"pearls",11));
            for(books bk : library){
                bk.displayinfo();
            }
            
            Collections.sort(library,new bookTitleComparator());
            for(books bk : library){
                bk.displayinfo();
            }
             Collections.sort(library,new bookRatingComparator());
            for(books bk : library){
                bk.displayinfo();
            }
        }}
    
                
                
                
                
                
                
                
                
                
                
            

