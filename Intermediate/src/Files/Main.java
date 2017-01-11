package Files;

import java.io.*;
import java.util.ArrayList;

public class Main {

	static ArrayList<Person> people = new ArrayList<>();
	static ArrayList<Person> newPeople = new ArrayList<>();
	
	public static void main(String[] args) throws IOException{
		Person p1 = new Person("Dave","Thundercat",20);
		Person p2 = new Person("Percy","Heal Bird",15);
		Person p3 = new Person("Marvin","Statue",12);
		Person p4 = new Person("Steevie","Golden Boss Man",35);
		Person p5 = new Person("Freddie","Fire Elemental",45);
		
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		people.add(p5);
		
		for(int i = 0; i < people.size();i++){
		writeArray("people.txt",people);
		}
		
		newPeople = readArray("people.txt");
		
		for(Person p: newPeople){
			System.out.println(p.name);
		}
	}
	
	public static void writeArray(String inFile, ArrayList<Person> p) throws IOException{
	try{
			BufferedWriter buffOut = new BufferedWriter(new FileWriter(inFile));
		
			for(int i = 0; i < p.size();i++){
				String line = p.get(i).name + "," + p.get(i).occupation + "," + p.get(i).age;
				buffOut.write(line);
				buffOut.newLine();
		}
			buffOut.close();
		} catch (IOException e){
			System.out.println("Something happened... wrongly");
		}
	}
	
	public static ArrayList<Person> readArray(String inFile) throws IOException{
		ArrayList<Person> newPeople = new ArrayList<>();
		try{
			BufferedReader buffIn = new BufferedReader(new FileReader(inFile));
            String line = "";
			while((line = buffIn.readLine()) != null) {
            	String lines[] = line.split(",");
            	Person pNew = new Person(lines[0],lines[1],Integer.parseInt(lines[2]));
            	newPeople.add(pNew);
            }
			buffIn.close();
		} catch (IOException e){
			System.out.println("Something happened... wrongly");
		}
		return newPeople;
	}

}
