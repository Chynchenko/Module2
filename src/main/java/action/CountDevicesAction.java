package action;

import model.DeviceTypes;
import util.UserInput;

public class CountDevicesAction implements Action {
    @Override
    public void execute() {
        String[] menu = {"Telephone", "Television"};
        final int userChoice = UserInput.menu(menu);
        if (userChoice == 0) {
            dataAnalytics.countDevices(DeviceTypes.TELEPHONE);
        }
        if (userChoice == 1) {
            dataAnalytics.countDevices(DeviceTypes.TELEVISION);
        }
    }



}