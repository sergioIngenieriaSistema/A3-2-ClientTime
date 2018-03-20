/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienttime;

/**
 *
 * @author entrar
 */
public class ClientTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NewJerseyClient client = new NewJerseyClient();
        System.out.println(client.getJson());
    }
    
}
