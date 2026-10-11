package lld.Library_Management_System;

public class Book {
    private int isbn;
    private String title;
    private String author;
    private String category;


    public Book(int isbn,String title,String author,String category){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
        this.category=category;
    }

    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }

    public String getCategory(){
        return this.category;
    }
    public int getIsbn(){
        return this.isbn;
    }

}
