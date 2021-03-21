import java.util.Scanner;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner s = new Scanner(System.in);
	
		File f = new File("test.txt");
	 Scanner sfile = new Scanner(f);//Scanner collegato al file

		if(!f.exists()){
			f.createNewFile();
		}else{
			System.out.print("Inserire quanti numeri si vogliono inserire: ");
			int n = s.nextInt();
			PrintWriter fw = new PrintWriter(f);
			s.nextLine();
			for(int i = 0; i < n; i++){				
				System.out.print("Inserire Numero: ");
				String m = s.nextLine();
				fw.write( m +"\n" );
				}
			fw.close();
		}
    int tot=0;
     while (sfile.hasNextLine()) { // Lettura del file
        String nm = sfile.nextLine();
        int num = Integer.parseInt(nm);
        tot = tot + num;
      }
    System.out.print("La somma e' " + tot);
	}

}