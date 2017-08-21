import java.io.*;
import java.net.*;

class TCPServer {

	public static void main(String argv[]) throws Exception {
		/*
		 * EXERCICIO 01
		 * 
		 * String clientSentence; String capitalizedSentence;
		 * 
		 * ServerSocket welcomeSocket = new ServerSocket(6667);
		 * 
		 * while(true) {
		 * 
		 * Socket connectionSocket = welcomeSocket.accept();
		 * 
		 * BufferedReader inFromClient = new BufferedReader(new
		 * InputStreamReader(connectionSocket.getInputStream()));
		 * 
		 * DataOutputStream outToClient = new
		 * DataOutputStream(connectionSocket.getOutputStream());
		 * 
		 * clientSentence = inFromClient.readLine();
		 * 
		 * capitalizedSentence = clientSentence.toUpperCase() + '\n';
		 * System.out.println(clientSentence);
		 * outToClient.writeBytes(capitalizedSentence); } }
		 */

		// EXERCICIO 02        
		ServerSocket servsock = new ServerSocket(6158);
		while (true) {

			Socket sock = servsock.accept();
			System.out.println("Conexão aceita: " + sock);

			File myFile = new File(
					"/home/ehsiao/Área de Trabalho/EDII/tarefa07_pre.c"); // ORIGEM
																			// DO
																			// ARQUIVO
																			// P/
																			// DOWNLOAD
			byte[] mybytearray = new byte[(int) myFile.length()];
			FileInputStream fis = new FileInputStream(myFile);
			BufferedInputStream bis = new BufferedInputStream(fis);
			bis.read(mybytearray, 0, mybytearray.length);
			OutputStream os = sock.getOutputStream();
			System.out.println("Enviando arquivo para cliente...");
			os.write(mybytearray, 0, mybytearray.length);
			os.flush();
			sock.close();
		}
	}
}
