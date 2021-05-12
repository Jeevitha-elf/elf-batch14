import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.apache.commons.csv.CSVRecord;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class ReadDataFromCsv {
	public static void main(String[] args) throws IOException, CsvException {
		FileReader fr= new FileReader("./resources/readdata1.csv");
		CSVReader cr=new CSVReader(fr);
		List<String[]> str = cr.readAll();
		for(String[] s:str) {
			for(String v:s) {
				System.out.println(v+" ");
			}
			System.out.println();
		}
	}
}
