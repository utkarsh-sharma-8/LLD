package lld.SplitWise;

import java.util.List;

public class Expense {
    private User paidBy;
    private int amount;
    private OwingStrategy owingStrategy;
    private List<User> participants;

    public Expense(int amount, User paidBy, OwingStrategy owingStrategy, List<User> participants){
        this.amount=amount;
        this.paidBy=paidBy;
        this.owingStrategy=owingStrategy;
        this.participants=participants;
    }

    public int getExpense(){
        return this.amount;
    }

    public User getUserWhoPaid(){
        return this.paidBy;
    }

     public User getPaidBy() {
        return paidBy;
    }

    public List<User> getParticipants() {
        return participants;
    }

    public OwingStrategy getOwingStrategy() {
        return this.owingStrategy;
    }
}
