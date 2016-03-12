import java.util.*;

/*       */
class Record {

	ArrayList<String> record = new ArrayList<String>();

	int countFields(){
		return record.size();
	}

	void appendField(String value){
		record.add(value);
	}

	String getField(int index){
		if(index < 0 || index > record.size()){
			throw new Error("Invalid input");
		}
		String field = record.get(index);
		return field;
	}

	// sets individual field value
	void setField(int index, String value){
		if(index < 0 || index > record.size()){
			throw new Error("Invalid input");
		}
		else{
			record.set(index, value);			
		}
	}

	// Tests
	public static void main(String[] args) {

		Tester t = new Tester();	
    	Record recordTest = new Record();	
    	String value;

    	// Test appendField method and getField Method
    	recordTest.appendField("Bob");
     	value = recordTest.getField(0);
    	t.is(value, "Bob");

    	// Tests setField method
    	recordTest.appendField("Rick");
    	recordTest.setField(1, "Morty");
    	value = recordTest.getField(1);
    	t.is(value, "Morty");

    	// Tests countFields method
    	int total = recordTest.countFields();
    	t.is(total, 2);
    	t.end();
    }
}