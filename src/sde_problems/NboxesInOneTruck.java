package sde_problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class BoxUnits {
	int boxes;
	int units;

	public BoxUnits(int boxes, int units) {
		this.boxes = boxes;
		this.units = units;
	}
}

class UnitsComparator implements Comparator<BoxUnits> {
	@Override
	public int compare(BoxUnits b1, BoxUnits b2) {
		if (b1.units > b2.units)
			return -1;
		else if (b1.units < b2.units)
			return 1;
		else if (b1.units > b2.units)
			return -1;
		return 1;
	}
}

public class NboxesInOneTruck {

	public static int nboxesInOneTruck(List<Integer> boxes, List<Integer> units, int truckSize) {
		ArrayList<BoxUnits> unitsPerBox = new ArrayList<>();
		for (int i = 0; i < boxes.size(); i++)
			unitsPerBox.add(new BoxUnits(boxes.get(i), units.get(i)));

		UnitsComparator uc = new UnitsComparator();
		Collections.sort(unitsPerBox, uc);
		for(BoxUnits obj : unitsPerBox) {
			System.out.println(obj.boxes);
			System.out.println(obj.units);
		}

		int answer = 0;
		int curBoxes = 0;

		for (int i = 0; i < unitsPerBox.size(); i++) {
			if(curBoxes + unitsPerBox.get(i).boxes <= truckSize) {
				curBoxes += unitsPerBox.get(i).boxes;
				answer += unitsPerBox.get(i).boxes * unitsPerBox.get(i).units;
			}
			else {
				int remain = truckSize - curBoxes;
				answer += remain * unitsPerBox.get(i).units;
				curBoxes += remain;
			}
			System.out.println("curBoxes" + curBoxes);
		}
		return answer;
	}

	public static void main(String[] args) {
		List<Integer> boxes = new ArrayList<>();
		List<Integer> units = new ArrayList<>();

		for(int i=1; i<=3; i++) {
			boxes.add(i);
			units.add(i*3);
		}
		// boxes.add(1);
		// units.add(7);
		// boxes.add(6);
		// units.add(2);
		// boxes.add(3);
		// units.add(1);

		int answer = nboxesInOneTruck(boxes, units, 4);

		System.out.println(answer);

	}

}
