package action;
public class FindInvoicesWithOneDeviceAction implements Action {
    @Override
    public void execute() {
        dataAnalytics.findInvoicesWithOneDevice();
    }
}