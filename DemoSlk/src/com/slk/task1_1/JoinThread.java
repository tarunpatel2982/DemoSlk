package com.slk.task1_1;

public class JoinThread  extends Thread{
public void run()
    {    
        for(int i=1; i<=4; i++)  
        {    
            try  
            {    
                Thread.sleep(500);    
            }catch(Exception e){System.out.println(e);}    
            System.out.println(i);    
        }    
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			JoinThread joinThread = new JoinThread();

			
			JoinThread joinThread2 = new JoinThread();

			JoinThread joinThread3 = new JoinThread();
			
			joinThread.start();
			try
			{
				joinThread.join();
			}catch(Exception e)
			{
				System.out.println(e);
			}
			joinThread2.start();

			joinThread3.start();
			

			
	}

}
