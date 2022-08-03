
public class Vocabulary {
	public String vocab;
	public String type;
	public String meaning;
	
	//Setters and Getters
	public String getVocal() {
		return vocab;
	}
	public void setVocal(String vocal) {
		this.vocab = vocal;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMeaning() {
		return meaning;
	}
	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
	
	public void display_vocal() {
		System.out.format("%-15s %-5s %-15s\n", 
				this.vocab,
				this.type,
				this.meaning);
	}
}
