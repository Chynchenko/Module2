package action;

public class CreateFifteenInvoiceAction implements Action {
    @Override
    public void execute() {
        shopService.createFifteenRandomInvoice();
    }

}