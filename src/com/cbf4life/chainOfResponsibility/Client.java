package com.cbf4life.chainOfResponsibility;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author cbf4Life cbf4life@126.com I'm glad to share my knowledge with you
 *         all. 我们后人来看这样的社会道德
 *         例子经典
 */
@SuppressWarnings("all")
public class Client {

	public static void main(String[] args) {

		// 随机挑选几个女性

		Random rand = new Random();

		ArrayList<IWomen> arrayList = new ArrayList();

		arrayList.add(new Women(1, "我要出去逛街"));//女儿
		arrayList.add(new Women(2, "我要出去逛街"));//妻子
		arrayList.add(new Women(3, "我要出去逛街"));//母亲
		arrayList.add(new Women(0, "我要出去逛街"));//无
		
		// 定义三个请示对象

		Handler father = new Father();

		Handler husband = new Husband();

		Handler son = new Son();

		// 设置请示顺序（设置责任链，father -> husband -> son，son之后没有next则“没地方请示了， 不做处理”）

		father.setNext(husband);

		husband.setNext(son);

		for (IWomen women : arrayList) {

			father.HandleMessage(women);

		}

	}

}
