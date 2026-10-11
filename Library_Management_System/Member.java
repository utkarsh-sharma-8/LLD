package lld.Library_Management_System;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Member {
    private int memberId;
    private List<Book> booksHolded;
    private Date dueDate;   
    private Map<Book,Date> dueDateTrack;

    public Member(int memberId){
        this.memberId=memberId;
    }
    public void borrowBook(Book book){
        booksHolded.add(book);
        dueDateTrack.put(book,dueDate);
    }
    public List<Book> getBooksHolded(){
        return this.booksHolded;
    }
    public void returnBook(Book book){
        booksHolded.remove(book);
        dueDateTrack.remove(book);
    }
    public int getMemberId(){
        return this.memberId;
    }
}
