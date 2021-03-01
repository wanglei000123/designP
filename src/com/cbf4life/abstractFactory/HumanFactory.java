package com.cbf4life.abstractFactory;

/**
 * @author cbf4Life cbf4life@126.com I'm glad to share my knowledge with you
 *         all. 这次定一个接口，应该要造不同性别的人，需要不同的生产线 那这个八卦炉必须可以制造男人和女人
 */
public interface HumanFactory {

	// 制造黄色人类

	public Human createYellowHuman();

	// 制造一个白色人类

	public Human createWhiteHuman();

	// 制造一个黑色人类

	public Human createBlackHuman();
}
