package sp17_bse_026_final;

import java.util.ArrayList;
import java.util.List;

public class HTMLParentElement extends HTMLTag {
	private String tagName;
	private String start; 
	private String end;
	private List<HTMLTag>childrenTag;
	
	public HTMLParentElement(String tagName){
		this.tagName = tagName;
		this.start = "";
		this.end = "";
		this.childrenTag = new ArrayList<>();
	}
	public String getTagName() {
		return tagName;
	}
	/*IntListVer1 list1 = new IntListVer1();
        IntListVer1 list2 = new IntListVer1(100);
        */

	public void setStartTag(String tag) {
		this.start = tag;
	}

	public void setEndTag(String tag) {
		this.end = tag;
	}

	public void addChildTag(HTMLTag htmlTag){
		childrenTag.add(htmlTag);
	}
	
	public void removeChildTag(HTMLTag htmlTag){
		childrenTag.remove(htmlTag);
	}

	public List<HTMLTag>getChildren(){
		return childrenTag;
	}

	public void generateHtml() {
		System.out.println(start);
		for(HTMLTag tag : childrenTag){
			tag.generateHtml();
		}
		System.out.println(end);
		
	}

}
