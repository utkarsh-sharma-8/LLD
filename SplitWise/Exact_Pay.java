package lld.SplitWise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Exact_Pay implements OwingStrategy {
     private ArrayList<User> user;
    private int amount;
    private Map<User, Integer> map = new HashMap<>();

    public Exact_Pay(ArrayList<User> user, int amount){
        this.user=user;
        this.amount= amount;
    }

    public Map<User,Integer> getDueAmount(){
        int totalUsers=user.size();
        int share =this.amount/totalUsers;       
        for(User user : this.user){
            map.put(user,share);
        }
        return map;
    }
}
