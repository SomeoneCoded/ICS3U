package performanceTask;

// Template class
public class AnimeCharacter {

	private String name;
	private String series;
	private int firstAppearence;

	// constructor method
	public AnimeCharacter(String name, String series, int firstAppearence) {
		super();
		this.name = name;
		this.series = series;
		setFirstAppearence(firstAppearence);
	}

	// setters and getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public int getFirstAppearence() {
		return firstAppearence;
	}

	public void setFirstAppearence(int firstAppearence) {
		if (firstAppearence < 0)
			firstAppearence = 0;
		this.firstAppearence = firstAppearence;
	}

	// to string method
	@Override
	public String toString() {
		return "AnimeCharacter [name=" + name + ", series=" + series + ", firstAppearence=" + firstAppearence + "]";
	}

}
