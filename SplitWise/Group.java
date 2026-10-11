package lld.SplitWise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Group {
    
    private List<User> users = new ArrayList<>();
    private int groupId;

    public Group(int groupId){
        this.groupId=groupId;
    }

    public int getGroupId(){
        return this.groupId;
    }
    public void addUser(User user) {
        users.add(user);
    }
    public List<User> getGroupMembers(){
        return Collections.unmodifiableList(users);
    }
}
