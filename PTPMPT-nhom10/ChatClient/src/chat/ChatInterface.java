/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

//import com.sun.xml.internal.ws.wsdl.writer.document.Message;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Huy
 */

public interface ChatInterface extends Remote{
    // declaring methods to call remotely
    public boolean login(String username) throws RemoteException;
    public void logout(String username) throws RemoteException;
    public void sendMessage(Message message) throws RemoteException;
    List<String> getAllUsers() throws RemoteException;
    public List<chat.Message> getAllMessages() throws RemoteException;
}
