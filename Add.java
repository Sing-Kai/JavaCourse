class Add{

	int total = 0;

	void run(String[] args){

		for(int i = 0; i < args.length; i++){
			int n = Integer.parseInt(args[i]);
			total = total + n;
		}
	System.out.println(total);	
	}

	public static void main(String[] args){
	
		Add program = new Add();
		program.run(args);
		
	}
}