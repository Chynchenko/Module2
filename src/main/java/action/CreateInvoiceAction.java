package action;

public class CreateInvoiceAction implements Action {
    @Override
    public void execute() {
        shopService.createRandomInvoice();
    }
}