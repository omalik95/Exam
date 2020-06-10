package sp17_bse_026_final;

public class HTMLElement extends HTMLTag {
	private String tag;
	private String start; 
	private String end;
	private String btag;
	
	public HTMLElement(String tag){
		this.tag = tag;
	//	this.tagBody = "";
		//this.startTag = "";
		//this.endTag = "";
	}
	public String getTagName() {
		return tag;
	}

	public void setStartTag(String tag) {
		this.start = tag;
	}
	public void setEndTag(String tag) {
		this.end = tag;
	}

	public void setTagBody(String btag){
		this.btag = btag;
	}
	public void generateHtml() {
		System.out.println(start+""+btag+""+end);
	}


}
