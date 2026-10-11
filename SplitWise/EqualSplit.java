package lld.SplitWise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EqualSplit implements OwingStrategy {
    private ArrayList<User> user;
    private int amount;

    public EqualSplit(ArrayList<User> user, int amount){
        this.user=user;
        this.amount= amount;
    }
    @Override 
    public Map<User,Integer> getDueAmount(){
        int totalUsers=user.size();
        Map<User, Integer> map = new HashMap<>();
        int share =this.amount/totalUsers;       
        for(User user : this.user){
            map.put(user,share);
        }
        return map;
    }
}
