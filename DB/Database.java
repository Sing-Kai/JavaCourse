import java.util.*;

class Database {

 	Record record1;

	public static void main(String[] args) {
		Database database = new Database();
		database.run();
				
    }	

    void run() {
    	record1 = new Record();
    	record1.getName();
    	record1.getKind();
    	record1.getAge();
    	record1.countFields();

    	record1.setName("James");
    	record1.getName();

    	record1.setKind("Dragon");
    	record1.getKind();

    	record1.setAge("100");
    	record1.getAge();

    }

}