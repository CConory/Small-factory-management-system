package gui界面;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDP {
	private final static int PORT=8090;
	private static final String IP="172.29.45.12";
	public static String get(){
		try(DatagramSocket socket=new DatagramSocket(0)){
			socket.setSoTimeout(10000);
			InetAddress ip=InetAddress.getByName(IP);
			DatagramPacket request=new DatagramPacket(new byte[1],1,ip,PORT);
			DatagramPacket response=new DatagramPacket(new byte[1024],1024);
			socket.send(request);
			socket.receive(response);
			String result=new String(response.getData(),0,response.getLength(),"US-ASCII");
			return result;
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return null;		
	}
}
