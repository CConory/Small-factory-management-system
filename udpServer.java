package server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UDPServer {
	private final static int PORT=8090;
	private final static Logger audit=Logger.getLogger("requests");
	private final static Logger errors=Logger.getLogger("errors");
	public static void main(String[] args){
		try(DatagramSocket socket=new DatagramSocket(PORT)){
			while(true){
				try{
					DatagramPacket request =new DatagramPacket(new byte[1024],1024);
					socket.receive(request);
					String s="2015150291/123456";
					byte[] data=s.getBytes("US-ASCII");
					DatagramPacket response=new DatagramPacket(data,data.length,request.getAddress(),request.getPort());
					socket.send(response);
					audit.info(s+""+request.getAddress());
				}catch(IOException|RuntimeException ex){
					errors.log(Level.SEVERE,ex.getMessage(),ex);
				}
			}
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
