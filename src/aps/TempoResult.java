package aps;

public class TempoResult {

	String array;
	Long tempo;

	public TempoResult() {

	}

	public TempoResult(String array, Long tempo) {
		super();
		this.array = array;
		this.tempo = tempo;
	}

	public String getArray() {
		return array;
	}

	public void setArray(String array) {
		this.array = array;
	}

	public Long getTempo() {
		return tempo;
	}

	public void setTempo(Long tempo) {
		this.tempo = tempo;
	}

	@Override
	public String toString() {
		return (array + ",  " + tempo);
	}

}
