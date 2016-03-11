import java.util.*;

/*       */
class Record {

	String[] record = {"Name", "Kind", "Age"};

	String getName(){
		System.out.println(record[0]);
		return record[0];
	}

	String getKind(){
		System.out.println(record[1]);
		return record[1];
	}

	String getAge(){
		System.out.println(record[2]);
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
		System.out.println(counter);
		return counter;
	}

	// Tests
	private static int tests;
	public static void main(String[] args) {
		test();
    }

    public static void test() {
    	Record recordTest = new Record();
    	tests = 0;
    	is(recordTest.getName(), "Name");
    	is(recordTest.getKind(), "Kind");
    	is(recordTest.getAge(), "Age");
    	is(recordTest.setName("testName"), "testName");
    	is(recordTest.setKind("testKind"), "testKind");
    	is(recordTest.setAge("testAge"), "testAge"); 
    	is(recordTest.countFields(), 3);
        System.out.println("Tests passed: " + tests);	
    }

    static void is(Object x, Object y) {
        tests++;
        if (x == y) return;
        if (x != null && x.equals(y)) return;
        throw new Error("Test failed: " + x + ", " + y);
    }  
}