package webpackage.other;

import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Enclosure {
	private String name;
	private List<String> Enclosures;
	
	public String getName() {
		return name;
	}

	public List<String> getEnclosures() {
		return Enclosures;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEnclosures(List<String> Enclosures) {
		this.Enclosures = Enclosures;
	}

}
