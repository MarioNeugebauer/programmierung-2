package demo009.menu.impl;

import demo009.ApplicationContext;
import demo009.menu.Command;

public class CommandLoehneFestlegen implements Command {

	@Override
	public String menuItemName() {
		return "L�hne festlegen";
	}

	@Override
	public void execute(ApplicationContext context) {
		// TODO Auto-generated method stub
		System.out.println("========== "+menuItemName());

		System.out.println("Noch nicht implementiert");
	}

}
