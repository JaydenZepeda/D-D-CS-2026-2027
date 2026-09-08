import java.util.ArrayList;
import java.util.Objects;

public class PugSaver {

	// Moves every dog whose breed is "Pug" in the list to the back of the list
	// All non-pugs must remain in the same relative order they were in originally
	// and all pugs must also remain in the same relative order they were in
	// originally
	public static void rescuePugs(ArrayList<Dog> testSubjects) {
		int nonpugCount = 0;
		int pugCount = 0;
		for (int index = 0; index < testSubjects.size(); index++) {
			if (testSubjects.get(index).getBreed().equals("Pug")) {
				pugCount++;
			} else {
				nonpugCount++;
			}
		}
		ArrayList<Dog> nonpug = new ArrayList<Dog>(nonpugCount);
		ArrayList<Dog> pugs = new ArrayList<Dog>(pugCount);
		for (int i = 0; i < testSubjects.size(); i++) {
			if (testSubjects.get(i).getBreed().equals("Pug")) {
				pugs.add(testSubjects.get(i));
			} else {
				nonpug.add(testSubjects.get(i));
			}
		}
		int index = 0;
		for (int i = 0; i < nonpug.size(); i++) {
			testSubjects.set(index, nonpug.get(i));
			index++;
		}
		for (int i = 0; i < pugs.size(); i++) {
			testSubjects.set(index, pugs.get(i));
			index++;
		}
	}
}
