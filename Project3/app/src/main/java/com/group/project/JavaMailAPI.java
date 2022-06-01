package com.group.project;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

class JavaMailAPI extends AsyncTask<Void, Void, Void> {

    // These files are added to dependencies in build.gradle
    // implementation files('libs/activation.jar')
    // implementation files('libs/additional.jar')
    // implementation files('libs/mail.jar')

    // Variables
    private Context mailContext;
    private Session mailSession;
    private String mailEmail;
    private String mailSubject;
    private String mailMessage;
    private ProgressDialog mailProgressDialog;

    // Constructor
    public JavaMailAPI(Context mContext, String mEmail, String mSubject, String mMessage) {
        this.mailContext = mContext;
        this.mailEmail = mEmail;
        this.mailSubject = mSubject;
        this.mailMessage = mMessage;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        // While it's sending email, it shows message of the progress
        mailProgressDialog = ProgressDialog.show(mailContext, "Sending message",
                "Please wait...", false, false);
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        // Dismiss progress dialog when message is successfully sent
        mailProgressDialog.dismiss();

        // Show success toast
        Toast.makeText(mailContext, "Message Sent", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected Void doInBackground(Void... params) {
        // Creating properties
        Properties props = new Properties();

        // Configures gmail properties
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        // Creating a new session
        mailSession = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    //Authenticating the password
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(Utils.EMAIL, Utils.PASSWORD);
                    }
                });

        try {
            //Creating MimeMessage object
            MimeMessage mm = new MimeMessage(mailSession);

            //Setting sender address
            mm.setFrom(new InternetAddress(Utils.EMAIL));
            //Adding receiver
            mm.addRecipient(Message.RecipientType.TO, new InternetAddress(mailEmail));
            //Adding subject
            mm.setSubject(mailSubject);
            //Adding message
            mm.setText(mailMessage);
            //Sending email
            Transport.send(mm);

        } catch (MessagingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
