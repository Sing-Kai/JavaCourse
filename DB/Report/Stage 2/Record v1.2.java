import java.util.*;

/*       */
class Record {

	String[] record = {"Name", "Kind", "Age"};

	String getName(){
		return record[0];
	}

	String getKind(){
		return record[1];
	}

	String getAge(){
		return record[2];
	}

	String setName(String newName){
		record[0] = newName;
		return newName;
	}

	String setKind(String newKind){
		record[1] = newKind;
		return newKind;
	}

	String setAge(String newAge){
		record[2] = newAge;
		return newAge;
	}

	int countFields(){
		int counter = 0;
		for (int i = 0; i < record.length; i++){
			if (record[i] != null){
				counter++;
			}
		}
		return counter;
	}

	// Tests
	public static void main(String[] args) {
		Tester t = new Tester();
    	Record recordTest = new Record();	

		recordTest.setName("testName");
    	t.is(recordTest.getName(), "testName");

    	recordTest.setKind("testKind");
    	t.is(recordTest.getKind(), "testKind");

    	recordTest.setAge("testAge");
    	t.is(recordTest.getAge(), "testAge");

    	t.is(recordTest.countFields(), 3);
    	t.end(); 
    }
}