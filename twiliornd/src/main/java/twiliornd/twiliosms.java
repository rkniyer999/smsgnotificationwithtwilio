package twiliornd;

// You may want to be more specific in your imports
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class twiliosms {

	  // Find your Account Sid and Token at twilio.com/console
    public static final String ACCOUNT_SID = "AC17f944594883960e6fd126b36602743d";
    public static final String AUTH_TOKEN = "f77cd5d1af826d2e60928982885b695e";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber("+919607042787"),
                new com.twilio.type.PhoneNumber("+15055964070"),
                "Test message from Hemendra....")
            .create();

        System.out.println(message.getSid());
 }
}
