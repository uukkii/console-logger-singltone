import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < source.size(); i++) {
            if (source.get(i) >= treshold) {
                logger.log("Element \"" + source.get(i) + "\" does pass.");
                result.add(source.get(i));
            } else logger.log("Element \"" + source.get(i) + "\" doesn't pass.");
        }
        logger.log("Summary, " + result.size() + "of " + source.size() + " elements are passed the filter.");
        return result;
    }
}