package action;

public class CreateFileInvoiceAction implements Action {

    @Override
    public void execute() {
        shopService.createInvoiceFromFile("file.csv");
    }

}