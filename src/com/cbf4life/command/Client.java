package com.cbf4life.command;

import com.cbf4life.command.Invoker.Control;
import com.cbf4life.command.Receiver.Tv;
import com.cbf4life.command.command.CommandChange;
import com.cbf4life.command.command.CommandOff;
import com.cbf4life.command.command.CommandOn;

/**
 * @author cbf4Life cbf4life@126.com I'm glad to share my knowledge with you
 *         例子见经典(https://blog.csdn.net/jason0539/article/details/45110355)
 */
// 测试类Client
public class Client {
	public static void main(String[] args) {
		// 命令接收者Receiver
		Tv myTv = new Tv();
		// 开机命令ConcreteCommond
		CommandOn on = new CommandOn(myTv);
		// 关机命令ConcreteCommond
		CommandOff off = new CommandOff(myTv);
		// 频道切换命令ConcreteCommond
		CommandChange channel = new CommandChange(myTv, 2);
		// 命令控制对象Invoker
		Control control = new Control(on, off, channel);

		// 开机
		control.turnOn();
		// 切换频道
		control.changeChannel();
		// 关机
		control.turnOff();
	}
}
