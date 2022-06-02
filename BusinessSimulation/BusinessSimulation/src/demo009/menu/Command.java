package demo009.menu;

import demo009.ApplicationContext;

public interface Command {

	public String menuItemName();
	
	public void execute(ApplicationContext context);
	
}
