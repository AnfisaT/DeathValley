package anfisa.apps.userblanklist.DBObjects;

/**
 * Created by Anfisa on 11.08.2017.
 */
public class User {
    private int UserId;
    private String Name;
    private String SureName;

    public int GetUserId(){
        return UserId;
    }

    public void SetUserId(int UserId){
        this.UserId = UserId;
    }

    public String GetName(){
        return Name;
    }

    public void SetName(String Name){
        this.Name = Name;
    }

    public String GetSureName(){
        return SureName;
    }

    public void SetSureName(String SureName){this.SureName = SureName;}
}

