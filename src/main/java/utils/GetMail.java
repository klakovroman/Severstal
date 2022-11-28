package utils;

import javax.mail.*;
import javax.mail.internet.MimeMultipart;
import java.io.*;
import java.util.Properties;

public class GetMail {
    private static String getMessage(String host, String username, String password) {
        String textFromMessage = null;
        Properties prop = new Properties();
        prop.put("mail.pop3.host", host);
        prop.put("mail.pop3.port", "995");
        prop.put("mail.pop3.starttls.enable", "true");
        Session emailSession = Session.getDefaultInstance(prop);
        try {
            Store store = emailSession.getStore("pop3s");
            store.connect(host, username, password);
            Folder emailFolder;
            Message [] messages;
            while (true){
                emailFolder = store.getFolder(GetDataFromJson.getTestData("mailFolder"));
                emailFolder.open(Folder.READ_WRITE);
                messages = emailFolder.getMessages();
                if (messages.length > 0){
                    break;}
            }
            Message message = messages[0];
            try {
                     if (message.isMimeType("multipart/*")) {
                    MimeMultipart mimeMultipart = (MimeMultipart) message.getContent();
                    textFromMessage = getMimeText(mimeMultipart);
                }
            } catch (MessagingException | IOException e) {
                e.printStackTrace();
            }
            message.setFlag(Flags.Flag.DELETED, true);
            emailFolder.close(true);
            store.close();
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        return textFromMessage;
    }

    private static String getMimeText(MimeMultipart mimeMultipart) {
        String MimeText = "";
        try {
            int count = mimeMultipart.getCount();
            for (int i = 0; i < count; i++) {
                BodyPart bodyPart = mimeMultipart.getBodyPart(i);
                if (bodyPart.isMimeType("text/plain")) {
                    MimeText = MimeText + "\n" + bodyPart.getContent();
                    break;
                }
            }
        } catch (MessagingException | IOException e) {
            e.printStackTrace();
        }
        return MimeText;
    }

    public static boolean compareLetterAndTestText(String compareText) {
        String message = null;
        message = getMessage(
                GetDataFromJson.getTestData("host"),
                GetDataFromJson.getTestData("usernameEmail"),
                GetDataFromJson.getTestData("passwordEmail"));
        return message.contains(compareText);
    }
}