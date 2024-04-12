import java.util.List;
import java.util.Map;

public class BalanceSheetController {

    public void updateUserExpenseBalanceSheet(User expensePaidBy, List<Split> splits, double totalExpenseAmount) {

    }

    public void showBalanceSheetOfUser(User user) {

        System.out.println("---------------------------------------");

        System.out.println("Balance sheet of user Id: " + user.getUserId() + " user name " + user.getUserName());

        UserExpenseBalanceSheet userExpenseBalanceSheet = user.getUserExpenseBalanceSheet();

        System.out.println("Your Total Expense : " + userExpenseBalanceSheet.getYourTotalExpense());
        System.out.println("You ll get back : " + userExpenseBalanceSheet.getTotalYouGetBack());
        System.out.println("You owe this : " + userExpenseBalanceSheet.getTotalYouOwe());
        System.out.println("Total payment done: " + userExpenseBalanceSheet.getTotalPaymentDoneByYou());
        for (Map.Entry<String, Balance> entry : userExpenseBalanceSheet.getUserVsBalance().entrySet()) {

            String userID = entry.getKey();
            Balance balance = entry.getValue();

            System.out.println("userID:" + userID + " YouGetBack:" + balance.getAmountGetBack() + " YouOwe:"
                    + balance.getAmountOwe());
        }

        System.out.println("---------------------------------------");

    }
}
