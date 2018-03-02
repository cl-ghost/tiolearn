package com.cl.tio.learn.server.impl;

import java.io.IOException;

import org.springframework.stereotype.Service;
import org.tio.server.AioServer;
import org.tio.server.ServerGroupContext;
import org.tio.server.intf.ServerAioHandler;
import org.tio.server.intf.ServerAioListener;

import com.cl.tio.learn.server.inter.TioService;
import com.cl.tio.learn.until.Const;

@Service
public class TioServerImpl implements TioService {
	//handler, 包括编码、解码、消息处理
	public static ServerAioHandler aioHandler = new TioAioHandler();
	//事件监听器，可以为null，但建议自己实现该接口，可以参考showcase了解些接口
	public static ServerAioListener aioListener = null;

	//一组连接共用的上下文对象
	public static ServerGroupContext serverGroupContext = new ServerGroupContext(aioHandler, aioListener);

	//aioServer对象
	public static AioServer aioServer = new AioServer(serverGroupContext);
	
	//有时候需要绑定ip，不需要则null
	public static String serverIp = null;
	
	//监听的端口
	public static int serverPort = Const.PORT;
	@Override
	public void startTioServer() {
		// TODO Auto-generated method stub
		System.out.println("tio start now");
		try {
			serverGroupContext.setHeartbeatTimeout(Const.TIMEOUT);
			aioServer.start(serverIp, serverPort);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
