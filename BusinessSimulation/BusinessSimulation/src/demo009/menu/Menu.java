package demo009.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import demo009.ApplicationContext;
import demo009.misc.Util;

/**
 * Ein Menu kann angelegt werden, um darin Commands aufzunehmen, die bei der
 * Auswahl eines Menupunktes ausgeführt werden sollen. Ueber die Schnittstelle
 * Command werden die auszufuehrenden Aktionen mit der Methode execute() 
 * ausgefuehrt.
 * 
 * In ein Menu koennen mehrere Command eingehangen werden.
 * 
 * Dem Menu muss eine Bezeichnung fuer den Auswahlpunkt zum Verlassen des Menues
 * mitgegeben werden, da je nach Menu die Wirkung unterschiedlich sein kann. Wenn
 * zum Beispiel das Hauptmenu verlassen wird, fuehrt das zum Beenden der aktuellen
 * Runde und damit zum Start einer neuen Runde. Bei Untermenues waere die
 * Bedeutung anders, da man aus den Untermenu zu dem uebergeordneten Menu kommt. 
 *
 */
public class Menu {

	private String menuName;
	
	private String backButtonName;

	// Liste von möglichen Commands im Menu
	List<Command> menuItems = new ArrayList<Command>();

	ApplicationContext appContext;

	// Konstruktor
	public Menu(String menuName, ApplicationContext context, String backButtonName) {
		this.menuName=menuName;
		this.appContext = context;
		this.backButtonName=backButtonName;
	}

	/**
	 * Neues Command der Liste von möglichen Commands im Menu hinzufuegen
	 * 
	 * @param command - das Objekt des Commands, das ausgeführt werden soll bei Auswahl
	 */
	public void setCommand(Command command) {
		if(command!=null) {
			menuItems.add(command);
		}
	}

	/**
	 * Die zuvor ueber setCommand() hinzugefuegten Commands werden hiermit
	 * dargestellt. Es wird eine Auswahl ermoeglicht, sodass das
	 * entsprechende Command ausgefuehrt wird. Abschliessend wird ein 
	 * Menuepunkt hinzugefuegt, der das Verlassen des Menues ermoeglicht. 
	 */
	public void showMenu() {

		while(true) {
			System.out.println("========== "+menuName);

			// true setzen, falls Integer eingegeben wurde, ansonsten false
			boolean scannerErfolg=false;

			// Variable für Eingabe der zu verkaufenden Menge
			int auswahlMenuItem=0;

			// darstellen
			int menuItemCounter=0;
			for (menuItemCounter=0; menuItemCounter<menuItems.size(); menuItemCounter++) {
				Command command = menuItems.get(menuItemCounter);
				showMenuItem(menuItemCounter, command.menuItemName());
			}
			showMenuItem(menuItemCounter, backButtonName);

			// abfragen
			Scanner myScanner = new Scanner(System.in);
			while(!scannerErfolg) {
				try {
					System.out.print("Auswahl:");
					auswahlMenuItem = myScanner.nextInt();
					scannerErfolg=true;
					myScanner.nextLine();
				} catch (Exception e) {
					e.printStackTrace();
					scannerErfolg=false;
					myScanner.nextLine();
				}
			}

			if(auswahlMenuItem==menuItemCounter) {
				// Verlassen des Menus
				return;
			}

			// ausgewähltes Command ausführen
			menuItems.get(auswahlMenuItem).execute(appContext);
		}
	}

	private void showMenuItem(int itemNumber, String commandMenuItemName) {
		System.out.println(itemNumber + ": "+commandMenuItemName);
	}

	public String getMenuName() {
		return menuName;
	}

}
