package test;

import cn.AbstractStorage;
import cn.ConsumerExtendsThread;
import cn.ProducerExtendsThread;
import cn.Storage1;

public class TestThread {

	   public static void main() {}
       public void test() {

           // �ֿ����
           AbstractStorage abstractStorage = new Storage1();
   
           // �����߶���
          ProducerExtendsThread p1 = new ProducerExtendsThread(abstractStorage);
          ProducerExtendsThread p2 = new ProducerExtendsThread(abstractStorage);
          ProducerExtendsThread p3 = new ProducerExtendsThread(abstractStorage);
          ProducerExtendsThread p4 = new ProducerExtendsThread(abstractStorage);
          ProducerExtendsThread p5 = new ProducerExtendsThread(abstractStorage);
          ProducerExtendsThread p6 = new ProducerExtendsThread(abstractStorage);
          ProducerExtendsThread p7 = new ProducerExtendsThread(abstractStorage);
  
          // �����߶���
          ConsumerExtendsThread c1 = new ConsumerExtendsThread(abstractStorage);
          ConsumerExtendsThread c2 = new ConsumerExtendsThread(abstractStorage);
          ConsumerExtendsThread c3 = new ConsumerExtendsThread(abstractStorage);
  
          // ���������߲�Ʒ��������
          p1.setNum(10);
          p2.setNum(10);
          p3.setNum(10);
          p4.setNum(10);
          p5.setNum(10);
          p6.setNum(10);
          p7.setNum(80);
  
          // ���������߲�Ʒ��������
          c1.setNum(50);
          c2.setNum(20);
          c3.setNum(30);
  
          // �߳̿�ʼִ��
          c1.start();
          c2.start();
          c3.start();
  
          p1.start();
          p2.start();
          p3.start();
          p4.start();
          p5.start();
          p6.start();
          p7.start();
      
       }
}
