//John Smith
package census2000;

public class LastNames implements Comparable<LastNames>{
	String name;
	String rank;
	String occurs;
	String perHundred;
	String perThousand;
	
	public LastNames() {
		setName(name);
		this.name = getName();
		setRank(rank);
		this.rank = getRank();
		setOccurs(occurs);
		this.occurs = getOccurs();
		setPerHundred(perHundred);
		this.perHundred = getPerHundred();
		setPerThousand(perThousand);
		this.perThousand = getPerThousand();
	}
	
	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getOccurs() {
		return occurs;
	}
	
	public void setOccurs(String occurs) {
		this.occurs = occurs;
	}
	
	public String getPerHundred() {
		return perHundred;
	}
	
	public void setPerHundred(String perHundred) {
		this.perHundred = perHundred;
	}
	
	public String getPerThousand() {
		return perThousand;
	}
	
	public void setPerThousand(String perThousand) {
		this.perThousand = perThousand;
	}
	
	@Override
	public String toString() {
		return "Last Name: " + name + ", Rank: " + rank + ", Occurs: " + occurs + "." 
				+"\n Proportion per 100k: " + perHundred + ", Cumulative Proportion per 100k:  "
				+ perThousand;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LastNames other = (LastNames) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(LastNames o) {
		return this.getName().compareToIgnoreCase(o.getName());
	}
}
