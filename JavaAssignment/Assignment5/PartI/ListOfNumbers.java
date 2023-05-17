import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class ListOfNumbers {
	
    private List<RDFTriple> list;
    private String inFile;
 
    public ListOfNumbers () {
        // create an ArrayList of RDFTriples of Integers
    }
    
    public List getList() {
    	return this.list;
    }
    
    public void createList() {
    	List<RDFTriple> rdfTripleList = new ArrayList<RDFTriple>();
    	for (int i = 0 ; i< 100 ; i++) {
    		Integer number1 = (int) (Math.random()*10000);
    		Integer number2 = (int) (Math.random()*10000);
    		Integer number3 = (int) (Math.random()*10000);

    		// fill the existing list with RDFTriple objects
    		// of three numbers.
    		RDFTriple<Integer, Integer, Integer> t = 
    				new RDFTriple<Integer, Integer, Integer>(number1, number2, number3);
    		rdfTripleList.add(t);
    	}
    }
    

    public ListOfNumbers (String inFile) {
    	this();
    	this.inFile = inFile;	
    }
    
    public void readList() {
    	List<RDFTriple> rdfTripleList = new ArrayList<RDFTriple>();
    	try {
			FileReader f = new FileReader("numberfile.txt");
			BufferedReader in = new BufferedReader(f); 
			String linea = in.readLine(); 
			while (linea!=null) { 
				String nums[] = linea.split(" ");
				RDFTriple<Integer, Integer, Integer> t = 
	    				new RDFTriple<Integer, Integer, Integer>(Integer.valueOf(nums[0]), Integer.valueOf(nums[1]), Integer.valueOf(nums[2]));
				rdfTripleList.add(t);
				linea = in.readLine();  
			}
			f.close(); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    
    public void writeList() {
        PrintWriter out = null;
        try {
            System.out.println("Entering try statement");
            out = new PrintWriter(new FileWriter("outFile.txt"));
            for (int i = 0; i < list.size(); i++)
                out.println(list.get(i).getSubj() + " " + list.get(i).getPred() + " " + list.get(i).getObj());
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Caught IndexOutOfBoundsException: " +
                                 e.getMessage());
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        } finally {
            if (out != null) {
                System.out.println("Closing PrintWriter");
                out.close();
            } else {
                System.out.println("PrintWriter not open");
            }
        }
    }
}