package org.a4.service;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    private static String MAILFROM = "alisymeri@hotmail.com";
    private static String PASSWORD = "";
    private static String LINK = "http://130.229.153.191:8080/rest/user/verify/";


    @Async
    public synchronized void sendMail(String mailTo, String uuid) {
        String host = "smtp.live.com";

        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.port", "587");
        properties.setProperty("mail.smtp.starttls.enable", "true");
        properties.setProperty("mail.smtp.auth", "true");
        properties.setProperty("mail.smtp.host", host);

        Session session = Session.getDefaultInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(MAILFROM, PASSWORD);
            }
        });

        session.setDebug(true);

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(MAILFROM));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(mailTo));
            message.setSubject("Verify your account");
            String link = LINK + uuid;
            message.setText("You have successfully created an account, click this link: " + link + " to verify your registration.");
            System.out.println(link);
            Transport.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

}