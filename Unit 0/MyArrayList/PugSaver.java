import java.util.ArrayList;
import java.util.Objects;

public class PugSaver {

	// Moves every dog whose breed is "Pug" in the list to the back of the list
	// All non-pugs must remain in the same relative order they were in originally
	// and all pugs must also remain in the same relative order they were in
	// originally
	public static void rescuePugs(MyArrayList<Dog> testSubjects) {
		for (int i = testSubjects.size() - 1; i >= 0; i--) {
			if (((testSubjects.get(i)).getBreed()).equals("Pug")) {
				Dog pug = testSubjects.remove(i);
				testSubjects.add(pug);
				i--;
			}
		}
	}
}
