package com.cbf4life.command.command;

import com.cbf4life.command.Receiver.Tv;

//关机命令ConcreteCommand
public class CommandOff implements Command {
	private Tv myTv;

	public CommandOff(Tv tv) {
		myTv = tv;
	}

	public void execute() {
		myTv.turnOff();
	}
}
