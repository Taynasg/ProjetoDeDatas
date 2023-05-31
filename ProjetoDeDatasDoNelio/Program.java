package ProjetoDeDatasDoNelio;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

        //Instanciação de momentos atuais
        // Vai gerar a data atual da máquina
        LocalDate d01 = LocalDate.now();

        // Vai gerar a data e o horário atual da máquina
        LocalDateTime d02 = LocalDateTime.now();

        // Vai gerar o horário tual de acordo com Londres
        Instant d03 = Instant.now();

        System.out.println("d01 = " + d01.toString());
        System.out.println("d02 = " + d02.toString());
        System.out.println("d03 = " + d03.toString());

        //Formatando um texto ISO 8601 para uma data

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26z");
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");

        System.out.println("d04 = " + d04.toString());
        System.out.println("d05 = " + d05.toString());
        System.out.println("d06 = " + d06.toString());
        System.out.println("d07 = " + d06.toString());

        // Fazer um texto no formato customizado virar uma Data-hora
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // Eu poderia colocar também a chamada
        LocalDate d08 = LocalDate.parse("2022-07-20", fmt1);
        LocalDate d09 = LocalDate.parse("2022-07-20 01:30", fmt1);

        System.out.println("d08 = " + d08.toString());
        System.out.println("d09 = " + d09.toString());


    }
}