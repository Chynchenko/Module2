package action;

import model.Invoice;

import java.util.Arrays;

public class ShowAllAction implements Action {
    @Override
    public void execute() {
        Invoice[] all = shopService.getAll();
        Arrays.stream(all).forEach(System.out::println);
    }
}