package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio;

public class Discount {

    //Criar orçamento com esses valores: storeName, price, discountCode;
    public enum Code {
        NONE(0), SUPER_SAYAJIN(5), SUPER_SAYAJIN_2(10), SUPERSAYAJIN_3(15);

        private final int percentage;

        Code(int percentage) {
            this.percentage = percentage;
        }

        public int getPercentage() {

            return percentage;
        }
    }
}
