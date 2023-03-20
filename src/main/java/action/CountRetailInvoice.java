package action;

public class CountRetailInvoice implements Action{

    @Override
    public void execute() {
        dataAnalytics.countRetailInvoices();
    }
}