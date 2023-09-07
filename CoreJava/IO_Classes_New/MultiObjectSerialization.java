package IO_Classes_New;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

public class MultiObjectSerialization {

	public static void main(String[] args) throws IOException {
		// Create Movie Objects and add them to list
		Movie m1 = new Movie();
		m1.getValues();
		Movie m2 = new Movie();
		m2.getValues();
		List<Movie> lmovies = new ArrayList<>();
		lmovies.add(m1);
		lmovies.add(m2);

		writeToFile(lmovies);
		readFile();

	}

	public static void writeToFile(List<Movie> lmovies) throws IOException {

		FileOutputStream file = new FileOutputStream("Movie.txt");
		ObjectOutputStream os = new ObjectOutputStream(file);
		os.writeObject(lmovies);
		os.close();
		file.close();

	}

	public static void readFile()  {
		
		try{
		FileInputStream file = new FileInputStream("Movie.txt");
		ObjectInputStream is = new ObjectInputStream(file);

		List<Movie> input = (List<Movie>) is.readObject();

		// this will contain the list of the objects
		for (Movie app : input) {

			
			System.out.print(app.id + " " + app.name);
			System.out.println();

		}

		is.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		}
}

// Serizable is a pre defined marker interface- empty interface
class Movie implements Serializable {
	// Variables
	int id;
	String name;

	// constructor
	public Movie() {
	}

	public Movie(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void getValues() {
		// Scanner class and take input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter movie id");
		id = sc.nextInt();
		sc.nextLine();// to remove enter
		System.out.println("Eter name");
		name = sc.nextLine();

	}
}
