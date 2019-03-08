package cn.test;

import java.util.List;
import java.util.concurrent.ExecutionException;

import com.chileqi.threadpoolclients.ThreadPoolClients;
import com.chileqi.threadpoolclients.ThreadPoolTask;
import com.chileqi.threadpoolclients.ThreadPoolClients.ThreadPoolEntity;

public class TestDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {


		ThreadPoolClients tpc=new ThreadPoolClients(10);
		tpc.add(new ThreadPoolTask() {
			@Override
			public Object call() throws Exception {
				
				
				
				
				return super.call();
			}
		});
		tpc.add(new ThreadPoolTask() {
			@Override
			public Object call() throws Exception {
				
				
				
				
				return super.call();
			}
		});
		
		List<ThreadPoolEntity> list=tpc.submits();
		
		for (ThreadPoolEntity tpe : list) {
			
			System.out.println(tpe.getKey()+"\t"+tpe.getFuture().get());
		}
		
		
	}

}
