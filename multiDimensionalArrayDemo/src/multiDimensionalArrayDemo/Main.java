package multiDimensionalArrayDemo;


public class Main {

	public static void main(String[] args) {
		String[][] sehirler = new String[3][3];
		
		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Kocaeli";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Maraş";
		sehirler[2][0] = "Van";
		sehirler[2][1] = "Diyarbakır";
		sehirler[2][2] = "Gaziantep";
		
		for(int i = 0; i<3; i++) {
			System.out.println("-----------------");
			for(int j = 0; j<3; j++) {
				System.out.println(sehirler[i][j]);
			}
		}
		

	}

}