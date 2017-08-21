import java.io.*; 
import java.net.*; 
class TCPClient { 
	
	/*EXERCICIO 01
	class TCPClient {
		public static void main(String argv[]) throws Exception {
			String sentence;
			String modifiedSentence;
			
			BufferedReader inFromUser = new BufferedReader(new InputStreamReader(
					System.in));
			Socket clientSocket = new Socket("172.20.17.41", 6850);
			
			
			DataOutputStream outToServer = new DataOutputStream(
					clientSocket.getOutputStream());
			
			BufferedReader inFromServer = new BufferedReader(new InputStreamReader(
					clientSocket.getInputStream()));
			
			sentence = inFromUser.readLine();
			outToServer.writeBytes(sentence + '\n');
			modifiedSentence = inFromServer.readLine();
			System.out.println("FROM SERVER: " + modifiedSentence);
			
			clientSocket.close();

		}
	}*/
//	EXERCICIO 02
    public static void main(String argv[]) throws Exception 
    { 
    	int filesize=6022386;  
    	  
        long start = System.currentTimeMillis();  
        int bytesRead;  
        int current = 0;  
        Socket sock = new Socket("172.20.17.46",6784);  //IP E PORTA DO SERVIDOR A SER CONECTADO
      
        byte [] mybytearray  = new byte [filesize];  
        InputStream is = sock.getInputStream();  
        FileOutputStream fos = new FileOutputStream("/home/ehsiao/Área de Trabalho/arquivo.extensao"); //DESTINO DO ARQUIVO A SER BAIXADO
        BufferedOutputStream bos = new BufferedOutputStream(fos);  
        bytesRead = is.read(mybytearray,0,mybytearray.length);  
        current = bytesRead;  
      
        do {  
           bytesRead =  
              is.read(mybytearray, current, (mybytearray.length-current));  
           if(bytesRead >= 0) current += bytesRead;  
        } while(bytesRead > -1);  
      
        bos.write(mybytearray, 0 , current);  
        long end = System.currentTimeMillis();  
        System.out.println(end-start);  
        bos.close();  
        sock.close();  
      }Z}