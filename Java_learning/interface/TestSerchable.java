interface Serchable {
	public void search(String keyword);
}

class Document implements Serchable {
	private String content;
	
	public Document(String content) {
		this.content = content;
	}

	public void search(String text) {
		if(content.contains(text)) {
			System.out.println("This Document contains this text");
		}else {
			System.out.println("This Document does not contain this text");
		}
	}
}


class WepPage implements Serchable {
	private String url;	
	private String htmlContent;
	
	public WepPage(String url, String htmlContent) {
		this.url = url;
		this.htmlContent = htmlContent;
	}
	
	public void search(String content) {
		if(htmlContent.contains(content)) {
			System.out.println("This wep page containt this content");
		}else {
			System.out.println("We can not find this content");
		}
	}
}

public class TestSerchable {
	public static void main(String[] args) {
		Document d = new Document("This is simple document");
		WepPage w = new WepPage("www.simple.com", "This is simple weppage");
		
		d.search("simple");
		w.search("does");
	}
}

