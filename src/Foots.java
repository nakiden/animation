public class Foots {

    public Foots(boolean forward){

        printFoot(forward);
    }

    private void printFoot(boolean forward){

        if (forward) {

            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]);
                System.out.println();
            }
        } else {

            for (int i = 0; i < b.length; i++) {
                System.out.print(b[i]);
                System.out.println();
            }
        }
    }

    public String a []= {
             "***/  /******/  /**"
            ,"**/__/******/__/**"
    };

    public String b []= {
             "***|  |******|  |**"
            ,"***|__|******|__|**"
    };
}
