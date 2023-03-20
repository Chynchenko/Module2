package action;

public class MinimalInvoiceSumAction implements Action {
    @Override
    public void execute() {
        dataAnalytics.minimalInvoiceSum();
    }
}
