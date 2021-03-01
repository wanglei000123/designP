package com.cbf4life.abstractFactory;

/**
 * @author cbf4Life cbf4life@126.com I'm glad to share my knowledge with you
 *         all. 世界上有哪些类型的人，列出来 JDK 1.5开始引入enum类型也是目的的，吸引C程序员转过来
 */
public enum HumanEnum {

	// 把世界上所有人类型都定义出来

	YelloMaleHuman("com.cbf4life.abstractFactory.YellowMaleHuman"),

	YelloFemaleHuman("com.cbf4life.abstractFactory.YellowFemaleHuman"),

	WhiteFemaleHuman("com.cbf4life.abstractFactory.WhiteFemaleHuman"),

	WhiteMaleHuman("com.cbf4life.abstractFactory.WhiteMaleHuman"),

	BlackFemaleHuman("com.cbf4life.abstractFactory.BlackFemaleHuman"),

	BlackMaleHuman("com.cbf4life.abstractFactory.BlackMaleHuman");

	private String value = "";

	// 定义构造函数，目的是Data(value)类型的相匹配

	private HumanEnum(String value) {

		this.value = value;

	}

	public String getValue() {

		return this.value;

	}

	/*
	 * 
	 * java enum类型尽量简单使用，尽量不要使用多态、继承等方法
	 * 
	 * 毕竟用Clas完全可以代替enum
	 */

}
