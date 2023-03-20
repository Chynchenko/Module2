package action;

import util.UserInput;

public class FindAction implements Action {
    @Override
    public void execute() {
        final String inputId = UserInput.inputId();
        shopService.getById(inputId)
                .ifPresentOrElse(System.out::println, () -> System.out.println("This invoice is not found"));
    }
}
