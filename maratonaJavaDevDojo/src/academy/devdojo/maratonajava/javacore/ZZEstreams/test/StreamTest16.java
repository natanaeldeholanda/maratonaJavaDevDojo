package academy.devdojo.maratonajava.javacore.ZZEstreams.test;


import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest16 {

    /*OPERAÇÕES limit, findFirst não devem ser usados o Parallel
    Custo total da computação
    Quantidade de dados pequena, não adianta usar o Parallel
    Tipos de coleções -> ArrayList, Ok
    Tamanho do Stream (tamanhos definidos são melhores)
    Processamento do merge
    if(tarefa for pequena e não pode ser dividida)
    faz sequencialmente
    else{
    divide em duas tarefas
    chama o método recursivamente
    espera todas as tarefas serem completadas
    Combina o resultado
    }
     */


    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 10_000_000L;
        System.out.println("Método pra ver quanto tempo demora pra somar de 1 a 10_000_000L");
        sumFor(num);
        System.out.println("--------------------------------------");
        System.out.println("Método pra ver quanto tempo demora pra somar de 1 a 10_000_000L, usando Stream");
        sumStreamIterate(num);
        System.out.println("--------------------------------------");
        System.out.println("Método pra ver quanto tempo demora pra somar de 1 a 10_000_000L, usando parallel: ");
        sumParallelIterate(num);
        System.out.println("--------------------------------------");
        System.out.println("Método pra ver quanto tempo demora pra somar de 1 a 10_000_000L, usando LongStream: ");
        sumParallelIterate(num);
        System.out.println("--------------------------------------");
        System.out.println("Método pra ver quanto tempo demora pra somar de 1 a 10_000_000L, usando ParallelLongStream: ");
        sumParallelIterate(num);
    }
    private static void sumFor(long num){
        System.out.println("Sum for");
        long result = 0;
        long init = System.currentTimeMillis();
        for(long i = 1; i <= num; i++){
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + "\n" + "Total time: " + (end - init) + "ms");
    }

    private static void sumStreamIterate(long num){
        System.out.println("Sum StreamInterate");
        long init = System.currentTimeMillis();
        long resultStreamIterate =Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(resultStreamIterate + "\n" + "Total time: " + (end - init) + "ms");
    }

    private static void sumParallelIterate(long num){
        System.out.println("Sum ParallelStreamInterate");
        long init = System.currentTimeMillis();
        long resultParallelStreamIterate =Stream.iterate(1L, i -> i + 1).parallel().limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(resultParallelStreamIterate + "\n" + "Total time: " + (end - init) + "ms");
    }

    private static void sumLongParallelIterate(long num){
        System.out.println("Sum LongStreamInterate");
        long init = System.currentTimeMillis();
        long resultLongStreamIterate = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(resultLongStreamIterate + "\n" + "Total time: " + (end - init) + "ms");
    }

    private static void sumParallelStreamIterate(long num){
        System.out.println("Sum ParallelStreamInterate");
        long init = System.currentTimeMillis();
        long sumParallelStreamIterate = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(sumParallelStreamIterate + "\n" + "Total time: " + (end - init) + "ms");
    }

}
