package cn;

public class ProducerExtendsThread extends Thread {
	//ÿ������������
	      private int num ;
	     //�����Ĳֿ�
	      public AbstractStorage abstractStorage;
	      public ProducerExtendsThread(AbstractStorage abstractStorage){
	          this.abstractStorage = abstractStorage;
	     }
	 
	     public void setNum(int num){
	         this.num = num;
	     }
	     // �߳�run����
	     @Override
	     public void run()
	     {
	         produce(num);
	     }
	     // ���òֿ�Storage����������
	     public void produce(int num)
	     {
	         abstractStorage.produce(num);
	     }
}
