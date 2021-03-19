package cl.cloudns.koznem.service;

import cl.cloudns.koznem.domain.ContactInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SendingEmailService {

    @Autowired
    private JavaMailSender mail;

    public void sendEmailToMe(ContactInfo contactInfo) throws MailException {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("koznem@umail.uz");
        message.setTo("koznem24@gmail.com");
        message.setSubject(contactInfo.getTopic());

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Full Name: " + contactInfo.getFullName());
        stringBuilder.append("\n");
        stringBuilder.append("Email address: "+contactInfo.getEmail());
        stringBuilder.append("\n");
        stringBuilder.append("Phone number " +contactInfo.getMobileNumber());
        stringBuilder.append("\n");
        stringBuilder.append("Message : " + contactInfo.getMessage());

        message.setText(stringBuilder.toString());

        mail.send(message);

    }

}
