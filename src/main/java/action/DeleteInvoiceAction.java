package action;

import util.UserInput;

public class DeleteInvoiceAction implements Action {
    @Override
    public void execute() {
        final String inputId = UserInput.inputId();
        shopService.delete(inputId);
    }

}