package cl.cloudns.koznem.controller;

import cl.cloudns.koznem.domain.ContactInfo;
import cl.cloudns.koznem.service.SendingEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
    @Autowired
    private SendingEmailService sendEmail;

    @CrossOrigin(origins = "*")
    @PostMapping("/portfolio/sendMail")
    public void sendTestEmail(@RequestBody ContactInfo contactInfo){
        try{
            sendEmail.sendEmailToMe(contactInfo);
        }catch(MailException exception){
            System.out.println("Error sending email:" + exception.getMessage());
        }

    }

}
