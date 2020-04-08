package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortDemo4 {
	public static void main(String[] args) {
		ArrayList<Contact> contacts = new ArrayList<Contact>();
		
		contacts.add(new Contact(10,"류관순","1","@n"));
		contacts.add(new Contact(7,"강감찬","2","@g"));
		contacts.add(new Contact(3,"이순신","3","@w"));
		contacts.add(new Contact(6,"김유신","5","@r"));
		contacts.add(new Contact(2,"윤봉길","6","@y"));
		
        Collections.sort(contacts);
        for(Contact contact : contacts) {
        	System.out.println(contact.getNo()+"\t"+contact.getName()+"\t"+contact.getTel()+"\t"+contact.getEmail());
        }
		
		
		
		
		
		
	}
}
