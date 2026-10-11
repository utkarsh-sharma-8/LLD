package lld.Library_Management_System;

public class PhysicalCopy implements BookCopy{
    private int bookId;
    private Status bookCopyStatus;
    private Book book;

    public PhysicalCopy(int bookId,Status bookCopyStatus,Book book){
        this.bookId=bookId;
        this.bookCopyStatus=bookCopyStatus;
        this.book=book;
    }
    @Override 
    public Status getbookCopyStatus(){
        return this.bookCopyStatus;
    }
    public void setbookCopyStatus(Status bookCopyStatus){
        this.bookCopyStatus=bookCopyStatus;
    }
}
