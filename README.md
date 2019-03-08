# ThreadPoolClients



DEMO:



public static void main(String[] args) {
		
	 ThreadPoolClients tpc=new ThreadPoolClients(100);
	 for(int i=0;i<10;i++) {
		 tpc.add(new ThreadPoolTask() {
			@Override
			public Object call() throws Exception {
				 String text="";
				 int num= (int) (Math.random()*100000000);
				 String phone="139"+num;
				 //phone="13816360435";//   13816360435 
				 try {
				    //


				} catch (IOException e) {
					e.printStackTrace();
				}finally {
					super.call();
				}
				System.out.println(phone+text);
				return phone+text;
			}
		});
	 }

	List<ThreadPoolEntity> list=tpc.submits();
	for (ThreadPoolEntity tpe : list) {
		try {
			//System.out.println(tpe.getKey()+"\t"+tpe.getFuture().get());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
			
			
}
  
  
