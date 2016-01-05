package sechalmersmdsdgroup5.hotel.utils;

import java.util.ArrayList;
public class PairList<F,S> extends ArrayList<Pair<F,S>> {

    public PairList() {
        super();
    }

    /**
     * returns the pair given the first.
     * @param fst
     * @return
     */
    public Pair getPair(F fst) {
        for (Pair pair : this) {
            if ((pair.fst()).equals(fst)) {
                return pair;
            }
        }

        return  null;
    }
}
