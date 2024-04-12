import java.util.*;

public class UserExpenseBalanceSheet {
    Map<String, Balance> userVsBalance;
    double yourTotalExpense;
    double totalPaymentDoneByYou;
    double totalYouOwe;
    double totalYouGetBack;

    public UserExpenseBalanceSheet() {
        userVsBalance = new HashMap<>();
        yourTotalExpense = 0;
        totalYouOwe = 0;
        totalYouGetBack = 0;
        totalPaymentDoneByYou = 0;
    }

    public Map<String, Balance> getUserVsBalance() {
        return userVsBalance;
    }

    public void setUserVsBalance(Map<String, Balance> userVsBalance) {
        this.userVsBalance = userVsBalance;
    }

    public double getYourTotalExpense() {
        return yourTotalExpense;
    }

    public void setYourTotalExpense(double yourTotalExpense) {
        this.yourTotalExpense = yourTotalExpense;
    }

    public double getTotalPaymentDoneByYou() {
        return totalPaymentDoneByYou;
    }

    public void setTotalPaymentDoneByYou(double totalPaymentDoneByYou) {
        this.totalPaymentDoneByYou = totalPaymentDoneByYou;
    }

    public double getTotalYouOwe() {
        return totalYouOwe;
    }

    public void setTotalYouOwe(double totalYouOwe) {
        this.totalYouOwe = totalYouOwe;
    }

    public double getTotalYouGetBack() {
        return totalYouGetBack;
    }

    public void setTotalYouGetBack(double totalYouGetBack) {
        this.totalYouGetBack = totalYouGetBack;
    }
    

}
