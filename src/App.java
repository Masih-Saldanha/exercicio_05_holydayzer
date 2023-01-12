public class App {
    public static void main(String[] args) throws Exception {
        Feriado confraternizacaoMundial = new Feriado(1, 1, 2023, "Confraternização Mundial");
        Feriado carnaval = new Feriado(21, 2, 2023, "Carnaval");
        Feriado pascoa = new Feriado(17, 4, 2023, "Páscoa");
        Feriado tiradentes = new Feriado(21, 4, 2023, "Tiradentes");
        Feriado diaDoTrabalho = new Feriado(1, 5, 2023, "Dia do trabalho");
        Feriado corpusChristi = new Feriado(8, 6, 2023, "Corpus Christi");
        Feriado independenciaDoBrasil = new Feriado(7, 9, 2023, "Independência do Brasil");
        Feriado nossaSenhoraAparecida = new Feriado(21, 2, 2023, "Nossa Senhora Aparecida");
        Feriado finados = new Feriado(2, 11, 2023, "Finados");
        Feriado proclamacaoDaRepublica = new Feriado(15, 11, 2023, "Proclamação da República");
        Feriado natal = new Feriado(25, 12, 2023, "Natal");

        ListaFeriados lista = new ListaFeriados();

        lista.feriados.add(confraternizacaoMundial);
        lista.feriados.add(carnaval);
        lista.feriados.add(pascoa);
        lista.feriados.add(tiradentes);
        lista.feriados.add(diaDoTrabalho);
        lista.feriados.add(corpusChristi);
        lista.feriados.add(independenciaDoBrasil);
        lista.feriados.add(nossaSenhoraAparecida);
        lista.feriados.add(finados);
        lista.feriados.add(proclamacaoDaRepublica);
        lista.feriados.add(natal);

        lista.returnDates();

        System.out.println(lista.searchDate("01/10"));
        System.out.println(lista.searchDate("01/01"));
    }
}
