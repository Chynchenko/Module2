package action;

public class CountSumAllInvoicesAction implements Action{
    @Override
    public void execute() {
        dataAnalytics.countSumAllInvoices();
    }
}