package anfisa.apps.userblanklist.DBFinders;

import anfisa.apps.userblanklist.DBData.DBUserAccData;
import java.util.ArrayList;

/**
 * Created by Anfisa on 11.08.2017.
 */
public class Sum {
    DBUserAccData A = new DBUserAccData();
    ArrayList<Integer> AcSums = A.AccountSums();
    int Sum = 0;

    public Integer GetAccountSum () {
        for (int i = 0; i < AcSums.size(); i++){
            Sum += AcSums.get(i);
        }

        return Sum;
    }

}
