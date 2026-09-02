import java.util.ArrayList;
import java.util.Objects;

public class PugSaver {

	// Moves every dog whose breed is "Pug" in the list to the back of the list
	// All non-pugs must remain in the same relative order they were in originally
	// and all pugs must also remain in the same relative order they were in
	// originally
	public static void rescuePugs(MyArrayList<Dog> list) {
		for (int i = list.size() - 1; i >= 0; i--) {
			if (((list.get(i)).getBreed()).equals("Pug")) {
				Dog pug = list.remove(i);
				list.add(pug);
				i--;
			}
		}
	}
}
