package packman;
//clase para los niveles
public class Laberinto {
	//creando mas arrays podemos diseñar mas niveles
		char laberinto1 [][] = {
			{'#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#'},
			{'#','#','#','#','#','#','#','#','#','#',' ',' ',' ',' ',' ','#','#','#','#','#','#'},
			{'#','#','#',' ','#','#','#','#','#','#',' ','#','#','#',' ','#','#','#','#','#','#'},
			{'#','#','#',' ','#','#','#','#','#','#',' ','#','#',' ',' ','#','#','#','#','#','#'},
			{'#',' ',' ',' ','#','#','#','#','#','#',' ',' ','#',' ','#','#','#','#','#','#','#'},
			{'#',' ','#','#',' ',' ',' ',' ','#','#','#',' ','#',' ','#',' ','#','#','#','#','#'},
			{'#',' ',' ','#',' ','#','#',' ','#','#','#',' ','#',' ','#',' ',' ',' ',' ',' ','#'},
			{'#',' ','#',' ','#','#','#',' ',' ',' ',' ',' ','#',' ','#','#',' ','#','#',' ','#'},
			{'#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#'},	
		};
	/*String laberinto1 [][] = {
	{"#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#"},
	{"#","#","#","#","#","#","#","#","#","#","  ","  ","  ","  ","  ","#","#","#","#","#","#","#","#","#","#","#"},
	{"#","#","#","  ","#","#","#","#","#","#","  ","#","#","#","  ","#","#","#","#","#","#","#","#","#","#","#","#","#"},
	{"#","#","#","  ","#","#","#","#","#","#"," ","#","#","  ","  ","#","#","#","#","#","#","#","#","#","#","#","#","#"},
	{"#","  ","  ","  ","#","#","#","#","#","#","  ","  ","#","  ","#","#","#","#","#","#","#","#","#","#","#"},
	{"#","  ","#","#","  ","  ","  ","  ","#","#","#","  ","#","  ","#","  ","#","#","#","#","#","#","#"},
	{"#"," ","  ","#","  ","#","#","  ","#","#","  ","  ","#","  ","#","  ","  ","  "," ","  ","#"},
	{"#","  ","#"," ","#","#","#"," "," ","#","  ","#","#","  ","#","#","  ","#","#","  ","#","#","#","#","#","#"},
	{"#","  ","  ","  ","  ","#","#","#","  ","  ","  ","#","#","  ","#","#","  ","#","#"," ","#","#"},
	{"#","#","#","  ","#","#","  ","#","#","#","#","#","#","  ","  ","  ","  ","#","  "," ","#","#","#","#"},
	{"#","#","#","  ","  ","  ","  ","#","  ","  ","  ","#","#","#","#","#","#","#","  ","#","#","#","#"},
	{"#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#"},
	
};*/
	//métodos
	//método que imprime laberintos
	public void imprimirLaberinto(){
		for (int i=0;i<laberinto1.length;i++){
			for (int j=0;j<laberinto1[i].length;j++){
				System.out.print(laberinto1[i][j]);
			}
			System.out.println("");
		}
	}
	
}
