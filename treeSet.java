import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class treeSet {
	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<>();
		String fileName = "C:\\Users\\jared\\Documents\\treeSetData.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = br.readLine()) != null) {
				tree.add(line);
			}
			
			System.out.println("Tree Set : " + tree);
			
			br.close();
		}
		catch (Exception e) {
			System.out.println("File Not Found");
		}
	}
}
