/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypkg7;
import jakarta.mail.*;
import jakarta.mail.internet.*;
import java.util.*;

/**
 *
 * @author gauhar
 */
public class MailSender {

    //private String to;
    public void sendMail(String email,String text){
        String from="g.nawab7155@gmail.com";
            final String username="g.nawab7155@gmail.com";
            final String password="etibrtdpfpcczekr";
            Properties props=new Properties();
            props.put("mail.smtp.auth","true");
            props.put("mail.smtp.starttls.enable","true");
            props.put("mail.smtp.host","smtp.gmail.com");
            props.put("mail.smtp.port","587");
            props.put("mail.smtp.ssl.trust","smtp.gmail.com");
            Session sess=Session.getInstance(props,new jakarta.mail.Authenticator(){
                protected PasswordAuthentication getPasswordAuthentication(){
                    return new PasswordAuthentication(username,password);
                    }});
                           try{
                               Message msg=new MimeMessage(sess);
                               msg.setFrom(new InternetAddress(from));
                               msg.setRecipients(Message.RecipientType.TO,InternetAddress.parse(email));
                               msg.setSubject("Test mail");
                               msg.setText(text);
                               Transport.send(msg);
                           }catch(MessagingException e){
                               e.printStackTrace();
                           }

    }

    private static class properties {

        public properties() {
        }

        private void put(String mailsmtpauth, String atrue) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    
    
    
}