package org.nico.ratel.landlords.client.event;

import org.nico.ratel.landlords.entity.ClientTransferData;
import org.nico.ratel.landlords.print.SimplePrinter;

import io.netty.channel.Channel;

public class ClientEventListener_CODE_SHOW_POKERS extends ClientEventListener<String>{

	@Override
	public void call(Channel channel, ClientTransferData<String> clientTransferData) {
		SimplePrinter.println(clientTransferData.getData());
	}

}
