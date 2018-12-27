package test;

import cn.AbstractStorage;
import cn.ConsumerExtendsThread;
import cn.ProducerExtendsThread;
import cn.Storage1;

public class TestThread {

	   public static void main() {}
       public void test() {

           // 仓库对象
           AbstractStorage abstractStorage = new Storage1();
   
           // 生产者对象
          ProducerExtendsThread p1 = new ProducerExtendsThread(abstractStorage);
          ProducerExtendsThread p2 = new ProducerExtendsThread(abstractStorage);
          ProducerExtendsThread p3 = new ProducerExtendsThread(abstractStorage);
          ProducerExtendsThread p4 = new ProducerExtendsThread(abstractStorage);
          ProducerExtendsThread p5 = new ProducerExtendsThread(abstractStorage);
          ProducerExtendsThread p6 = new ProducerExtendsThread(abstractStorage);
          ProducerExtendsThread p7 = new ProducerExtendsThread(abstractStorage);
  
          // 消费者对象
          ConsumerExtendsThread c1 = new ConsumerExtendsThread(abstractStorage);
          ConsumerExtendsThread c2 = new ConsumerExtendsThread(abstractStorage);
          ConsumerExtendsThread c3 = new ConsumerExtendsThread(abstractStorage);
  
          // 设置生产者产品生产数量
          p1.setNum(10);
          p2.setNum(10);
          p3.setNum(10);
          p4.setNum(10);
          p5.setNum(10);
          p6.setNum(10);
          p7.setNum(80);
  
          // 设置消费者产品消费数量
          c1.setNum(50);
          c2.setNum(20);
          c3.setNum(30);
  
          // 线程开始执行
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
