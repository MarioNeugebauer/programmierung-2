package demo009.menu;

import demo009.ApplicationContext;

/**
 * Die Klasse Submenu ermoeglicht das Erstellen eines Untermenus, das in ein
 * uebergeordnetes Menu eingebunden werden kann. Deshalb erbt das Submenu
 * die Attribute und Methoden von Menu.
 * 
 * Ueber das Interface Command
 * wird das Submenu einbettet in das uebergeordnete Menu. Die Methode 
 * execute() ruft dann die Darstellung des Menus auf, welche durch die 
 * in Menu befindlichen Methoden konfiguriert wurde.
 */
public class Submenu extends Menu implements Command {

	private String commandKey;
	
	public Submenu(String menuName, ApplicationContext context, String backButtonName) {
		super(menuName, context, backButtonName);
	}

	@Override
	public String menuItemName() {
		return this.getMenuName();
	}

	@Override
	public void execute(ApplicationContext context) {
		this.showMenu();
	}

}
