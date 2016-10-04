
import java.util.Random;


public class pokemon {


	//pidgey, weedle, caterpie, magikarp, rattata, eevee, nidoranF, nidoranM, bellsprout, goldeen, venonat, spearow
	static Integer comun [] = {10,10,10,101,7,7,32,32,32,13,13,13};
	
//ekans, cleafairy, odish, zubat, paras, meowth, poliwag, slopoke, krabby, excecute, horsea, staryu, pinsir, psiduck
	static Integer medio [] = {13,13,32,13,13,13,32,13,13,13,13,7,1,7};

//bulbausur, squire, charmander, sandrew, jigglypuff, diglet, mankey, growlithe, abra, machop, tantacool, geodude, ponita, magnmite, grimer, seel, doduo, drowzee, cubone, koffing, rhinox, tangela
	static Integer dificil []= {32,32,32,13,13,13,13,13,32,32,13,32,13,13,13,13,13,13,1,13,13,1};
	
//gastly, pikachu, vulpix, magmar, onix, scither, hitmoly, lickitong, hitmochap, elektabuz, voltorb, jynx, shellder, dratini
	static Integer especial [] = {32,13,13,1,1,1,1,1,1,1,13,1,13,32};
	
//lapras, snorlax, porigon, chansey	
	static Integer epica [] = {1,1,1,1};
	
	static String pokecomun [] = { "pidgey", "weedle", "caterpie", "magikarp", "rattata", "eevee", "nidoranF", "nidoranM", "bellsprout", "goldeen", "venonat", "spearow"};
	
	static String pokemedio [] = {"ekans", "cleafairy", "odish", "zubat", "paras", "meowth", "poliwag", "slopoke", "krabby", "excecute", "horsea", "staryu", "pinsir", "psiduck"};
	
	static String pokedificil [] = { "bulbausur", "squire", "charmander", "sandrew", "jigglypuff", "diglet", "mankey", "growlithe", "abra", "machop", "tantacool", "geodude", "ponita", "magnmite", "grimer", "seel", "doduo", "drowzee", "cubone", "koffing", "rhinox", "tangela" };
	
	static String pokeespecial [] = { "gastly", "pikachu", "vulpix", "magmar", "onix", "scither", "hitmoly", "lickitong", "hitmochap", "elektabuz", "voltorb", "jynx", "shellder", "dratini" };
	
	static String pokeepico [] = { "lapras", "snolax", "porigon", "chansey" };
	
	static int [] todos = new int [66];
	
	static int jolteon=0, flareon=0, vaporeon=0;
	
	static int ev=7;
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int z=0, z1=0, z2=0, z3=0, z4=0;
		
int cont=0;
					
		llenar();
		


Random generator = new Random();
generator.setSeed(3816);


//seguira mientras no haya capturado todos los pokemon
while(z!=12 || z1!=14 || z2!=22 || z3!=14 || z4!=4)
{			
	
cont++;
	for(int c=0; c<12; c++)
			
		{

			if(comun[c]<=0 && z!=12)
			{
				z++; 
			}
			
		}
		
		if(z!=12) {z=0;}

		
		for(int m=0; m<14; m++)
		{

			if(medio[m]<=0 && z1!=14)
			{
				z1++;
			}
			
		}
		
		if(z1!=14) {z1=0;}
	
	
		for(int d=0; d<22; d++)
		{
			if(dificil[d]<=0 && z2!=22)
			{
				z2++;
			}
			
		}
		
		if(z2!=22) {z2=0;}	
	

		for(int s=0; s<14; s++)
		{
			if(especial[s]<=0 && z3!=14)
			{
				z3++;
			}
			
		}
		
		if(z3!=14) {z3=0;}

		for(int e=0; e<4; e++)
		{
			if(epica[e]<=0 && z4!=4)
			{
				z4++;
			}
			
		}
		
		if(z4!=4) {z4=0;}
		
	

		int poc=generator.nextInt(66); //genera que tipo de pokemon se encontro comun, medio, dificil, especial, epico
		
		//segun el tipo que es llamara su funcion
		if(todos[poc] == 48) 
		{  
			Pcomunes();
			}
		else if (todos[poc] == 30) 
		{
			
			
			Pmedios(); }
		else if (todos[poc] == 15) 
		{ 
			
			Pdificiles(); }
		else if (todos[poc] == 5) 
		{ 
			
			Pespeciales(); }
		else if (todos[poc] == 2) 
		{
			
			Pepicos(); }
		//System.out.println(poke);

}		
	
		//System.out.println(cont);
		
	



		int tie = (cont/400)*14;
		
		System.out.println(tie +" días");
		
		lista();
		
		
		
		
		
			}
	
	




	

//impresion final
	private static void lista() {
		// TODO Auto-generated method stub
		System.out.println("\ncomunes");
		for (int c = 0; c < 12; c++) {

			System.out.println(pokecomun[c] + " " + comun[c]);

		}

		System.out.println("\nmedios");
		for (int m = 0; m < 14; m++) {
			System.out.println(pokemedio[m] + " " + medio[m]);

		}

		
		
				System.out.println("\ndificiles");
		for (int d = 0; d < 22; d++) {
			System.out.println(pokedificil[d] + " " + dificil[d]);

		}

		System.out.println("\nespeciales");
		for (int s = 0; s < 14; s++) {
			System.out.println(pokeespecial[s] + " " + especial[s]);

		}

		System.out.println("\nepicas");
		for (int e = 0; e < 4; e++) {
			System.out.println(pokeepico[e] + " " + epica[e]);

		}

	}








//llena el vector de todos porque me dio pereza hacerlo manual
	private static void llenar() {
			// TODO Auto-generated method stub
		
		int i=0;
		
		while(i<66)
		{
			if(i<32)
			{
				todos[i]=48;
			}
			
			if(i>=32 && i<51)
			{
				todos[i]=30;
			}
			
			if(i>=51 && i<61)
			{
				todos[i]=15;
			}
			
			if(i>=61 && i<65)
			{
				todos[i]=5;
			}
			
			if(i==65)
			{
				todos[i]=2;
			}
			
		//System.out.println(todos[i]);
		
		i++;
		}
		}









	private static void Pcomunes() {
		
		//cual de todos los comunes salio
		Random pokeC = new Random();
		int pc=pokeC.nextInt(12);
		
		//probabilidad de capturarlo
		Random captura = new Random();
		int cat=captura.nextInt(4);
		
		//para eevee porque tiene 3 evoluciones aleatorias
		Random exev = new Random();
		int eevee=exev.nextInt(3);
		//System.out.println(pc);
		
		//si es diferente de 0 lo ha capturado
		if(cat!=0)
		{
			comun[pc]=comun[pc]-1; 
		
			//eevee evolucion
			if(pc==5 && comun[pc]==0)
			{
				
				
				if(eevee==0) 
				{
					jolteon++; //System.out.println("jolteon");
				}
				
				if(eevee==1)
				{
					flareon++; //System.out.println("flareon");
				}
				
				if(eevee==2)
				{
					vaporeon++; //System.out.println("vaporeon");
				}
				
				//si es igual a 0 es que no lo ha conseguido
				if(vaporeon==0 || flareon==0 || jolteon==0)
				{
					comun[pc]=7; ev=ev+7;;
				}
			}
			
		
			
		}

		
	}
	
	private static void Pmedios() {
		

		Random pokeM = new Random();
		int pc=pokeM.nextInt(14);
		
		//int pc=(int) (Math.random()*12);
		Random captura = new Random();
		int cat=captura.nextInt(4);
		
		if(cat!=0)
		{medio[pc]=medio[pc]-1;
		
		}
		//System.out.println(pc+" "+medio[pc]);
		
	}
	
	private static void Pdificiles() {

		Random pokeD = new Random();
		int pc=pokeD.nextInt(22);
		
		//int pc=(int) (Math.random()*12);
		Random captura = new Random();
		int cat=captura.nextInt(4);
		
		if(cat!=0)
		{		dificil[pc]=dificil[pc]-1; 
		}
		
	}


	private static void Pespeciales () {
	
		Random pokeS = new Random();
		int pc=pokeS.nextInt(14);
		
		//int pc=(int) (Math.random()*12);
		Random captura = new Random();
		int cat=captura.nextInt(4);
		
		if(cat!=0)
		{
	especial[pc]=especial[pc]-1; 
	}
	//System.out.println(pc+" "+especial[pc]);
	}

	private static void Pepicos() {
	
		Random pokeE = new Random();
		int pc=pokeE.nextInt(4);
		
		//int pc=(int) (Math.random()*12);
		Random captura = new Random();
		int cat=captura.nextInt(4);
		
		if(cat!=0)
		{
	epica[pc]=epica[pc]-1;
	}
	//System.out.println(pc+" "+pico[pc]);
	
}

}
