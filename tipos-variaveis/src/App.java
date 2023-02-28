public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //Byte - idade
        //Short - ano
        //Int - Cep (Se começar com 0, talvez tenha que ser outro tipo)
        //Long - Cpf (Se começar com 0, talvez tenha que ser outro tipo e no final vamos por o L)
        //Float - PI (No final, temos que por um F)
        //Double - Salario

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; //Usamos o "cast", não é muito recomendado. Sem o método cast, não funcionaria pois estamos tentando converter um short pra int

        //Variaveis e constantes

        /*
         As constantes são valores armazenados em memórias que não podem ser modificados depois de declarados, são representados pela 
         palavra reservada 'final', seguida do tipo

         Por convenções, as constantes são escritas em CAIXA ALTA. Exemplos: 

         */

         final double VALOR_DE_PI = 3.14; //não pode ser alterada, dá erro de linguagem

        /*
         Operadores unários

         (++) incrementa o valor em +1 unidade
         (--) decrementa o valor em -1 unidade
         (!) nega o valor em uma expressão boleana

         */

         int numero = 5;
         
         numero =  - numero; //transforma o número 5 em negativo
         System.out.println(numero);

         numero = numero * -1; //transforma o número negativo em positivo. Não podemos usar o (+) pois é um operador aritimético
         System.out.println(numero);

         /*
          Operador ternário

          É como se fosse uma condição IF normal mas sua estrutura é resumida em uma linha.
          É representado pelo (?:)
          */

          int a,b;
          a = 5;
          b = 6;

          String resultado = a==b ? "verdadeiro" : "falso"; //operador ternário. A primeira operação sempre é boolean
                                    //(depende do tipo, se for int, tem que ser números, se for string tem que ser palavras)
          System.out.println(resultado);

          /*
           Operadores 

           (==) igual
           (!=) diferente de
           (>) maior que 
           (<) menor que 

           O método .equals() compara contéudo, por exemplo:

           String nome1 = "Kauan";
           String nome2 = new String("Kauan");

           System.out.println(nome1 == nome2); Aqui o resultado seria false, pois aqui compara os objetos e não o conteúdo, agora se usarmos
           System.out.println(nome1.equals(nome2)); Aqui o resultado seria true, pois compara o CONTEÚDO dos objetos!

           Operadores lógicos

           (&&) significa E
           (||) significa OU


           */
    }
}
