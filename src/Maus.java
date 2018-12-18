import java.util.UUID;


public class Maus {
	private String name;
	private int labornummer;
	private boolean tot;
	private String id;
	
	public Maus(String name, int labornummer, boolean tot) {
		super();
		this.id = UUID.randomUUID().toString();
		this.name = name;
		this.labornummer = labornummer;
		this.tot = tot;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLabornummer() {
		return labornummer;
	}

	public void setLabornummer(int labornummer) {
		this.labornummer = labornummer;
	}

	public boolean isTot() {
		return tot;
	}

	public void setTot(boolean tot) {
		this.tot = tot;
	}
	
	
	

}
