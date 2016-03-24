/**
 * Created by nakid on 26.02.2016.
 */
public class Head {

    public Head(){
        printHead();
    }

    private void printHead(){

        for (int i=0; i < a.length; i++){
            System.out.print(a[i]);
            System.out.println();
        }

    }

    public String a []= {
             "******|------|******"
            ,"*****c|-0--0-|c*****"
            ,"******|--__--|******"
            ,"******|------|******"
    };
}
