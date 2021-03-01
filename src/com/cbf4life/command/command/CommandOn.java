package com.cbf4life.command.command;

import com.cbf4life.command.Receiver.Tv;

//开机命令ConcreteCommand
public class CommandOn implements Command {
	private Tv myTv;

	public CommandOn(Tv tv) {
		myTv = tv;
	}

	public void execute() {
		myTv.turnOn();
	}
}
