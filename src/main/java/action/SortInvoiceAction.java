package action;

public class SortInvoiceAction implements Action {
    @Override
    public void execute() {
        shopService.sortInvoices().forEach(System.out::println);
    }
}
