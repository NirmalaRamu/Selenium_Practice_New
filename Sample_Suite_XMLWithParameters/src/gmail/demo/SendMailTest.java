package gmail.demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.AppUtils;

public class SendMailTest extends AppUtils
{
	@Parameters({"toemailid","subject","message"})
	@Test
	public void checkSendMail(String toemail,String subject,String message)
	{
		System.out.println("An email send to :"+toemail);
		System.out.println("With subject as :"+subject);
		System.out.println("With message :"+message);
	}
}
