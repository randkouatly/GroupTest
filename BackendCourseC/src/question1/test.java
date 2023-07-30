package question1;
import java.util.ArrayList;
import java.util.List;
public class test {
	/**
	 * YihengWu48832993
	 * @param args
	 */
    public static void main(String[] args) {
        List<Integer> mttr = new ArrayList<>();
        mttr.add(4);
        mttr.add(8);
        mttr.add(8);
        mttr.add(3);
        mttr.add(2);
        mttr.add(9);
        mttr.add(9);
        mttr.add(3);
        Integer sum = 0;
        for(Integer n :mttr) {
        	sum = add(sum,n);
        }
        System.out.println(mttr);
        System.out.println("Total is: " + sum);
    }
    /**
     * add
     * @param a
     * @param b
     * @return
     */
	private  static Integer add(Integer a,Integer b) {
		return a+b;
	}
}
