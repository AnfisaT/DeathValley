package anfisa.apps.userblanklist.DBObjects;

/**
 * Created by Anfisa on 11.08.2017.
 */
public class Account {
    private int AccountId;
    private int Account;
    private int UserId;

    public int GetAccountId(){
        return AccountId;
    }

    public void SetAccountId(int AccountId){
        this.AccountId = AccountId;
    }

    public int GetAccount (){return Account;}

    public void SetAccount (int Account){
        this.Account = Account;
    }

    public int GetUserId () {return UserId;}

    public void SetUserId (int UserId) { this.UserId = UserId;}
}
