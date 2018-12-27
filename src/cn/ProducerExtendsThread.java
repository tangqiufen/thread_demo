package cn;

public class ProducerExtendsThread extends Thread {
	//每次生产的数量
	      private int num ;
	     //所属的仓库
	      public AbstractStorage abstractStorage;
	      public ProducerExtendsThread(AbstractStorage abstractStorage){
	          this.abstractStorage = abstractStorage;
	     }
	 
	     public void setNum(int num){
	         this.num = num;
	     }
	     // 线程run函数
	     @Override
	     public void run()
	     {
	         produce(num);
	     }
	     // 调用仓库Storage的生产函数
	     public void produce(int num)
	     {
	         abstractStorage.produce(num);
	     }
}
