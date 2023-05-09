package lecture1;

import java.util.Iterator;

public class Task1 {
	public static void main(String[] args) {
		CustomList list = new CustomList(5);
		
		list.add("Purvi");
		list.add("Vtori");
		list.add("Treti");
		list.add("Chetvurti");
		list.add("Peti");
		
		System.out.println(list.toString());
		
		System.out.println(list.get(3));
		
		System.out.println(list.contains("Vtori"));
		
		list.removeAt(2);
		
		System.out.println(list.toString());
		
		
	}
}

class CustomList {
	String[] listContent;
	
	public CustomList(int length) {
		listContent = new String[length];
	}
	
	public void add (String element) {
		for (int i = 0; i < listContent.length; i++) {
			if(listContent[i] == null) {
				listContent[i] = element;
				break;
			}
		}
	}
	
	public String get(int index) {
		return listContent[index];
	}
	
	public boolean contains(String element) {
		for(String string : listContent) {
			if(string.equals(element)) {
				return Boolean.TRUE;
			}
		}
		
		return Boolean.FALSE;
	}
	
	public void removeAt(int index) {
		String[] newArray = new String[listContent.length];
		for (int i = 0; i < newArray.length; i++) {
			if(i == index) continue;
			
			newArray[i] = listContent[i];
		}
		
		listContent = newArray;
	}
	
	public int size() {
		return listContent.length;
	}
	
	@Override
	public String toString() {
		String response = "";
		
		for (int i = 0; i < listContent.length; i++) {
			response += listContent[i] + " ";
		}
		return response;
	}
}
