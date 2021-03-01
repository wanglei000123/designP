package com.cbf4life.template;

/**
 * @author cbf4Life cbf4life@126.com I'm glad to share my knowledge with you
 *         all. 客户开始使用这个模型
 *         例子不好，见https://blog.csdn.net/jason0539/article/details/45037535
 */
public class Client {

	public static void main(String[] args) {

		HummerH2Model h2 = new HummerH2Model();

		h2.run(); // H2型号的悍马跑起来

		// 客户开着H1型号，出去遛弯了

		HummerH1Model h1 = new HummerH1Model();

		h1.setAlarm(false);

		h1.run(); // 汽车跑起来了；

	}

}
