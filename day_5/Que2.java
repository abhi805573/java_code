 class Que2 {

    public static void main(String[] args) {

        int a = 20;

        int b = 30;

        int c = 40;

        if(a<b && a<c){
            System.out.println(a + " is the smallest number");
        }
        else if(b<a && b<c){
            System.out.println(b + " is the smallest number");
        }
        else if(c<a && c<b){
            System.out.println(c + " is the smallest number");
        }

    }

}