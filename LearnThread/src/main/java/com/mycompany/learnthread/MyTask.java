
package com.mycompany.learnthread;

public class MyTask implements Runnable{
    private int taskId;

    public MyTask(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
  System.out.println("Task"+taskId+" completed by"+Thread.currentThread().getName());
        try{
           Thread.sleep(1000);
        
        
        }
        catch(Exception e){
            System.out.println("Task"+taskId+"interrupted");
        
        }
        System.out.println("Task"+taskId+" completed by"+Thread.currentThread().getName());
        
        
    }
    
}
