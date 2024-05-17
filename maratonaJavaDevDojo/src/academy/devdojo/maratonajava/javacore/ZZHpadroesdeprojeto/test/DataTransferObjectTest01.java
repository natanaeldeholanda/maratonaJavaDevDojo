package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.*;

public class DataTransferObjectTest01 {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("777");
        Country country = Country.BRAZIL;
        Currency currency = CurrencyFactory.newCurrency(country);
        Person person = Person.PersonBuilder
                .builder()
                .firstName("Natanael")
                .lastName("Holanda")
                .userName("natanaeldeholanda")
                .email("natan.holanda@gmail.com")
                .build();
        ReportDto reportDto = ReportDto.ReportDtoBuilder.builder()
                .aircraft(aircraft.getName())
                .country(country)
                .currency(currency)
                .personName(person.getFirsName())
                .build();

        System.out.println(reportDto);
    }
}
