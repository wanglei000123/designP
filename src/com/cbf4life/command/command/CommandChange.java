package com.cbf4life.command.command;

import com.cbf4life.command.Receiver.Tv;

//频道切换命令ConcreteCommand
public class CommandChange implements Command {
	private Tv myTv;

	private int channel;

	public CommandChange(Tv tv, int channel) {
		myTv = tv;
		this.channel = channel;
    }

	public void execute() {
		myTv.changeChannel(channel);
	}
}
