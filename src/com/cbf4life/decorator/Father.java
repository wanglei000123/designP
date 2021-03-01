package com.cbf4life.decorator;

/**
 * @author cbf4Life cbf4life@126.com I'm glad to share my knowledge with you
 *         all. 老爸看成绩单了
 *         本例不错（看main方法过程即可）
 *         Java 的I/O API就是使用Decorator实现的
 *         需要一个汉堡，主体是鸡腿堡，可以选择添加生菜、酱、辣椒等等许多其他的配料，这种情况下就可以使用装饰者模式(配料就是装饰的第一层、第二层等等)
 */
public class Father {

	public static void main(String[] args) {

		// 成绩单拿过来

		SchoolReport sr;

		sr = new FouthGradeSchoolReport(); // 原装的成绩单

		// 加 了最高分说明的成绩单

		sr = new HighScoreDecorator(sr);

		// 又加了成绩排名的说明

		sr = new SortDecorator(sr);

		// 看成绩单

		sr.report();

		// 然后老爸，一看，很开心，就签名了

		sr.sign("老三"); // 我叫小三，老爸当然叫老三

	}
}
