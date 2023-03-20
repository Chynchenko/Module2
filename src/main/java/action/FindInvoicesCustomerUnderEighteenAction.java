package action;

public class FindInvoicesCustomerUnderEighteenAction implements Action {
    @Override
    public void execute() {
        dataAnalytics.findInvoicesCustomerUnderEighteen();
    }
}
