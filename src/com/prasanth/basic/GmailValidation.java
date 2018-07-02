package com.prasanth.basic;

import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Store;

public class GmailValidation 
{
	
	public static void main(String[] args) 
	{
		try
		{
			Properties pro = new Properties();
			pro.put("mail.store.protocol", "imaps");
			Session session = Session.getInstance(pro);
			Store store = session.getStore("imaps");
			store.connect("imap.gmail.com", "prasanthraviv@gmail.com", "dude1234");
			Folder folder = store.getFolder("INBOX");
			folder.open(Folder.READ_ONLY);
			Message[] messages = folder.getMessages();
			
			
			for(int i=0;i<messages.length-1;i++)
			{
				Message msg = messages[i];
				String mailSubject = (String)msg.getSubject();
				String mailContent = (String)msg.getContent();
				System.out.println(mailSubject);
				System.out.println(mailContent);
				
			}
			
		}
		catch(MessagingException ME)
		{
			ME.printStackTrace();
			
		}catch(Exception E)
		{
			E.printStackTrace();
			
		}
		
		
	}
 
}
			
		
