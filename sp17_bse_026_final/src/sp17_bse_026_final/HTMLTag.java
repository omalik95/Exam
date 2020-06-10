package sp17_bse_026_final;
import java.util.List;

public abstract class HTMLTag {
	String tag;
	public HTMLTag() {
		// todo
	}
	public abstract String getTagName();
	public abstract void setStartTag(String tag);
	public abstract void setEndTag(String tag);
	public void setTagBody(String tagBody){
	}
	public void addChildTag(HTMLTag htmlTag){
	
	}
	public void removeChildTag(HTMLTag htmlTag){
/*this.tagName = tagName;
		this.startTag = "";*/
	}
	public List<HTMLTag>getChildren(){
		throw new UnsupportedOperationException("ineligible");
	}
	public abstract void generateHtml();
	
}
