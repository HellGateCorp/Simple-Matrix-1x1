package matrix;

public class matrix {
	public static void main(String[] args) {
		// Zweidimensionales Array für die Ausgabe einer Tabelle, 
		// mit [10]Zeilen und je [10]Spalten,
		// befüllt mit dem kleinen 1x1
		int[][] einmaleins = {{1,2,3,4,5,6,7,8,9,10},{2,4,6,8,10,12,14,16,18,20},{3,6,9,12,15,18,21,24,27,30},{4,8,12,16,20,24,28,32,36,40},{5,10,15,20,25,30,35,40,45,50},
				{6,12,18,24,30,36,42,48,54,60},{7,14,21,28,35,42,49,56,63,70},{8,16,24,32,40,48,56,64,72,80},{9,18,27,36,45,54,63,72,81,90},{10,20,30,40,50,60,70,80,90,100}};
		// Äüßere Schleife(1.Dimension) kontroliert, 
		for (int i=0;i<einmaleins.length;i++) {
			// innere Schleife(2.Dimension)
			for (int j=0;j<einmaleins[i].length;j++) 
				//und erlaubt so die Ausgabe in Tabellenform
				System.out.print(einmaleins[i][j] + "\t");
			System.out.println();
		}
	}
}
