package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

public class ReportDto {
    private String aircraft;
    private Country country;
    private Currency currency;
    private String personName;

    public static final class ReportDtoBuilder {
        private String aircraft;
        private Country country;
        private Currency currency;
        private String personName;

        private ReportDtoBuilder() {
        }

        public static ReportDtoBuilder builder() {
            return new ReportDtoBuilder();
        }

        public ReportDtoBuilder aircraft(String aircraft) {
            this.aircraft = aircraft;
            return this;
        }

        public ReportDtoBuilder country(Country country) {
            this.country = country;
            return this;
        }

        public ReportDtoBuilder currency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public ReportDtoBuilder personName(String personName) {
            this.personName = personName;
            return this;
        }

        public String getName(){
            return personName;
        }

        public ReportDto build() {
            ReportDto reportDto = new ReportDto();
            reportDto.aircraft = this.aircraft;
            reportDto.personName = this.personName;
            reportDto.country = this.country;
            reportDto.currency = this.currency;
            return reportDto;
        }

        public String getPersonName() {
            return personName;
        }

    }
    @Override
    public String toString() {
        return "ReportDtoBuilder{" +
                "aircraft='" + aircraft + '\'' +
                ", country=" + country +
                ", currency=" + currency +
                ", personName='" + personName + '\'' +
                '}';
    }
}
