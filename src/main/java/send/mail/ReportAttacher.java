package send.mail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

public class ReportAttacher 
{
	EmailAttachment attachment  = new EmailAttachment(); 

	MultiPartEmail email = new MultiPartEmail();

	public  void addReportToMail(String reports,String reportname)
	{
		attachment.setPath(System.getProperty("user.dir")+"\\"+reports);
		attachment.setDisposition(EmailAttachment.ATTACHMENT);
		attachment.setDescription(reportname);
		attachment.setName(reportname);
	}

	public void sendReport(String ToMails[],String ccMails[]) throws EmailException
	{
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("chandisunill.g@gmail.com", "rvaskufefjpelgnz"));
		email.setSSLOnConnect(true);

		for(int i=0;i<ToMails.length;i++)
		{
			email.addTo(ToMails[i]);
		}

		for(int i=0;i<ccMails.length;i++)
		{
			email.addCc(ccMails[i]);
		}

		email.setFrom("chandisunill.g@gmail.com","sunilkumar");

		email.setSubject("Automation Test Report");

		email.setMsg("Hi,"+"\n \n"+"Please Find out the Report!"+"\n \n"+"Thanks,"+"\n"+"Vivekananda Reddy M.");

		email.attach(attachment);

		email.send();
	}


}
