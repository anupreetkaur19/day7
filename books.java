/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylisttest;

import java.util.Comparator;

/**
 *
 * @author macstudent
 */
public class books {
    int bookid;
    String booktitle;
    int bookrating;
    
    books(){
        this.bookid = 0;
        this.booktitle = "unknown";
        this.bookrating = 0;
    }
    
    books(int bookid, String booktitle, int bookrating){
        this.bookid = bookid;
        this.booktitle = booktitle;
        this.bookrating = bookrating;
        
    }
void setID(int ID){
    this.bookid = ID;
}
int getID(){
    return this.bookid;
}
void setTitle(String title){
    this.booktitle = title;
}
String getTitle(){
    return this.booktitle;
}

void setRating(int rate){
    this.bookrating = rate;
}
int getRating(){
    return this.bookrating;
}

void displayinfo(){
    System.out.println("bookid :" + this.bookid + "\n book title :" + this.booktitle + "\n book rating :" + this.bookrating);
}}

class bookTitleComparator implements Comparator<books>{
    
    @Override
    public int compare(books o1, books o2) {
        return o1.booktitle.compareToIgnoreCase(o2.booktitle);
    }}
    
    class bookRatingComparator implements Comparator<books>{
    
    @Override
    public int compare(books o1, books o2) {
        if (o1.bookrating == o2.bookrating)
        return 0;
        else if (o1.bookrating < o2.bookrating)
            return 1;
        else
            return -1;
    }
    
}