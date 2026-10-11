package lld.Library_Management_System;
import java.util.List;

public class BookingSystem {
    private Status newStatus;
    public Status borrowBook(int memberId,Book book,int booksHoldedLength, Status status) throws Exception{
        if(booksHoldedLength<5){
            this.newStatus=Status.BORROWED;
        }else if(booksHoldedLength>5){
            throw new Exception("User Can Borrow 5 Book At Max")
        }else if(status==Status.BORROWED){
            this.newStatus=Status.RESERVED;
        }else {
            throw new Exception("Book Is Already Reserved");
        }
        return newStatus;
    }
}
