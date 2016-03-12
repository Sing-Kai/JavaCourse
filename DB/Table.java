import java.util.*;

class Table {

	private List<ArrayList<String>> table = new ArrayList<ArrayList<String>>();
	private List<String> column = new ArrayList<String>();


	void addColumn(String value){
		column.add(value);
	}

	String getColumnName(int index){
		if(index < 0 || index > column.size()){
			throw new Error("Invalid Column Number");
		}		
		return column.get(index);
	}

	void setColumnNames(int index, String value){
		if(index < 0 || index > column.size()){
			throw new Error("Invalid Column Number");
		}	
		else{
			column.set(index, value);			
		}
	}

	void insertRecord(ArrayList<String> record) {
		table.add(record);
	}

	void deleteRecord(int index){
		table.remove(index);
	}

	void printTable() {
		for(int i = 0; i < table.size(); i++) {   
    		System.out.print(table.get(i));
		} 
/*		
		for (ArrayList<String> arr : table){
			System.out.println(Arrays.toString(arr));
		}

*/		
	}

	// return record

	// Tests
	public static void main(String[] args) {

		Table tableTest = new Table();
		Tester t = new Tester();
		String[] record2 = {"Rick", "Morty", "Birdman"};	
		Record r = new Record();			
		r.appendField("Rick");
/*
		// Test column name changes
		tableTest.setColumnNames("A", "B", "C");
		t.is(tableTest.getColumnOne(), "A");
		t.is(tableTest.getColumnTwo(), "B");		
		t.is(tableTest.getColumnThree(), "C");	
*/
		// Test insertRecord method and returnRecord method
		tableTest.insertRecord(r.record);
//		tableTest.deleteRecord(0);
		tableTest.printTable();

		t.end();
	
    }
}