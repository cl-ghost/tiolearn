package com.cl.tio.learn.pack;

import org.tio.core.intf.Packet;

/**
 * 
 * @author cl
 * 
 * 发送消息类
 *
 */
public class TioMsgPack extends Packet {

	private static final long serialVersionUID = -172060606924066412L;
	public static final int HEADER_LENGHT = 4; // 新消息头的长度
	public static final String CHARSET = "utf-8";
	private byte[] body;
	public byte[] getBody() {
		return body;
	}
	public void setBody(byte[] body) {
		this.body = body;
	}
	
}
