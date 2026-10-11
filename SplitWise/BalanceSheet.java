package lld.SplitWise;

import java.util.HashMap;
import java.util.Map;

public class BalanceSheet {
    private Map<User, Map<User, Integer>> balances = new HashMap<>();
    public void addBalance(
        User debtor,
        User creditor,
        int amount) {

    balances
        .computeIfAbsent(debtor, k -> new HashMap<>())
        .merge(creditor, amount, Integer::sum);
}
    public Map<User, Map<User, Integer>> getBalances() {
        return this.balances;
    }
}
