package com.cbf4life.state;

/**
 * @author cbf4Life cbf4life@126.com I'm glad to share my knowledge with you
 *         all. 模拟电梯的动作
 *         在工作流或游戏等各种系统中有大量使用，甚至是这些系统的核心功能设计，例如ERP系统中，一个批文的状态有多种：未办；正在办理；正在批示；正在审核；已经完成等各种状态，使用状态机可以封装这个状态的变化规则，从而达到扩充状态时，不必涉及到状态的使用者。
 */
public class Client {

	public static void main(String[] args) {

		Context context = new Context();

		context.setLiftState(new ClosingState());

		context.open();

		context.close();

		context.run();

		context.stop();
	}
}
