package com.cbf4life.mediator;

/**
 * 
 * 例子见https://blog.csdn.net/jason0539/article/details/45216585（经典）
 * 适用情况
一般来说，同事类之间的关系是比较复杂的，多个同事类之间互相关联时，他们之间的关系会呈现为复杂的网状结构，这是一种过度耦合的架构，即不利于类的复用，也不稳定。例如有六个同事类对象，假如对象1发生变化，会有4个对象受到影响。如果对象2发生变化，那么会有5个对象受到影响。也就是说，同事类之间直接关联的设计是不好的。
如果引入中介者模式，那么同事类之间的关系将变为星型结构，任何一个类的变动，只会影响的类本身，以及中介者，这样就减小了系统的耦合。一个好的设计，必定不会把所有的对象关系处理逻辑封装在本类中，而是使用一个专门的类来管理那些不属于自己的行为。
 *
 */
public class Client {

	public static void main(String[] args) {

		AbstractMediator mediator = new Mediator();

		// 采购人员采购电脑

		System.out.println("------采购人员采购电脑--------");

		Purchase purchase = new Purchase(mediator);

		purchase.buyIBMcomputer(100);

		// 销售人员销售电脑

		System.out.println("\n------销售人员销售电脑--------");

		Sale sale = new Sale(mediator);

		sale.sellIBMComputer(1);

		// 库房管理人员管理库存

		System.out.println("\n------库房管理人员清库处理--------");

		Stock stock = new Stock(mediator);

		stock.clearStock();

	}

}
