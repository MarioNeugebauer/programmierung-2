package demo010;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class DateiInObjekteEinlesen {
	public static void main(String[] args) {
		List<DatenContainer> listeDerObjekte = new ArrayList<DatenContainer>();
		FileReader fr;
		try {
			fr = new FileReader("c:/daten/temp/testobjekte.txt");
			BufferedReader br = new BufferedReader(fr);
			
			listeDerObjekte = new ArrayList<DatenContainer>();
			
			String eineZeile = br.readLine();
			while(eineZeile!=null && !eineZeile.trim().equals("")) {
				StringTokenizer st = new StringTokenizer(eineZeile, ";");

				int nummer = Integer.parseInt(st.nextToken().trim());
				String bezeichnung = st.nextToken();
				String inhalt = st.nextToken();
				int wert = Integer.parseInt(st.nextToken().trim());
				
				DatenContainer dc = new DatenContainer(nummer, bezeichnung, inhalt, wert);
				listeDerObjekte.add(dc);
				
				eineZeile=br.readLine();
			}
			br.close();
		} catch (IOException e) {
			// Fehlermeldung ausgeben
			e.printStackTrace();
		} catch (NumberFormatException nfe) {
			// Fehlermeldung ausgeben
			nfe.printStackTrace();
		}

		for (DatenContainer datenContainer : listeDerObjekte) {
			System.out.println(datenContainer);
		}
	}

}
