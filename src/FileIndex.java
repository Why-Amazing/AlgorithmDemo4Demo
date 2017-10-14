
import java.util.HashMap;

import com.kyson.chapter1.section1.DumplicateElements;
import com.kyson.chapter1.section1.EquivalentKey;
import com.kyson.chapter1.section1.Histogram;
import com.kyson.chapter1.section2.BinarySearchCounter;
import com.kyson.chapter1.section2.CircularRotation;
import com.kyson.chapter1.section2.Interval1D;
import com.kyson.chapter1.section2.Interval2D;
import com.kyson.chapter1.section2.Point2D;
import com.kyson.chapter1.section2.SmartDate1;
import com.kyson.chapter1.section2.SmartDate2;
import com.kyson.chapter1.section2.Transaction;
import com.kyson.chapter1.section2.VisualCounter;
import com.kyson.chapter1.section3.FixedCapacityStackOfStrings;

public class FileIndex {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        HashMap<String, String> map = new HashMap<>();

        /****
         * section 1
         */
        // 找到重复元素
        map.put("1.1.28", DumplicateElements.class.getName());
        map.put("1.1.29", EquivalentKey.class.getName());
        map.put("1.1.32", Histogram.class.getName());

        /***
         * section 2
         */
        map.put("1.2.1", Point2D.class.getName());
        map.put("1.2.2", Interval1D.class.getName());
        map.put("1.2.3", Interval2D.class.getName());
        map.put("1.2.6", CircularRotation.class.getName());
        map.put("1.2.9", BinarySearchCounter.class.getName());
        map.put("1.2.10", VisualCounter.class.getName());
        map.put("1.2.11", SmartDate1.class.getName());
        map.put("1.2.12", SmartDate2.class.getName());
        map.put("1.2.13", Transaction.class.getName());
        map.put("1.2.14", Transaction.class.getName());

        map.put("1.3.1", FixedCapacityStackOfStrings.class.getName());


    }

}
