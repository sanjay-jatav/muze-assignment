package utils;

import jakarta.mail.*;

import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailOTPReader {

    public static String getOTP(String email,
                                String appPassword) {

        String otp = "";

        try {

            String host = "imap.gmail.com";

            // Remove hidden spaces/new lines
            email = email.trim();

            appPassword = appPassword.trim();

            System.out.println("EMAIL: " + email);

            System.out.println("PASSWORD: " + appPassword);

            Properties properties = new Properties();

            properties.put(
                    "mail.store.protocol",
                    "imaps");

            properties.put(
                    "mail.imap.ssl.enable",
                    "true");

            properties.put(
                    "mail.imap.port",
                    "993");

            Session session =
                    Session.getInstance(properties);

            Store store =
                    session.getStore("imaps");

            System.out.println(
                    "Connecting to Gmail...");

            store.connect(
                    host,
                    email,
                    appPassword);

            System.out.println(
                    "Gmail Connected Successfully");

            Folder inbox =
                    store.getFolder("INBOX");

            inbox.open(Folder.READ_ONLY);

            Message[] messages =
                    inbox.getMessages();

            Message latestMessage =
                    messages[messages.length - 1];

            String emailContent =
                    latestMessage.getContent()
                            .toString();

            System.out.println(
                    "Email Content: "
                            + emailContent);

            Pattern pattern =
                    Pattern.compile("\\d{6}");

            Matcher matcher =
                    pattern.matcher(emailContent);

            if (matcher.find()) {

                otp = matcher.group();

                System.out.println(
                        "OTP Found: " + otp);
            } else {

                System.out.println(
                        "OTP Not Found In Email");
            }

            inbox.close(false);

            store.close();

        } catch (Exception e) {

            System.out.println(
                    "EMAIL LOGIN FAILED");

            e.printStackTrace();
        }

        return otp;
    }
}