package com.cbf4life.command.Invoker;

import com.cbf4life.command.command.Command;

//可以看作是遥控器Invoker
public class Control {
	private Command onCommand, offCommand, changeChannel;

	public Control(Command on, Command off, Command channel) {
		onCommand = on;
		offCommand = off;
	    changeChannel = channel;
	}

	public void turnOn() {
		onCommand.execute();
	}

	public void turnOff() {
		offCommand.execute();
	}

	public void changeChannel() {
	 changeChannel.execute();
	}
}
