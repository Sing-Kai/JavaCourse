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

	void setName(String newName){
		record[0] = newName;
	}

	void setKind(String newKind){
		record[1] = newKind;
	}

	void setAge(String newAge){
		record[2] = newAge;
	}

	void countFields(){
		int counter = 0;
		for (int i = 0; i < record.length; i++){
			if (record[i] != null){
				counter++;
			}
		}
		System.out.println(counter);
	}

	public static void main(String[] args) {

		System.out.println("Hello World");

    }
}