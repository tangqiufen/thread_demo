package cn;

public class ConsumerExtendsThread extends Thread {
	// ÿ�����ѵĲ�Ʒ����
	      private int num;
	  
	      // ���ڷ��õĲֿ�
	      private AbstractStorage abstractStorage1;
	  
	      // ���캯�������òֿ�
	      public ConsumerExtendsThread(AbstractStorage abstractStorage1)
	     {
	         this.abstractStorage1 = abstractStorage1;
	     }
	 
	     // �߳�run����
	     public void run()
	     {
	         consume(num);
	     }
	 
	     // ���òֿ�Storage����������
	     public void consume(int num)
	     {
	         abstractStorage1.consume(num);
	     }
	 
	     public void setNum(int num){
	         this.num = num;
	     }
}
