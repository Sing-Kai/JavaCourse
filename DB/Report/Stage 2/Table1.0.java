import java.util.*;

class Table {

	private List<String[]> table = new ArrayList<String[]>();

	String columnOne = "Name";
	String columnTwo = "Kind"; 
	String columnThree = "Age";

	String getColumnOne(){
		System.out.println(columnOne);
		return columnOne;
	}

	String getColumnTwo(){
		System.out.println(columnTwo);		
		return columnTwo;
	}

	String getColumnThree(){
		System.out.println(columnThree);		
		return columnThree;
	}

	void setColumnNames(String columnOne, String columnTwo, String columnThree){
		this.columnOne = columnOne;
		this.columnTwo = columnTwo;
		this.columnThree = columnThree;
	}

	void insertRecord(String[] record) {
		table.add(record);
	}

	void printTable() {
		for (String[] arr : table){
			System.out.println(Arrays.toString(arr));
		}
	}

	void deleteRecord(int index) {
		table.remove(index);
	}

	String[] returnRecord(int index) {
		String[] row = table.get(index);
		return row;
	}

	void print(){
		for(int i = 0; i < table.size(); i++){
			System.out.println(table.get(i));
		}
	}

	// Tests
	public static void main(String[] args) {

		Table tableTest = new Table();
		Tester t = new Tester();
		String[] record = {"Rick", "Morty", "Bob"};
		String[] recordTest;

		// Test column name changes
		tableTest.setColumnNames("A", "B", "C");
		t.is(tableTest.getColumnOne(), "A");
		t.is(tableTest.getColumnTwo(), "B");		
		t.is(tableTest.getColumnThree(), "C");	

		// Test insertRecord method and returnRecord method
		tableTest.insertRecord(record);
		recordTest = tableTest.returnRecord(0);
		t.is(recordTest, record);
		t.end();
    }
}
