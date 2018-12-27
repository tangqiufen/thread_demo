package cn;
import java.util.LinkedList;
public class Storage1 implements AbstractStorage {

	    //�ֿ��������
	      private final int MAX_SIZE = 100;
	     //�ֿ�洢������
	     private LinkedList list = new LinkedList();
	     //������Ʒ
	     public void produce(int num){
	         //ͬ��
	         synchronized (list){
            //�ֿ�ʣ������������Դ�ż���Ҫ��������������ͣ����
	            while(list.size()+num > MAX_SIZE){
	                 System.out.println("��Ҫ�����Ĳ�Ʒ������:" + num + "\t���������:"
	                         + list.size() + "\t��ʱ����ִ����������!");
	                 try {
                    //���������㣬��������
	                     list.wait();
	                 } catch (InterruptedException e) {
	                     e.printStackTrace();
	                 }
	             }
	 
	             for(int i=0;i<num;i++){
	                 list.add(new Object());
	             }
	             System.out.println("���Ѿ�������Ʒ����:" + num + "\t���ֲִ���Ϊ��:" + list.size());
	             list.notifyAll();
	         }
	     }
	 
	     //���Ѳ�Ʒ
	     public void consume(int num){
	         synchronized (list){	 
	             //��������������
	             while(num > list.size()){
	                 System.out.println("��Ҫ���ѵĲ�Ʒ������:" + num + "\t���������:"
	                        + list.size() + "\t��ʱ����ִ����������!");
	 
	                 try {
	                     list.wait();
	                 } catch (InterruptedException e) {
	                     e.printStackTrace();
	                 }
	             }
	             //�����������㣬��ʼ����
	             for(int i=0;i<num;i++){
	                 list.remove();
	             }
	             System.out.println("���Ѿ����Ѳ�Ʒ����:" + num + "\t���ֲִ���Ϊ��:" + list.size());
	             list.notifyAll();
	         }
	     }
	
}
