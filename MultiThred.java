class MultiThred extends Thread{  
  public void run() {  
  System.out.println("thread is running...");  
  }  
  public static void main(String args[]){  
  MultiThred t1 = new MultiThred();  
  t1.start();  
    }  
  }