package com.thread1.day2;


class SmsSender extends Thread{
	public void run(int name) {
		//when the thread is running state  -->
		//thread doing some work 
		//suppose some other requirement is come 
		//then the thread state will go to RUNNING to WAITING/BLOCKED
		//once WAITING is over then it will come again RUNNABLE STATE 
		//When the CPU allows , it will go to RUNNING state
		// and finished the run method it will go to the TERMINATED STATE
		System.out.println("SmsSender.run(>>>>>>>>>>>>>)");
	}
}
public class Driver {

	public static void main(String[] args) {
		SmsSender sms = new SmsSender();//it this state the thread will born and the state is NEW
		//state -> RNNABLE
		sms.start();//NEW-->RNNABLE
		//once the CPU gives the permission then i will go to the RUNNING condition and Execute the Run method
	//	sms.start();//TERMINATED --> RUNNABLE it will throw exception
		//once the thread will terminated it will never re start again
	
	}

}
