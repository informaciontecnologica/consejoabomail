
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.IOException;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author daniel
 */
public class Enviomail {
MailFile fi = new MailFile();
//    String to = "dtformosa@gmail.com";
//    String from = "jorge.daniel.castro.formosa@gmail.com";
//    String username = "jorge.daniel.castro.formosa@gmail.com";//change accordingly
//    String password = "caco12formosa";//change accordingly

    public void Enviomail(List<String> adjuntos,Properties cuerpo ) throws IOException {

        try {
            fi.Leer();

            // Assuming you are sending email through relay.jangosmtp.net "<!DOCTYPE html><html lang=\"es\"><head>"
//                        + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" /></head>"
//                        + "<body><h2><font color='ff0000'>"+cuerpo+"</font></h2>"
//                        + "<p>Consejo Profesional de Abogacia</p>"
//                        + "</body></html>"
            

            Properties props = new Properties();
            props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", fi.getHost());
            props.put("mail.smtp.port", fi.getPort());

            // Get the Session object.
            Session session = Session.getInstance(props, new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(fi.getUser(), fi.getPassword());
                }
            });

            // Create a default MimeMessage object.
            Message message = new MimeMessage(session);

            try {
                // Set From: header field of the header.
                message.setFrom(new InternetAddress(fi.getMailFrom()));

                // Set To: header field of the header.
                message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(cuerpo.getProperty("To")));

                // Set Subject: header field
                message.setSubject("Testing Subject");

                // Create the message part
                BodyPart messageBodyPart = new MimeBodyPart();
                messageBodyPart.setContent(message, "text/html");
                messageBodyPart.setContent("<!DOCTYPE html><html lang=3D\"es\"><head>"
                        + "<meta http-equiv=\"Content-Type\"  content=\"text/html; charset=UTF-8\"  Content-Transfer-Encoding:\" base64\" /></head>"
                        + "<body><Strong><font >"+cuerpo.getProperty("texto")+"</font></strong>"
                        + "<p>Consejo Profesional de Abogacia</p>"
                        + "</body></html>", "text/html");
                
                System.out.println(cuerpo.getProperty("To"));
                System.out.println(cuerpo.getProperty("texto"));
//          Create a multipar message
                Multipart multipart = new MimeMultipart();

                // Set text message part
                multipart.addBodyPart(messageBodyPart);
                // Part two is attachment
               
//                String filename = adjuntos
                if (adjuntos != null && adjuntos.size() > 0) {
                    for (String rutaAdjunto : adjuntos) {
                         messageBodyPart = new MimeBodyPart();
                        File f = new File(rutaAdjunto);
                        if (f.exists()) {
                            DataSource source = new FileDataSource(rutaAdjunto);
                            messageBodyPart.setDataHandler(new DataHandler(source));
                            messageBodyPart.setFileName(rutaAdjunto);
                            multipart.addBodyPart(messageBodyPart);
                             System.out.println(rutaAdjunto);
                        }
                    }
                }
//          Send the complete message parts
                    message.setContent(multipart);

                    // Send message
                    Transport.send(message);
                    System.out.println(adjuntos.get(0));
                    System.out.println("Sent message successfully....");

                }catch (AddressException ex) {
                throw new RuntimeException(ex);
            }
            } catch (MessagingException ex) {
                System.err.println(ex.getMessage());

            }
        }
    }
