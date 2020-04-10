package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortDemo5 {

	public static void main(String[] args) {

		ArrayList<Score> scores = new ArrayList<Score>();
		scores.add(new Score(10,"김유신",289));
		scores.add(new Score(12,"강감찬",300));
		scores.add(new Score(3,"이순신",181));
		scores.add(new Score(15,"류관순",222));
		scores.add(new Score(31,"윤봉길",121));
		scores.add(new Score(21,"안중근",159));
		scores.add(new Score(22,"이봉창",284));
		scores.add(new Score(44,"정다훈",300));


		//		Collections.sort(scores, (o1, o2)-> Integer.compare(o1.getNo(), o2.getNo()));
		//		Collections.sort(scores, (o1, o2)-> o1.getName().compareTo(o2.getName())*-1);
		Collections.sort(scores, (o1, o2)-> Integer.compare(o1.getTotal(), o2.getTotal())*-1);

		Collections.sort(scores, new Comparator<Score>() {
			@Override
			public int compare(Score o1, Score o2) {
				return Integer.compare(o1.getNo(), o2.getNo());
			}
		});

		Collections.sort(scores, new Comparator<Score>() {
			@Override
			public int compare(Score o1, Score o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});


		for(Score score : scores) {
			System.out.println(score.getNo()+"\t"+score.getName()+"\t"+score.getTotal());
		}

	}
}
