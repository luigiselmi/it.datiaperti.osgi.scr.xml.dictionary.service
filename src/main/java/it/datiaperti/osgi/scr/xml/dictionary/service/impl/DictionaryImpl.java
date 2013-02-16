package it.datiaperti.osgi.scr.xml.dictionary.service.impl;
 
import it.datiaperti.osgi.scr.xml.dictionary.service.api.DictionaryService;
import java.io.PrintStream;
import org.osgi.service.component.ComponentContext;
 
public class DictionaryImpl implements DictionaryService {

	String[] m_dictionary = { "welcome", "to", "the", "osgi", "tutorial" };
 
	public boolean checkWord(String word) {

		word = word.toLowerCase();
		
for (int i = 0; i < this.m_dictionary.length; i++)
{
if (this.m_dictionary[i].equals(word))
{
return true;
}
}
return false;
}

protected void activate(ComponentContext context) {
System.out.println("Dictionary Service Activated");
}
 
protected void deactivate(ComponentContext context) {
System.out.println("Dictionary Service Deactivated");
}
}
