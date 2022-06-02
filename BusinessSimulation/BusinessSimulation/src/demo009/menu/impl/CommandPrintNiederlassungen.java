package demo009.menu.impl;

import java.util.List;

import demo009.ApplicationContext;
import demo009.menu.Command;
import demo009.model.Niederlassung;

public class CommandPrintNiederlassungen implements Command {

	@Override
	public String menuItemName() {
		return "Niederlassungen ausgeben";
	}

	@Override
	public void execute(ApplicationContext context) {
		
		System.out.println("========== "+menuItemName());

		List<Niederlassung> listeNiederlassung = context.getNiederlassungen();
		
		for(int indexNdls=0; indexNdls<listeNiederlassung.size(); indexNdls++) {
			System.out.println(listeNiederlassung.get(indexNdls).getOrt()+"\t\t"+listeNiederlassung.get(indexNdls).getWarenartString());
		}
		
	}

}
