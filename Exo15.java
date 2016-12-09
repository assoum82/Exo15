public class Exo15 {
    private static int []tab={17,12,15,38,29,157,89,-22,0,5};
    public static int div(int indice, int diviseur){
        if (diviseur==0)
            throw new ArithmeticException("le diviseur est = 0");
        else{
            if (indice>9 && indice<0)
                throw new ArrayIndexOutOfBoundsException("l'indice n'existe pas");
            else {
                return tab[indice] / diviseur;
            }

        }

    }


        public static void main(String[] args) {
            int x;int y;
            int r;
            try {
                //x est pour l'induce
                x=tab[5];
                // y est pour le diviseur
                y=0;
                System.out.printf("le resulta est"+ div(x,y));


            }
            catch (ArithmeticException e){
                System.err.println(e.getMessage());
            }
            catch (ArrayIndexOutOfBoundsException e1){
                System.err.println(e1.getMessage());

            }


        }
    }

