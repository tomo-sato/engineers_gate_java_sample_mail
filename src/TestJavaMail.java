import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * メール送信のサンプルコード
 *
 * @author tomo-sato
 */
public class TestJavaMail {

	public static void main(String[] argv) {
		// メールサーバ
		String mailhost = "localhost";
		// 送信元メールアドレス
		String from = "tsato+from@localhost";
		// 送信先メールアドレス
		String to = "tsato+to@localhost";
		// メールタイトル
		String subject = "テストメールタイトルです。";
		// メール本文
		String text = "テストメール本文です。";

		try {
			Properties props = System.getProperties();
			props.put("mail.smtp.host", mailhost);

			Session session = Session.getInstance(props, null);
			session.setDebug(true);

			Message msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(from));

			msg.setRecipients(Message.RecipientType.TO,
						InternetAddress.parse(to, false));

			msg.setSubject(subject);
			msg.setText(text);
			msg.setSentDate(new Date());

			Transport.send(msg);

			System.out.println("\nMail was sent successfully.");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
