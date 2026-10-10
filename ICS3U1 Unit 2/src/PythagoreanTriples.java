// class
public class PythagoreanTriples {
	
	// main method
	public static void main(String[] args) {
		
		// side A
		for (int sideA = 1; sideA <= 500; sideA++) {
			// side B
			for (int sideB = sideA; sideB <= 500; sideB++) {
				// side C
				for (int sideC = sideB; sideC <= 500; sideC++) {

					// check if it is a Pythagorean triple
					if (Math.pow(sideA, 2) + Math.pow(sideB, 2) == Math.pow(sideC, 2))
						// output the triple
						System.out.printf("%d %d %d\n", sideA, sideB, sideC);
				}
			}
		}
	}
}
