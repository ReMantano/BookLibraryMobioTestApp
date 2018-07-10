package com.example.booklibrarymobiotestapp.book;

/**
 * Created by Vladislav on 09.07.2018.
 */

public class ListBook {

    private String  nameBook,nameAuthor
                    ,desk;
    private int image;

    ListBook(String nameBook, String nameAuthor, int image, String desk){
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
        this.image = image;
        this.desk = desk;
    }

    public String getNameBook(){
        return nameBook;
    }
    public String getNameAuthor(){
        return nameAuthor;
    }
    public int getImage(){
        return image;
    }
    public String getDesk(){
        return desk;
    }

    public void setNameBook(String nameBook){
        this.nameBook = nameBook;
    }
    public void setNameAuthor(String nameAuthor){
        this.nameAuthor = nameAuthor;
    }
    public void setImage(int image){
        this.image = image;
    }
    public void setDesk(String desk){
        this.desk = desk;
    }

}
