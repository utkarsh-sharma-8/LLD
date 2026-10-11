package lld.SplitWise;

import java.util.Map;

public class ExpenseManager {
    private BalanceSheet balanceSheet;
    public ExpenseManager(BalanceSheet balanceSheet) {
        this.balanceSheet = balanceSheet;
    }

    public void addExpense(Expense expense){
        Map <User, Integer> dues = expense.getOwingStrategy().getDueAmount();
        User paidBy = expense.getPaidBy();
        for(Map.Entry<User, Integer> entry :dues.entrySet()){
            User user = entry.getKey();

            if (!user.equals(paidBy)) {
                balanceSheet.addBalance(
                    user,
                    paidBy,
                    entry.getValue()
                );
            }
        }
    }
}
