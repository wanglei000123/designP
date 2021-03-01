package com.cbf4life.builder;

import java.util.ArrayList;

/**
 * @author cbf4Life cbf4life@126.com I'm glad to share my knowledge with you
 *         all. 最终客户开始使用这个模型
 *         例子比较好（建造者模式和工厂模式区别： 工厂模式一般都是创建一个产品，注重的是把这个产品创建出来就行，只要创建出来，不关心这个 产品的组成部分,建造者模式也是创建一个产品，但是不仅要把这个产品创建出来，还要关系这个产品的组成细节，组成过程。）
 *         从代码上看，工厂模式就是一个方法，用这个方法就能生产出产品。
 *         从代码上看，建造者模式在建造产品时，这个产品有很多方法，建造者模式会根据这些相同方法但是不同执行顺序建造出不同组成细节的产品。
 */
public class Client {

	public static void main(String[] args) {

		Director director = new Director();

		// 1W辆A类型的奔驰车

		for (int i = 0; i < 10000; i++) {

			director.getABenzModel().run();

		}

		// 100W辆B类型的奔驰车

		for (int i = 0; i < 1000000; i++) {

			director.getBBenzModel().run();

		}

		// 1000W量C类型的宝马车

		for (int i = 0; i < 10000000; i++) {

			director.getCBMWModel().run();

		}

	}

}
