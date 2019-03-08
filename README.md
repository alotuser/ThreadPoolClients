# ThreadPoolClients



DENO:



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
							
							 String data="{\"phone\":\""+phone+"\",\"userType\":\"1\",\"type\":\"TYPE_6\",\"user\":\"1\"}";
							 Document doc= Jsoup.connect("http://sms.cluochuxing.com/auth/getCode")                    
							.ignoreHttpErrors(true)
							.followRedirects(true)
							.ignoreContentType(true)
							.timeout(25000)
							.postDataCharset("utf-8")
							.userAgent("cluoyhd")
							.requestBody(data)
							.header("Content-Type", "application/json; charset=UTF-8")
							.header("sysVersion", "00")
							.header("deviceType", "1")
							.header("signature", "b3ed76994b76b0sfdsf4f6a47e159495b")
							.header("ip", "192.168.1.101")
							.header("User-Agent", "cluoyhd")
							.header("link", "http://sms.cluochuxing.com/auth/getCode")
							.header("clientInfo", "12345679")
							.header("screen", "1020*769")
							.header("deviceVersion", "0.2.2")
							.header("uuid", "efedc02d-96d5-4258-abdc-0eb4sddf7fb")
							.header("platform", "1")
							.header("deviceInfo", "1")
							.header("mac", "")
							.header("bodysignature", "f8cec10539816cafc73sdsf3842cb606c")
							.header("networkType", "NETWORK_UNKNOWN")
							.header("deviceModal", "TESTER-TESTER-TT 4")
							.header("deviceUUID", "TESTER-TT 4-")
							.header("channelId", "cluo")
							.post();
							
							text=(doc.text());
								
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
  
  
