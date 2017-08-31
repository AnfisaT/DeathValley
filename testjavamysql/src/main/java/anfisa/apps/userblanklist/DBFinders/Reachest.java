package anfisa.apps.userblanklist.DBFinders;

import anfisa.apps.userblanklist.DBData.DBUserAccData;
import anfisa.apps.userblanklist.DBObjects.Account;
import anfisa.apps.userblanklist.DBObjects.User;
import java.util.ArrayList;

/**
 * Created by Anfisa on 14.08.2017.
 */
public class Reachest {

    DBUserAccData A = new DBUserAccData();
    ArrayList<Account> B = A.AllAccounts();
    int max,maxId, cur, curId, nex, nexId = 0;
    User Reachest = new User();

    public User GetReachest(){

        for (int i = 0; i < B.size()-1; i++){

            cur = B.get(i).GetAccount();
            curId = B.get(i).GetUserId();
            nex = B.get(i+1).GetAccount();
            nexId = B.get(i+1).GetUserId();

            if(cur > nex){
                if (cur > max){
                    max = cur;
                    maxId = curId;
                    i++;
                }
            }
            else{
               if(nex > max){
                   max = nex;
                   maxId = nexId;
                   i++;
               }
            }
        }
        Reachest = A.GetUser(maxId);
        return Reachest;
    }

}
