

// Code to print table records


	public static void main(String[] args) {


		List<String[]> tableTest = new ArrayList<String[]>();

		String[] record = {"wubba", "Lubba", "dub", "dub"};
		String[] record2 = {"lick", "lick", "dub", "dub"};

		// tableTest.add(new String[] {"wubba", "Lubba", "dub", "dub"});

		tableTest.add(record);	

		tableTest.add(record2);	

		for (String[] arr : tableTest){
			System.out.println(Arrays.toString(arr));

		}


    }


		void printRecord(){

		for( int i = 0; i < record2.size(); i++){
			System.out.print(record2.get(i));
			System.out.print(" ");
		}
	}


		void printTable() {
		for (String[] arr : table){
			System.out.println(Arrays.toString(arr));
		}

	// for printing elements in array list
	void printTable() {
		for(int i = 0; i < table.size(); i++) {   
    		System.out.print(table.get(i));
		} 	
	}