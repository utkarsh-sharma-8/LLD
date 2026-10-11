package lld.Library_Management_System;

public class ReturningSystem {
    private Status newStatus;
    public Status returnBook(int memberId,Book book,Status status){
        this.newStatus=Status.AVAILABLE;
        return newStatus;
    }
}
