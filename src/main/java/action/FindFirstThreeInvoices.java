package action;

public class FindFirstThreeInvoices implements Action {
    @Override
    public void execute() {
        dataAnalytics.findFirstThreeInvoices();
    }
}
