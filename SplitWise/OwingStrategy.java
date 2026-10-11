package lld.SplitWise;

import java.util.List;
import java.util.Map;

public interface OwingStrategy {
    Map<User,Integer> calculateSplit(int amount, List<User> Participants);
}
